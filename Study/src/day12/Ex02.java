package day12;
/*
 
���� 2]
	
	�л��� �̸�, java , db , html , js , css , ����, ���
	�� ������ Ŭ������ ����� 
	5�� �л��� �����͸� �Է��ؼ� ����ϼ���.
	��, ������ ����ȭ��Ű����.
			
			 
 */
public class Ex02 {
	
	public Ex02() {
		
		Ex02_Ref[] stud = new Ex02_Ref[5];
		stud[0] = new Ex02_Ref("����ö",80,90,70,70,77);
		stud[1] = new Ex02_Ref("������",90,100,77,77,66);
		stud[2] = new Ex02_Ref("�����",100,100,100,100,100);
		stud[3] = new Ex02_Ref("�輺��",98,77,88,55,99);
		stud[4] = new Ex02_Ref("������",48,100,65,98,74);

		
		for(int i = 0 ; i < stud.length ; i++) {
			stud[i].toPrint();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Ex02();
	
	
	}
	
	
}
