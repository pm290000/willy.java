class Ex07{
	public static void main(String[] args){
	//수의 연산에 따른 자료형 변환
	//연산 후 무조건 큰 자료형으로 변경됨
	//예외) byte, short는 연산하면 무조건 int 이상의 자료형으로 변경
	byte su1 = 20;
	int su2 = 25;
	int su3 = 30;
	long su4 = 35;

	float su5 = 34.1f;
	double su6 = 247.12;

	// byte(short) + byte = int
	int res1 = su1 + su1 ;
	System.out.println(res1);

	// byte(short) + short = int
	int res2 = su1 + su2 ;
	System.out.println(res2);

	// byte(short) + int = int
	// byte(short) + long = long
	// byte(short) + float = float
	// byte(short) + double = double

	// int + int = int
	// int + long = long
	// int + float = float
	// int + double = double

	// long + long = long
	// long + int = long
	// long + float = float
	// long + double = double

	//float + float = float
	//float + double = double



	//소숫점 둘째자리 까지 구하자 ,like a dollar
	double num1 = 83.5555;
	int num2 = (int)(num1 * 100) ;
	double num3 =num2 / 100.0 ;
	System.out.println(num3);


	//10의자리 절삭하기 ,like a won\
	int num4 = 12758 ;
	int num5 = num4 / 10 ;
	int num6 = num5 * 10;
	System.out.println(num6);
	
	}
}