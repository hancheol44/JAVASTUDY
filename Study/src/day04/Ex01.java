package day04;

/*
  	4자리 숫자로 된 년도를 입력받아서 
  	윤년인지 평년인지 판단해서 출력하세요.
  	단, switch ~ case 구문으로 처리하세요. 
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 메세지 출력하고
		System.out.print("윤년인지 평년인지 궁금한 년도를 입력해주세요 : ");
		// 입력받고
		int year = sc.nextInt();
		
		//코드 만들고
		// 4로 나누어떨어지면 1, 100은 2, 400은 3
		int code = 0;
		String result = "평년";
		if(year % 400 == 0) {
			code = 3;
		} else if (year % 100 == 0) {
			code = 2;
		} else if (year % 4 == 0) {
			code = 1;
		} 
		
		switch (code) {    
			case 3 :
				result = "윤년";
				break;
			case 2 :
				
				break;
			
			case 1 :
				result = "윤년";
				break;
		default:
			// switch ~ case 조건처리...
	
		}
		System.out.println("입력받은 년도는 : "+ year +"\n"+result+"입니다");	
	}

}
