package exam;
/*
	  JOptionPane ���� ���ڸ� �Է¹޾Ƽ�
	  �迭�� ����� 
	  �迭�� ����� �� �ִ� ������ŭ ���ڸ� �Է¹޾Ƽ� 
	  �� ���ڵ��� ���� �����ִ� ���α׷��� �ۼ��ϼ���
	  ��, ���� ���ϴ� ����� �Լ��� ���� ó���ϼ���. 
 */
import javax.swing.*;

import java.util.*;

public class Ex01 {
	
	public Ex01() {
		
		String str = JOptionPane.showInputDialog("���ϴ� �迭���̸� ������ �Է����ּ���!");
		
		int ArrayNum = Integer.parseInt(str);
		
		int[] Array = new int[ArrayNum];
		
		setArray(Array);
		
		int alladd = addArray(Array);
		
		JOptionPane.showMessageDialog(null, "������� �迭�� ���� : "+str+"\n�迭�� ���� :"+Arrays.toString(Array)
										+"\n�迭�� ������ ������ ���� : "+alladd);
		  
	}
	
	public int[] setArray(int...a) {
		
		for(int i = 0 ; i < a.length; i++) {
			a[i] = (int)(Math.random()*(10-1+1)+1);
		}
		return a;
	}
	
	
	public int addArray(int...a) {
		int num = 0;
		for(int i = 0 ; i < a.length ; i++) {
			num += a[i];
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		new Ex01();

	}

}
