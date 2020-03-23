package day06;
/*
 
문제 4]

	반지름 5개를 기억할 배열을 만들고 									- 정수배열 1개
	
	랜덤하게 2 ~ 30까지의 5개의 반지름을 만들어서 입력하고				- Math.random()
	
	각각의 반지름을 가진 원의 넓이를 계산해서 저장할 배열을 만들고		- 실수배열(1)
		
	각 원의 둘레를 계산해서 저장할 배열도 만들어서 						- 실수배열(2)
	
	결과를 출력하는 프로그램을 작성하세요.								- 반복문으로 꺼내서 출력
	단, 출력형태는 
	
		예]
			반지름 : 10, 원의 둘레 : 62.8, 원의 넓이 : 314
			의 형태로 출력되게 하세요.			
 
 */
public class Ex04 {

	public static void main(String[] args) {
		
		int[] banji = new int[5];
		double[] result1 = new double[5]; // 원의 넓이 담을 배열
		double[] result2 = new double[5]; // 원의 둘레 닮을 배열
		double PI = 3.14;
		
		for(int i =0; i<5; i++) {
			int tmp = (int)(Math.random()*(30-2+1)+2);
			banji[i] = tmp;
			result1[i] = banji[i] * banji[i] * PI;
			result2[i] = banji[i] * 2 * PI;
			
			System.out.println("반지름 : " +banji[i]+", "+ "원의 넓이 : "+result1[i]+", "+ "원의 둘레 : "+result2[i]);
			
		}
	}

}
