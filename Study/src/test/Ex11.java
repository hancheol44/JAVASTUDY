package test;

import java.util.*;
public class Ex11 {

	public Ex11() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�̸�", "ȫ�浿");
		map.put("����","24");
		map.put("����","����");
		
		Set<String> key = map.keySet();
		
		ArrayList<String> list = new ArrayList<String>(key);
		
		for(String k : list) {
			System.out.println(k +" - "+map.get(k));
		}
	}
	public static void main(String[] args) {
		new Ex11();
	}

}
