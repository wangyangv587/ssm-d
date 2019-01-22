package com.kaikeba.controller;

import cn.hutool.json.JSONUtil;
import com.alibaba.druid.support.json.JSONUtils;
import com.kaikeba.annotation.ResponseJson;
import com.kaikeba.common.Result;
import com.kaikeba.pojo.Item;
import com.kaikeba.pojo.User;
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
    @ResponseJson
    public String queryItemById(Integer id){

//        Result result = new Result();
//        result.setData(JSONUtil.toJsonStr(itemService.queryItemById(id)));
        System.out.println("id = " + id);
        System.out.println("进入controller");
        return JSONUtil.toJsonStr(itemService.queryItemById(id));
    }

    @ResponseBody
    @RequestMapping("addItem")
    public String addItem(Item item){
        itemService.insert(item);
        return "ok";
    }

}
