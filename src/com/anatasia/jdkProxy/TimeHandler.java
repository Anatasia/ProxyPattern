package com.anatasia.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	private Object target;
	public TimeHandler(Object target){
		super();
		this.target = target;
	}
	
	/*
	 * 参数：
	 * proxy:被代理对象
	 * method:被代理对象方法
	 * args:方法参数
	 * 
	 * 返回值：
	 * Object方法的返回值
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行使...");
		method.invoke(target);
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行使... 汽车行驶时间："+(endTime-startTime)+"毫秒!");
		return null;
	}

}
