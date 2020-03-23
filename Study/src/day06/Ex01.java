package day06;
/*
 문제 1]

	'A' ~ 'J' 까지의 문자를 순차적으로 만들어서 
	배열에 넣고 
	각 문자를 하나씩 꺼내서 
	소문자로 변경하고 
	출력하세요.

	배열에 담긴 내용을 문자열로 확인해서 출력하세요. 
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		
		// 'A' ~ 'J' 문자 순차적으로 만들어 배열에 넣고?
		char[] text = new char[10];
		
		for(int i =0 ; i < text.length ; i++) {
			text[i] = (char)('A'+i);
		}
		// 소문자로 변경되어 받을 배열을 만든다.
		char[] text1 = new char[10];
		for(int i = 0; i < text1.length ; i++) {
			text1[i] = (char)(('a'-'A')+(text[i]));
		}
		System.out.println(text);
		System.out.println("=======================");
		System.out.println(text1);
		System.out.println("=======================");
		System.out.println(Arrays.toString(text1));
		
	
	}
}