package org.com.Spring;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;



public class BeforeAdvisor implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[]rgs,Object target)throws Throwable{
		System.out.println("Addition concern before actual logic:");
	}
	

}
