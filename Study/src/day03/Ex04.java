package day03;


import java.util.*;
public class Ex04 {
/*
  	문제 4]
  		부서 번호를 입력하면 
  		부서 이름을 출력해주는 프로그램을 작성하세요.
  		
  		10 - 총무부
  		20 - 회계부
  		30 - 영업부
  		40 - 기술부
  		
  		
 */
	public Ex04() {
		solv();
	}
	
	public void solv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("10   20    30    40   etc");
		System.out.println("위 4개의 부서번호중 이름이 궁금한 부서 한개를 입력해주세요 : ");
		int num = sc.nextInt();
		
		String result;
		
		if (num == 10) {
			result = "총무부";
		} else if (num == 20) {
			result = "회계부";
		} else if (num == 30) {
			result = "영업부";
		} else if (num == 40) {
			result = "기술부";
		} else {
			result = "다음기회에";
		}

		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}
