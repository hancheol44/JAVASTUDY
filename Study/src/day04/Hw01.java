package day04;
/*
	 두 수를 입력받은 후
	 두 수의 최대공약수를 구해서 출력해주는 프로그램을 작성하세요.
	 
	 최대공약수 : 두 수를 나눌 수 있는 최대수
	 
 */
import java.util.*;

public class Hw01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("최대공약수를 구하고 싶은 첫번째 정수를 입력하세요! :");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요! : ");
		int num2 = sc.nextInt();
	
		if(num2 > num1) {
			int tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
		// 또는 삼항연산자로 num1, num2 크기를 비교하여 출력한다
		for(int i = num2; i > 0 ; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println("큰수 : " + num1 + "작은수 : " + num2 +"최대공약수 : "+ i);
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}
