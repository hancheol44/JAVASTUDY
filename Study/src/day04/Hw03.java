package day04;

/*
 	(중첩된 반복문으로 처리)
  	2 ~ 100 사이의 수 중 소수만 출력해주는 프로그램을 작성하세요.
  	
  	소수 : 1과 자기자신으로만 나눌 수 있는 수
  	
  	comm ]
  		위 문제의 결과로 찾아낸 소수의 갯수를 맨 마지막에 출력하세요.
  	
 */



public class Hw03 {

	public static void main(String[] args) {
		
		
		int count = 0;
		// 2부터 100 까지 수를 반복해서 소수 검사를 한다.
		
	    loop:
		for(int i = 2; i <= 100; i++) {
			
			// 나눌 수 있는 수가 있는지 검사
			for(int j = 2; j < i; j++) {
				if(i % j == 0) { //소수가 아닌 경우를 판별
					continue loop; // i 가 소수가 아닌것으로 판별이 되었으니 다시 다음숫자 검사해야함
					
				}
			}
			// 맨 뒤 쉼표 없애는 법
			String mk = ", ";
			if(i == 2) {
				mk = "";
			}
			System.out.print(mk + i);
			count++;
			// 위 반복문이 정상적으로 끝까지 반복 처리가 됬다면 이 행을 실행할 것이고
			// 그 말은 나눌 수 있는 수(j)가 없다는 말이므로 
			// 이 수(i)는 소수가 된다.
			
			// 그러면 소수를 출력만 하면 될 것이다.
//			System.out.print(i+" , ");
			
		}
		System.out.println("\n위 결과값의 소수의 갯수 : "+count);
	}

}
