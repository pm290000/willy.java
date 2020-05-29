package com.ict.edu4;



//	데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
//				  일반 스레드가 종료하면 데몬 스레드는 강제적으로 종료 됨
public class Ex01 implements Runnable{
	boolean autoSave = false ;
	
	@Override
	public void run() {
		while (true) {
			try {
				// 3초마다 대기 상태
				Thread.sleep(1000*3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(1);
			if(autoSave) {
				autoSave();
			}
		}
		
	}
	public void autoSave() {
		System.out.println("작업파일을 자동 저장합니다.");
	}
	
	public static void main(String[] args) {
		Ex01 e1 = new Ex01();
		Thread thread = new Thread(e1);
		thread.setDaemon(true);   // 딱한줄차이얌~!! 이거 하면 1멈추지~ 안드로이드에서는 필수적으로 스레드 처리할때 대몬해야한다. 
		thread.start();
		
		for (int i = 1; i < 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i);
		}
		
		System.out.println("프로그램 종료");
	}
}









