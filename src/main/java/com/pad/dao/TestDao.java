package com.pad.dao;


import com.pad.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/17 0017.
 */

@Repository
public class TestDao {
    @Resource
    private SessionFactory sessionFactory;

    public boolean test(){
        System.out.println(sessionFactory);
        Person p=new Person();
        p.setName("110");
        p.setAge(666);
        Session session=sessionFactory.getCurrentSession();
        session.save(p);
        return true;
    }

}
