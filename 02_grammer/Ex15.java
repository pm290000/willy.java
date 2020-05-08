class Ex15{
	public static void main(String[] args){
	// 논리 연산자 : &&(AND, 논리곱), ||(OR, 논리합), !(NOT, 논리부정)
	// 논리 연산자의 대상(들어오는 정보) : boolean형, 비교연산, 논리연산
	// 논리 연산의 결과는 boolean형 즉, 조건식에 사용된다.

	// AND ( &&, 논리곱)
	// - 주어진 조건이 모두 true 일때 결과는 true
	// - 주어진 조건들 중 flase를 만나면 결과는 false
	// - false를 만나면 이후 연산을 하지 않음
	// - ' a >= 10 && <= 20 ' 의 의미는 a는 10부터 20까지의 범위를 의미한다.


	int su1 = 10 ;
	int su2 = 7 ;
	boolean result = false;  //초기값은 의미가 없는 값
	result = (su1 >= 7) && (su2 >=5);    //true =  true && true
	System.out.println("결과 : " + result);

	result = (su1 >= 7) && (su2 <=5);   // false = true && false
	System.out.println("결과 : " + result);

	result = (su1 <= 7) && (su2 >=5);    // false = fase && true
	System.out.println("결과 : " + result);

	result = (su1 <= 7) && (su2 <=5);   // false = false && false
	System.out.println("결과 : " + result);
	System.out.println("============================");


	result = ((su1 = su1 + 2) > su2) && (su1 == (su2 = su2 + 5));
	System.out.println("결과 : " + result);
	System.out.println("su1 : " + su1);
	System.out.println("su2 : " + su2);

	//AND는 false를 만나면 결과는 false 이고, 뒤 조건은 연산하지 않는다.
	System.out.println("============================");
	result = ((su1 = su1 + 2) < su2) && (su1 == (su2 = su2 + 5));
	System.out.println("결과 : " + result);
	System.out.println("su1 : " + su1);
	System.out.println("su2 : " + su2);


	su1 = 34;
	// su1의 값이 20~30 사이의 값이냐?
	result = (su1 >=20) && (su1<=30);
	System.out.println("결과: " + result);

	// char c1이 소문자이냐 ?
	char c1 = 'g' ;
	result = (c1>=97) && (c1<=122);
	System.out.println("결과: " + result);


	result = (c1>='a') && (c1<='z');
	System.out.println("결과: " + result);

	}
}