package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else : ���ǽ��� ���϶��� �����϶� ���� ������ ó���Ѵ�.
		// ���� : if(���ǽ�){
		// ���ǽ��� ���϶� ���� ����;
		// ���ǽ��� ���϶� ���� ����;
		// ���ǽ��� ���϶� ���� ����;
		// }else{
		// ���ǽ��� �����϶� ���� ����;
		// ���ǽ��� �����϶� ���� ����;
		// }

		// int k2 �� 60 �̻��̸� �հ�, 60�̸��� ���հ�
		int k2 = 2;
		String result = "0";
		if (k2 >= 60) {
			result = "�հ�";
		} else {
			result = "���հ�";
		}

		System.out.println("��� : " + result);
		// Ȧ�� ¦�� �Ǻ�
		int k3 = 3;
			result = "0";
		if (k3/2==0) {
			result = "¦��";
		}else {
			result = "Ȧ��";
		}
		
		System.out.println("��� : "+ result);
		
		// �빮��, �ҹ��� �Ǻ�
		char k4 = 'g';
		result = "0";
		if (k4<'z' && k4>'a') {
			result = "�ҹ���";
		}else {
			result = "�빮��";
		}
		
		System.out.println("��� : " + result);
		
		
		// 1 �Ǵ� 3�̸� ����, �ƴϸ� ����

		int k5 = 5;
		result = "0";
		
		if (k5==1 || k5==3) {
			result = "����";
		}else {
			result = "����";
		}
		
		System.out.println("��� : " + result);

				
		// �ٹ��ð��� 8�ð������� 8590���̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�.
		// ���� �ٹ��ð��� 10�̴�.
		// �󸶸� �޾ƾ� �ϴ°�?

		int time =10;
		int dan = 8590;
		int pay = 0;	
				
				
		if (time>8) {
			pay = (8*dan) + (int)((time -8)*dan*1.5);
		} else {pay = dan* time;

		}
		System.out.println("��� : " + pay);

		
		
		
		
		// �� �� �� ū ���� ����Ͻÿ�.
		int k6 = 5;
		int k7 = 8;
		result = "0";
		if (k6>k7) {
			result = "k6" ;
		}else {
			result = "k7";
		}
		System.out.println("��� : " + result);

		
		
		
	}
}
