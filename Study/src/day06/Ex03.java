package day06;

/*
 	
���� 3]
	
	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	�̶�� �迭�� �غ��ϰ� 
	
	79456���� �غ�� ȭ�� ������ ����� �� ������ ȭ������� ���
	�ʿ����� ������ ������ �迭�� ����� 
	
	����ϴ� ���α׷��� �ۼ��ϼ���.
	
	 
 */
public class Ex03 {

	public static void main(String[] args) {
		// ȭ������� �迭 �غ�
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		// ī��Ʈ �Ͽ� ������ �迭�� �غ��ϰ�
		int[] cnt = new int[8];
		
		// ���� ���� 79456 �� ���� ������ �����
		int result = 79456;
		
		for(int i =0; i< coin.length ;i++) {
			cnt[i] = result/coin[i];
			result = result%coin[i];
			
			System.out.println(coin[i]+ " : " + cnt[i]);
		}
	
	}

}
