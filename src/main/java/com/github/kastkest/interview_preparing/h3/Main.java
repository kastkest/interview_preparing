package com.github.kastkest.interview_preparing.h3;

public class Main {

    public static class PingPong {
        private final Object monitor = new Object();
        private volatile String current = null;
        private final String word1 = "ping";
        private final String word2 = "pong";
        private volatile int count = 10;

        public PingPong() {
            this.current = word1;
        }

        public void printPing() {
            synchronized (monitor) {
                try {
                    while (count > 1) {
                        while (!current.equals(word1)) {
                            monitor.wait();
                        }
                        System.out.println(word1);
                        current = word2;
                        count--;
                        monitor.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


        public void printPong() {
            synchronized (monitor) {
                try {
                    while (count > 1) {
                        while (!current.equals(word2)) {
                            monitor.wait();
                        }
                        System.out.println(word2);
                        current = word1;
                        count--;
                        monitor.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args) {
            PingPong pp = new PingPong();

            new Thread(pp::printPing).start();

            new Thread(pp::printPong).start();
        }
    }
}
