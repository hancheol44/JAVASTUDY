package day09;
/*
0.  			2차원 배열 char 타입에 
  			1,2,3,4,5,6,7,8,9,10
  			A,B,C,D,E,F,G,H,I,J
  			가,나,다,라,마,바,사,아,자,차
  			를 담고
  
  위 배열을 이용하여
  		1.	숫자와 대문자를 추출하여 담은 배열
  		2.  숫자와 한글 추출 담은 배열
  		
  			다음
  		3.	1,A,가 부터 순서대로 즉 char[][] ch3 = new char[10][3] 을 만들고
  		4.  위 배열의 모양으로 숫자와 대문자
  		5.                     숫자   한글
  			
  			
  			
 */
import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		char[][] ch = new char[][] {
									 	{'0','1','2','3','4','5','6','7','8','9'},
										{'A','B','C','D','E','F','G','H','I','J'},
										{'가','나','다','라','마','바','사','아','자','차'}
									};
		
		
		
									
									
									
		for(int i = 0 ; i < ch.length ; i++) {
			
			for(int j = 0 ; j < ch[i].length ; j++) {
				
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------");
		
		char[][] ch1 = new char[2][10];  // 숫자와 대문자 
		
		for(int i = 0 ; i < ch1.length ; i++) {

			for(int j = 0 ; j < ch1[i].length ; j++) {
				
				ch1[i][j] = ch[i][j];
			System.out.print(ch1[i][j]);
		
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------");
		
		char[][] ch2 = new char[2][10];  // 숫자와 한글
		
		for(int i = 0 ; i < ch2.length  ; i++) {
			
			for(int j = 0 ; j < ch2[i].length ; j++) {
				
				int no = i;
				
				if(i == 1) {
					no = i+1;
				}
				ch2[i][j] = ch[no][j];
				
				System.out.print(ch2[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------");
		
		char[][] ch3 = new char[10][3];  // ch 각 배열 n번째를 같은 배열로 가지는 2차원배열
		
		for(int i = 0 ; i < ch3.length ; i++) {
			
			for(int j = 0 ; j < ch3[i].length ; j++) {
				
				ch3[i][j] = ch[j][i];
				System.out.print(ch3[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------");
		
		char[][] ch4 = new char[10][2];  // 숫자와 대문자가 출력되게 하세요 
		
		for(int i = 0 ; i < ch4.length ; i++) {
			
			for(int j = 0 ; j < ch4[i].length ; j++) {
				
				ch4[i][j] = ch[j][i];
				System.out.print(ch4[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------");
		
		char[][] ch5 = new char[10][2];   //숫자와 한글이 출력되게 하세요
		
		for(int i = 0 ; i < ch5.length ; i++) {
			
			for(int j = 0 ; j < ch5[i].length ; j++) {
				
				int no = j;
				if(j == 1) {
					no = j+1;
				}
				ch5[i][j] = ch[no][i];
				System.out.print(ch5[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
