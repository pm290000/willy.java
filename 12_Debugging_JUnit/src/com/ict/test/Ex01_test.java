package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex01;


//	JUnit : (메소드 단위 테스트) 도구, 이클립스에서 기본적으로 제공
//	블랙박스 테스트 : 입력값을 넣어서 예상값이 일치하면 성공,
//						예상값이 일치하지 않으면 실패
//	assertEquals : 기본형 변수 또는 객체의 값이 예상값과 일치한지 검사하는 메소드
//	assertSame	 : 두 객체가 같은 객체인지 검사 (주소가 같나?)
//	assertNull	 : null인지 검사
//	assertNotNull: null이 아닌지 검사
//	assertTrue(a): a가 참인지 검사
//	assertArrayEquals(a,b) : 배열a, 배열b가 일치한지 확인

public class Ex01_test {
	Ex01 t1;
	
	//	테스트 전 : 실행할 메소드의 클래스를 객체 생성하자
	@Before		// 에노테이션 : 주석의 일종으로 컴파일러에게 지시를 내리는 것
	public void tBefore() {
		System.out.println("실행 클래스를 객체 생성하자");
		t1 = new Ex01();
	}
	
	
	//	테스트를 실행하는 메소드
	@Test
	public void addtest() {
		// 메소드를 실행한 결과값
		int res = t1.add(10, 20);
		// expected=> 예상값, => 결과값
		assertEquals(30, res);
	}
	@Test
	public void subtest() {
		// 메소드를 실행한 결과값
		int res = t1.sub(1, 5);
		// expected=> 예상값, => 결과값
		assertEquals(-4, res);
	}
	
	@After
	public void tAfter() {
		System.out.println("테스트 실행 후 메소드 실행");
		
	}
	

}
