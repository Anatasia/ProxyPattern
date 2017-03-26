package com.anatasia.proxy;

public class CarLogProxy implements Moveable{

private Moveable m;
	
	public CarLogProxy(Moveable m){
		super();
		this.m = m;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
		System.out.println("日志开始...");
		m.move();
		System.out.println("日志结束行使... ");
	}

}
