package com.ict.edu01;

import java.util.Scanner;


public class Ex04_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Ex04[] arr = new Ex04[1];
		
		for (int i = 0; i < arr.length; i++) {
			Ex04 person = new Ex04();
			System.out.println("이름 : ");
			//String name = sc.next();
			//person.setName(name);
			person.setName(sc.next());
			
			System.out.println("국어 : ");
			int kor = sc.nextInt();
			
			System.out.println("영어 : ");
			int eng = sc.nextInt();
			
			System.out.println("수학 : ");
			int math = sc.nextInt();
	
			
			//합계
			person.s_sum(kor, eng, math);
			
			//평균
			person.s_avg();
			//학점
			person.s_hak();
			
			arr[i] = person;
		}
		// 순위
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {
					int k = arr[i].getRank();
					arr[i].setRank(++k);
				}
			}
		}
		
		//정렬
		
		Ex04 tmp = new Ex04();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp=arr[i];
					arr[i]= arr[j];
					arr[j]= tmp;
				}
			}	
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + " ");
			System.out.print(arr[i].getSum() + " ");
			System.out.print(arr[i].getAvg() + " ");
			System.out.print(arr[i].getHak() + " ");
			System.out.println(arr[i].getRank() + " ");
		}
		
		
	}

}
