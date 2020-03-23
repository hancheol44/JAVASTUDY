package day09;
/**
 * 
	5 �л��� ����, ����, ����, ����, ���� ������ �Է� �޾Ƽ� 
	������ ������ ���ϴ� ���α׷��� �ۼ��ϼ���.	
	��, �Է�, �������, �������, ����� �Լ��� ó���ϼ���.
	
	��, �迭�� [5][7] �� ���·� �����.
	
	
 * @author ����ö
 *
 */
import java.util.*;
public class Solv03_Ref {
	int[][] score;
	 
	
	public Solv03_Ref() {
		
	}
// 5������ ���� �����ϴ� �Լ�
	public void score() {
		score = new int[5][7];
		
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length-2 ; j++) {
				
				score[i][j] = (int)(Math.random()*(100-60+1)+60);
			}
		}
	}
	
	  
	
// 5���� ������ ������ ���ϴ� �Լ�
	public void addNum() {
		for(int i = 0 ; i < score.length ; i++) {
			int sumScore = 0;
			for(int j = 0 ; j < score[i].length-1; j++) {
				sumScore += score[i][j];
			}
			score[i][5] = sumScore;
		}
		System.out.println("***************** ���� ��� ��  ****************");
		System.out.println(Arrays.deepToString(score));
		System.out.println();
	}
	
	
// 5 �л��� ������ ���ϴ� �Լ� 	
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
		System.out.println("***************** ������� �� ****************");
		System.out.println(Arrays.deepToString(score));
		System.out.println();
		System.out.println("********************* �� ���� �� *****************");
	}
	
	public void toPrint() {
		
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length-2 ; j++) {
				
				System.out.print(score[i][j]+ "  ");
			}
			System.out.println();
			System.out.print("���� : "+ score[i][5] + "    ���� : " + score[i][6]+"��");
			System.out.println();
			System.out.println("------------------------------");
		}
	}
	

	
	
}