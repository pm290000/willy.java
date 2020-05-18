package com.ict.edu2;

public class Main {
	public static void main(String[] args) {
		DcaPhone dca = new DcaPhone();
		dca.call();//부모
		dca.message();//부모
		dca.dca();//자식
		System.out.println("===========");
		

		//자식클래스 = 자식클래스(생성자)
		MP3Phone mp3 = new MP3Phone();
		mp3.call();//부모
		mp3.message();//부모
		mp3.sound();//자식
		System.out.println("===========");
		
		
		//자식클래스 = 자식클래스(생성자)
		GamePhone go = new GamePhone();
		go.call();//부모
		go.message();//부모
		go.play();//자식
		System.out.println("===========");
		
		//부모클래스 = 부모클래스
		Phone p1 = new DcaPhone();
		p1.call();//부모
		p1.message();//부모
		//p1.dca();  //자식, 오류발생
		
		Phone p2 = new MP3Phone();
		p1.call();//부모
		p1.message();//부모
		//p1.dca();  //자식, 오류발생
		
		
		
	}
}
