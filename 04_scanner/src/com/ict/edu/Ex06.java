package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 이름 :
		// 국어 점수:
		// 영어 점수:
		// 수학점수:
		// 평균:
		// 학점:
		Scanner sc = new Scanner(System.in);

		esc: while (true) {
//정보 입력받기
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어점수 : ");
			int k1 = sc.nextInt();
			System.out.print("영어점수 : ");
			int k2 = sc.nextInt();
			System.out.print("수학점수 : ");
			int k3 = sc.nextInt();

			int sum = k1 + k2 + k3;// 총점
			double arg = (int) (sum / 3.0) / 10.0;// 평균
			String hak = "";

			if (arg >= 90) {
				hak = "A학점";
			} else if (arg >= 80) {
				hak = "B학점";
			} else if (arg >= 70) {
				hak = "C학점";
			} else {
				hak = "D학점";
			}

			System.out.println("이름 : " + name);
			System.out.println("국어점수 : " + k1);
			System.out.println("영어점수 : " + k2);
			System.out.println("수학점수 : " + k3);

			System.out.println("총점은 : " + sum);
			System.out.println("평균은 : " + arg);
			System.out.println("학점은 : " + hak);
			// 정보가공
			while (true) {
				System.out.println("다시하시겠습니까?(1.yes/2.no)");
				int k4 = sc.nextInt();
				if (k4 == 1) {
					continue esc;
				} else if (k4 == 2) {
					break esc;
				} else {
					System.out.println("제대로 입력하세요");
					continue;
				}

			}
		}
		System.out.println("수고하셨습니다.");
	}
}
