package com.github.kastkest.interview_preparing.h2;

public class MyArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private E[] arr;
    private int maxLength;
    private int number;

    public MyArrayList() {
        this.maxLength = DEFAULT_CAPACITY;
        this.number = 0;
        this.arr = (E[]) new Object[maxLength];
    }

    public void add(E item) {
        if (number == maxLength) {
            maxLength = maxLength * 3 / 2;
            E[] tmp = (E[]) new Object[maxLength];
            System.arraycopy(arr, 0, tmp, 0, arr.length);
            this.arr = tmp;
        }
        arr[number] = item;
        number++;
    }

    public E get(int number) {
        if (number > maxLength) {
            throw new IndexOutOfBoundsException();
        }
        return arr[number];
    }

    public void remove(int i) {
        E[] tmp = (E[]) new Object[maxLength];
        System.arraycopy(arr, 0, tmp, 0, i);
        System.arraycopy(arr, i + 1, tmp, i, number - i - 1);
        number--;
        arr = tmp;
    }

    public boolean isEmpty() {
        return number == 0;
    }


}
