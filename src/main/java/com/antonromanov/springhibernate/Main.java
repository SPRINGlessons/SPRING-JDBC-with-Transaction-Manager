package com.antonromanov.springhibernate;

import com.antonromanov.springhibernate.DAO.UserDAO;
import com.antonromanov.springhibernate.model.User;
import com.tutorialspoint.MyDatabaseBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        MyDatabaseBean dataBean = (MyDatabaseBean) ctx.getBean("mydatabean");


        dataBean.add();


    }

}
