package com.ict.edu;

public class Test {
   public static void main(String[] args) {
//	1-5번  int su = 24  일때  삼항연산자를 활용해서 홀수인지, 짝수인지 판별할 수 있는 코딩을 쓰시오

      int su = 24;
      String res = (su % 2 == 0) ? "짝수" : "홀수";
      System.out.println(res);
   }
}