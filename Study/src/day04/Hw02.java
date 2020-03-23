package day04;
/*
  	두 수를 입력받은 후
  	두 수의 최소공배수를 구해서 출력해주는 프로그램을 작성하세요.
  	
  	최소공배수 : 두 수로 나누어 떨어지는 가장 작은 수
 */
import java.util.*;
public class Hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("최소공배수를 구할 첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int tmp = 0;
		if(num2 > num1) {
			tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
		for(int i = num1; ;i++) {
			if(i % num2 == 0 && i % num1 ==0) {
				System.out.println("큰수 : "+num1+"\n작은수 : "+num2+"\n최소공배수 : "+i);
				break;
			}
		}
		
	}

}
