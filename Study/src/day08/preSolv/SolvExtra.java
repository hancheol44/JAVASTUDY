package day08.preSolv;

import javax.swing.*;
import java.util.*;

/*
 
extra ]
	영문 문자열을 입력받아서
	해당 알파벳이 출현하는 빈도를 저장하고
	빈도를  * 로 표시하세요.
	
	
	예]
	"We are the World!"
	==> [W|e| |a|r|t|h|o|l|d|!]
	==> [2|3|3|1|2|1|1|1|1|1|1]
	 
 */

public class SolvExtra {

public SolvExtra() {
	extra1();
}

public void extra1() {
	String str = "We are the World!";
	System.out.println(str.substring(str.indexOf('W',str.indexOf('W')+1)));
	System.out.println();
	
}
	public static void main(String[] args) {
		new SolvExtra();
		String str = JOptionPane.showInputDialog("영문을 입력하세요! : ");
		
		// 할일
		// 0. 문자열에 포함된 문자로 이루어진 문자열을 만든다.
		String tmp = "";
		
		loop:
		for(int i = 0 ; i < str.length() ; i++) {
			char imsi = str.charAt(i);
			
		// tmp 에 같은 문자가 있는지 검사하고 없으면 추가한다.
			for(int j = 0 ; j < tmp.length() ; j++) {
				if(imsi == tmp.charAt(j)) {
					continue loop;
				}
			}
			tmp = tmp + imsi;
		}
		
		// 1. 포함되어 있는 문자의 가지수를 구한다.
		int cnt = tmp.length();
		/*
		loop:
		for(int i = 0 ; i < str.length(); i++) {
			for(int j = 0 ; j < i ; j++) {
				if(str.charAt(j) == str.charAt(i)) {
					continue loop;
				}
			}
			cnt += 1;
		}
		*/
		// 2. 포함된 문자의 배열을 만들 수 있게 되어 문자배열과 카운트 배열을 만든다.
		char[] ch = tmp.toCharArray();    	//포함된 문자를 저장할 배열
		
		// 문자배열을 문자의 아스키코드가 작은 순으로 정렬하고 
		
		for(int i = 0 ; i < ch.length -1 ; i++) {
			for(int j = i+1 ; j < ch.length ; j++) {
				if(ch[i] > ch[j]) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
		
		int[] count = new int[cnt];   	//포함된 문자의 출현빈도를 기억할 배열
		// 2-1 문자마다 출현하는 카운트를 구해준다.
		for(int i = 0 ; i < ch.length ; i++) {
			char c = ch[i];
			for(int j = 0 ; j < str.length(); j++) {
				if(c == str.charAt(j)) {
					count[i] += 1;
				}
			}
		}
		/*
		// 반복해서 별찍고 출력
		for(int i = 0 ; i < ch.length ; i++) {
			System.out.printf("%3c : ", ch[i]);
			for(int j = 0 ; j < count[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		// 출력한다.
		StringBuffer buff = new StringBuffer();
		for(int i = 0 ; i < ch.length ; i++) {
			buff.append("   ");
			buff.append(ch[i]);
			buff.append("   :   ");
			for(int j = 0 ; j < count[i] ; j++) {
				buff.append("*");
				
			}
			buff.append("\n");
			
		}
		JOptionPane.showMessageDialog(null, buff.toString());
	
	}

}
