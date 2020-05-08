package com.ict.edu;

import java.lang.invoke.SwitchPoint;

public class Ex04 {
	public static void main(String[] args) {
		// switch ~case : if ���� ���� ���ǹ�
		// if���� ���ǽ��� boolean���̴�. �� �񱳿���, ��������, boolean���� ���
		// switch ���� ���ڰ��� byte, short, int, char, String �϶� ���
		// switch(���ڰ�){
		// case ���ǰ�1 : ���ڰ��� ���ǰ�1�� ������ ������ ���� ; break;
		// case ���ǰ�2 : ���ڰ��� ���ǰ�1�� ������ ������ ���� ; break;
		// case ���ǰ�3 : ���ڰ��� ���ǰ�1�� ������ ������ ���� ; break;
		// default : ���ǰ�1,2,3 ��� ���� ���� �� ������ ����;
		// }
		// break �� ������ break�� ������ ���� ��� ���๮�� ����
		// break ������ �������ϰ� �ִ� ������ ����� ����

		// char k1�� A�̸� ������ī B�̸� ����� C�� ĳ���� ������ �ѱ�
		char k1 = 'A';
		String res = "";

		switch (k1) {
		case 'A':
			System.out.println("������ī");
			break;
		case 'B':
			System.out.println("�����");
			break;
		case 'C':
			System.out.println("�ɳ���");
			break;
		default:
			System.out.println("�ѱ�");
			break;
		}
		char k2 = 'B';
		switch (k2) {
		case 'A':
			res = "������ī";
			break;
		case 'B':
			res = "�����";
			break;
		case 'C':
			res = "�ɳ���";
			break;
		default:
			res = "�ѱ�";
			break;
		}
		System.out.println("" + res);
		// char k3�� A,a�̸� ������ī B,b�̸� ����� C,b�� ĳ���� ������ �ѱ�
		char k3 = 'b';
		switch (k3) {
		case 'A':

			break;
		case 'a':
			res = "������ī";
			break;

		case 'B':

		case 'b':
			res = "�����";
		case 'C':

		case 'c':
			res = "�ɳ���";

		default:
			res = "�ѱ�";
			break;
		}
		System.out.println("��� : " + res);

		// int k4�� 1 �Ǵ� 3�̸� ����, 2 �Ǵ� 4�̸� ����
		int k4 = 1;

		switch (k4) {
		case 1:
			res = "����";
		case 3:
			res = "����";
			break;
		case 2:
			res = "����";
		case 4:
			res = "����";
			break;
		}
		System.out.println("��� : " + res);

		// String k5�� �ѱ��̸� ���� , �߱��̸� �ϰ�, �Ϻ��̸� ����, �̱��̸� ������
		String k5 = "�߱�";

		switch (k5) {
		case "�ѱ�":
			res = "����";
			break;
		case "�߱�":
			res = "�ϰ�";
			break;
		case "�Ϻ�":
			res = "����";
			break;
		case "�̱�":
			res = "������";
			break;
		}

		System.out.println("��� : " + res);

		// switch���� ������ �о����� ������� ���� (if�� �������)
		// int k6�� ������ 90�̻��̸� A����, 80�̻��̸� B����,
		// 70�̻��̸� C����, ������ F
		int k6 = 94;
		switch ((int) (k6 / 10)) {
		case 10:
			break;
		case 9:
			res = "A";
			break;
		case 8:
			res = "B";
			break;
		case 7:
			res = "C";
			break;

		default:
			res = "F";
			break;
		}

		System.out.println("��� : " + res);
	}
}