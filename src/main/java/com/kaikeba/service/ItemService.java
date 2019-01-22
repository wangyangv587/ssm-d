package com.kaikeba.service;

import com.kaikeba.pojo.Item;
import com.kaikeba.pojo.User;

import java.util.List;

/**
 * @author: Alex
 * @date: 2019/1/17 17:04
 * description:
 */
public interface ItemService {

    List<Item> queryAll();

    Item queryItemById(Integer id);

    void insert(Item item);

    void insertTest(Item item, User user);
}
