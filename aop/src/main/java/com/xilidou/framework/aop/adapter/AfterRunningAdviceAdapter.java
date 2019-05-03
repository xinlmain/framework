package com.xilidou.framework.aop.adapter;

import com.xilidou.framework.aop.advisor.Advisor;
import com.xilidou.framework.aop.advisor.AfterRunningAdvice;
import com.xilidou.framework.aop.interceptor.AfterRunningAdviceInterceptor;
import com.xilidou.framework.aop.interceptor.AopMethodInterceptor;

public class AfterRunningAdviceAdapter implements AdviceAdapter{

    private AfterRunningAdviceAdapter(){

    }

    private static final AfterRunningAdviceAdapter INSTANCE = new AfterRunningAdviceAdapter();

    public static AfterRunningAdviceAdapter getInstance(){
        return INSTANCE;
    }

    @Override
    public AopMethodInterceptor getInterceptor(Advisor advisor) {
        AfterRunningAdvice advice = (AfterRunningAdvice) advisor.getAdvice();
        return new AfterRunningAdviceInterceptor(advice);
    }
}
