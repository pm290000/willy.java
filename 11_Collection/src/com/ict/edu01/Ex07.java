package com.ict.edu01;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex07 {
	// 로또 번호 : 1- 45, 렌덤, 중복 안됨, 6자리
	// TreeSet : 오름차순 정렬
	public static void main(String[] args) {

		TreeSet<Integer> lotto1 = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int) (Math.random() * 45) + 1;
			if (!lotto1.add(k)) {
				i--;
			}
		}
		System.out.println(lotto1);
	}
}