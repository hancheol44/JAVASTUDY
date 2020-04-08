package test;

import java.util.*;
public class Ex11 {

	public Ex11() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("이름", "홍길동");
		map.put("나이","24");
		map.put("성별","남자");
		
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
