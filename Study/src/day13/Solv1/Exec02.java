package day13.Solv1;

import java.util.*;
public class Exec02 {

	public Exec02() {
		ArrayList list = new ArrayList();
		
		list.add(new Nemo());
		list.add(new Semo());
		list.add(new Won());
		
		ArrayList list2 = new ArrayList();
		
		for(int i = 0 ; i < 10 ; i++ ) {
			int width = (int)(Math.random() * (20 - 10 + 1)+10);
			int height = (int)(Math.random() * (20 - 10 + 1)+10);
			list2.add(new int[] {width, height});
		}
		
		// Figure 넣을 리스트
		ArrayList flist = new ArrayList();
		for(int i = 0 ; i < 10 ; i++ ) {
			// 매번 랜덤하게 넣을 도형을 결정을 해주자.
			int no = (int)(Math.random()*3 + 1);
			Figure f = null;
			if(no == 1) {
				// 사각형 넣어주고
				f = new Nemo();
			} else if( no == 2) {
				// 삼각형 넣어주고
				f = new Semo();
			} else {
				// 원 넣어주고...
				f = new Won();
			}
			f.calcArea((int[])list2.get(i));
			flist.add(f);
		}
		
		for(Object o : flist) {
			Figure f = (Figure) o;
			f.toPrint();
		}
		
	}
	public static void main(String[] args) {
		new Exec02();
		
	}

}
