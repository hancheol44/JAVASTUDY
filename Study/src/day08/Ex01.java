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
	 	구구단을 출력하는데
	단과 곱을 배열을 만들어서 처리하고 출력하세요.
	-------------------
	 | 단    |    곱 |
	-------------------
	
	int[] dan = {2, 3, ... 9};
	int[] gop = {1, 2, 3,... 9};
	초기화는 반복문으로
	
	int[][] gugudan = {dan, gop};
	
	출력형태는
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
	 
	우리반 학생들의 정보를 배열로 관리하려고 한다.
	이름 , 전화번호 , 이메일 을 배열의 형태로 만들어 관리하고
	다시 팀별로 데이터를 정리해서 배열을 만들고 출력하세요.
	
	 */

	String[] name1 = {"김소영","최두용","정우승","유태희","김종형","임서진"};
	String[] tel1 = {"010-1111-1111","010-2222-2222","010-3333-3333","010-5555-5555",
					"010-8888-8888","010-9999-9999"};
	String[] mail1 = {"pengsoon@increpas.com","dDragon@increpas.com",
					"victory@increpas.com","nobody@increpas.com",
					"bell@increpas.com","leem@increpas.com"};
	

	String[] name2 = {"손은진","이진수","김성현","김수진","이한철"};
	String[] tel2 = {"010-1123-1111","010-4522-2222","010-3663-3333","010-5515-5545",
					"010-8238-8128"};
	String[] mail2 = {"pen1oon@increpas.com","dD6agon@increpas.com",
					"vic3ory@increpas.com","no7y@increpas.com",
					"b5l@increpas.com"};
	
	
	
}
public void solv02() {
	/*
	 
	국어, 수학, 영어, 물리, 역사 점수를 관리하려고 한다. (점수는 랜덤하게 추출하세요.)
	학생의 수는 5명이고 
	2차원 배열로 만들어서 
	5명의 점수를 저장할 배열을 만드세요.
	
	
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
	2번에서 
	점수의 총점과 평균을 추가해서 관리하려고 합니다.	
	2번 문제의 배열의 길이를 증가시켜서 처리하세요...
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
	// 공백을 제외하고 변수에 담아 출력
	for(int i = 0 ; i < spel.length ; i++) {
		if(spel[i] != ' ') {
			char tmp = spel[i];
			System.out.print(tmp+", ");
		}
	}
	*/	
	
	/* 기본문제 배열을 하나씩 뽑아 출력한다.
	for(int i = 0 ; i < spel.length ; i++) {
		char tmp = spel[i];
		System.out.print(tmp+", ");
	}
	System.out.println();
	*/
}


}
