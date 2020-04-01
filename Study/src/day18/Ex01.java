package day18;

import java.io.*;
import java.util.*;
import javax.swing.*;
/*
  	
  	���� 1]
  	
  		1. Ex01.txt �� ����� �����͸� Properties�� ���
  		2. Ű ���� ��� ������ 
  		3. �����͸� �����ϰ� 
  		4. ������ �����ּ���.
  		5. �޼���â�� ����� ������ ����ϼ���.
  		
 */
public class Ex01 {

	public Ex01() {
		
		Properties prop = new Properties();
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			prop.load(fin);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "### ���� �б� ���� ###");
		}
		
		// �����͸� Ű�� ������ �ѽ����� �̾Ƴ�����.
		Set<Map.Entry<Object, Object>> set1 = prop.entrySet();	
		
		// Iterator --
		Iterator<Map.Entry<Object, Object>> itor = set1.iterator();
		
		int num = 0;
		String msg ="**** ������ ****";
		
		while(itor.hasNext()) {
			Map.Entry<Object, Object> ent = itor.next();
			String k = (String)ent.getKey();
			String v = (String)ent.getValue();
			
			msg += "\n" + k + " : " + v;
			
			int no = Integer.parseInt(v);
			num += no;
		}
		
		msg += "\n���� : " + num; 
		
		JOptionPane.showMessageDialog(null, msg);
}
		
	
	public static void main(String[] args) {
		new Ex01();

	}

}
