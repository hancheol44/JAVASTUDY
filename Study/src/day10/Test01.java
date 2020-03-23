package day10;

public class Test01 {
	
	public int plus(int no1, int no2) {
		int sum = no1 + no2;
		return sum + 10;
	}
		
	
	public static void main(String[] args) {
		Test01 t1 = new Test01();
		
//		System.out.println(t1.plus(2,3).sum);     / /t1.plus(2,3) 이 이미 정수의 값 (기본타입)이기 때문에 오류발생
		System.out.println(t1.plus(2,3));
	}

}
