package day04;

/*
  	4�ڸ� ���ڷ� �� �⵵�� �Է¹޾Ƽ� 
  	�������� ������� �Ǵ��ؼ� ����ϼ���.
  	��, switch ~ case �������� ó���ϼ���. 
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// �޼��� ����ϰ�
		System.out.print("�������� ������� �ñ��� �⵵�� �Է����ּ��� : ");
		// �Է¹ް�
		int year = sc.nextInt();
		
		//�ڵ� �����
		// 4�� ����������� 1, 100�� 2, 400�� 3
		int code = 0;
		String result = "���";
		if(year % 400 == 0) {
			code = 3;
		} else if (year % 100 == 0) {
			code = 2;
		} else if (year % 4 == 0) {
			code = 1;
		} 
		
		switch (code) {    
			case 3 :
				result = "����";
				break;
			case 2 :
				
				break;
			
			case 1 :
				result = "����";
				break;
		default:
			// switch ~ case ����ó��...
	
		}
		System.out.println("�Է¹��� �⵵�� : "+ year +"\n"+result+"�Դϴ�");	
	}

}
