package day11.bonus;
/*
  	2���� �迭 ��������
  	
  	5����
  	���� ���� ���� ���� �ڵ� ���� �� ����, ����� ��Ÿ����
  	
  	���� ������ ��յ� ���� �����Ǿ��ִ� 2���迭�� ���弼��
  	
 */
import java.util.*;
public class Bonus01 {
	
	public static void main(String[] args) {
		
		double[][] grade = new double[7][7];
		
		
		// ���� ���� �������� �����Ͽ� �迭�� �־��ش�.
		for(int i = 0 ; i < grade.length-2 ; i++) {
			for(int j = 0 ; j < grade[i].length-2 ; j++) {
				grade[i][j] = (int)(Math.random()*(100-60+1)+60);
			}
		}
//		System.out.println(Arrays.deepToString(grade));
		
		
		// �л��� ������ ����� �����Ͽ� �迭�� �־��ش�.
		
		for(int i = 0 ; i < grade.length; i++) {
			
			int sum = 0; 
			int sum1 = 0; 
			
			for(int j = 0 ; j < grade[i].length ; j++) {
				
				if(j != 5 && j !=6) {
					sum += grade[i][j];
					sum1 += grade[j][i];
				} else if(j == 5) {
					grade[i][j] = sum;
					grade[j][i] = sum1;
				} else if(j == 6) {
					grade[i][j] = (sum / 5.);
					grade[j][i] = (sum1 / 5.);
				}
				System.out.print(grade[i][j]+ "  |  ");
			}
			System.out.println();
			
		}
		System.out.println("===============================================================");
	
	/*	
		// �ϼ��� �迭�� ���� ������ ����� �־� �ϼ���Ų��.
		
		for(int i = 0 ; i < grade.length; i++) {
			
			int sum1 = 0; 
			
			for(int j = 0 ; j < grade[i].length ; j++) {
				
				if(j != 5 && j != 6) {
					sum1 += grade[j][i];
				} else if (j == 5) {
					grade[j][i] = sum1;
				} else if (j == 6) {
					grade[j][i] = (sum1 / 5.);
				}
				System.out.print(grade[j][i]+" | ");
				
			}
			System.out.println();
		}
		*/
		
	}
	
}
