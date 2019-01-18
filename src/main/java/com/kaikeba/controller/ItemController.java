package com.kaikeba.controller;

import com.kaikeba.pojo.Item;
import com.kaikeba.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    @RequestMapping(value = "/queryAll")
    public ModelAndView queryAll(){
        ModelAndView view = new ModelAndView();
        view.setViewName("item");
//        List<Item> items = itemService.queryAll();
//        view.addObject("items",items);
        List<String> items = new ArrayList<>();
        items.add("er");
        items.add("er");
        items.add("er");
        view.addObject("items",items);
        return view;
    }
}
