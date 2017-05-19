package com.pad.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pad.service.TestService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
@Controller
public class TestAction extends ActionSupport {
    @Resource
    private TestService testService;

    public String execute(){
        System.out.println(testService.test());

        return SUCCESS;
    }

}
