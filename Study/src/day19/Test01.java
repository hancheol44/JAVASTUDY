package day19;
/*
  	���� 1 ] 
  		Ű���带 �̿��ؼ� ���ڸ� �Է� �޾ƺ���.
 */

import java.io.*;
import java.util.*;
public class Test01 {
/*
 		���� ] 
 			Ű���� ���� �ܺ� ��ġ�̴�.
 			���� ���̴� �ܺ���ġ�̱� ������ 
 			�̹� ��Ʈ������ �غ��� ������ �����Ѵ�.
 			
 				System.in
 */
	public Test01() {
		System.out.print("�� ���ڸ� �Է��� �ּ���! : ");
		
		// ���� ���� 
		int ch = 0;
		
		try {
			/*
			// 1. 
			ch = System.in.read();
			System.out.println("�Է��� ���� : " + (char)ch);
			*/
			
			/*
			// 2. ***
			byte[] buff = new byte[256];
			// 256�� ���ڿ� ���� �ѹ��� �д� �������� ���� ��������.
			int len = System.in.read(buff);
			// ���� ����� ���ڷ� ��ȯ�ؼ� �������.
			String str = new String(buff,0,len);
			System.out.println("���� ���� : "+ str);
			*/
			
			// 3. �ַ� ��Ʈ��ũ ó���� �� �� ���� ����ϴ� ���
			byte[] buff = new byte[256];
			// �迭�� ��� �����͸� 'A' �� ä���ش� Arrays.fill()
			Arrays.fill(buff,(byte)'A');	
//			System.out.println(Arrays.toString(buff));
			// �غ�� �迭 buff�� 10�� ����� ���� ������ ����ϰ� 100���ڱ����� ��������
			// (100 ���ڸ� �Է¹��� �� �ִ�)
			int len = System.in.read(buff,10,100);
			
			String str = new String(buff, 0, len + 20);
			
			// \n �� ��������   replaceAll()
			str = str.replaceAll("\r\n", "*");      // \r �� �� 'Ŀ���� �� ������' �ǹ�
			
			System.out.println("�Է��� ���ڿ� : " + str);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test01();

	}

}
