package day06;

/*
 	
문제 3]
	
	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	이라는 배열을 준비하고 
	
	79456원을 준비된 화폐 단위로 계산할 때 각각의 화폐단위가 몇개씩
	필요한지 갯수를 저장할 배열을 만들고 
	
	출력하는 프로그램을 작성하세요.
	
	 
 */
public class Ex03 {

	public static void main(String[] args) {
		// 화폐단위의 배열 준비
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		// 카운트 하여 저장할 배열을 준비하고
		int[] cnt = new int[8];
		
		// 계산될 숫자 79456 을 담은 변수를 만들고
		int result = 79456;
		
		for(int i =0; i< coin.length ;i++) {
			cnt[i] = result/coin[i];
			result = result%coin[i];
			
			System.out.println(coin[i]+ " : " + cnt[i]);
		}
	
	}

}
