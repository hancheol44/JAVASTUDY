package extra;

/*
	���� 2 ]
	
		�簢�� Ŭ������ �����
		�簢���� ���α��̰� ������ ���� Ŭ������ ó���ǵ��� �ϼ���.
		==> equals() �������̵� �ϼ���...
		
		�׸��� ���� �ٸ� �簢�� 5���� �÷��ǿ� �����ϰ� ����ϼ���.
		
		
 */

import java.util.*;

public class Ex02 {

	public Ex02() {
		ArrayList<Sagak> list = new ArrayList<Sagak>();
		
		for(int i = 0 ; i < 5 ; i++) {
			int no1 = (int)(Math.random()*(10-1+1)+1);
			int no2 = (int)(Math.random()*(10-1+1)+1);
			
			list.add(new Sagak(no1,no2));
		}
		
		for(Sagak s : list) {
			System.out.print("garo : "+s.getGaro() + "\tsero : "+s.getSero());
			System.out.println("\narea : "+s.getArea());
			
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
