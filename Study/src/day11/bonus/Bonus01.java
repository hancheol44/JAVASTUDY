package day11.bonus;
/*
  	2차원 배열 연습문제
  	
  	5명의
  	국어 영어 수학 물리 코딩 점수 및 총점, 평균을 나타내고
  	
  	과목별 총점과 평균도 같이 정리되어있는 2차배열을 만드세요
  	
 */
import java.util.*;
public class Bonus01 {
	
	public static void main(String[] args) {
		
		double[][] grade = new double[7][7];
		
		
		// 과목별 점수 랜덤으로 생성하여 배열에 넣어준다.
		for(int i = 0 ; i < grade.length-2 ; i++) {
			for(int j = 0 ; j < grade[i].length-2 ; j++) {
				grade[i][j] = (int)(Math.random()*(100-60+1)+60);
			}
		}
//		System.out.println(Arrays.deepToString(grade));
		
		
		// 학생별 총점과 평균을 생성하여 배열에 넣어준다.
		
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
		// 완성된 배열에 과목별 총점과 평균을 넣어 완성시킨다.
		
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
