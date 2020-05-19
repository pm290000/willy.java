package com.ict.edu3;

public class T_sub extends T_Super {
	String addr ; 
	int car ;
	
	public T_sub() {
		this("서울 홍대입구");
		System.out.println("자식생성자1");
	}
	public T_sub(String addr) {
		this.addr = addr;
		System.out.println("자식생성자2");
	}
	public T_sub(int car) {
		this.car = car;
	}
	public T_sub(String addr, int car) {
		this.addr = addr;
		this.car = car;
	}
	public T_sub( int car, String addr) {
		this.addr = addr;
		this.car = car;
	}
}
