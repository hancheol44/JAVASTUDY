package day03;
/*
  	���� 6]
   		������ �⵵�� �Է¹޾Ƽ� 
   		�ش� �⵵�� �������� ������� �Ǻ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
   		����]
   		4�� ������ ��������, 100���� ������ �������� ������ 
   		400���� ������ �������� �ظ� �����̶� �Ѵ�.
   		
   		��, ���׿����ڸ� ����ؼ� ó���ϼ���.
 */
import java.util.*;
public class Hw06 {
	
	public Hw06() {
		solv();
	}
	public void solv() {
		// 1. �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// 2. �޼��� ����ϰ�
		System.out.print("�⵵�� �Է��ϼ��� : ");
		// 3. �Է��� ���� ������ ���
		int year = sc.nextInt();
		// 4. �������� ������� �Ǻ��ϰ�
		String result = (year % 4 != 0) ? ("���") : 
						(year % 100 != 0) ? ("����") :
					    (year % 400 == 0) ? ("����"): ("���");
		
		// 5. ����ϰ�
		System.out.println("�Է��� �� "+ year +"���� "+result+"�Դϴ�!");
	}
	
	public static void main(String[] args) {
		new Hw06();
	}

}
