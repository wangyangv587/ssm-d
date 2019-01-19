package com.kaikeba.controller;

import com.kaikeba.pojo.Item;
import com.kaikeba.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Alex
 * @date: 2019/1/15 16:20
 * description:
 */
@Controller
@RequestMapping
public class ItemController {

    @Resource
    private ItemService itemService;

    @ResponseBody
    @RequestMapping("testRedirect")
    public String testRedirect(HttpServletRequest request, Model model){


        return "redirect:account";
    }

    @RequestMapping("testForward")
    public String testForward(HttpServletRequest request, Model model){


        return "forward:account";
    }

    @ResponseBody
    @RequestMapping("queryItemById")
    public Item queryItemById(Integer id){

        return itemService.queryItemById(id);
    }
}
