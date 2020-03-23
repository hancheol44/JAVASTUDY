package day04;

/*
  	두 사람이 등산을 하는데
  	한 사람은 이제 등산(0.54m/s)을 시작하고
  	한 사람은 정상에서(1.07m/s) 내려오기 시작했습니다.
  	
  	산의 높이가 7564m 라고 가정하고 
  	두 사람이 만나는 시간은 몇분 몇초 후인지와 높이를 출력해주는 프로그램을 작성하세요. 
 */


public class Hw04 {

	public static void main(String[] args) {
		int tHeight = 7564; // 산의 높이 저장할 변수;
		for(int i = 0; ; i++) {
			//각 초당 올라가는 사람의 높이는 
			double h1 = 0.54 * i;
			//각 초당 내려가는 사람의 높이
			double h2 = tHeight - 1.07 * i;
			
			// 올라가는 사람과 내려오는 사람의 높이가 역전됬을때
			// 결과를 추출하고 break 하면  된다.
			if(h1 > h2) {
				System.out.println("올라가는 사람의 높이 : "+h1);
				System.out.println("내려가는 사람의 높이 : "+h2);
				System.out.println("두 사람이 만난 직후 시간 : "+(i / 60)+" 분,"+(i % 60)+" 초" );
				break;
			}
		}
	}

}
