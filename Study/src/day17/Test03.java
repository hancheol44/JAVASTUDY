package day17;

import java.util.*;

public class Test03 {

	public Test03() {
		ArrayList<Sagak> list = new ArrayList<Sagak>();  // 제너릭 <>
		for(int i = 0 ; i < 10 ; i++) {
			
			list.add(new Sagak((int)(Math.random()*16+5), (int)(Math.random()*16+5)));
		}
//		list.add(new Samgak());   에러
		
		
		//꺼내보자
		for(int i = 0 ; i < 10 ; i++) {
			System.out.printf("%2d ] %5.0f\n", i+1, list.get(i).getArea() );
		}  
		
		System.out.println();
		//향상된 for 명령으로 처리
		int num = 1;
		for(Sagak s : list) {
			System.out.printf("%2d ] %5.0f\n", num++, s.getArea() );
		}
		
		ArrayList<Collection> list2 = new ArrayList<Collection>();
		
		list2.add(new Vector());
		list2.add(new ArrayList());
		list2.add(new LinkedList());
		list2.add(new HashSet());
		list2.add(new TreeSet());
//		list2.add(new HashMap());  Map 계열은 다르다
	}

	public static void main(String[] args) {
		new Test03();

	}

}
