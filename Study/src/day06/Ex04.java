package day06;
/*
 
���� 4]

	������ 5���� ����� �迭�� ����� 									- �����迭 1��
	
	�����ϰ� 2 ~ 30������ 5���� �������� ���� �Է��ϰ�				- Math.random()
	
	������ �������� ���� ���� ���̸� ����ؼ� ������ �迭�� �����		- �Ǽ��迭(1)
		
	�� ���� �ѷ��� ����ؼ� ������ �迭�� ���� 						- �Ǽ��迭(2)
	
	����� ����ϴ� ���α׷��� �ۼ��ϼ���.								- �ݺ������� ������ ���
	��, ������´� 
	
		��]
			������ : 10, ���� �ѷ� : 62.8, ���� ���� : 314
			�� ���·� ��µǰ� �ϼ���.			
 
 */
public class Ex04 {

	public static void main(String[] args) {
		
		int[] banji = new int[5];
		double[] result1 = new double[5]; // ���� ���� ���� �迭
		double[] result2 = new double[5]; // ���� �ѷ� ���� �迭
		double PI = 3.14;
		
		for(int i =0; i<5; i++) {
			int tmp = (int)(Math.random()*(30-2+1)+2);
			banji[i] = tmp;
			result1[i] = banji[i] * banji[i] * PI;
			result2[i] = banji[i] * 2 * PI;
			
			System.out.println("������ : " +banji[i]+", "+ "���� ���� : "+result1[i]+", "+ "���� �ѷ� : "+result2[i]);
			
		}
	}

}
