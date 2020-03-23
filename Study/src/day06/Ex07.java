package day06;
/*
 
문제 7] 

	문자열을 입력받아서
	문자배열에 문자열을 이루는 문자를 순차적으로 저장하세요.
	
	"hong"
	--------
	|'h'|'o'|'n'|'g'|
	-----------------
	
	참고]
		문자열의 특정 위치의 문자를 추출해주는 함수
		
			문자열.charAt(위치값);
		
		문자열의 길이를 반환해주는 함수
		
			문자열.length();   
			==> 반환값이 정수
 		  		 	  				 
 */
import java.util.*;	
public class Ex07 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요 : ");
		String str = sc.nextLine();
		// 입력된 문자열 만큼의 길이를 가지면서
		// 문자를 담을 수 있는 문자 배열을 만든다 
		char arr[] = new char[str.length()];
		
		for(int i = 0 ; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		
		

	}

}
