package com.seesawin.annotations.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAspects {

	@AfterThrowing("com.seesawin.annotations.aop.SystemPointcuts.afterThrowing()")
	public void execAfterThrowing() {
		System.out.println("@AfterThrowing");
	}

	@AfterThrowing(pointcut = "com.seesawin.annotations.aop.SystemPointcuts.afterThrowing()", throwing = "ex")
	public void execAfterThrowing(Exception ex) {
		System.out.println("@AfterThrowing Exception ex : " + ex.getMessage());
	}

}
