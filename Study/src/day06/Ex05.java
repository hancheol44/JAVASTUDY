package day06;
/*
 
���� 5]

	�Ǻ���ġ ���� 10���� ������ �迭�� ����� 
	�迭�� ���� �Է��ؼ� 
	�迭�� ����� �����͸� ����ϼ���.
	 
 */
public class Ex05 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		int small = 0;
		int big = 1;
		
		for(int i = 0 ; i < num.length; i++) {
			int result = small + big;
			for(int j =1; j<=i;j++)
				small = big;
				big = result;
				num[i] = big;
			
			System.out.print(num[i]+", ");
		}
	}

}
