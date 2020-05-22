package com.ict.edu;


import java.util.Random;

public class Test1 {
   public static void main(String[] args) {
//	1   Random 클래스를 활용해서 정수 1-10 사이의 난 수를 구하시오
      Random ran = new Random();
      System.out.println("난수생성 10까지 : " + ran.nextInt(11));
   }
}