package day10;

import java.util.Arrays;

/*
	��ȭ�н�
	
	�ֱ� 5�⵿���� ����� �迭�� ��Ƽ� �����Ϸ��� �Ѵ�.
	int[][] gion = new int[5][2];
	
	�� �����
	ù��° �濡�� ����� -20 ~ 40 ���� �����ϰ� �Է��ϰ�
	�ι�° �濡�� ������ 1 ~ 5���� �ε��� ���������� ä����������.		
													
 */
public class Bonus01 {

	public static void main(String[] args) {
		int[][] gion = new int[5][2];
		
		for(int i = 0 ; i < gion.length ; i++) {
			for(int j = 0 ; j < gion[i].length ; j++) {
				int degree = (int)(Math.random()*(61))-20;
				gion[i][0] = degree;
				gion[i][1] = i+1; 
			}
		}
		System.out.println(Arrays.deepToString(gion));
		System.out.println("******************************");
		
		
		for(int i = 0 ; i < gion.length ; i++) {
			int no1 = i;
			for(int j = 0 ; j < gion[i].length ; j++) {
				if(j==0) {
					gion[i][j] = (int)(Math.random()*(61))-20;
				} else {
					++no1;
					gion[i][j] = no1;
				}
			}
		}
		//�� if����� for�����θ� �̿��ؼ��� ������
		
		
		
		System.out.println(Arrays.deepToString(gion));
		System.out.println("******************************");
		for(int i = 0 ; i < gion.length -1 ; i++) {
			
			for(int j = i+1 ; j < gion.length ; j++) {
				if(gion[i][0] > gion[j][0]) {
					int[] tmp = gion[i];
					gion[i] = gion[j];
					gion[j] = tmp;
				}
			}
		}
		for(int i = 0 ; i < gion.length ; i++) {
			gion[i][1] = i+1;
		}
			
		System.out.print(Arrays.deepToString(gion));
		
	}
	


}
