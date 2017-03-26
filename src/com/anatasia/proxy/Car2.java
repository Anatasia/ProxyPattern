package com.anatasia.proxy;

public class Car2 extends Car {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行使...");
		super.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行使... 汽车行驶时间："+(endTime-startTime)+"毫秒!");
	}

	

}
