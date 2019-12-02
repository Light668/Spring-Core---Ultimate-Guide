package com.light.spring.core.aop.basic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.light.spring.core.aop.basic")
@EnableAspectJAutoProxy
public class CalculatorConfiguration {

}
