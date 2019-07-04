package com.spring4.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LogHelper {
    
    @Before("execution(public void describe())")
    public void logBefore() {
	System.out.println("logged Before");
    }
    
    
    @After("execution(public void describe())")
    public void logAfter() {
	System.out.println("logged Afte");
    }

}
