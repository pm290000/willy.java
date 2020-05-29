package com.ict.edu01;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		String pathName = "c:"+File.separator+"study"+File.separator+"util"+File.separator+"test.txt" ; //위치
		File file = new File(pathName);
		try {
			file.createNewFile();
			boolean res = file.createNewFile();
			if (res) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
			}
		} catch (IOException e) {
			System.out.println("파일 생성 실패");
			System.out.println("파일경로가 틀렸습니다.");
		}
		
		System.out.println("========================");
		String pathName2 = "c:"+File.separator+"study"+File.separator+"util"+File.separator+"test" ; //위치
		File file2 = new File(pathName2);

		
			boolean res = file2.mkdir();
			if (res) {
				System.out.println("디렉토리 생성 성공");
			}else {
				//경로가 틀리거나 같은 디렉토리가 있으면 실패
				System.out.println("디렉토리 생성 실패");
			}
			System.out.println("========================");
		
			//파일 삭제, 디렉토리 삭제 => delete()
			
			String pathName3 = "c:"+File.separator+"study"+File.separator+"util"+File.separator+"test.txt" ; //위치
			File file3 = new File(pathName3);
			try {
				file.createNewFile();
				boolean res3 = file.delete();
				if (res3) {
					System.out.println("파일 삭제 성공");
				}else {
					System.out.println("파일 삭제 실패");
				}
			} catch (IOException e) {
				System.out.println("========================");
				
				
				
			}
			String pathName4 = "c:"+File.separator+"study"+File.separator+"util"+File.separator+"test" ; //위치
			File file4 = new File(pathName4);

			
				boolean res4 = file2.delete();
				if (res4) {
					System.out.println("디렉토리 삭제 성공");
				}else {
					//경로가 틀리거나 같은 디렉토리가 있으면 실패
					System.out.println("디렉토리 생성 실패");
				}
				System.out.println("========================");
			
			
			
			
		}
	}

