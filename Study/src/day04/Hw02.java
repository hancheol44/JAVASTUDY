package day04;
/*
  	�� ���� �Է¹��� ��
  	�� ���� �ּҰ������ ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
  	
  	�ּҰ���� : �� ���� ������ �������� ���� ���� ��
 */
import java.util.*;
public class Hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ּҰ������ ���� ù��° ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		int tmp = 0;
		if(num2 > num1) {
			tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
		for(int i = num1; ;i++) {
			if(i % num2 == 0 && i % num1 ==0) {
				System.out.println("ū�� : "+num1+"\n������ : "+num2+"\n�ּҰ���� : "+i);
				break;
			}
		}
		
	}

}
