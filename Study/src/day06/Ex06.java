package day06;
/*
 
���� 6]

	���丮�� 10���� ������ �迭�� �����
	1���� ���������� 10������ ���丮���� ���� �迭�� ��� 
	������ ����ϼ���.	


 		  		 	  			 
 */
public class Ex06 {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i = 0; i<num.length; i++) {
			int result = 1;
			for(int j = 1; j <=i+1; j++) {
				result = result * j;
				num[i] = result;
			}
			System.out.println(num[i]);
		}
	}

}
