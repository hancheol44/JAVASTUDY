package day14;

import javax.swing.JOptionPane;

public class Ex01_01 {
/*
  	�߰� �н� ] 
  		���� ����� �Լ��� �����ؼ� ó���ϼ���.
  		
  		
 */
	public Ex01_01() {
	String age = JOptionPane.showInputDialog("���̸� �Է��� �ּ���(����)!!!!");
	
	int age1 = 0; 
	String msg = "";
	try {
		age1 = Integer.parseInt(age);
		if(age1 < 10) {
			msg ="��� �Դϴ٤���"; 
		} else if(age1 < 20) {
			msg ="10�� �Դϴ٤���";
		} else if (age1 < 30) {
			msg ="20�� �Դϴ٤���";
		} else if (age1 < 40) {
			msg ="30�� �Դϴ٤���";
		} else if (age1 < 50) {
			msg ="40�� �Դϴ٤���";
		} else if (age1 < 60) {
			msg ="50�� �Դϴ٤���";
		} else if (age1 < 70) {
			msg ="60�� �Դϴ٤���";
		} else if (age1 < 80) {
			msg ="70�� �Դϴ٤���";
		} else if (age1 < 90) {
			msg ="80�� �Դϴ٤���";
		} else if (age1 < 100) {
			msg ="90�� �Դϴ٤���";
		} else {
			msg = "����ϼ���~����";
		}
	} catch (Exception e) {
		msg = "���� ������ �ƴմϴ�";
	}
	
	JOptionPane.showMessageDialog(null, msg);
	
}
	public static void main(String[] args) {
		new Ex01_01();
		
		
		
		
		
	}
}


