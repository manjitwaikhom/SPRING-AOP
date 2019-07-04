package com.spring4.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	Vehicle vehicle=context.getBean(Vehicle.class);
	vehicle.describe();

    }

}
