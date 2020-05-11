package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 숫자를 받아서 홀수, 짝수를 구분하자.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int su1 = sc.nextInt();
		String result = "";
		if (su1%2 == 0) {
			result = "짝수";			
		}else {
			result = "홀수";
		}
		System.out.println("결과 : " + result);
		
		
		//나라를 입력하면 수도가 출력되게 하자
		// 1.한국=서울 2. 중국=베이징 3.일본=도쿄)
		
		System.out.println("나라입력 : 		// 1.한국=서울 2. 중국=베이징 3.일본=도쿄)\r\n ");
		int num = sc.nextInt();
		if(num == 1) 
			result ="서울";
		else if (num == 2) {
			result = "베이징";
		}
		else if(num == 3) {
			result = "도쿄";
		}else {
			result = "데이터 없음";
		}
	
		System.out.println("결과 : " + result);
		

		
		System.out.println("나라 입력 : 한국,중국, 일본");
		String country = sc.next();
		result = "";
		switch (country) {
		case "한국": result = "서울"; break;
		case "중국": result = "베이징"; break;
		case "일본": result = "도쿄"; break;
		default: result ="데이터 없음"; break;
		}
		System.out.println("결과 : "+ result);
	
		
		//근무시간이 8시간까지는 시간당 8590이고
		//8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 근무시간을 입력해서 알바금액을 산정하자
		System.out.println("알바시간 : ");
		int time = sc.nextInt();
		int dan = 8590;
		int pay = 0;
		if (time>8) {
			pay = (8 * dan)+(int)((time-8)*dan*1.5);
		}else {
			pay = dan * time;
		}
		System.out.println("알바비 : " + pay);
		
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000내고 먹었다. 
		// 메뉴를 고른 결과와 잔돈을 출력하시오. (단, 부가세 10% 포함)
		System.out.println("menu 선택 : \n1. 카페모카(3500원)\n2. 카페라떼(4000)\n3. 아메리카노(3000) \n4. 과일쥬스(3500)" );
		int menu = sc.nextInt();
		int dan2 = 0;
		String drink2 = "";
		if (menu == 1) {
			dan2 = 3500 ;
			drink2 = "카페모카";
		}else if (menu == 2) {
			dan2 = 4000 ;
			drink2 = "카페라떼";
		}else if (menu == 3) {
			dan2 = 3000 ;
			drink2 = "아메리카노";
		}else if (menu == 4) {
			dan2 = 3500 ;
			drink2 = "과일쥬스>>";
		}
		int su3 = 2;
		int total2 = dan2 * su3 ;
		int vat2 = (int) (total2 * 0.1) ;
		int input2 = 10000;
		int output2 = input2 - (total2 + vat2);
		System.out.println("잔돈 : " + output2);
	
	
	
	
	}
}
