class Ex05{
	public static void main(String[] args){
	// �Ǽ� : �Ҽ����� ����
	// float < double
	// �Ǽ��� �⺻ double

	//float�� ���� �ڿ� �ݵ�� F, f �� �ٿ��� �Ѵ�. (�����ϸ� ����)
	//24�� �����̹Ƿ� float�� �Ǽ� �׷��Ƿ� ������ �� �ִ�.
	float su1 = 24 ;
	System.out.println(su1);
	
	//31.4�� f ,F�� �ٿ��� �����߻����� ����
	float su2 = 3.14f ;
	System.out.println(su2);

	//char c1�� float�� ������ �� �ִ�.
	char c1 = 97 ;
	System.out.println(c1);

	float su3 = c1;
	System.out.println(su3);


	//double �� byte, char , int, long , float ��� �޾Ƽ� ������ �� �ִ�.
	double su4 = 3.14 ;
	System.out.println(su4);


	double su5 = su3;
	System.out.println(su5);

	double su6 = c1;
	System.out.println(su6);
	}
}
