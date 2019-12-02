package com.light.spring.core.aop.basic;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorLoggingAspect {

	private Logger logger = Logger.getLogger(CalculatorConfiguration.class.getName());

	// @Before("execution(* ArithmeticCalculator.multiplication(..))")
	public void logBefore() {
		logger.info("Before multiplication method");
	}

	// @After("execution(* ArithmeticCalculator.addition(..))")
	public void logAfter() {
		logger.info("After addition method");
	}

	// @AfterReturning(pointcut = "execution(* ArithmeticCalculator.addition(..))",
	// returning = "result")
	public void logAfterReturning(Object result) {
		logger.info("AfterReturning addition method");
		logger.info("Addition Result is " + result);
	}

	// @AfterThrowing(pointcut = "execution(* ArithmeticCalculator.division(double,
	// double))", throwing = "ex")
	public void logAfterTrowing(Throwable ex) {
		logger.info("AfterThrowing division method");
		logger.info("Exception message: " + ex.getMessage());
	}

	// @Before("execution(* ArithmeticCalculator.multiplication(..))")
	public void joinPointInfo(JoinPoint joinPoint) {
		logger.info("joinPointInfo Advice");
		logger.info("Kind: " + joinPoint.getKind());
		logger.info("Method Signature: " + joinPoint.getSignature().getName());
		logger.info("Declaring type name: " + joinPoint.getSignature().getDeclaringTypeName());
		logger.info("Method arguments: " + Arrays.toString(joinPoint.getArgs()));
		logger.info("Target Object: " + joinPoint.getTarget());
		logger.info("This Object: " + joinPoint.getThis());
	}

	@Around("execution(* ArithmeticCalculator.multiplication(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		logger.info("Around advice.");
		logger.info("Method arguments:" + Arrays.toString(proceedingJoinPoint.getArgs()));
		Object result;
		try {
			result = proceedingJoinPoint.proceed(new Object[] {5.8, 9.2});
			return result;
		} catch (Throwable th) {
			throw th;
		}
	}
}
