package day02;

import java.util.*;
/*
 * 
 * Ű����� �Է¹޾� ����ϴ� ������� �ۼ��ϼ���
 * 
 * 2. �������� 7�� ���� ����, �ѷ��� ����ؼ� ����ϼ���.
	  		   ��, ������, �ѷ�, ���̴� ������ ���� ó���� �ϼ���.
	  		   �׸��� �ѷ��� float Ÿ���� ������ ���弼��.
	  		   
	  			���� �ѷ� : 2 * ������ * PI (3.14)
	  			���� ���� : ������ * ������ * PI (3.14)
	  			
	  			
	  		3. �ΰ��� ����(����)�� ������ ���
	  		   �� ���� ����, ���η� �ϴ� �簢���� ���̸� ���ϼ���.
	  		   
	  		4. 3�� ������ �� ���� �غ��� ���̷� �ϴ� �ﰢ���� ���̸� ���ϼ���.
	  		
	  		5. 54232���� �����ؾ��Ѵ�. 
	  		   �츮������ ȭ��� �� ������ ��� �ʿ����� ����ؼ� ����ϼ���.
	  		   5������ 1��, 1������ 0��, 5õ���� 0��, õ���� 4��, ...
 */
public class Ex02 {
	public static void main(String[] args) {

		// 2. ������ �Է¹޾� ���� ����, �ѷ� ���ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������(����)�� �Է����ּ��� : ");
		final double PI = 3.14;
		int banji1 = sc.nextInt();
		float result = (float)(2*banji1*PI);
		double result1 = banji1*banji1*PI;
		System.out.println("���� �ѷ��� "+ result +" �Դϴ�.");
		System.out.println("���� ���̴� "+ result1+" �Դϴ�.");
		

		//3. �ΰ��� ����(����)�� ������ ���
		//   �� ���� ����, ���η� �ϴ� �簢���� ���̸� ���ϼ���.
		
		System.out.print("�簢���� ���θ� �Է����ּ��� : ");
		int garo1 = sc.nextInt();
		System.out.println("");
		System.out.print("�簢���� ���θ� �Է����ּ��� : ");
		int sero2 = sc.nextInt();
		
		System.out.println("�Է��Ͻ� �簢���� ����"+ garo1 +" ����"+ sero2+"�̸�");
		System.out.println("�簢���� ���̴�"+ garo1 * sero2 +" �Դϴ�.");
		
		
		// �� ���� �غ��� ���̷� �ϴ� �ﰢ���� ���̸� ���ϼ���.
		
		System.out.print("�ﰢ���� ���θ� �Է����ּ��� :");
		int garo3 = sc.nextInt();
		System.out.print("�ﰢ���� ���̸� �Է����ּ��� :");
		int high = sc.nextInt();
		
		System.out.println("�ﰢ���� ���̴�"+(garo3*high)/2+"�Դϴ�");
		
		
		// �Է¹��� �ݾ��� �� ������ �󸶳� �ʿ����� ��µǰ��ϼ���.
		
		System.out.println("�ݾ��� �Է����ּ��� : ");
		int money = sc.nextInt();
		
		int pr500 = money/50000;
		money %= 50000;
		int pr100 = money/10000;
		money %= 10000;
		int pr50 = money/5000;
		money %= 5000;
		int pr10 = money/1000;
		money %= 1000;
		int pr5 = money/500;
		money %= 500;
		int pr1 = money/100;
		money %= 100;
		int pr11 = money/10;
		money %= 10;
		int pr111 = money/1;
		
		System.out.println("�Է¹��� �ݾ� 5��������"+ pr500 +"�� �Դϴ�." );
		System.out.println("�Է¹��� �ݾ� 1������"+ pr100 +"�� �Դϴ�." );
		System.out.println("�Է¹��� �ݾ� 5õ������"+ pr500 +"�� �Դϴ�." );
		System.out.println("�Է¹��� �ݾ� 5��������"+ pr500 +"�� �Դϴ�." );
		System.out.println("�Է¹��� �ݾ� 5��������"+ pr500 +"�� �Դϴ�." );
		System.out.println("�Է¹��� �ݾ� 5��������"+ pr500 +"�� �Դϴ�." );
		System.out.println("�Է¹��� �ݾ� 5��������"+ pr500 +"�� �Դϴ�." );
		System.out.println("�Է¹��� �ݾ� 5��������"+ pr500 +"�� �Դϴ�." );
		
		
		 
		
	}
}
