package com.github.kastkest.interview_preparing.h5;

import org.hibernate.Session;

public class StudentDAO {

    public Student studentFindById(Long id) {
        Session session = SessionCreator.getSessionFactory().openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }

    public void save(Student student) {
        Session session = SessionCreator.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    public void update(Student student) {
        Session session = SessionCreator.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.update(student);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Student student) {
        Session session = SessionCreator.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(student);
        session.getTransaction().commit();
        session.close();
    }
}
