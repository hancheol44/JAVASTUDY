package day14;

import javax.swing.JOptionPane;

public class Test04 extends Test03 {

	// getNum() �� ����� ������ �غ���. -> �������̵� 
	
	// �Է¹��� ���ڿ� 10�� ���� ������ ��ȯ���ֵ��� �������̵� �غ���.
	/*
	  
	 	�������̵� ��Ģ	]
	 		0. ����� �޾ƾ� �Ѵ�.
	 		1. �Լ��� ������ �����Ѵ�.
	 		2. ���������ڴ� ���ų� ���� ��������...
	 		3. ����ó���� ���ų� ���� ��������...	 		
	 		 		
	 */
//	public int getNum() throws Exception {  ==> �����߻�! �������̵��Ģ 3�� ����
	public int getNum() throws NumberFormatException {
		// ��ȯ�� ���� ���� ���� �� �ʱ�ȭ
		int num = 0;
		
		// ���ڸ� �Է� �޾Ƽ� ���ڿ��� ��� 
		String str = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���!!!");
		 
		// ���ڿ��� ������ ���·� ��ȯ�Ͽ� ������ ���
		num = Integer.parseInt(str);
		
		// ������ ��� ������ ���ܸ� �߻���Ų��.
		if(num < 0) {
			throw new NumberFormatException();
		}
		
		return num * 10;
	}
	
	
	public static void main(String[] args) {
		new Test04();
		

	}

}