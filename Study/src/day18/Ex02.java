package day18;
/*
 
 	���� 2] 
 		�л��� �̸�, ��ȣ, ��, ����, ����, ����, ����, ����� ������ VOŬ������ �����
 		 		
 		5 �л��� �����͸� �Է��ؼ� ������ Set�� ���� 
 		�̸� ������ ����ϼ���.


 	TreeSet 
 	 
 */
import java.util.*;
import javax.swing.*;
import java.io.*;


public class Ex02 {

	public Ex02() {
		// �̸��� ����ִ� �迭�� ����� �ݺ������� set�� �����͸� �־��ֱ����ؼ�
		String[] member = new String[] {"�����","������","������","�輺��","����ö"};
		// TreeSet ���� �����.  ��? 
		TreeSet<Stud> set = new TreeSet<Stud>();
		
		// 5���� �л��� ������ �����ϰ� �Է¹޾� �����͸� �ִ´�
		for(int i = 0 ; i < 5 ; i++) {
			String str = member[i];
			int no = i+1;
			int ban = (int)(Math.random()*(8-1+1)+1);
			int no1 = (int)(Math.random()*(41)+60);
			int no2 = (int)(Math.random()*(41)+60);
			int no3 = (int)(Math.random()*(41)+60);
			
			set.add(new Stud(str,no,ban,no1,no2,no3));
		}
		// ����� ���� ���� for�� ?
		for(Stud s : set) {
			System.out.println(s.getName() +" | "+s.getBan()+" | "+s.getNo()+" | "+s.getKor()
								+" | "+s.getEng()+" | "+s.getMath()+ " | " + s.getTotal()+" | "+s.getAvg());
		}
		
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
