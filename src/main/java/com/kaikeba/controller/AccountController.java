package com.kaikeba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

/**
 * @author: Alex
 * @date: 2019/1/15 16:20
 * description:
 */
@Controller
@RequestMapping
public class AccountController {

    @RequestMapping(value = "/query")
    public String query(){

        return "/account";
    }
}
