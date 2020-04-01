package day17;

import java.util.*;

public class Semo2 {

	public Semo2() {
		ArrayList<Semo> list = new ArrayList<Semo>();
		
		// 리스트에 삼각형 채워주고
		for(int i = 0 ; i < 10 ; i++) {
			int no1 = (int)(Math.random()* 16 + 5);
			int no2 = (int)(Math.random()* 16 + 5);
			list.add(new Semo(no1,no2));
		}
		
		// 리스트의 내용 중 면적을 한개씩 꺼내서 보고
		for(Semo s : list) {
			System.out.print(s.getArea()+" | ");
		}  
		System.out.println();
		// 정렬을 해보자.
		Collections.sort(list, new Semo());
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i).getArea() + " | ");
		}
		System.out.println();
		
		
		
		// 밑변을 기준으로
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
