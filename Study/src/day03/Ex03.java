package day03;
/*
  	���� 3]
  		���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
  	
  					�ڵ�   �⺻���     �����
  		������ 		(1)		 3800		  245	
  		����� 		(2)		 2400		  157	
  		������ 		(3)		 2900		  169	
  		����� 		(4)		 3200	      174
  		
  		������ = �⺻��� + ��뷮 * �����
  		
  		����� �ڵ�� ��뷮�� �Է¹޾Ƽ�
  		�������� ������ִ� ���α׷��� �ۼ��ϼ���.
 */
import java.util.*;
public class Ex03 {
	


	public Ex03() {
		solv();
	}
	
	public void solv() {
		//1. �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		//2. �޼��� ����ϰ� �Է°� ������ ���
		
		//2-1 �ڵ� �Է¹ް�
		System.out.println("1. ������    2. �����   3. ������    4. �����");
		System.out.print("�� �ڵ��� �Ѱ��� �Է��ϼ���! : ");
		int code = sc.nextInt();
		
		//����] 1 ~ 4 �̿��� ���� �Է��� �Ǹ� ��뷮 �Է��� �ǹ̰� �����Ƿ� ��� ����
		if (!(code >= 1 && code <= 4)) {
			System.out.println("�ڵ尡 �߸��Ǿ����ϴ�. ��� �����մϴ�!");
			return;
		}
		//2-2 ��뷮 �Է¹ް�
		System.out.print("��뷮�� �Է��ϼ���! : ");
		int used = sc.nextInt();
		
		//3. �ڵ忡 ���� �뵵 �����ؼ� ������ ����ϰ�
		int calc = 0;
		String yongdo = "������";
		
		int gibon = 3800; // �⺻��� - ������ �⺻������� �ʱ�ȭ
		int yogm = 245;   // ����� - ������ ��������� �ʱ�ȭ
		
		/*
		if(code == 1) {
			// ����� ������ ==> �뵵�� �⺻���� ���������� �ʱ�ȭ�� �Ǿ������Ƿ� ������ �ʿ䰡 ����.
			calc = 3800 + used * 245;
		} else if (code == 2) {
			yongdo = "�����";
			calc = 2400 + used * 157;
	    */		
		if (code == 2) {
			yongdo = "�����";
			gibon = 2400;
			yogm = 157;
		} else if (code == 3) {
			yongdo = "������";
			gibon = 2900; yogm = 169;
		} else if (code == 4){
			yongdo = "�����";
			gibon = 3200; yogm = 174;
		} 
		
		calc = gibon + used * yogm;
		//4. ��� ���
		System.out.println("����� �ڵ� : "+ code +
							  "\n�뵵 : "+ yongdo + 
							  "\n��뷮 : "+ used +
							  "\n������ : "+calc);
		
	}
	public static void main(String[] args) {
		new Ex03();

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("�ڵ� : 1. ������   2.�����   3.������  4.�����");
		System.out.print("����� �ڵ带 �Է����ּ��� : ");
		int code = sc.nextInt();
						
		System.out.print("���� ��뷮�� �Է����ּ��� : ");
		int ele = sc.nextInt();
		
		int pri = 0;
		
		if(code == 1) {
			pri = 3800 + ele * 245;
		} else {
			if(code ==2) {
				pri = 2400 + ele * 157;
			} else {
				if(code ==3) {
					pri = 2900 + ele * 169;
				} else {
					if(code ==4) {
						pri = 3200 + ele * 174;
					} 
				}
			}
		}
		
		System.out.println("�Է��� �ڵ��" + code +"�Է��� ��뷮��"+ele);
		System.out.println("���� �����" + pri +"�� �Դϴ�!");
		 */
	}

}
