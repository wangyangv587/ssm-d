package com.kaikeba.dao;

import com.kaikeba.dao.impl.DaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);

        Dao dao = annotationConfigApplicationContext.getBean(Dao.class);

        System.out.println(dao instanceof DaoImpl);
        dao.query();
    }
}
