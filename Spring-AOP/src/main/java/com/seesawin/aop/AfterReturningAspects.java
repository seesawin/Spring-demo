package com.seesawin.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturningAspects {

	@AfterReturning("com.seesawin.aop.SystemPointcuts.afterRet()")
	public void execAfterRet() {
		System.out.println("@AfterReturning");
	}

	@AfterReturning(pointcut = "com.seesawin.aop.SystemPointcuts.afterRet()", returning = "retVal")
	public void execAfterRetVal(Object retVal) {
		System.out.println("@AfterReturning : " + retVal);
	}

}
