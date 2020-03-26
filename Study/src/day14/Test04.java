package day14;

import javax.swing.JOptionPane;

public class Test04 extends Test03 {

	// getNum() 의 기능을 수정을 해보자. -> 오버라이드 
	
	// 입력받은 숫자에 10을 곱한 정수를 반환해주도록 오버라이드 해보자.
	/*
	  
	 	오버라이드 규칙	]
	 		0. 상속을 받아야 한다.
	 		1. 함수의 원형을 유지한다.
	 		2. 접근지정자는 같거나 넓은 방향으로...
	 		3. 예외처리는 같거나 좁은 방향으로...	 		
	 		 		
	 */
//	public int getNum() throws Exception {  ==> 에러발생! 오버라이드규칙 3번 위반
	public int getNum() throws NumberFormatException {
		// 반환값 담을 변수 선언 및 초기화
		int num = 0;
		
		// 숫자를 입력 받아서 문자열로 담고 
		String str = JOptionPane.showInputDialog("숫자를 입력하세요!!!");
		 
		// 문자열을 정수의 형태로 변환하여 변수에 담고
		num = Integer.parseInt(str);
		
		// 음수일 경우 강제로 예외를 발생시킨다.
		if(num < 0) {
			throw new NumberFormatException();
		}
		
		return num * 10;
	}
	
	
	public static void main(String[] args) {
		new Test04();
		

	}

}
