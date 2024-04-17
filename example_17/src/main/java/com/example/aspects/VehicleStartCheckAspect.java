package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)    //aspect number
public class VehicleStartCheckAspect {

    private Logger logger = Logger.getLogger(VehicleStartCheckAspect.class.getName());



    //这是一个前置通知，指定了切点表达式，用于匹配所有 com.example.services 包中的方法，
    // 并且这些方法的第一个参数必须是 boolean 类型
    @Before("execution(* com.example.services.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable {
        if(!vehicleStarted){
            throw new RuntimeException("Vehicle not started");
        }
    }
}
