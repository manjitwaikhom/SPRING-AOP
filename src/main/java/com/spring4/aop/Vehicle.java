package com.spring4.aop;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    
    String name="Car";
    int number=1234;
    
    
    
    public void describe() {
	System.out.println("Name: "+ name +"Number: "+number);
    }

}
