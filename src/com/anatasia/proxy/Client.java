package com.anatasia.proxy;
/**
 * 测试类
 * @author Anatasia
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car = new Car();
//		car.move();
		//使用集成方式
//		Moveable m = new Car2();
//		m.move();
		//使用聚合方式实现
		Car car = new Car();
		Moveable m = new Car3(car);
		m.move();
	}

}
