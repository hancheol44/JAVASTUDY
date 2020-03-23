package day08;


import java.util.*;
import javax.swing.*;

public class Ex01 {

	public static void main(String[] args) {
		new Ex01();

	}
	
public Ex01() {
    //	solv00();   //ok
	//	solv01();
    //	solv02();   //ok
    //	comm1();    //ok
}
public void solv00() {
	/*
	 	�������� ����ϴµ�
	�ܰ� ���� �迭�� ���� ó���ϰ� ����ϼ���.
	-------------------
	 | ��    |    �� |
	-------------------
	
	int[] dan = {2, 3, ... 9};
	int[] gop = {1, 2, 3,... 9};
	�ʱ�ȭ�� �ݺ�������
	
	int[][] gugudan = {dan, gop};
	
	������´�
		2 x 1 = 2
		..
		2 x 9 = 18
		-------------
		3 x 1 = 3
		.... 
	 */
	int[] dan = new int[8];
	int[] gop = new int[9];
	
	int[][] gugudan = {dan,gop};
	
	for(int i = 0 ; i < dan.length ; i++) {
		dan[i] = i+2;
	}
	
	for(int i = 0 ; i < gop.length ; i++) {
		gop[i] = i+1;
	}
	
	System.out.println(Arrays.toString(dan));
	System.out.println(Arrays.toString(gop));
	for(int i = 0 ; i < gugudan[0].length ; i++) {
		
		for(int j = 0 ; j < gugudan[1].length ; j++) {
			System.out.println(gugudan[0][i]+" X "+gugudan[1][j]+" = "+(gugudan[0][i]*gugudan[1][j]));
		}
		System.out.println("------------------------------");
	}
	
}

public void solv01() {
	/*
	 
	�츮�� �л����� ������ �迭�� �����Ϸ��� �Ѵ�.
	�̸� , ��ȭ��ȣ , �̸��� �� �迭�� ���·� ����� �����ϰ�
	�ٽ� ������ �����͸� �����ؼ� �迭�� ����� ����ϼ���.
	
	 */

	String[] name1 = {"��ҿ�","�ֵο�","�����","������","������","�Ӽ���"};
	String[] tel1 = {"010-1111-1111","010-2222-2222","010-3333-3333","010-5555-5555",
					"010-8888-8888","010-9999-9999"};
	String[] mail1 = {"pengsoon@increpas.com","dDragon@increpas.com",
					"victory@increpas.com","nobody@increpas.com",
					"bell@increpas.com","leem@increpas.com"};
	

	String[] name2 = {"������","������","�輺��","�����","����ö"};
	String[] tel2 = {"010-1123-1111","010-4522-2222","010-3663-3333","010-5515-5545",
					"010-8238-8128"};
	String[] mail2 = {"pen1oon@increpas.com","dD6agon@increpas.com",
					"vic3ory@increpas.com","no7y@increpas.com",
					"b5l@increpas.com"};
	
	
	
}
public void solv02() {
	/*
	 
	����, ����, ����, ����, ���� ������ �����Ϸ��� �Ѵ�. (������ �����ϰ� �����ϼ���.)
	�л��� ���� 5���̰� 
	2���� �迭�� ���� 
	5���� ������ ������ �迭�� ���弼��.
	
	
	 */
	int[][] exam = new int[5][6];
	
	for(int i = 0 ; i < exam.length ; i++) {
		for(int j = 0 ; j < exam[i].length ; j++) {
			exam[i][0] = 1000+i; 
			exam[i][j] = (int)(Math.random()*(101));
			
		}
	}
//	System.out.println(Arrays.deepToString(exam));
	for(int i = 0 ; i < exam.length ; i++) {
		
		System.out.println("-----------------------");
		for(int j = 0 ; j < exam[i].length ; j++) {
			System.out.printf("%4d",exam[i][j]);
		}
		System.out.println();
	}
	System.out.println();
	
	/*
	2������ 
	������ ������ ����� �߰��ؼ� �����Ϸ��� �մϴ�.	
	2�� ������ �迭�� ���̸� �������Ѽ� ó���ϼ���...
	 */
	double[][] result = new double[5][8];
	/*
	result[0][0] = exam[0][0];
	result[0][1] = exam[0][1];
	*/
	for(int i = 0 ; i < exam.length ; i++) {
		for(int j = 0 ; j < exam[i].length ; j++) {
			result[i][j] = exam[i][j];
			if(j != 0) {
				result[i][6] += exam[i][j];
			}
		}
		result[i][7] = result[i][6] / 5 ;
	}
	
//	System.out.println(Arrays.deepToString(result));
	for(int i = 0 ; i < result.length ; i++) {
		
		System.out.println("-------------------------------------------------------");
		for(int j = 0 ; j < result[i].length ; j++) {
			System.out.print(result[i][j] + " | ");
		}
		System.out.println();
	}
	



	
	
	
	
	
	
	
}

public void comm1() {
	String str = "PengSoo Good!";
	char[] spel = new char[str.length()];
	
	for(int i = 0 ; i < str.length(); i++) {
		spel[i] = str.charAt(i);
	}
	
	/*
	// ������ �����ϰ� ������ ��� ���
	for(int i = 0 ; i < spel.length ; i++) {
		if(spel[i] != ' ') {
			char tmp = spel[i];
			System.out.print(tmp+", ");
		}
	}
	*/	
	
	/* �⺻���� �迭�� �ϳ��� �̾� ����Ѵ�.
	for(int i = 0 ; i < spel.length ; i++) {
		char tmp = spel[i];
		System.out.print(tmp+", ");
	}
	System.out.println();
	*/
}


}
