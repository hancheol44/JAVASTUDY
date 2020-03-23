package day09_sub;
/*
  		1 2 3 4 10
  		3 4 5 6 18
  		5 6 7 8 26
 */
public class Ex04 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 3 ; i++) {
			
			int sum = 0;   // 누적시킬때 어떠한 반복문에 위치시켜야하는지 생각해야한다.
			for(int j = 0 ; j < 5 ; j++) {
			//int sum = 0 ;  이쪽에 누적시킬시 내부 for문이 돌아갈때마다 숫자가 리셋된다.	
				int result = (i*2)+1+j;
				
				if(j != 4) {
					sum += result;
				} else {
					result = sum;
				}
				System.out.printf("%4d",result);
			}
			System.out.println();
		}
	}

}
