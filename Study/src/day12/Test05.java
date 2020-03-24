package day12;

public class Test05 {
	
	public Test05() {
		Emp e1 = new Emp();
		// Emp 에 있는 변수들을 활용하고 싶으나 변수의 접근지정자가 private 으로 제한되어있다
//		e1.sal = 10000;  그래서 오류가 발생된다.
		e1.setEmpno(10000);
		int eno = e1.getEmpno();
		
	}
	public static void main(String[] args) {
		new Test05();

	}

}
