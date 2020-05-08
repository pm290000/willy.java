class Ex12{
	public static void main(String[] args){
	//3989초는 시.분.초?
	//1시간3600(60분*60)
	//1분->60초
	// 3989/3600= 1%389
	//389/60=6%29
	//1시간6분29초
	int time = 3989 ;
	int h = 0;
	int m = 0;
	int s = 0;
	int res = 0; //나머지
	

	//시간 구하기= 몫(3600을 나눈 몫이 시간)
	h = time / 3600 ; //int(몫) = int / int
	
	//나머지 구하기
	res = time % 3600 ;
	
	//분 구하기 = 몫
	m = res / 60 ;

	//초 구하기	
	s = res % 60 ;

	//출력하기
	System.out.println(time +"초는" + h +"시"+ m +"분" + s+ "초");
	

	}
}