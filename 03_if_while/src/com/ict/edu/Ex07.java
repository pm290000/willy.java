package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// while 문 : for 문과 같은 반복문
		// 형식1 :
		// 초기식
		// while(조건식){
		// 조건식이 참일때 실행 ;
		// 증감식;
		// }
		// while문 끝을 만나면 무조건 조건식으로 가라

		// 형식2 :
		// 초기식
		// while(true){
		// if(빠져나갈 조건) break;
		// 조건식이 참일때 실행 ;
		// 증감식;
		// }
		// while문 끝을 만나면 무조건 조건식으로 가라

		// 0-10 까지 출력
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int k1 = 0;
		while (k1 < 11) {
			System.out.print(k1 + " ");
			k1++;
		}
		System.out.println();

		int k2 = 0;
		while (true) {
			if (k2 >= 11)
				break;
			System.out.print(k2 + " ");
			k2++;
		}
		System.out.println();

		// 0 - 10 까지 짝수만 출력
		int k3 = 0;
		while (k3 < 11) {
			if (k3 % 2 == 0) {
				System.out.print(k3 + " ");
			}
			k3++;
		}
		System.out.println();

		// 0 - 10 까지 홀수만 출력
		int k4 = 0;
		while (k4 < 11) {
			if (k4 % 2 == 1) {
				System.out.print(k4 + " ");
			}
			k4++;
		}
		System.out.println();

		// 0 - 50 까지 7의 배수 출력
		int k5 = 0;
		while (k5 < 51) {
			if (k5 % 7 == 0) {
				System.out.print(k5 + " ");
			}
			k5++;
		}
		System.out.println();

		// a - g 까지 출력
		char k6 = 'a';
		while (k6 < 'h') {
			System.out.print(k6 + " ");
			k6++;
		}
		System.out.println();

		// 5단 출력
		int k7 = 1;
		while (k7 < 10) {
			System.out.println("5 * " + k7 + " = " + (5 * k7));
			k7++;
		}
		System.out.println();

		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		int k8 = 1;
		while (k8 < 5) {
			System.out.println("0 0 0 0");
			k8++;
		}
		System.out.println();

		int k9 = 1;
		while (k9 < 17) {
			System.out.print("0 ");
			if (k9 % 4 == 0) {
				System.out.println();
			}
			k9++;
		}
		// 숙제
		// 0-10 누적합
		int sum = 0;
		int k10 = 0;
		while (k10 < 11) {

			sum = sum + k10;

			k10++;
		}
		System.out.println("누적합 :" + sum);

		// 0-10 홀수의 합계
		int odd = 0;
		int k11 = 0;
		while (k11 < 11) {
			if (k11 % 2 == 1) {
				odd = odd + k11;
			}

			k11++;
		}
		System.out.println("홀수의 합 : " + odd);
		// 0-10 짝수의 합계
		int even = 0;
		int k12 = 0;
		while (k12 < 11) {
			if (k12 % 2 == 0) {
				even = even + k12;
			}
			k12++;
		}
		System.out.println("짝수의 합 : " + even);

		// 0-10 홀수, 짝수의 합계
		odd = 0 ;
		even = 0 ;
		int k13 = 0;
		while (k13<11) {
			
			if (k13 % 2 == 0) {
				even = even + k13 ;
			} else {
				odd = odd + k13 ;
			}
			
			k13++;
		}
		
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);

		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1)

		sum = 1 ;
		int k14 = 7;
		
		while (k14>0) {
			
			sum = sum * k14 ;
			k14--;
		}
		System.out.println("7 ! : " + sum);
	}
	}
