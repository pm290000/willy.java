package com.ict.edu;

import java.lang.invoke.SwitchPoint;

public class Ex04 {
	public static void main(String[] args) {
		// switch ~case : if 문과 같이 조건문
		// if문은 조건식이 boolean형이다. 즉 비교연산, 논리연산, boolean형을 사용
		// switch 문은 인자값이 byte, short, int, char, String 일때 사용
		// switch(인자값){
		// case 조건값1 : 인자값과 조건값1과 같을때 수행할 문장 ; break;
		// case 조건값2 : 인자값과 조건값1과 같을때 수행할 문장 ; break;
		// case 조건값3 : 인자값과 조건값1과 같을때 수행할 문장 ; break;
		// default : 조건값1,2,3 모두 같지 않을 때 수행할 문장;
		// }
		// break 가 없으면 break를 만날때 까지 모든 실행문을 실행
		// break 역할은 현실행하고 있는 범위를 벗어나는 역할

		// char k1이 A이면 아프리카 B이면 브라질 C는 캐나다 나머지 한국
		char k1 = 'A';
		String res = "";

		switch (k1) {
		case 'A':
			System.out.println("아프리카");
			break;
		case 'B':
			System.out.println("브라질");
			break;
		case 'C':
			System.out.println("케나다");
			break;
		default:
			System.out.println("한국");
			break;
		}
		char k2 = 'B';
		switch (k2) {
		case 'A':
			res = "아프리카";
			break;
		case 'B':
			res = "브라질";
			break;
		case 'C':
			res = "케나다";
			break;
		default:
			res = "한국";
			break;
		}
		System.out.println("" + res);
		// char k3이 A,a이면 아프리카 B,b이면 브라질 C,b는 캐나다 나머지 한국
		char k3 = 'b';
		switch (k3) {
		case 'A':

			break;
		case 'a':
			res = "아프리카";
			break;

		case 'B':

		case 'b':
			res = "브라질";
		case 'C':

		case 'c':
			res = "케나다";

		default:
			res = "한국";
			break;
		}
		System.out.println("결과 : " + res);

		// int k4가 1 또는 3이면 남자, 2 또는 4이면 여자
		int k4 = 1;

		switch (k4) {
		case 1:
			res = "남자";
		case 3:
			res = "남자";
			break;
		case 2:
			res = "여자";
		case 4:
			res = "여자";
			break;
		}
		System.out.println("결과 : " + res);

		// String k5이 한국이면 서울 , 중국이면 북경, 일본이면 동경, 미국이면 워싱턴
		String k5 = "중국";

		switch (k5) {
		case "한국":
			res = "서울";
			break;
		case "중국":
			res = "북경";
			break;
		case "일본":
			res = "동경";
			break;
		case "미국":
			res = "워싱턴";
			break;
		}

		System.out.println("결과 : " + res);

		// switch문은 범위가 넓어지면 사용하지 말자 (if문 사용하자)
		// int k6의 점수가 90이상이면 A학점, 80이상이면 B학점,
		// 70이상이면 C학점, 나머지 F
		int k6 = 94;
		switch ((int) (k6 / 10)) {
		case 10:
			break;
		case 9:
			res = "A";
			break;
		case 8:
			res = "B";
			break;
		case 7:
			res = "C";
			break;

		default:
			res = "F";
			break;
		}

		System.out.println("결과 : " + res);
	}
}
