package day04;

/*
   	 4자리 숫자로 된 년도를 입력받아서
   	 그 해가 윤년인지 아닌지 판단하세요.
*/
// 라이브러리 가져오고
import java.util.*;

public class Test01 {

	public static void main(String[] args) {
	// 작업순서
	// 0. 필요한 변수 선언하고 
	Scanner sc;
	int year;
	String hae = "평년";
	
	// 1. 입력받을 준비하고
	sc = new Scanner(System.in);	
	// 2. 메시지 출력하고
	System.out.print("### 몇년도 ??? : ");	
	// 3. 년도 꺼내서 변수에 담고
	year = sc.nextInt();	
	// 4. 조건처리해서 판단하고
	if (year % 400 == 0) {
		/*
		  	이 부분은 실행한다는 의미는 400으로 나누어 떨어지면
		  	실행 되고 이하 모든 조건문을 패스한다
		 */
		hae = "윤년";
	} else if(year % 100 == 0) {
		/*
		  	이 부분이 실행한다는 의미는 400으로 나누어 떨어지지 않는 수 중
		  	100으로 나누어 떨어지면 실행되며 또 이하 모든 조건문 패스한다.
		 */
//		hae = "평년";
	} else if(year % 4 == 0) {
		System.out.println("4로 나눠 떨어지는 수");
		hae = "윤년";
	} /* else {
		hae = "평년";
	}*/
	// 5. 결과 출력하고 	
	System.out.println("입력한 해 [ "+ year +" ] 는 [ "+ hae + " ] 입니다~!");	
	
		
	
		
	}

}
