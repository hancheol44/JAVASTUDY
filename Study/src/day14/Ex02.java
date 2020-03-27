package day14;

import javax.swing.JOptionPane;

public class Ex02 {

	int garo,sero,garo1,sero1;
	

	
	public Ex02() {
		
		String str1 = JOptionPane.showInputDialog("밑변의 값을 입력해주세요");
		String str2 = JOptionPane.showInputDialog("높이의 값을 입력해주세요");
		String str3 = JOptionPane.showInputDialog("밑변의 값을 입력해주세요");
		String str4 = JOptionPane.showInputDialog("높이의 값을 입력해주세요");
		
		
		// 예외처리
		try {
		 garo = Integer.parseInt(str1);
		 sero = Integer.parseInt(str2);
		 garo1 = Integer.parseInt(str3);
		 sero1 = Integer.parseInt(str4);
		
		Samgak s1 = new Samgak(garo,sero);
		Samgak s2 = new Samgak(garo1,sero1);
		
		String Semo = ((s1.equals(s2))?("같은 삼각형 입니다!!!"):("다른 삼각형입니다!!!"));
		JOptionPane.showMessageDialog(null,"*** 1번 삼각형 ***\n\t"+ s1.toString());
		JOptionPane.showMessageDialog(null,"*** 2번 삼각형 ***\n\t"+ s2.toString());
		JOptionPane.showMessageDialog(null," 1번과 2번 삼각형 "+ ((s1.equals(s2))?("같은 삼각형 입니다!!!"):("다른 삼각형입니다!!!")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
