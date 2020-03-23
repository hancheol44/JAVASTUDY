package day02;

import java.util.*;
public class Ex01 {
/*
   	문제 1]
   		3자리로 구성된 숫자 하나를 입력받은 후 또는 랜덤하게 만든 후
   		백자리 이하를 버린 숫자를 만들어서 출력하세요.
   		ex) 456 --> 400
   	
   	
   	문제 2]
   		0 ~ 255 사이의 숫자를 랜덤하게 만들고 
   		그 숫자를 코드값으로 하는 문자를 만들어서
   		해당 문자가 영문자인지 아닌지 판별해서 출력하세요.
   		단, 삼항연산자를 사용해서 처리하세요.
   	
   	문제 3]
   		화씨(Fahrenheit) 온도 100 은
   		섭씨(Celcius) 온도 몇도인지 알아보는 프로그램을 작성하세요.
   		
   		공식]
   			섭씨온도 = 5 / 9 x (화씨온도 - 32)
   			
   	문제 4]
   		소수점이 있는 숫자를 입력한 후 
   		소수점 이하 세째자리에서 반올림한 결과를 출력하세요.
   		
   		원리]
   			+0.005 을 하면 세째자리에서 변화가 일어날 것이고
   			여기에 x100 해주면 두번째 자리까지 정수부에 들어갈 것이고
   			이것을 정수로 바꾸면 원 숫자의 세번째 자리는 버릴것이고
   			다시 / 100 해주면 원 소수점 형태로 변환될 것이고...
   			
   	문제 5]
   		랜덤한 숫자 ( 10 ~ 99 ) 사이의 숫자를 발생시킨 후 
   		그 숫자가 가까운 10의 배수의 차를 출력하는 프로그램을 작성하세요.
   		
   		예]
   			45 는 50 과의 차가 5가 난다.
   			
   			53 은 50 과의 차가 3이 난다.
   			
   	문제 6]
   		임의의 년도를 입력받아서 
   		해당 년도가 윤년인지 평년인지 판별해서 출력해주는 프로그램을 작성하세요.
   		윤년]
   			4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으며 
   			400으로 나누어 떨어지는 해를 윤년이라 한다.
   		
   		단, 삼항연산자를 사용해서 처리하세요.
   			 
   			
   			
 */
	public Ex01() {
		que01();
		que02();
		que03();
		que04();
		que05();
		que06();
	}
	 public void que01() {
		 /*
			   1.3자리로 구성된 숫자 하나를 입력받은 후 또는 랜덤하게 만든 후
	   				백자리 이하를 버린 숫자를 만들어서 출력하세요.
	   				ex) 456 --> 400 
			 */
			int num = (int)(Math.random()*(999-100 + 1)) +100;
			int num1 = num /100;
			int num2 = num1 * 100;
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("3자리 숫자를 입력해주세요 : ");
			int input1 = sc.nextInt();
			int input2 = input1 / 100;
			int input3 = input2 * 100;
			System.out.println(input3);
	 }
		
	 public void que02() {  // 다시
			 /*
			    0 ~ 255 사이의 숫자를 랜덤하게 만들고 
	   		그 숫자를 코드값으로 하는 문자를 만들어서
	   		해당 문자가 영문자인지 아닌지 판별해서 출력하세요.
	   		단, 삼항연산자를 사용해서 처리하세요.
			  */
			 int num = (int)(Math.random()*256);	
			 char code = (char)num;
			 System.out.println(code);
			 String result = ((char)code >= 'A' & (char)code <='Z') ? ("영문자입니다!!!") :
				 			(
				 			  (char)code >= 'a' & (char)code <= 'z' ? ("영문자입니다!!!") :
				 				  ("영문자가 아닙니다ㅠㅠ")
				 			);
				 				
					 
		     System.out.println(result);
	 }
	 public void que03() {
		 /*
		  화씨(Fahrenheit) 온도 100 은
   			섭씨(Celcius) 온도 몇도인지 알아보는 프로그램을 작성하세요.
   		
   			공식]
   				섭씨온도 = 5 / 9 x (화씨온도 - 32)
		  */
		 Scanner sc = new Scanner(System.in);
		 System.out.print("화씨 온도를 입력하세요 : ");
		 double fah1 = sc.nextInt();
		 double cel1 = 5/9f*(fah1 - 32);
		 System.out.println("입력한 화씨 온도는 섭씨 온도로"+cel1);
		 
	 }
	 public void que04() { 
		 /*
		  	문제 4]
   				소수점이 있는 숫자를 입력한 후 
   				소수점 이하 세째자리에서 반올림한 결과를 출력하세요.
   		
   		원리]
   			+0.005 을 하면 세째자리에서 변화가 일어날 것이고
   			여기에 x100 해주면 두번째 자리까지 정수부에 들어갈 것이고
   			이것을 정수로 바꾸면 원 숫자의 세번째 자리는 버릴것이고
   			다시 / 100 해주면 원 소수점 형태로 변환될 것이고...
		  */
		 Scanner sc = new Scanner(System.in);
		 System.out.print("소수점이 있는 숫자를 입력해주세요 : ");
		 double num1 = sc.nextDouble();
		 double num2 = (num1 + 0.005) * 100;
		 int num3 = (int)num2;
		 double result = (double)num3/100;
		 System.out.println("입력한 숫자에서 소수 세째자리에서 반올림 결과는 : "+result+"입니다." );
		 
	 }
	 
	 public void que05() {
		 /*
		  	문제 5]
   		랜덤한 숫자 ( 10 ~ 99 ) 사이의 숫자를 발생시킨 후 
   		그 숫자가 가까운 10의 배수의 차를 출력하는 프로그램을 작성하세요.
   		
   		예]
   			45 는 50 과의 차가 5가 난다.
   			
   			53 은 50 과의 차가 3이 난다.
		  */
		 int num = (int)(Math.random()*(99 - 10 + 1))+10;
		 int num1 = (num+5)/10*10;
		 System.out.println("입력한 숫자는 : "+num);
		 System.out.println("가까운 10의 배수는 : "+num1);
		 System.out.println("출력한 숫자가 가까운 10의 배수와의 차이는 : "+Math.abs(num1-num));
		 
	 
	 }
	 
	public void que06() {
		/*
		 	임의의 년도를 입력받아서 
   			해당 년도가 윤년인지 평년인지 판별해서 출력해주는 프로그램을 작성하세요.
   			윤년]
   			4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으며 
   			400으로 나누어 떨어지는 해를 윤년이라 한다.
   		
   		단, 삼항연산자를 사용해서 처리하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 년도를 입력해주세요 : ");
		int year = sc.nextInt();
		char year1 = (char)year;
		
		String result = ((char)year1 % 4 == 0 && (char)year1 % 100 != 0 || (char)year1 % 400 == 0) ?
							("윤년입니다~") : ("평년이네요");
				
		System.out.println(result);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Ex01();
		
	
		
		 
		
	}
}
