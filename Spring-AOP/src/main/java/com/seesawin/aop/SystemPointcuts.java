package com.seesawin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SystemPointcuts {

	@Pointcut("within(com.seesawin.service..*)")
	public void before() {
	}

	@Before("before()")
	public void execBefore() throws Throwable {
		System.out.println("*@Before");
	}

	@Pointcut("within(com.seesawin.service..*)")
	public void afterFinal() {
	}

	@After("afterFinal()")
	public void execAfterFinal() {
		System.out.println("*@After");
	}

	@Pointcut("within(com.seesawin.service..*)")
	public void afterRet() {
	}

	@AfterReturning("afterRet()")
	public void execAfterRet() {
		System.out.println("*@AfterReturning");
	}

	@AfterReturning(pointcut = "afterRet()", returning = "retVal")
	public void execAfterRetVal(Object retVal) {
		System.out.println("*@AfterReturning : " + retVal);
	}

	@Pointcut("within(com.seesawin.service..*)")
	public void afterThrowing() {
	}

	@AfterThrowing("afterThrowing()")
	public void execAfterThrowing() {
		System.out.println("*@AfterThrowing");
	}

	@AfterThrowing(pointcut = "afterThrowing()", throwing = "ex")
	public void execAfterThrowing(Exception ex) {
		System.out.println("*@AfterThrowing Exception ex : " + ex.getMessage());
	}

	@Pointcut("within(com.seesawin.service..*)")
	public void around() {
	}

	@Around("around()")
	public Object execAround(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("*@Around start");

		Object[] args = pjp.getArgs();

		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] : " + args[i]);
			System.out.println("reset Hsu");
			args[i] = "Hsu ";
		}

		String component = pjp.getSignature().getDeclaringType().getName();
		String method = pjp.getSignature().getName();

		System.out.println("component : " + component);
		System.out.println("invoke method : " + method);

		Object resp = pjp.proceed(args);
		System.out.println("resp : " + resp);

		System.out.println("*@Around end");

		return resp;
	}
}
