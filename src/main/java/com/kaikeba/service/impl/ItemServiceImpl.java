package com.kaikeba.service.impl;

import com.kaikeba.mapper.ItemMapper;
import com.kaikeba.pojo.Item;
import com.kaikeba.pojo.ItemExample;
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

    @Override
    public List<Item> queryAll() {
        ItemExample itemExample = new ItemExample();
        ItemExample.Criteria criteria = itemExample.createCriteria();
        return itemMapper.selectByExample(itemExample);
    }
}
