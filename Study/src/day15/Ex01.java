package day15;

/*
  	 �̸����� �Է¹޾Ƽ� 
  	 �Է¹��� ���ڿ��� �̸��� ������ �´��� �ƴ��� �˻��ϼ���.
  	 �̸��� ������
  	 	���ĺ� �� ���ڷ� 8���� �̻����� �ϰ� @ �������ּ�
  	 �� ó���ϼ���.
  	 	 
  	 ���� ]
  	 	�ѱ� ó�� : [��-�K]   -- �ѱ��� ���̵� ���� ������.
  	 	
  	 	
  	 
 */


import javax.swing.*;
import java.util.regex.*;

public class Ex01 {

	public static void main(String[] args) {
	
		String email = JOptionPane.showInputDialog("�̸����� �Է����ּ���!!!");
		
		
		
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,}+@[a-zA-Z0-9]+.[a-z]{2,3}+$");
		
		
		
		
		Matcher match = pattern.matcher(email);
		
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "�ùٸ� �̸��� �Դϴ�.");
		} else {
			JOptionPane.showMessageDialog(null, "�߸��� �̸��� �Դϴ�.");
		}
	}
}
