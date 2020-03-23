package day02;

import java.util.*;
/*
 * 
 * 키보드로 입력받아 계산하는 방법으로 작성하세요
 * 
 * 2. 반지름이 7인 원의 넓이, 둘레를 계산해서 출력하세요.
	  		   단, 반지름, 둘레, 넓이는 변수를 만들어서 처리를 하세요.
	  		   그리고 둘레는 float 타입의 변수로 만드세요.
	  		   
	  			원의 둘레 : 2 * 반지름 * PI (3.14)
	  			원의 넓이 : 반지름 * 반지름 * PI (3.14)
	  			
	  			
	  		3. 두개의 숫자(정수)를 변수에 담고
	  		   두 수를 가로, 세로로 하는 사각형의 넓이를 구하세요.
	  		   
	  		4. 3번 문제의 두 수를 밑변과 높이로 하는 삼각형의 넓이를 구하세요.
	  		
	  		5. 54232원을 지불해야한다. 
	  		   우리나라의 화폐로 각 단위가 몇개나 필요한지 계산해서 출력하세요.
	  		   5만원권 1장, 1만원권 0장, 5천원권 0장, 천원권 4장, ...
 */
public class Ex02 {
	public static void main(String[] args) {

		// 2. 반지름 입력받아 원의 넓이, 둘레 구하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름(정수)을 입력해주세요 : ");
		final double PI = 3.14;
		int banji1 = sc.nextInt();
		float result = (float)(2*banji1*PI);
		double result1 = banji1*banji1*PI;
		System.out.println("원의 둘레는 "+ result +" 입니다.");
		System.out.println("원의 넓이는 "+ result1+" 입니다.");
		

		//3. 두개의 숫자(정수)를 변수에 담고
		//   두 수를 가로, 세로로 하는 사각형의 넓이를 구하세요.
		
		System.out.print("사각형의 가로를 입력해주세요 : ");
		int garo1 = sc.nextInt();
		System.out.println("");
		System.out.print("사각형의 세로를 입력해주세요 : ");
		int sero2 = sc.nextInt();
		
		System.out.println("입력하신 사각형의 가로"+ garo1 +" 세로"+ sero2+"이며");
		System.out.println("사각형의 넓이는"+ garo1 * sero2 +" 입니다.");
		
		
		// 두 수를 밑변과 높이로 하는 삼각형의 넓이를 구하세요.
		
		System.out.print("삼각형의 가로를 입력해주세요 :");
		int garo3 = sc.nextInt();
		System.out.print("삼각형의 높이를 입력해주세요 :");
		int high = sc.nextInt();
		
		System.out.println("삼각형의 넓이는"+(garo3*high)/2+"입니다");
		
		
		// 입력받은 금액이 각 단위가 얼마나 필요한지 출력되게하세요.
		
		System.out.println("금액을 입력해주세요 : ");
		int money = sc.nextInt();
		
		int pr500 = money/50000;
		money %= 50000;
		int pr100 = money/10000;
		money %= 10000;
		int pr50 = money/5000;
		money %= 5000;
		int pr10 = money/1000;
		money %= 1000;
		int pr5 = money/500;
		money %= 500;
		int pr1 = money/100;
		money %= 100;
		int pr11 = money/10;
		money %= 10;
		int pr111 = money/1;
		
		System.out.println("입력받은 금액 5만원권은"+ pr500 +"장 입니다." );
		System.out.println("입력받은 금액 1원권은"+ pr100 +"장 입니다." );
		System.out.println("입력받은 금액 5천원권은"+ pr500 +"장 입니다." );
		System.out.println("입력받은 금액 5만원권은"+ pr500 +"장 입니다." );
		System.out.println("입력받은 금액 5만원권은"+ pr500 +"장 입니다." );
		System.out.println("입력받은 금액 5만원권은"+ pr500 +"장 입니다." );
		System.out.println("입력받은 금액 5만원권은"+ pr500 +"장 입니다." );
		System.out.println("입력받은 금액 5만원권은"+ pr500 +"장 입니다." );
		
		
		 
		
	}
}
