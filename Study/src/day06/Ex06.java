package day06;
/*
 
문제 6]

	팩토리얼 10개를 저장할 배열을 만들고
	1부터 순차적으로 10까지의 팩토리얼을 만들어서 배열에 담고 
	꺼내서 출력하세요.	


 		  		 	  			 
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
