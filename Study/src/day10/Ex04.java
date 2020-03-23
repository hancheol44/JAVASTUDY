package day10;
/*
 	
	학생의 점수를 입력하면 총점을 계산해주는 프로그램을 제작하세요.
	가변인수
-------------------------------------------------------------------	
	심화 ]
		랜덤하게 인원수를 만들고
		그 인원수 만큼 점수를 랜덤하게 만들어서
		함수를 실행하게 하세요.
 
 */


// 전역변수에 정수타입으로 설정하고 
import java.util.*;
import javax.swing.*;

public class Ex04 {
	int addnum; // 총점이 기록되고
	
	int group;  // 랜덤으로 만들어지는 사람 수 
	int[] people;  // 사용할 배열 생성
	
	
	public Ex04() {
		per();   //인원수 발생하는 함수 실행
//		System.out.println("점수"+addnum); 테스트용
		System.out.println("랜덤하게 만들어진 인원 : "+group);
		
		people = new int[group]; // 그 인원만큼의 방을 가진 배열 생성
		System.out.println("******************************");
		System.out.println("인원수 : "+getSum(people));  // 배열 각 방에 랜덤하게 점수를 생성하여 총합을 할 함수에 배열 입력   
		System.out.println("******************************");
		System.out.println("총점"+addnum);  // 총점 출력
	
	}
	// 인원수를 랜덤하게 발생시키는 함수
	public int per() {
		group = (int)(Math.random()*(25-5+1)+5);
		
		return group;
	}
	
	public int getSum(int...person) {
		// 랜덤으로 생성된 사람의 수 만큼 랜덤으로 점수가 발생되고
		// 각 점수들의 총합을 계산해주는 함수.   
		for(int i = 0 ; i < person.length ; i++) {
			person[i] = (int)(Math.random()*(100-1+1)+1);
			addnum += person[i];
			System.out.println("점수  "+(i+1)+" : "+person[i]);
		}
		System.out.println();
		System.out.println("총점 : "+addnum);
		return person.length;
	}
	
	public static void main(String[] args) {
		new Ex04();
		
	}
	
	

}


