package day08.preSolv;

import javax.swing.*;
import java.util.*;

/*
 
extra ]
	���� ���ڿ��� �Է¹޾Ƽ�
	�ش� ���ĺ��� �����ϴ� �󵵸� �����ϰ�
	�󵵸�  * �� ǥ���ϼ���.
	
	
	��]
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
		String str = JOptionPane.showInputDialog("������ �Է��ϼ���! : ");
		
		// ����
		// 0. ���ڿ��� ���Ե� ���ڷ� �̷���� ���ڿ��� �����.
		String tmp = "";
		
		loop:
		for(int i = 0 ; i < str.length() ; i++) {
			char imsi = str.charAt(i);
			
		// tmp �� ���� ���ڰ� �ִ��� �˻��ϰ� ������ �߰��Ѵ�.
			for(int j = 0 ; j < tmp.length() ; j++) {
				if(imsi == tmp.charAt(j)) {
					continue loop;
				}
			}
			tmp = tmp + imsi;
		}
		
		// 1. ���ԵǾ� �ִ� ������ �������� ���Ѵ�.
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
		// 2. ���Ե� ������ �迭�� ���� �� �ְ� �Ǿ� ���ڹ迭�� ī��Ʈ �迭�� �����.
		char[] ch = tmp.toCharArray();    	//���Ե� ���ڸ� ������ �迭
		
		// ���ڹ迭�� ������ �ƽ�Ű�ڵ尡 ���� ������ �����ϰ� 
		
		for(int i = 0 ; i < ch.length -1 ; i++) {
			for(int j = i+1 ; j < ch.length ; j++) {
				if(ch[i] > ch[j]) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
		
		int[] count = new int[cnt];   	//���Ե� ������ �����󵵸� ����� �迭
		// 2-1 ���ڸ��� �����ϴ� ī��Ʈ�� �����ش�.
		for(int i = 0 ; i < ch.length ; i++) {
			char c = ch[i];
			for(int j = 0 ; j < str.length(); j++) {
				if(c == str.charAt(j)) {
					count[i] += 1;
				}
			}
		}
		/*
		// �ݺ��ؼ� ����� ���
		for(int i = 0 ; i < ch.length ; i++) {
			System.out.printf("%3c : ", ch[i]);
			for(int j = 0 ; j < count[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		// ����Ѵ�.
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
