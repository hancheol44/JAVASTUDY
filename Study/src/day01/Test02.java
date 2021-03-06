package day01;

public class Test02 {
	public static void main(String[] args) { // 진입점 함수(메인메소드)
		/*
		 	변수 만드는 형식
		 	
		 		1.
		 		[접근지정자] [속성] 데이터타입 변수이름;  ← 변수선언
		 		변수이름 = 데이터;						  ← 변수초기화	
		 		
		 		
		 		2.
		 		[접근지정자] [속성] 데이터타입 변수이름 = 데이터;  ← 변수선언 & 초기화
		 */
		/*
		 	자바 기본 데이터 타입 8가지
		 	boolean - 논리형
		 	char - 문자형
		 	byte  - 정수형
		 	short
		 	int
		 	long
		 	
		 	float - 실수형
		 	double 
		 	
		 */
		// 주석 public static void main(String[] args){
		
		//		}
		
		// 형변환 
		double no1 = 3.14;
		
		float no2 = (float)3.14;     // 1. 강제형변환
		float no3 = 3.14f;			 // 2. 리터럴형변환
		
		double no4 = 123.456f;    	 // 3. 자동형변환 
		
		String str1 = "가나다";
		String str2 = "가나다";
		String str3 = new String("가나다");
		
		System.out.println(str1 == str2);
		
		System.out.println(str1 == str3);
		
		System.out.println(str3.equals(str1));    // 문자열 리터럴 자체로만 비교하는 String 클래스소속함수 equals
	}
}
