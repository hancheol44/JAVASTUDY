package day14;

public class Test01_Main {
	String name;
	int age;
	Test01_01 t;
	/*
	public Test01_Main() {
		
		t = new Test01_01();
		
		Test01 t1 =t.t1;
		t1.age = 24;
		t1.name = "홍길동";
		System.out.println(t1.toString());
	}
	*/
	public Test01_Main(int age, String name) {
		this.name = name;
		this.age = age;
		t = new Test01_01(this);
//		t = new Test01_01(new Test01_Main(24,"홍길동"));   ColorWin 에도 같은내용이있음
//							위와 같이 함수를 사용하고 할 때에는 관계에 대해 생각해야하고
//							위는 new 를 함으로서 새로운 인스턴스가 생성된것이기때문에
//							본래 사용하려던 클래스와는 전혀 다른것이다
		
	}
	
	public static void main(String[] args) {
		Test01_Main m1 = new Test01_Main(24, "홍길동");
		Test01_Main m2 = new Test01_Main(18, "심청이");
		System.out.println(m1.t.t1.toString());
		System.out.println(m2.t.t1.toString());

	}

}
