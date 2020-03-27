package day15;

/*
  	 이메일을 입력받아서 
  	 입력받은 문자열이 이메일 형식이 맞는지 아닌지 검사하세요.
  	 이메일 형식은
  	 	알파벳 과 숫자로 8글자 이상으로 하고 @ 도메인주소
  	 로 처리하세요.
  	 	 
  	 참고 ]
  	 	한글 처리 : [가-핳]   -- 한글은 아이디에 쓰지 마세요.
  	 	
  	 	
  	 
 */


import javax.swing.*;
import java.util.regex.*;

public class Ex01 {

	public static void main(String[] args) {
	
		String email = JOptionPane.showInputDialog("이메일을 입력해주세요!!!");
		
		
		
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,}+@[a-zA-Z0-9]+.[a-z]{2,3}+$");
		
		
		
		
		Matcher match = pattern.matcher(email);
		
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "올바른 이메일 입니다.");
		} else {
			JOptionPane.showMessageDialog(null, "잘못된 이메일 입니다.");
		}
	}
}
