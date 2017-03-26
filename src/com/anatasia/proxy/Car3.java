package com.anatasia.proxy;

public class Car3 implements Moveable {

	private Car car;
	
	public Car3(Car car){
		super();
		this.car = car;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行使...");
		car.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行使... 汽车行驶时间："+(endTime-startTime)+"毫秒!");
	}

	

}
