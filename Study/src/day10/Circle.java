package day10;
/**
 * 	이 클래스는 원의 반지름, 둘레, 넓이를 기억할 클래스
 * @author 이한철
 * 
 *
 */
public class Circle {
	
	int banji;
	double PI;
	double area;
	double gil;
	
	public void setCir(int no1, double no2) {
		banji = no1;
		PI = no2;
		
		area = no1 * no1 * no2;
		gil = 2 * no1 * no2;
	}
	
	public void toPrint() {
		System.out.println("반지름 : "+banji+"\n원의 둘레 : " + gil +"\n원의 넓이 : "+ area);
		System.out.println();
	}
	
	
	
	
	
	
}
