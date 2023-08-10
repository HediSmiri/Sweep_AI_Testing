package com.sweepbot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DataDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertData(String data) {
        String sql = "INSERT INTO mytable (data) VALUES (?)";
        jdbcTemplate.update(sql, data);
    }
}