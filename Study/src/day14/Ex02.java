package day14;

import javax.swing.JOptionPane;

public class Ex02 {

	int garo,sero,garo1,sero1;
	

	
	public Ex02() {
		
		String str1 = JOptionPane.showInputDialog("�غ��� ���� �Է����ּ���");
		String str2 = JOptionPane.showInputDialog("������ ���� �Է����ּ���");
		String str3 = JOptionPane.showInputDialog("�غ��� ���� �Է����ּ���");
		String str4 = JOptionPane.showInputDialog("������ ���� �Է����ּ���");
		
		
		// ����ó��
		try {
		 garo = Integer.parseInt(str1);
		 sero = Integer.parseInt(str2);
		 garo1 = Integer.parseInt(str3);
		 sero1 = Integer.parseInt(str4);
		
		Samgak s1 = new Samgak(garo,sero);
		Samgak s2 = new Samgak(garo1,sero1);
		
		String Semo = ((s1.equals(s2))?("���� �ﰢ�� �Դϴ�!!!"):("�ٸ� �ﰢ���Դϴ�!!!"));
		JOptionPane.showMessageDialog(null,"*** 1�� �ﰢ�� ***\n\t"+ s1.toString());
		JOptionPane.showMessageDialog(null,"*** 2�� �ﰢ�� ***\n\t"+ s2.toString());
		JOptionPane.showMessageDialog(null," 1���� 2�� �ﰢ�� "+ ((s1.equals(s2))?("���� �ﰢ�� �Դϴ�!!!"):("�ٸ� �ﰢ���Դϴ�!!!")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
