package day10;
/*
 
���� 1]

	���� ������, �ѷ�, ���̸� ������ Ŭ������ ����� 
	�� Ŭ���� ��ü 10���� �迭�� ������ �迭�� ���� 
	�� ����� �ʱ�ȭ�ϰ� 
	����ϼ���.
 */

// Circle Ŭ���� �̿��ؼ� �ϰ��ִ�.

import java.util.Arrays;

public class Ex01 {
	// circle �迭������ �����.
	Circle[] circle;
	
	// circle �� �ʱ�ȭ �ϴ� �Լ��� �����.
	
public void setCir() {
	// �迭�� �ʱ�ȭ���ش� (������ �� : 10)
	circle = new Circle[10];
	
	// ���� �� �濡 �����͸� ä���ش�. �����ϰ�
	for(int i = 0 ; i < circle.length ; i++) {
		circle[i] = new Circle();
		
		int banji = (int)(Math.random()*(10-1+1)+1);
		double PI = 3.14;
		
		circle[i].setCir(banji, PI);
	}
	
}
	
	public static void main(String[] args) {
		Ex01 c = new Ex01();
		
		c.setCir();
		
		for(int i = 0 ; i < c.circle.length ; i++) {
			c.circle[i].toPrint();
			System.out.println("***********************");
		}
		System.out.println();
		
		
	}

}
