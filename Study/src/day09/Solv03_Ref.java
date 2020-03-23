package day09;
/**
 * 
	5 학생의 국어, 영어, 수학, 물리, 국사 점수를 입력 받아서 
	총점과 석차를 구하는 프로그램을 작성하세요.	
	단, 입력, 총점계산, 석차계산, 출력은 함수로 처리하세요.
	
	단, 배열은 [5][7] 의 형태로 만든다.
	
	
 * @author 이한철
 *
 */
import java.util.*;
public class Solv03_Ref {
	int[][] score;
	 
	
	public Solv03_Ref() {
		
	}
// 5과목의 점수 생성하는 함수
	public void score() {
		score = new int[5][7];
		
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length-2 ; j++) {
				
				score[i][j] = (int)(Math.random()*(100-60+1)+60);
			}
		}
	}
	
	  
	
// 5과목 점수를 총합을 구하는 함수
	public void addNum() {
		for(int i = 0 ; i < score.length ; i++) {
			int sumScore = 0;
			for(int j = 0 ; j < score[i].length-1; j++) {
				sumScore += score[i][j];
			}
			score[i][5] = sumScore;
		}
		System.out.println("***************** 총점 계산 후  ****************");
		System.out.println(Arrays.deepToString(score));
		System.out.println();
	}
	
	
// 5 학생의 석차를 구하는 함수 	
	public void grade() {
		for(int i = 0 ; i < score.length-1; i++) {
			for(int j = i+1 ; j < score.length ;j++) {
				if(score[i][5] < score[j][5]) {
					int[] tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		for(int i = 0 ; i < score.length ; i++) {
				score[i][6] = i+1;
			
		}
		System.out.println("***************** 석차계산 후 ****************");
		System.out.println(Arrays.deepToString(score));
		System.out.println();
		System.out.println("********************* 총 정리 후 *****************");
	}
	
	public void toPrint() {
		
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length-2 ; j++) {
				
				System.out.print(score[i][j]+ "  ");
			}
			System.out.println();
			System.out.print("총점 : "+ score[i][5] + "    석차 : " + score[i][6]+"등");
			System.out.println();
			System.out.println("------------------------------");
		}
	}
	

	
	
}