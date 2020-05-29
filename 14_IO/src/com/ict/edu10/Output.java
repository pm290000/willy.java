package com.ict.edu10;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {

	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io14.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		Scanner sc = new Scanner(System.in);
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			ArrayList<VO> list = new ArrayList<VO>();
			while (true) {
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("국어 : ");
				int kor = sc.nextInt();
				System.out.println("영어 : ");
				int eng = sc.nextInt();
				System.out.println("수학 : ");
				int math = sc.nextInt();
				
				VO vo = new VO(name, kor, eng, math);
				list.add(vo);
				
				System.out.println("계속할까요? (y/n");
				String msg = sc.next();
				if(msg.equalsIgnoreCase("n"))break;
			}
			
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
