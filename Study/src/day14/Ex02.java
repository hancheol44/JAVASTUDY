package day14;

import javax.swing.JOptionPane;

public class Ex02 {

	public Ex02() {
		
		String str1 = JOptionPane.showInputDialog("�غ��� ���� �Է����ּ���");
		String str2 = JOptionPane.showInputDialog("������ ���� �Է����ּ���");
		String str3 = JOptionPane.showInputDialog("�غ��� ���� �Է����ּ���");
		String str4 = JOptionPane.showInputDialog("������ ���� �Է����ּ���");
		
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
