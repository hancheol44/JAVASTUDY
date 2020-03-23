package day01;



public class Ex01 {
	/*
	  		1.  1, 2, 5, 10, 20 을 제외한 숫자 하나를 가정하고 (양수, 음수 모두)
	  			이것을 2진수로 바꿔보고
	  			실제 프로그램의 결과와 일치하는지 확인하세요.
	  			
	  			
	  			비트코드 확인 방법
	  			Integer.toBinaryString(숫자)
	  			
	  		2. 반지름이 7인 원의 넓이, 둘레를 계산해서 출력하세요.
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
	  		   
	  	숙제]
	  		1년은 365.2426일 이다.
	  		이 날짜는 과연 몇일, 몇시간, 몇분, 몇초인지 계산해서 출력하세요.
	  	
	  	
	  	
	--------------------------------------------------------------------------  			
	 */
	
	
	//1번    모름
	public static void main(String[] args) {
		int x = 10;
		System.out.println("10 : " + Integer.toBinaryString(x));
		
		
		
		//2
		
		
		
		
		
		
		final double PI = 3.14;
		
		int banji = 7;
		float dull = (float)(2*banji*PI);
		double sjfq = banji*banji*PI;
		
		System.out.println("원의 둘레는 : " + dull +"입니다.");
		System.out.println("원의 넓이는 : " + sjfq +"입니다.");
		
		//3
		
		
		
		int garo = 10;
		int sero = 11;
		int sq = garo*sero;
		int tri = (garo*sero)/2;
		
		
		System.out.println("사각형의 넓이는 : "+ sq + "입니다.");
		System.out.println("삼각형의 넓이는 : "+ tri +"입니다.");
		
		
		//4
		int pri = 54223;
		int pr500 = pri/50000;
		pri %= 50000;
		int pr100 = pri/10000;
		int pr50 = pri/5000;
		int pr10 = pri/1000;
		pri %= 1000;
		int pr5 = pri/500;
		int pr1 = pri/100;
		pri %= 100;
		int pr55 = pri/50;
		int pr11 = pri/10;
		pri %= 10;
		int pr111 = pri/1;
		
		System.out.println(pri+"원은 각각"+ "5만원권" + pr500+"장 "+"1만원권"+ pr100+"장 "+ "5천원권" + pr50+ "장 "
				+ "1천원권"+pr10+"장 "+"500원"+pr5+"개 "+"100원"+pr1+"개 "+"50원"+ pr55 +"개 "+
				"10원"+pr11+"개 "+"1원"+pr111+"개 ");
		
		
		//숙제
		/*	1년은 365.2426일 이다.
  			이 날짜는 과연 몇일, 몇시간, 몇분, 몇초인지 계산해서 출력하세요.
  		*/
		
		double year = 365.2426;
		int dd = (int)year/1;
		
		int sec = (int)((year%1) * 24 * 60 * 60);
		int hh = sec / 3600;
		
		sec %= 3600;
		int mm = sec / 60;
		 
		sec %= 60;
		int ss = sec;
		
		System.out.println(year+"일은  "+ dd +"일"+ hh+"시간" + mm+ "분"+ ss+"초");
		
		
	}
}
