package com.xilidou.framework.aop.test;

import com.xilidou.framework.aop.core.AopApplictionContext;

public class MainTest {

    public static void main(String[] args) throws Exception {

        AopApplictionContext aopApplictionContext = new AopApplictionContext("application.json");
        aopApplictionContext.init();

        // 注意，为什么callback能执行到，因为这里获得的bean是testServiceProxy，
        // 然后将它当作testService来用的，也就是原来的bean被替换了（可以替换的原因是
        // proxy的父类是TestService）。因为proxy安装了callback，自然就可以实现拦截。
        TestService testService = (TestService) aopApplictionContext.getBean("testServiceProxy");

        testService.testMethod();


    }
}
