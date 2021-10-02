package org.com.Spring;

import java.util.List;

public class ProxyFactoryBean {
	@SuppressWarnings("rawtypes")
	private List interceptorNames;
	private Object target;
	
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	
	@SuppressWarnings("rawtypes")
	public List getInterceptorNames() {
		return interceptorNames;
	}
	public void setInterceptorNames(@SuppressWarnings("rawtypes") List interceptorNames) {
		this.interceptorNames = interceptorNames;
	}
	
	

}
