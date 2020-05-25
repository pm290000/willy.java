package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex02;

public class Ex02_test {
	Ex02 ex2 ;
	@Before
	public void nulTest() {
		ex2 = new Ex02();
	}
	
	@Test
	public void test() {
		int res = ex2.mul(3,2);
		assertEquals(15,res);
	}
	
	
	@After
	public void tAfter() {
		System.out.println("테스트 실행 후 메소드 실행");
	}

}
