package com.ict.debugging;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		Scanner sc = new Scanner(System.in);
		
		
		String msg =  "4"; 
		
		test.setData(msg);
		String msg2 = test.setData2(msg);
		int msg3 = Integer.parseInt(msg2);
		for (int i = 1; i < 10; i++) {
			System.out.println(msg2 + "*" + i + "=" + (msg3 * i));
		}
		
	}
	
	public void setData(String msg) {
		System.out.println(msg);
	}
	
	public String setData2(String msg) {
		String str = null;
		if(msg.length() >= 1) {
			str = msg.substring(0,1);
		}
		return str;
	}
}
