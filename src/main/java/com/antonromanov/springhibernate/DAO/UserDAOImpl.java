package com.antonromanov.springhibernate.DAO;

import com.antonromanov.springhibernate.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class UserDAOImpl implements UserDAO{

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public void save(User user) {

        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        //session.persist(user);
        //session.getTransaction().commit();
        tx.commit();
        session.close();


    }
/*
    public List<User> getPersonList() {

        Session session = this.sessionFactory.openSession();
        String hql = "from Test";
        List<User> personList = session.createQuery(hql).list();
        session.close();
        return personList;

    }

    */
}
