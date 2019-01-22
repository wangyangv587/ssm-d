package com.kaikeba.service.impl;

import com.kaikeba.mapper.ItemMapper;
import com.kaikeba.mapper.UserMapper;
import com.kaikeba.pojo.Item;
import com.kaikeba.pojo.ItemExample;
import com.kaikeba.pojo.User;
import com.kaikeba.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Alex
 * @date: 2019/1/17 17:04
 * description:
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemMapper itemMapper;

    @Resource
    private UserMapper userMapper;

    @Override
    public Item queryItemById(Integer id) {

        return id == null ? null : itemMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insert(Item item) {
        itemMapper.insert(item);
    }

    @Override
    public void insertTest(Item item, User user){
        itemMapper.insert(item);

        System.out.println(1/0);
        userMapper.insert(user);
    }

    @Override
    public List<Item> queryAll() {
        ItemExample itemExample = new ItemExample();
        ItemExample.Criteria criteria = itemExample.createCriteria();
        return itemMapper.selectByExample(itemExample);
    }
}
