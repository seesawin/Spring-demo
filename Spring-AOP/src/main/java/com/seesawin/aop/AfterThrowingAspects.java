package com.seesawin.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAspects {

	@AfterThrowing("com.seesawin.aop.SystemPointcuts.afterThrowing()")
	public void execAfterThrowing() {
		System.out.println("@AfterThrowing");
	}

	@AfterThrowing(pointcut = "com.seesawin.aop.SystemPointcuts.afterThrowing()", throwing = "ex")
	public void execAfterThrowing(Exception ex) {
		System.out.println("@AfterThrowing Exception ex : " + ex.getMessage());
	}

}
