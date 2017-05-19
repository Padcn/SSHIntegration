package com.pad.service;

import com.pad.dao.TestDao;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
@Service
public class TestService {
    @Resource
    private TestDao testDao;

    public boolean test(){
        System.out.println(testDao);
        return testDao.test();
    }

}
