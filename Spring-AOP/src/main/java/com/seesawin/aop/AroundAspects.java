package com.seesawin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspects {

	@Around("com.seesawin.aop.SystemPointcuts.around()")
	public Object execAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("@Around start");

		Object[] args = pjp.getArgs();

		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] : " + args[i]);
			System.out.println("reset seesawin");
			args[i] = "seesawin ";
		}

		String component = pjp.getSignature().getDeclaringType().getName();
		String method = pjp.getSignature().getName();

		System.out.println("component : " + component);
		System.out.println("invoke method : " + method);

		Object resp = pjp.proceed(args);
		System.out.println("resp : " + resp);

		System.out.println("@Around end");

		return resp;
	}
}
