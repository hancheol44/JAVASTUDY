package day14;

import javax.swing.JOptionPane;

public class Ex01_01 {
/*
  	추가 학습 ] 
  		메인 기능을 함수로 제작해서 처리하세요.
  		
  		
 */
	public Ex01_01() {
	String age = JOptionPane.showInputDialog("나이를 입력해 주세요(정수)!!!!");
	
	int age1 = 0; 
	String msg = "";
	try {
		age1 = Integer.parseInt(age);
		if(age1 < 10) {
			msg ="어린이 입니다ㅊㅊ"; 
		} else if(age1 < 20) {
			msg ="10대 입니다ㅊㅊ";
		} else if (age1 < 30) {
			msg ="20대 입니다ㅊㅊ";
		} else if (age1 < 40) {
			msg ="30대 입니다ㅊㅊ";
		} else if (age1 < 50) {
			msg ="40대 입니다ㅊㅊ";
		} else if (age1 < 60) {
			msg ="50대 입니다ㅊㅊ";
		} else if (age1 < 70) {
			msg ="60대 입니다ㅊㅊ";
		} else if (age1 < 80) {
			msg ="70대 입니다ㅊㅊ";
		} else if (age1 < 90) {
			msg ="80대 입니다ㅊㅊ";
		} else if (age1 < 100) {
			msg ="90대 입니다ㅊㅊ";
		} else {
			msg = "장수하세요~ㅊㅊ";
		}
	} catch (Exception e) {
		msg = "나이 형식이 아닙니다";
	}
	
	JOptionPane.showMessageDialog(null, msg);
	
}
	public static void main(String[] args) {
		new Ex01_01();
		
		
		
		
		
	}
}


