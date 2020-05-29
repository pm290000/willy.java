package com.ict.edu02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) {

		String pathname = "C:" +File.separator+ "study"+File.separator+"util"+File.separator+"io02.txt";
		File file =new File(pathname);
		FileOutputStream fos = null;
		try {fos = new FileOutputStream(file);
			String str = "phone \n010-9745-0916\n이름 :장형욱\n나이 : 27";
			byte[]b1 =str.getBytes();
			
			fos.write(b1);
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
