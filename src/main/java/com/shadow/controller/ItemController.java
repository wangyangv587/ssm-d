package com.shadow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Alex
 * @date: 2019/1/15 16:20
 * description:
 */
@Controller
@RequestMapping
public class ItemController {

    @ResponseBody
    @RequestMapping("index")
    public String index(){

        System.out.println("index...");

        return "index";
    }

}
