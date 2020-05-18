package class02;

import java.util.Random;

// Random 클래스를 상속받아서 사용
public class Ex03 extends Random {
	public static void main(String[] args) {
		//	main 매소드도 static이기 때문에 static 못 만든다.
		//	static int su = ran.nextInt(10)+1; //1-10
	
		//	static 메소드가 아니라 사용 불가
		// int num = nextInt(10)+1; // 1-10
		// System.out.println(num);
		
		// play()를 사용하기 위해서는 현재 클래스를 객체로 만들어야 된다.
		Ex03 e3 = new Ex03();
		e3.play();
	}
		public void play() {
			int num = nextInt(10)+1; // 1-10
		System.out.println(num);
	}
}
