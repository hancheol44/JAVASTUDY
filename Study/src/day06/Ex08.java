package day06;
/*
 
문제 8]
	
		회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고 -- 문자열배열 3개
		데이터를 입력해서 (5명)
		
		회원의 이름을 입력하면 
		회원의 이름과 전화번호, 이메일을 출력해주는 프로그램을 작성하세요. 
 */
import java.util.*;
public class Ex08 {

	public static void main(String[] args) {
		
		String[] name = new String[] {"손은진","김수진","이진수","김성현","이한철"};
		String[] tel = new String[] {"010-1111-1111","010-2222-2222",
									 "010-3333-3333","010-4444-4444","010-5555-5555"};
		String[] email = new String[] {"abc@naver.com","qwe@naver.com","qwer1@gmail.com",
										"ioqj@gmail.com","rrr@naver.com"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("손은진"+", " +"김수진"+", " +"이진수"+", "+"김성현"+", "+"이한철");
		System.out.print("전화번호와 이메일이 궁금한 회원의 이름을 입력하세요 : ");
		
		String str = sc.nextLine();
		for(int i =0 ; i< name.length; i++) {
			if(str.equals(name[i])) {
				System.out.println(name[i]);
				System.out.println(tel[i]);
				System.out.println(email[i]);
			}
			System.out.println();  
		}
		
		
	}

}
