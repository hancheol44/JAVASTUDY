package day03;
/*
 			랜덤한 숫자 ( 10 ~ 99 ) 사이의 숫자를 발생시킨 후 
   		그 숫자가 가까운 10의 배수의 차를 출력하는 프로그램을 작성하세요.
   		
   		예]
   			45 는 50 과의 차가 5가 난다.
   			
   			53 은 50 과의 차가 3이 난다.
 */
public class Hw05 {
/*
	public Hw05() {
		
	}
	
	위 상태에서 위 Hw05() 가 생략이 되어도
	메인 메소드에 있는 new Hw05(); 오류발생되지 않는다.
	JVM에서 가상으로 생성을 하기 때문! (기본생성자함수를 만들어준다)
	
	------
	public Hw05(int gg){
	
	}
	
	→ 위와 같이 할 시에는 메인메소드에 있는 new Hw05(); 에러발생
	  이유는 Hw05에 매개변수가 생성이 되어
	  JVM 에서 임의로 생성하는 것이 안되기 때문
	  매개변수를 포함하는 생성자함수를 만들경우
	------
*/	
	public Hw05() {
//		abc();
		solv();
	}
	/*
	public Hw05(int no) {
		
	}
	*/
	public void solv() {
		// 10 ~ 99 사이의 랜덤한 숫자 만들기
		int num = (int)(Math.random()*(99 - 10 + 1))+ 10;
		
		// 가까운 10의 배수 만들기
		// 먼저 10으로 나눈 나머지 구하고
		int nmj = num % 10;
		
		// 나머지가 5보다 크거나 같으면 십의 단위를 10 올려주고 ,
		// 작으면 10의 단위로 그냥 쓰고
		int sip = (nmj >= 5) ? (num / 10 * 10 + 10) : (num / 10  * 10);
		
		// 차를 구한다. 그런데 나머지가 5보다 크거나 같은 경우는 sip에서 숫자를 빼주어야겠고,
		// 5보다 작으면 숫자에서 sip을 빼주면 된다.
		int cha = (nmj >= 5) ? (sip - num) : (num - sip);
		
		// 출력한다.
		System.out.println("랜덤하게 발생한 숫자 : "+ num + "\n 가까운 10의 배수 : "+ sip +
							"\n 가까운 십의 배수와의 차 : "+ cha);
	}
	public static void main(String[] args) {   // 
		new Hw05(); // new 는 클래스를 메모리에 올릴때 사용한다. (함수는 적용X)
//		abc();
//		new Hw05(10);
	}
	/*
	public void abc() { 
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★");
	}

	public void xyz() {
		abc();		// 클래스 내부의 같은 멤버이기에 호출 가능하다.
		}
	
	public void xyz(int abc) {  // 위 xyz 현 xyz 매개변수의(유형이나 개수) 다름으로 동일 이름 사용가능(오버로딩)
		
	} 
	*/
}
