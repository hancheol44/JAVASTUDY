package day10;

import java.util.Arrays;

/**
 *  이 클래스는 점수 그 점수의 총점, 평균을 기억할 클래스이다. 
 * @author 이한철
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

// 총점함수
public void sumscore() {
	for(int i = 0 ; i < no1.length ; i++) {
		sumscore += no1[i];
	}
}


// 입력된 점수의 평균을 구하는 함수
public void numavg() {
	avg = sumscore/10;
}


public void toPrint() {
	System.out.print("입력점수 : "+ Arrays.toString(no1) + "\n총점 : "+ sumscore+ "     평균 : " + avg);
	System.out.println();
}

}
	
	
	
	
	
	
	
	
	
	

