package extra;

/*
	문제 2 ]
	
		사각형 클래스를 만들고
		사각형의 가로길이가 같으면 같은 클래스로 처리되도록 하세요.
		==> equals() 오버라이드 하세요...
		
		그리고 각각 다른 사각형 5개를 컬렉션에 저장하고 출력하세요.
		
		
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
