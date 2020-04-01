package day18;

import java.io.*;
import java.util.*;
import javax.swing.*;
/*
  	
  	문제 1]
  	
  		1. Ex01.txt 에 저장된 데이터를 Properties에 담고
  		2. 키 값을 모두 꺼내서 
  		3. 데이터를 추출하고 
  		4. 총점을 구해주세요.
  		5. 메세지창을 띄워서 총점을 출력하세요.
  		
 */
public class Ex01 {

	public Ex01() {
		
		Properties prop = new Properties();
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			prop.load(fin);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "### 파일 읽기 에러 ###");
		}
		
		// 데이터를 키와 벨류를 한쌍으로 뽑아내보자.
		Set<Map.Entry<Object, Object>> set1 = prop.entrySet();	
		
		// Iterator --
		Iterator<Map.Entry<Object, Object>> itor = set1.iterator();
		
		int num = 0;
		String msg ="**** 시험결과 ****";
		
		while(itor.hasNext()) {
			Map.Entry<Object, Object> ent = itor.next();
			String k = (String)ent.getKey();
			String v = (String)ent.getValue();
			
			msg += "\n" + k + " : " + v;
			
			int no = Integer.parseInt(v);
			num += no;
		}
		
		msg += "\n총점 : " + num; 
		
		JOptionPane.showMessageDialog(null, msg);
}
		
	
	public static void main(String[] args) {
		new Ex01();

	}

}
