package day10;
/*
 
문제 1]

	원의 반지름, 둘레, 넓이를 저장할 클래스를 만들고 
	그 클래스 객체 10개를 배열로 관리할 배열을 만들어서 
	각 멤버를 초기화하고 
	출력하세요.
 */

// Circle 클래스 이용해서 하고있다.

import java.util.Arrays;

public class Ex01 {
	// circle 배열변수를 만든다.
	Circle[] circle;
	
	// circle 을 초기화 하는 함수를 만든다.
	
public void setCir() {
	// 배열을 초기화해준다 (문제의 값 : 10)
	circle = new Circle[10];
	
	// 이제 각 방에 데이터를 채워준다. 랜덤하게
	for(int i = 0 ; i < circle.length ; i++) {
		circle[i] = new Circle();
		
		int banji = (int)(Math.random()*(10-1+1)+1);
		double PI = 3.14;
		
		circle[i].setCir(banji, PI);
	}
	
}
	
	public static void main(String[] args) {
		Ex01 c = new Ex01();
		
		c.setCir();
		
		for(int i = 0 ; i < c.circle.length ; i++) {
			c.circle[i].toPrint();
			System.out.println("***********************");
		}
		System.out.println();
		
		
	}

}
