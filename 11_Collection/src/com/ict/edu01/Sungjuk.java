package com.ict.edu01;

import java.util.Scanner;

public class Sungjuk {
   public static void main(String[] args) {
      // 5명의 이름, 국어, 영어, 수학을 입력받아서
      // 이름, 총점, 평균, 학점, 순위를 구하고 정렬하자
      
      Scanner sc = new Scanner(System.in);
     
      Person[] arr = new Person[5];

      for (int i = 0; i < arr.length; i++) {
         Person person = new Person();
         System.out.print("이름 : ");
        
         person.setName(sc.next());
         
         System.out.print("국어점수 : ");
         int kor = sc.nextInt();
         
         System.out.print("영어점수 : ");
         int eng = sc.nextInt();         
      
         System.out.print("수학점수 : ");
         int math = sc.nextInt();
         
         //합계
         person.s_sum(kor, eng, math);
         
         //평균
         person.s_avg();
         
         //학점
         person.s_hak();
      
         arr[i] = person ;
      }
      
      
      // 순위
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr.length; j++) {
            if (arr[i].getSum() < arr[j].getSum()) {
               int k = arr[i].getRank();
               arr[i].setRank(++k);
            }
         }
      }
      
      
      // 정렬
      Person tmp = new Person();
      for (int i = 0; i < arr.length-1; i++) {
         for (int j = i+1; j < arr.length; j++) {
            if (arr[i].getRank() > arr[j].getRank()) {
               tmp=arr[i];
               arr[i]= arr[j];
               arr[j]= tmp;
            }
         }
         
      }
      
      //출력
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i].getName()+" ");
         System.out.print(arr[i].getSum()+" ");
         System.out.print(arr[i].getAvg()+" ");
         System.out.print(arr[i].getHak()+" ");
         System.out.println(arr[i].getRank());
         
      }
   }
}