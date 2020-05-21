package com.ict.edu01;

import java.util.Scanner;

public class Ex05 {
private String name;
private int sum;
private double avg;
private String hak;
private int rank = 1;

Scanner sc = new Scanner(System.in);

public void s_sum(int kor, int eng, int math) {
	sum= kor+eng+math;
}
//평균
public void  s_avg() {
	avg = (int)(sum/3.0*10)/10.0;
}
//학점
public void s_hak() {
	if (sum>=90) {
		hak = "A";
	}else if(sum>=80) {
		hak = "B";
	}else if(sum>=70) {
		hak = "C";
	}else{
		hak = "F";
	}
	
	
	//GETTER ///SETTER
}
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
