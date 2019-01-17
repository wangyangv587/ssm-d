package com.kaikeba.controller;

import com.kaikeba.pojo.Item;
import com.kaikeba.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Alex
 * @date: 2019/1/15 16:20
 * description:
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Resource
    private ItemService itemService;

    @ResponseBody
    @RequestMapping(value = "/queryAll")
    public List<Item> queryAll(){
        List<Item> items = itemService.queryAll();
        return items;
    }
}
