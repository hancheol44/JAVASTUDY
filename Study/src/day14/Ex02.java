package day14;

import javax.swing.JOptionPane;

public class Ex02 {

	public Ex02() {
		
		String str1 = JOptionPane.showInputDialog("밑변의 값을 입력해주세요");
		String str2 = JOptionPane.showInputDialog("높이의 값을 입력해주세요");
		String str3 = JOptionPane.showInputDialog("밑변의 값을 입력해주세요");
		String str4 = JOptionPane.showInputDialog("높이의 값을 입력해주세요");
		
		int garo = Integer.parseInt(str1);
		int sero = Integer.parseInt(str2);
		int garo1 = Integer.parseInt(str3);
		int sero1 = Integer.parseInt(str4);
		
		
		
		 Samgak s1 = new Samgak();
		 Samgak s2 = new Samgak();
		 
		 
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
