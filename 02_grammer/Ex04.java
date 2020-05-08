class Ex04{
	public static void main(String[] args){
	//숫자 : 정수형(소숫점이 없음) < 실수형(소숫점이 있음)
	//정수형 : byte < short < ing < long

	//실수형 : float < double
	//실수형의 기본은 double

	//byte : 정수형중 가장 작은 단위 (-128 ~127 사이의 숫자만 저장 가능)
	byte b1 =  127 ;
	System.out.println(b1);
	
	//계산식은 결과만 저장된다.
	//byte b2 = 15 + 120 ;
	//System.out.println(b2);

	//Short : -32.768~32,767사이의 값만 저장
	short s1 = -32767;
	System.out.println(s1);

	short s2 = 32767;
	System.out.println(s2);

	//int와 long은 숫자 범위를 외울 필 요 없다.
	//앞으로 일반적인 정수는 int사용
	//아주 큰 정수를 사용할 때 long사용

	int su1 = 247 ;
	int su2 = 7777777;
	System.out.println(su1);
	System.out.println(su2);

	//long : int보다 더 넓은 범위를 가지고 있음
	//	기본적으로 숫자 뒤에 L 또는 l을 붙인다.(생략 가능,붙이는게 좋음(자동형변환))
	long num1 = 124L;
	System.out.println(num1);


	long num2 = 124;
	System.out.println(num2);
	
	// 정수 su1 을 long num3에 저장
	long num3 = su1 ;
	System.out.println(num3);

	// short s1을 long num4에 저장
	long num4 = su1 ;
	System.out.println(num4);
	// short s1을 int su3에 저장
	int su3 = s1;
	System.out.println(su3);

	char c1 = '가';
	System.out.println(c1);

	int su4 = c1;
	System.out.println(su4);

	}
}