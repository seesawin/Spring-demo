package com.seesawin.annotations.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterFinallyAspects {

	@After("com.seesawin.annotations.aop.SystemPointcuts.afterFinal()")
	public void execAfterFinal() {
		System.out.println("@After");
	}

}
