package com.kaikeba.handler;

import cn.hutool.core.annotation.AnnotationUtil;
import cn.hutool.json.JSONUtil;
import com.kaikeba.annotation.ResponseJson;
import com.kaikeba.common.Result;
import com.kaikeba.pojo.Item;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.lang.Nullable;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class ReturnValueHandler implements HandlerMethodReturnValueHandler {

    public ReturnValueHandler(){
        System.out.println("进入init ReturnValueHandler");
    }
    @Override
    public boolean supportsReturnType(MethodParameter methodParameter) {
        System.out.println("进入support：" + AnnotationUtils.isAnnotationDeclaredLocally(ResponseJson.class,methodParameter.getContainingClass()));
        return AnnotationUtils.isAnnotationDeclaredLocally(ResponseJson.class,methodParameter.getContainingClass());
    }

    @Override
    public void handleReturnValue(@Nullable Object o, MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest) throws Exception {
        HttpServletResponse response = nativeWebRequest.getNativeResponse(HttpServletResponse.class);
        PrintWriter writer = response.getWriter();
        System.out.println("进入handlerReturnValue");
        if(o instanceof String){
            writer.write(o.toString());
            writer.flush();
        }else if(o instanceof Item){
            Result<Item> result = new Result<>();
            result.setData(o);
            writer.write(JSONUtil.toJsonStr(o));
            writer.flush();
        }
    }
}
