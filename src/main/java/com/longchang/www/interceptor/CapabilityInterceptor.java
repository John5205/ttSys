package com.longchang.www.interceptor;

import org.springframework.core.NamedThreadLocal;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class CapabilityInterceptor extends HandlerInterceptorAdapter {
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    // 我们的拦截器都是单例的，因此不管用户请求多少次都只能有一个拦截器实现，是线程不安全的，为了解决这个问题
    //ThreadLocal:它是线程绑定变量，提供线程局部变量，一个线程一个ThreadLocal,多个线程同时访问时A线程的ThreadLocal看不到B线程的ThreadLocal
    private NamedThreadLocal<Long> namedThreadLocal = new NamedThreadLocal<>("Capability-monitor");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 记录开始时间
        long startTime = System.currentTimeMillis();
        namedThreadLocal.set(startTime);

        System.out.println("开始时间：" + sdf.format(date) + "ms");
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //在结束请求处理之后记录结束时间
        long endTime = System.currentTimeMillis();
        long usedTime = endTime - namedThreadLocal.get();
        System.out.println("结束时间：" + sdf.format(date) + "ms");
        System.out.println("处理消耗时间：" + usedTime + "ms");

        // 自由添加可提供提示语句
        if (usedTime > 150){
            System.out.println("[警告]请求偏慢哦！");
        }
    }
}
