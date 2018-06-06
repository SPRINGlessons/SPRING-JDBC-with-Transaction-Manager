package com.tutorialspoint;


import javax.sql.DataSource;

import com.antonromanov.springhibernate.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
//import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.util.List;



public class MyDatabaseBean {

    private JdbcTemplate jdbcTemplate;

    //private static final String SQL_INSERT_SPITTER ="SET search_path=public";

    final static char dm = (char) 34;
    private static final String query = "INSERT INTO public." + dm + "Test" + dm + " (name) VALUES (?)";
    String querySpitter = "INSERT INTO public." + dm + "Test" + dm + " (name) VALUES (:name)";
    private static final String selectQuery = "select * from public." + dm + "Test" + dm + "";
    private static final String selectQueryAll = "select name from public." + dm + "Test" + dm + "";
    private static final String selectQueryAllColumns = "select * from public." + dm + "Test" + dm + "";

    Object[] args = new Object[]{"Юляшенька Панферова в черненьких чулочках"};

    private DataSource dataSource;
    private User user;




    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    public void setDataSource(DataSource dataSource) {
        //this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.dataSource = dataSource;
    }



    public void add() {


        jdbcTemplate.update(query, args);


    }





    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
