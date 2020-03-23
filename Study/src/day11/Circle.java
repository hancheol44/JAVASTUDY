package day11;
/*
	 
	 문제 1 ]
	 	이 클래스는 원의 정보를 저장할 클래스이다.
	 	이 클래스가 객체가 될때 반지름을 입력받아서 원에 대한 정보가 
	 	입력이 되게 클래스를 정의 하세요.
	 	
		반지름이 입력이 안 될 경우는 10으로 입력되게 하세요.   
 */
public class Circle {
	// 이 클래스는 원에 대한 정보를 기억하는 클래스이므로 
	// 반지름, 둘레, 넓이를 기억하면 될 것이다.
	
	int banji;
	
	double arround, area;
	
	
	// 기본생성자함수
	public Circle() {
		this(10);   // 입력이 되지 않을 경우 10으로 
	}
	
	
// 생성자 함수 오버로딩
public Circle(int banji) {
	this.banji = banji;
	this.arround = setArround(banji);
	this.area = setArea(banji);
}


// 원의 둘레를 구하는 함수
public double setArround(int banji) {
	return 2 * banji * 3.14;

}


// 원의 넓이를 구하는 함수

public double setArea(int banji) {
	return banji * banji * 3.14;
}
	
public void toPrint() {
	System.out.printf("반지름 : %5d | 원의둘레 : %7.2f | 원의 넓이 : %7.2f\n",banji,arround,area);
}
	
	
	
}
