package day09;
/*
0.  			2���� �迭 char Ÿ�Կ� 
  			1,2,3,4,5,6,7,8,9,10
  			A,B,C,D,E,F,G,H,I,J
  			��,��,��,��,��,��,��,��,��,��
  			�� ���
  
  �� �迭�� �̿��Ͽ�
  		1.	���ڿ� �빮�ڸ� �����Ͽ� ���� �迭
  		2.  ���ڿ� �ѱ� ���� ���� �迭
  		
  			����
  		3.	1,A,�� ���� ������� �� char[][] ch3 = new char[10][3] �� �����
  		4.  �� �迭�� ������� ���ڿ� �빮��
  		5.                     ����   �ѱ�
  			
  			
  			
 */
import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		char[][] ch = new char[][] {
									 	{'0','1','2','3','4','5','6','7','8','9'},
										{'A','B','C','D','E','F','G','H','I','J'},
										{'��','��','��','��','��','��','��','��','��','��'}
									};
		
		
		
									
									
									
		for(int i = 0 ; i < ch.length ; i++) {
			
			for(int j = 0 ; j < ch[i].length ; j++) {
				
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------");
		
		char[][] ch1 = new char[2][10];  // ���ڿ� �빮�� 
		
		for(int i = 0 ; i < ch1.length ; i++) {

			for(int j = 0 ; j < ch1[i].length ; j++) {
				
				ch1[i][j] = ch[i][j];
			System.out.print(ch1[i][j]);
		
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------");
		
		char[][] ch2 = new char[2][10];  // ���ڿ� �ѱ�
		
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
		
		char[][] ch3 = new char[10][3];  // ch �� �迭 n��°�� ���� �迭�� ������ 2�����迭
		
		for(int i = 0 ; i < ch3.length ; i++) {
			
			for(int j = 0 ; j < ch3[i].length ; j++) {
				
				ch3[i][j] = ch[j][i];
				System.out.print(ch3[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------");
		
		char[][] ch4 = new char[10][2];  // ���ڿ� �빮�ڰ� ��µǰ� �ϼ��� 
		
		for(int i = 0 ; i < ch4.length ; i++) {
			
			for(int j = 0 ; j < ch4[i].length ; j++) {
				
				ch4[i][j] = ch[j][i];
				System.out.print(ch4[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------");
		
		char[][] ch5 = new char[10][2];   //���ڿ� �ѱ��� ��µǰ� �ϼ���
		
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
