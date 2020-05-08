package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 if문 : if문을 여러개 사용한 문
		// 형식) if(조건식1){
		// 조건식1이 참일때 실행문장;
		// }else if(조건식2){
		// 조건식1은 거짓이고, 조건식2가 참인 경우 실행문장;
		// }else if(조건식3){
		// 조건식1,2는 거짓이고, 조건식3이 참인경우 실행문장;
		// }else{
		// 조건식1,2,3 모두 거짓일때 , 즉 나머지
		// }

		// int k1의 점수가 90이상이면 A학점, 80이상이면 B학점,
		// 70이상이면 C학점, 나머지 F
		int k1 = 55;
		String str = "";
		if (k1 >= 90) {
			str = "A학점";
		} else if (k1 >= 80) {
			str = "B학점";
		} else if (k1 >= 70) {
			str = "C학점";
		} else {
			str = "F학점";
		}

		System.out.println("결과 : " + str);

		// char k2가 대문자인지, 소문자 인지, 숫자인지, 기타문자 인지
		// 선별하시오
		char k2 = 'ㅁ';
		str = "";
		if (k2 >= 'a' && k2 <= 'z') {
			str = "소문자";
		} else if (k2 >= 'A' && k2 < 'Z') {
			str = "대문자";
		} else if (k2 >= 0 && k2 >= 9) {
			str = "숫자";
		} else {
			str = "기타문자";
		}

		System.out.println("결과 : " + str);

		// char k3가 A, a이면 아프리카 B,b이면 브라질 C,c는 캐나다 나머지 한국
		char k3 = 'a';
		str = "";
		if (k3 == 'A' || k3 == 'a') {
			str = "아프리카";

		} else if (k3 == 'B' || k3 == 'b') {
			str = "브라질";
		} else {
			str = "한국";
		}

		System.out.println("결과 : " + str);

		// menu가 1이면 카페모카 3500원 2이면 카페라떼 4000, 3이면 아메리카노 3000원
		// 4이면 과일쥬스 3500원, 친구와 2잔을 10,000원 내고 먹었다
		// 잔돈은 얼마인가? (단, 부가세 10% 포함)
		int menu = 3;
		
		if (menu == 1) {
			int dan = 3500;
			String drink ="카페모카";
			int su =2;
			int total = dan *su ;
			int vat = (int)(total *0.1);
			int input = 10000;
			int output = input - (total + vat);
			
			System.out.println("잔돈 : " + output);
			
			
		} else if (menu == 2) {
			int dan = 4000;
			String drink ="카페라떼";
			int su =2;
			int total = dan *su ;
			int vat = (int)(total *0.1);
			int input = 10000;
			int output = input - (total + vat);
			
			System.out.println("잔돈 : " + output);
		} else if (menu == 3) {
			int dan = 3000;
			String drink ="아메리카노";
			int su =2;
			int total = dan *su ;
			int vat = (int)(total *0.1);
			int input = 10000;
			int output = input - (total + vat);
			
			System.out.println("잔돈 : " + output);
		}

		else if (menu == 4) {
			int dan = 3500;
			String drink ="과일쥬스";
			int su =2;
			int total = dan *su ;
			int vat = (int)(total *0.1);
			int input = 10000;
			int output = input - (total + vat);
			
			System.out.println("잔돈 : " + output);
		}

		System.out.println("=======리팩토링 : 1. 중복코딩을 줄이자======");
		
		int dan2 = 0 ;
		String drink2 = "";
		
		
		if (menu ==1) {
			dan2 = 3500;
			drink2 = "카페모카";
			
		}else if (menu ==2) {
			dan2 = 4000;
			drink2 = "카페라떼";
			
		}
		else if (menu ==3) {
			dan2 = 3000;
			drink2 = "아메리카노";
			
		}
		else if (menu ==4) {
			dan2 = 3500;
			drink2 = "과일쥬스";
			
		}
		int su =2;
		int total = dan2 *su ;
		int vat = (int)(total *0.1);
		int input = 10000;
		int output = input - (total + vat);
		System.out.println("잔돈 : " + output);
		
	}
}
