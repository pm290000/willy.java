package com.ict.edu01;

import java.util.Scanner;

public class Ex04 {
//복습
	// 이름, 총점,평균,평점
	// 입력
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank;
	Scanner sc = new Scanner(System.in);
	

	// 합계구하기
	public void s_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}

	// 평균구하기
	public void s_avg() {
		avg = (int) (sum / 3.0 * 10) / 10.0;
	}
	// 학점구하기
	public void s_hak() {
		
		if (avg>=90) {
			hak = "A학점";
		}else if(avg>=80) {
			hak = "B학점";
		}else if (avg>=70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
	}
	//getter,setter
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	

	
	
	

}
