package net_test;

import java.net.*;
public class AddrTest {
/*
 	�ڹٿ����� IP �ּ��� ������ �����ϴ� Ŭ������ �����ϰ� �ִ�.
 	==> InetAddress
 	
 	���� ] 
 		1. �� ��ǻ���� IP�� �˾ƺ���.
 			InetAddress �� new ��ų �� ����.
 			==> �Լ��� �Ӽ��� static �̸鼭 ��ȯ���� �ڱ��ڽ��� �Լ��� ã�ƺ���.
 			
 		2. naver ������ �ּҸ� �˾ƺ���.

 */
	
	public AddrTest() {
		InetAddress inet = null;
		InetAddress naver = null;
		
		try {
			inet = InetAddress.getLocalHost();  // ���� �� ��ǻ���� IP ������ ���� ��´�
			naver = InetAddress.getByName("www.naver.com");
			/*
			 	InetAddress Ŭ������ ������ �����ϴ� Ŭ���� �̹Ƿ�
			 	������ ������ �Լ��� �߿��Լ���.
			 	
			 		1. IP�ּ�
			 			getHostAddress();
			 		2. ������ �ּ�( ��� �ο��� �̸� )
			 			getHostName();
			 */
			String ip = inet.getHostAddress();
			String name = inet.getHostName();
			
			System.out.println("�� ��ǻ�� IP : " + ip);
			System.out.println("�� ��ǻ�� �̸� : " + name);
			System.out.println();
			String ip1 = naver.getHostAddress();
			String name1 = naver.getHostName();
			
			System.out.println("naver IP : " + ip1);
			System.out.println("naver �̸� : " + name1);
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
		
	}

	public static void main(String[] args) {
		new AddrTest();
	}

}
