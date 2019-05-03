package com.xilidou.framework.aop.adapter;

import com.xilidou.framework.aop.advisor.Advisor;
import com.xilidou.framework.aop.advisor.BeforeMethodAdvice;
import com.xilidou.framework.aop.interceptor.AopMethodInterceptor;
import com.xilidou.framework.aop.interceptor.BeforeMethodAdviceInterceptor;

public class BeforeMethodAdviceAdapter implements AdviceAdapter{

    private BeforeMethodAdviceAdapter() {
    }

    private static final BeforeMethodAdviceAdapter INSTANCE = new BeforeMethodAdviceAdapter();

    public static BeforeMethodAdviceAdapter getInstance(){
        return INSTANCE;
    }

    @Override
    public AopMethodInterceptor getInterceptor(Advisor advisor) {
        BeforeMethodAdvice advice = (BeforeMethodAdvice) advisor.getAdvice();
        return new BeforeMethodAdviceInterceptor(advice);
    }
}
