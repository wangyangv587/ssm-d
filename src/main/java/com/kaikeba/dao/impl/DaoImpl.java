package com.kaikeba.dao.impl;

import com.kaikeba.dao.Dao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


@Repository
public class DaoImpl implements Dao {
    @Override
    public void query() {
        System.out.println("query");
    }

    @Override
    public void query(String name) {
        System.out.println("name = " + name);
    }
}
