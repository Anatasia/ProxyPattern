package com.anatasia.proxy;

public class CarTimeProxy implements Moveable {

	private Moveable m;
	
	public CarTimeProxy(Moveable m){
		super();
		this.m = m;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行使...");
		m.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行使... 汽车行驶时间："+(endTime-startTime)+"毫秒!");
	}

	

}
