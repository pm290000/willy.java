package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else : 조건식이 참일때와 거짓일때 각각 나눠서 처리한다.
		// 형식 : if(조건식){
		// 조건식이 참일때 실행 문자;
		// 조건식이 참일때 실행 문자;
		// 조건식이 참일때 실행 문자;
		// }else{
		// 조건식이 거짓일때 실행 문장;
		// 조건식이 거짓일때 실행 문장;
		// }

		// int k2 이 60 이상이면 합격, 60미만은 불합격
		int k2 = 2;
		String result = "0";
		if (k2 >= 60) {
			result = "합격";
		} else {
			result = "불합격";
		}

		System.out.println("결과 : " + result);
		// 홀수 짝수 판별
		int k3 = 3;
			result = "0";
		if (k3/2==0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		
		System.out.println("결과 : "+ result);
		
		// 대문자, 소문자 판별
		char k4 = 'g';
		result = "0";
		if (k4<'z' && k4>'a') {
			result = "소문자";
		}else {
			result = "대문자";
		}
		
		System.out.println("결과 : " + result);
		
		
		// 1 또는 3이면 남자, 아니면 여자

		int k5 = 5;
		result = "0";
		
		if (k5==1 || k5==3) {
			result = "남자";
		}else {
			result = "여자";
		}
		
		System.out.println("결과 : " + result);

				
		// 근무시간이 8시간까지는 8590원이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무시간이 10이다.
		// 얼마를 받아야 하는가?

		int time =10;
		int dan = 8590;
		int pay = 0;	
				
				
		if (time>8) {
			pay = (8*dan) + (int)((time -8)*dan*1.5);
		} else {pay = dan* time;

		}
		System.out.println("결과 : " + pay);

		
		
		
		
		// 두 수 중 큰 값을 출력하시오.
		int k6 = 5;
		int k7 = 8;
		result = "0";
		if (k6>k7) {
			result = "k6" ;
		}else {
			result = "k7";
		}
		System.out.println("결과 : " + result);

		
		
		
	}
}
