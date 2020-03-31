package extra;

/*
	 �л� ������ �����ϱ� ���� Ŭ������ �����ϼ���.
	 class name : Stud
	 
	 ���� 
	 	String name;
	 	int ban;
	 	int no;
	 	int kor, eng, math, physics, cod, total;
	 
	 ���������� ��ü�� ���鶧 �����ϰ� �ԷµǴ� ������ �ϰ�
	 ���� �ѹ����θ� �ϰ�
	 �����͸� �Է��ؼ�
	 	ArrayList �� ����ؼ� 
	 ������ ���� ������ �����ؼ�
	 ����ϼ���.
	 
	 
 */
import java.util.*;
public class Ex01 {

	public Ex01() {
		String[] member = new String[] {"�����","������","����ö","������","�輺��",
										"���̽�","������","�ڱ���","�̸�ȯ","������"};
		
		ArrayList<Stud> list = new ArrayList<Stud>();
		// 10���� �л��� ������ �����ϰ� �Է¹޴´�.
		// list �� �����͸� �ִ´�.
		for(int i = 0 ; i < 10 ; i++) {
			String str = member[i];
			int no1 = (int)(Math.random()*101);
			int no2 = (int)(Math.random()*101);
			int no3 = (int)(Math.random()*101);
			int no4 = (int)(Math.random()*101);
			int no5 = (int)(Math.random()*101);
			
			list.add(new Stud(str,no1,no2,no3,no4,no5));
		}
		// ���� for������ list�� Stud �ν��Ͻ� s �� ��´�
		for(Stud s : list) {
			System.out.print(s.getTotal()+ " | ");
		}
		System.out.println();
		System.out.println();
		
		// Stud Ŭ������ ���ǵ� 
		Collections.sort(list, new Stud());
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i).getName()+ " : "+list.get(i).getTotal() + " | ");
		}
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
