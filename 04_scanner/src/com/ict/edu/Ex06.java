package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//이름 :
		//국어 점수:
		//영어 점수:
		//수학점수:
		//평균:
		//학점:
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		System.out.println("국어점수 : " );
		System.out.println("영어점수 : ");
		System.out.println("수학점수 : ");
		
		String str = sc.next();
		int k1 = sc.nextInt();
		int k2 = sc.nextInt();
		int k3 = sc.nextInt();
		int sum = k1+k2+k3;
		int arg = sum/3;
		if (arg>=90) {
			System.out.println("A학점");
		}else if(arg>=80){
			System.out.println("B학점");
		}else if(arg>=70){
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		
		
		
		
		System.out.println("이름 : " + str);
		System.out.println("국어점수 : " + k1);
		System.out.println("영어점수 : " + k2);
		System.out.println("수학점수 : " + k3);

		
		
		System.out.println("총점은 : "+ sum );
		System.out.println("평균은 : " + arg);
		System.out.println("학점은 : "  );
	
		
	
	
	
		
	}
}
