package day06;
/*
 
���� 8]
	
		ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� ����� -- ���ڿ��迭 3��
		�����͸� �Է��ؼ� (5��)
		
		ȸ���� �̸��� �Է��ϸ� 
		ȸ���� �̸��� ��ȭ��ȣ, �̸����� ������ִ� ���α׷��� �ۼ��ϼ���. 
 */
import java.util.*;
public class Ex08 {

	public static void main(String[] args) {
		
		String[] name = new String[] {"������","�����","������","�輺��","����ö"};
		String[] tel = new String[] {"010-1111-1111","010-2222-2222",
									 "010-3333-3333","010-4444-4444","010-5555-5555"};
		String[] email = new String[] {"abc@naver.com","qwe@naver.com","qwer1@gmail.com",
										"ioqj@gmail.com","rrr@naver.com"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������"+", " +"�����"+", " +"������"+", "+"�輺��"+", "+"����ö");
		System.out.print("��ȭ��ȣ�� �̸����� �ñ��� ȸ���� �̸��� �Է��ϼ��� : ");
		
		String str = sc.nextLine();
		for(int i =0 ; i< name.length; i++) {
			if(str.equals(name[i])) {
				System.out.println(name[i]);
				System.out.println(tel[i]);
				System.out.println(email[i]);
			}
			System.out.println();  
		}
		
		
	}

}
