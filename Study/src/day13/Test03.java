package day13;

public class Test03 {
	int no = 100;
	public static class Cls01 {  // Top Level Inner class
		String name = "우현우";
	}
	
	
	class Cls02{
		int num = no;
	}
	
	public Test03() {
		hw(new Inter01() {  // 무명 내부 클래스
			public void toPrint() {
				System.out.println("*** 여기는 익명 내부 클래스 ***");
			}
		});
		
		abc();
	}
	
	public void abc() {
		int b = 10;
		
		Cls02 c2 = new Cls02();
		
		
		
		class Cls03{
			int c = 100;
			public void xyz() {
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
			}
		}
	
	Cls03 c3 = new Cls03();
	
	c3.xyz();
		
	}
	
	
	
	public static void main(String[] args) {
		new Test03();
		
	}
	// 클래스 블럭 내에 만들어지는 클래스를 내부 클래스라 한다.
	
	public void hw(Inter01 i) {
		i.toPrint();
	}
	
	
}

class Test03_01 {	// 외부클래스
	
	public Test03_01() {
		Test03.Cls01 t1 = new Test03.Cls01();   // static 에 올라가있기 때문에 가능하다?
		
		Test03 t2 = new Test03();     
//		Test03.Cls02 t3 = new Test03.Cls02(); 안됨 Cls02 는 클래스의 멤버함수이기때문에 
	}
}