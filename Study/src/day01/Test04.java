package day01;
/**
 * 	클래스의 정보를 담는 주석. 이 부분에 클래스의 설명을 작성을 하는것이 원칙
 * @author 이한철
 * @since  2020.03.09  (작성일)
 * @version v.1.0      (해당 클래스의 버전을 지정하는 부분)
 * @see 		  	   (참고해야할 클래스들을 나열하는 부분)
 * 
 * 			변경이력
 * 				2020.03.09 - 클래스제작 - 담당자 : 이한철
 * 
 * 			프로젝트 진행시 꼭 작성해주어야하는부분
 * 			
 *
 */
public class Test04 {
	public static void main(String[] args) {
		/*
		 	java 의 주석처리
		 		1. // - 한 행에 한해서 주석처리하는방법.
		 				// 이후의 내용을 주석처리한다.
		 		
		 		2. /* - 여러행을 주석처리하는 방법
		 				기호 사이의 모든 내용 주석처리
		 			*/
		 			  
		/*
		  	증감연산자
		  		++, --
		  		: 변수에 붙여지며 붙여진 변수의 값을 1 또는 -1 해준다.
		  		: 기호 이후에 처음 나오는 변수에 한해서 한번만 적용된다.
		 */
		
		int no1 = 10;
		int no2 = no1++ + ++no1; 
		
		System.out.println("no2 : " + no2);
		/*
		  	 문자열을 결합해주는 연산자는 + 로 처리를 한다.
		 */
		
		int num1 = 10;
		int num2 = ++num1 + num1++;
		
		
		System.out.println("num2 : "+num2);
		System.out.println("최종 num1 : "+num1);
		
	}
}
