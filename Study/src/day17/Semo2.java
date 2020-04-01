package day17;

import java.util.*;

public class Semo2 {

	public Semo2() {
		ArrayList<Semo> list = new ArrayList<Semo>();
		
		// ����Ʈ�� �ﰢ�� ä���ְ�
		for(int i = 0 ; i < 10 ; i++) {
			int no1 = (int)(Math.random()* 16 + 5);
			int no2 = (int)(Math.random()* 16 + 5);
			list.add(new Semo(no1,no2));
		}
		
		// ����Ʈ�� ���� �� ������ �Ѱ��� ������ ����
		for(Semo s : list) {
			System.out.print(s.getArea()+" | ");
		}  
		System.out.println();
		// ������ �غ���.
		Collections.sort(list, new Semo());
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i).getArea() + " | ");
		}
		System.out.println();
		
		
		
		// �غ��� ��������
		Collections.sort(list, new Comparator() { 
	 		public int compare(Object o1, Object o2) {
				return - ((Semo)o1).getWidth() - ((Semo)o2).getWidth();
			}
		});
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i).getWidth()+ " | ");
		}
		System.out.println();
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Semo2();
	}

}
