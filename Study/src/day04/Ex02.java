package day04;
/*
  	 문제 2]
  	 	두개의 주사위를 던져서 합이 6이 되는 경우를 출력하세요.
 */

public class Ex02 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 6 ; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i+j == 6) {
					System.out.println("주사위의 합이 6인 경우는");
					System.out.println("i주사위가"+i+"일때"+"\nj주사위수는"+j+"\n");
					break;
				} 
			}
			
		}
						

	}

}
