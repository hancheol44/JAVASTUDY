package day08;

import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		// 2차원 배열을 만든다. 배열을 관리할 갯수는 3개로 하고, 배열에 담길 숫자의 갯수는 7개

		int[][] num = new int[3][7];
		
		for(int[] no1 : num) { // num에 담긴 데이터는 정수 배열일 것이고 하나를 꺼내게 되면 정수배열일 것이다.
			for(int val : no1) {
				System.out.print(val+", ");
			}
			System.out.println();
		}
		// 데이터를 3, 6, 9 로 채워주자.
		// 1차 배열의 각 방에 하나씩 차례로 접근해야 될 것이다.
		for(int i = 0 ; i < num.length ; i++) {
			
			for(int j = 0 ; j < num[i].length ; j++) {
				num[i][j] = 3 + 3 * i;
			}
		}
		
		// 하나씩 꺼내서 출력하기 
		for(int[] no1 : num) { // num에 담긴 데이터는 정수 배열일 것이고 하나를 꺼내게 되면 정수배열일 것이다.
		 	for(int val : no1) {
				System.out.print(val+", ");
			}
			System.out.println();
		}
		/*
		 3, 4, 5, 6, 7, 8, 9, 
		 6, 7, 8, 9, 10, 11, 12, 
		 9, 10, 11, 12, 13, 14, 15, 
 		 로 변경해보자
		 */
		 for(int i = 0 ; i < num.length ; i++) {
			 for(int j = 0 ; j < num[i].length ; j++) {
				 // num의 i번째 인덱스의 데이터를 꺼내면 배열일 것이기 때문에
				 
				 // 각방에 들어가서 각 데이터를 꺼내고 데이터를 인덱스 만큼 더해준다.
				 num[i][j] += j;  // <== num[i][j] = num[i][j] + j;
			 }
		 }
		 for(int i = 0 ; i < num.length ; i++) {
			 for(int j = 0 ; j < num[i].length ; j++) {
				 System.out.printf("%-1d, ",num[i][j]);
			 }
			 System.out.println();
		 }
	}

}
