package com.ict.edu6;

public class TestMain {
	public static void main(String[] args) {
		Car car = new Car();
		
		Cutomer cutomer = new Cutomer(car);
		Producer producer = new Producer(car);
		
		new Thread(cutomer).start();
		new Thread(producer).start();
	}
}
