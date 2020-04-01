package day18;

import java.util.*;
import java.io.*;
public class Test01 {
/*
  	Sample.txt 파일을 읽어서 Map으로 저장해보자.
 */
	public Test01() {
		// Properties 변수 만들고
		Properties prop = new Properties();
		// 외부 파일과 연결할 예정이다.
		// 이 작업은 오후에 할 예정인 IO에서 정확히 공부하자.
		FileInputStream fin = null; // 파일이 없는 경우는 예외가 발생할 것이기 때문에 일단 null로 초기화해주고 
									// try 블럭에서 변수에 데이터를 셋팅한다.
		try {
			fin = new FileInputStream("src/day18/Sample_ko.txt");
			// 경로는 절대 경로를 사용해서 우리가 현재 작업하는 폴더를 (d:\pre\gitme\JAVASTUDY\Study\src\day18\Sample.txt
			// 이클립스 안에 데이터를 만들면 이것은 이클립스 자신이 경로를 새롭게 정해서 처리하므로
			// 위의 경우처럼 프로젝트 내부의 경로를 찾아주면 된다.
			
			// 이제 이 파일의 내용을 Properties가 읽도록한다.
			prop.load(fin);
			// load 함수가 실행되는 순간 파일의 내용을 읽어서 Map으로 처리를 했다.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 이제부터는 마치 HashMap 에 데이터가 저장된 것처럼 사용하면 된다.
		// Properties는 해당파일 내용을 '='을 기준으로 왼쪽은 키값, 오른쪽은 데이터가 된다.
		//		'=' 연산자 앞뒤로 반드시 공백은 없게 해야하고 데이터 끝에 공백이 존재하는지도 확인해야한다.
		// 		id=increpas-cls2 라고 하면 map.put("id","increpas-cls2") 라고 입력한 것과 같은 결과다.
		String name = (String) prop.get("name");
		System.out.println("성현씨 짝궁 이름 : "+ name);
		System.out.println("성현씨 짝궁 나이 : "+ prop.get("age"));
		System.out.println("성현씨 짝궁 연락처 : "+ prop.get("tel"));
		System.out.println("성현씨 짝궁 주소 : "+ prop.get("addr"));
	}

	public static void main(String[] args) {
		new Test01();

	}

}
