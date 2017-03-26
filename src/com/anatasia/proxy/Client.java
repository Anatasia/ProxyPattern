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
		
		Car car = new Car();
		CarTimeProxy ctp = new CarTimeProxy(car);
		CarLogProxy clp = new CarLogProxy(ctp);
		clp.move();
		
		// TODO Auto-generated method stub
//		Car car = new Car();
//		car.move();
		//使用继承方式
//		Moveable m = new Car2();
//		m.move();
		//使用聚合方式实现
//		Car car = new Car();
//		Moveable m = new CarTimeProxy(car);
//		m.move();
	}

}
