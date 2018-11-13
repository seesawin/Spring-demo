package com.seesawin.annotations.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspects {

	@Before("com.seesawin.annotations.aop.SystemPointcuts.before()")
	public void execBefore() throws Throwable {
		System.out.println("@Before");
	}

}
