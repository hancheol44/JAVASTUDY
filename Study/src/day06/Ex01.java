package day06;
/*
 ���� 1]

	'A' ~ 'J' ������ ���ڸ� ���������� ���� 
	�迭�� �ְ� 
	�� ���ڸ� �ϳ��� ������ 
	�ҹ��ڷ� �����ϰ� 
	����ϼ���.

	�迭�� ��� ������ ���ڿ��� Ȯ���ؼ� ����ϼ���. 
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		
		// 'A' ~ 'J' ���� ���������� ����� �迭�� �ְ�?
		char[] text = new char[10];
		
		for(int i =0 ; i < text.length ; i++) {
			text[i] = (char)('A'+i);
		}
		// �ҹ��ڷ� ����Ǿ� ���� �迭�� �����.
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