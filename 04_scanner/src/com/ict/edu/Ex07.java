package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 입금액과 메뉴를 입력받고
		// 메뉴: 1. 커피음료(3500), 2. 이온음료(2500), 3.물(1500) 4. 과일 쥬스(4000)원
		// 선택한 음료, 입금액, 잔돈 출력(부가세10% 포함)
		Scanner sc = new Scanner(System.in);

		esc: while (true) {
			// 정보 입력
			System.out.println("입금액 : ");
			int mon = sc.nextInt();

			System.out.println(
					"메뉴: 1. 커피음료(3500),\n2. 이온음료(2500), \n3. 물(1500) \n4. 과일 쥬스(4000)원\n선택한 음료, 입금액, 잔돈 출력\n(부가세10% 포함))");

			int menu = sc.nextInt();
			//정보가공
			String drink = "";
			int dan = 0;
			int su = 1;
			switch (menu) {
			case 1: drink = "커피음료"; dan = 3500;break;
			case 2: drink = "이온음료"; dan = 2500;break;
			case 3: drink = "물"; dan = 1500;break;
			case 4: drink = "과일쥬스"; dan = 4000;break;
			}
			int tony= su*dan;
			int total = (mon - (tony + (int) (tony * 0.1)));
			System.out.println("선택한 음료 : " + drink);
			System.out.println("입금액 : " + mon);
			System.out.println("잔돈 : " + total);
			while (true) {
				System.out.println("다시하시겠습니까?(1.yes/2.no)");
				int s1 = sc.nextInt();
				if (s1 == 1) {
					continue esc;
				} else if (s1 == 2) {
					break esc;
				} else {
					System.out.println("제대로 입력하세요");
					continue;
				}

			}
		}
		System.out.println("맛있게 드세요");
	}
}
