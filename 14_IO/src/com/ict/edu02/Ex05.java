package com.ict.edu02;

import java.io.File;
import java.io.FileInputStream;

public class Ex05 {
	public static void main(String[] args) {
		String pathname 
			= "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io02.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			byte[] b = new byte[(int) file.length()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
		} catch (Exception e) {
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
