package day14;

import javax.swing.*;
public class Test03 {
	
	public Test03() {
		// getNum() 는 예외를 전이하는 함수이므로
		// 이런 예외전이함수는 반드시 예외처리를 해줘야 한다.
		
		int num = 0;
		
		try {
			num = getNum();
			// 예외클래스를 기술 할 때는 예외 관계의 가장 최하위 부터 하는것이 원칙이다.
		} catch(NumberFormatException e) {       
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	 
	public int getNum() throws NumberFormatException {
		// 반환값 담을 변수 선언 및 초기화
		int num = 0;
		
		// 숫자를 입력 받아서 문자열로 담고 
		String str = JOptionPane.showInputDialog("숫자를 입력하세요!!!");
		 
		// 문자열을 정수의 형태로 변환하여 변수에 담고
		num = Integer.parseInt(str);
		
		if(num < 0) {
			//강제 예외 발생시키기...
			// 형식
			//	throw new 예외클래스생성자();
			throw new NumberFormatException();
		}
		/*
		 	num 변수에 데이터를 담을 경우 예외가 발생할 수 있다.
		 	따라서 원칙은 윗 부분을 예외처리를 해야 하지만 
		 	이번에는 이 함수를 호출한 곳으로 예외처리를 떠넘긴다.
		 	throws ...
		 */
		
		return num;
	}
	
	
	
	public static void main(String[] args) {
		new Test03();
	}
	
	
	
}
