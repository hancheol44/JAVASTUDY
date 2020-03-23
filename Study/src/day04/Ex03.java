package day04;

/*
  		문제 3]
  			2x + 4y = 10 의 방정식의 결과를 출력하세요.
  			단, x, y는 모두 0이상  10 이하의 정수 입니다.
*/
public class Ex03 {

	public static void main(String[] args) {
		
		for(int x = 0; x <=10; x++) {
			for(int y = 0; y <= 10 ; y++) {
				if(2*x + 4*y == 10) {
					
					System.out.println("2x + 4y = 10이 되는 수는" +"\nx는"+x+"\ny는"+y);
				}
			}
		}
		
	}

}
