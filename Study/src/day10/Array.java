package day10;

import java.util.Arrays;

/**
 *  �� Ŭ������ ���� �� ������ ����, ����� ����� Ŭ�����̴�. 
 * @author ����ö
 *
 */
public class Array {
	int[] no1;
	
	int score;
	
	int sumscore;
	
	double avg;
	
public void input() {
	
	no1 = new int[10];
	
	for(int i = 0 ; i < no1.length ; i++) {
		no1[i] = (int)(Math.random()*(100-0+1));
	
	}
	
}

// �����Լ�
public void sumscore() {
	for(int i = 0 ; i < no1.length ; i++) {
		sumscore += no1[i];
	}
}


// �Էµ� ������ ����� ���ϴ� �Լ�
public void numavg() {
	avg = sumscore/10;
}


public void toPrint() {
	System.out.print("�Է����� : "+ Arrays.toString(no1) + "\n���� : "+ sumscore+ "     ��� : " + avg);
	System.out.println();
}

}
	
	
	
	
	
	
	
	
	
	

