package com.ict.edu07;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.ict.edu06.VO;

public class Output {
	
		public static void main(String[] args) {
			String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io10.txt";
			File file = new File(pathname);
			FileOutputStream fos =null;
			BufferedOutputStream bos = null;
			ObjectOutputStream oos = null;
			
			try {
				fos = new FileOutputStream(file);
				bos = new BufferedOutputStream(fos);
				oos = new ObjectOutputStream(bos);
				
			
				//여러개의 객체 정보를 담아 보자
				VO vo1 = new VO("고길동",34,70.4,true);
				VO vo2 = new VO("장형욱",27,61.4,true);
				VO vo3 = new VO("박민희",27,49.4,true);
				VO vo4 = new VO("이연호",26,63.4,true);
				VO vo5 = new VO("김미미",27,50.4,false);
				
				ArrayList<VO> list = new ArrayList<VO>();
				list.add(vo1);
				list.add(vo2);
				list.add(vo3);
				list.add(vo4);
				list.add(vo5);
				
				// 객체직렬화
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
