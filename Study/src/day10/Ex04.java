package day10;
/*
 	
	�л��� ������ �Է��ϸ� ������ ������ִ� ���α׷��� �����ϼ���.
	�����μ�
-------------------------------------------------------------------	
	��ȭ ]
		�����ϰ� �ο����� �����
		�� �ο��� ��ŭ ������ �����ϰ� ����
		�Լ��� �����ϰ� �ϼ���.
 
 */


// ���������� ����Ÿ������ �����ϰ� 
import java.util.*;
import javax.swing.*;

public class Ex04 {
	int addnum; // ������ ��ϵǰ�
	
	int group;  // �������� ��������� ��� �� 
	int[] people;  // ����� �迭 ����
	
	
	public Ex04() {
		per();   //�ο��� �߻��ϴ� �Լ� ����
//		System.out.println("����"+addnum); �׽�Ʈ��
		System.out.println("�����ϰ� ������� �ο� : "+group);
		
		people = new int[group]; // �� �ο���ŭ�� ���� ���� �迭 ����
		System.out.println("******************************");
		System.out.println("�ο��� : "+getSum(people));  // �迭 �� �濡 �����ϰ� ������ �����Ͽ� ������ �� �Լ��� �迭 �Է�   
		System.out.println("******************************");
		System.out.println("����"+addnum);  // ���� ���
	
	}
	// �ο����� �����ϰ� �߻���Ű�� �Լ�
	public int per() {
		group = (int)(Math.random()*(25-5+1)+5);
		
		return group;
	}
	
	public int getSum(int...person) {
		// �������� ������ ����� �� ��ŭ �������� ������ �߻��ǰ�
		// �� �������� ������ ������ִ� �Լ�.   
		for(int i = 0 ; i < person.length ; i++) {
			person[i] = (int)(Math.random()*(100-1+1)+1);
			addnum += person[i];
			System.out.println("����  "+(i+1)+" : "+person[i]);
		}
		System.out.println();
		System.out.println("���� : "+addnum);
		return person.length;
	}
	
	public static void main(String[] args) {
		new Ex04();
		
	}
	
	

}


