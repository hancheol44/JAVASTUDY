package day18;
/*
 
 	문제 2] 
 		학생의 이름, 번호, 반, 국어, 영어, 수학, 총점, 평균을 저장할 VO클래스를 만들고
 		 		
 		5 학생의 데이터를 입력해서 관리할 Set을 만들어서 
 		이름 순으로 출력하세요.


 	TreeSet 
 	 
 */
import java.util.*;
import javax.swing.*;
import java.io.*;


public class Ex02 {

	public Ex02() {
		// 이름을 담고있는 배열을 만든다 반복문에서 set에 데이터를 넣어주기위해서
		String[] member = new String[] {"김수진","손은진","이진수","김성현","이한철"};
		// TreeSet 으로 만든다.  왜? 
		TreeSet<Stud> set = new TreeSet<Stud>();
		
		// 5명의 학생의 성적을 랜덤하게 입력받아 데이터를 넣는다
		for(int i = 0 ; i < 5 ; i++) {
			String str = member[i];
			int no = i+1;
			int ban = (int)(Math.random()*(8-1+1)+1);
			int no1 = (int)(Math.random()*(41)+60);
			int no2 = (int)(Math.random()*(41)+60);
			int no3 = (int)(Math.random()*(41)+60);
			
			set.add(new Stud(str,no,ban,no1,no2,no3));
		}
		// 출력을 위한 향상된 for문 ?
		for(Stud s : set) {
			System.out.println(s.getName() +" | "+s.getBan()+" | "+s.getNo()+" | "+s.getKor()
								+" | "+s.getEng()+" | "+s.getMath()+ " | " + s.getTotal()+" | "+s.getAvg());
		}
		
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
