package day06;
/*
 
문제 5]

	피보나치 수열 10개를 저장할 배열을 만들고 
	배열에 값을 입력해서 
	배열에 저장된 데이터를 출력하세요.
	 
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
