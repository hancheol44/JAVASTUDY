package day03;


import java.util.*;
public class Ex04 {
/*
  	���� 4]
  		�μ� ��ȣ�� �Է��ϸ� 
  		�μ� �̸��� ������ִ� ���α׷��� �ۼ��ϼ���.
  		
  		10 - �ѹ���
  		20 - ȸ���
  		30 - ������
  		40 - �����
  		
  		
 */
	public Ex04() {
		solv();
	}
	
	public void solv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("10   20    30    40   etc");
		System.out.println("�� 4���� �μ���ȣ�� �̸��� �ñ��� �μ� �Ѱ��� �Է����ּ��� : ");
		int num = sc.nextInt();
		
		String result;
		
		if (num == 10) {
			result = "�ѹ���";
		} else if (num == 20) {
			result = "ȸ���";
		} else if (num == 30) {
			result = "������";
		} else if (num == 40) {
			result = "�����";
		} else {
			result = "������ȸ��";
		}

		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}
