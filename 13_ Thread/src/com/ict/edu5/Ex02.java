package com.ict.edu5;

public class Ex02 implements Runnable{
	
	@Override
	public void run() {
		kitchen();
		bedroom();
		
	}

	
		public void kitchen() {
			System.out.println(Thread.currentThread().getName()+ "is in kitchen");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		public synchronized void bedroom() {
			System.out.println(Thread.currentThread().getName()+ "is in kitchen");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println(Thread.currentThread().getName()+"is leaving bedroom");
		}
	
}
