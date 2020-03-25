package day13.sub;


import java.util.*;
import java.lang.Math.*;

public class Moyang_Exec {
	
	public Moyang_Exec() {
		ArrayList list = new ArrayList();
		
		list.add(new Sagak());
		list.add(new Samgak());
		list.add(new Dongle());
		
		ArrayList list2 = new ArrayList();
		
		for(int i = 0 ; i < 10 ; i++) {
			int garo = (int)(Math.random()*(10-5+1)+5);
			int sero = (int)(Math.random()*(10-5+1)+5);
			list2.add(new int[] {garo,sero});
		}
		
		ArrayList mlist = new ArrayList();
		for(int i = 0 ; i < 10 ; i++) {
			int no = (int)(Math.random()*(3-1+1)+1);
			Moyang f = null;
			if(no == 1) {
				f = new Sagak(((int[]) list2.get(i))[0],((int[]) list2.get(i))[1]);
			} else if(no == 2) {
				f = new Samgak(((int[]) list2.get(i))[0],((int[]) list2.get(i))[1]);
				
			} else {
				f = new Dongle(((int[]) list2.get(i))[0]);
			}
			
			mlist.add(f);
			
		}
		
		for(Object o : mlist) {
			Moyang f = (Moyang) o;
			f.toPrint();
		}
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		new Moyang_Exec();

	}

}
