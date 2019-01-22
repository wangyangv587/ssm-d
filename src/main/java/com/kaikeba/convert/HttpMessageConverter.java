package com.kaikeba.convert;


import cn.hutool.json.JSONUtil;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.lang.Nullable;

import java.io.IOException;
import java.lang.reflect.Type;

public class HttpMessageConverter extends MappingJackson2HttpMessageConverter{

    @Override
    protected void writeInternal(Object object, @Nullable Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        System.out.println("进入convert");
        //super.writeInternal(object, type, outputMessage);
        // 使用 hutool的 JSONUtil将 Java 对象转换成 Json String
        String jsonStr = JSONUtil.toJsonStr(object);
        outputMessage.getBody().write(jsonStr.getBytes());
    }
}
