package test;

public class Semo extends Figure {
	int garo, sero;    // 전역변수 선언할 때 VO클래스제외하고
					   // 전역변수의 접근지정자를 무엇으로 해주는 것이 좋나요??
	
	
	
	
					// 생성자 함수도 만들어서 필요한 변수가 초기화 되게 하세요.
	public Semo() {
		this.garo = garo;
		this.sero = sero;
		area();
	}
	
	public float area(int garo, int sero) {
		area = (float)(garo * sero);
		return area;
	}
	
	
	public void toPrint() {
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		Semo t = new Semo();
		t.area(3,4);
		t.toPrint();
		
		System.out.println("-------------------");
		
		t.area();
		t.toPrint();
		
		System.out.println("-----------------");
		Semo t1 = new Semo();
		t1.area();
		t1.toPrint();
	}
}
