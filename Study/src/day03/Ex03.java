package day03;
/*
  	문제 3]
  		전기 요금을 계산하는 프로그램을 작성하세요.
  	
  					코드   기본요금     사용요금
  		가정용 		(1)		 3800		  245	
  		산업용 		(2)		 2400		  157	
  		교육용 		(3)		 2900		  169	
  		상업용 		(4)		 3200	      174
  		
  		전기요금 = 기본요금 + 사용량 * 사용요금
  		
  		사용자 코드와 사용량을 입력받아서
  		전기요금을 계산해주는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex03 {
	


	public Ex03() {
		solv();
	}
	
	public void solv() {
		//1. 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		//2. 메세지 출력하고 입력값 변수에 담고
		
		//2-1 코드 입력받고
		System.out.println("1. 가정용    2. 산업용   3. 교육용    4. 상업용");
		System.out.print("위 코드중 한개를 입력하세요! : ");
		int code = sc.nextInt();
		
		//번외] 1 ~ 4 이외의 값이 입력이 되면 사용량 입력의 의미가 없으므로 즉시 종료
		if (!(code >= 1 && code <= 4)) {
			System.out.println("코드가 잘못되었습니다. 즉시 종료합니다!");
			return;
		}
		//2-2 사용량 입력받고
		System.out.print("사용량을 입력하세요! : ");
		int used = sc.nextInt();
		
		//3. 코드에 따라서 용도 구분해서 전기요금 계산하고
		int calc = 0;
		String yongdo = "가정용";
		
		int gibon = 3800; // 기본요금 - 가정용 기본요금으로 초기화
		int yogm = 245;   // 사용요금 - 가종용 사용요금으로 초기화
		
		/*
		if(code == 1) {
			// 여기는 가정용 ==> 용도는 기본값이 가정용으로 초기화가 되어있으므로 수정할 필요가 없다.
			calc = 3800 + used * 245;
		} else if (code == 2) {
			yongdo = "산업용";
			calc = 2400 + used * 157;
	    */		
		if (code == 2) {
			yongdo = "산업용";
			gibon = 2400;
			yogm = 157;
		} else if (code == 3) {
			yongdo = "교육용";
			gibon = 2900; yogm = 169;
		} else if (code == 4){
			yongdo = "상업용";
			gibon = 3200; yogm = 174;
		} 
		
		calc = gibon + used * yogm;
		//4. 요금 출력
		System.out.println("사용자 코드 : "+ code +
							  "\n용도 : "+ yongdo + 
							  "\n사용량 : "+ used +
							  "\n전기요금 : "+calc);
		
	}
	public static void main(String[] args) {
		new Ex03();

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("코드 : 1. 가정용   2.산업용   3.교육용  4.상업용");
		System.out.print("사용자 코드를 입력해주세요 : ");
		int code = sc.nextInt();
						
		System.out.print("전기 사용량을 입력해주세요 : ");
		int ele = sc.nextInt();
		
		int pri = 0;
		
		if(code == 1) {
			pri = 3800 + ele * 245;
		} else {
			if(code ==2) {
				pri = 2400 + ele * 157;
			} else {
				if(code ==3) {
					pri = 2900 + ele * 169;
				} else {
					if(code ==4) {
						pri = 3200 + ele * 174;
					} 
				}
			}
		}
		
		System.out.println("입력한 코드는" + code +"입력한 사용량은"+ele);
		System.out.println("전기 요금은" + pri +"원 입니다!");
		 */
	}

}
