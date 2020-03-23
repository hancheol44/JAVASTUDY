package day09;
/*
 
	5 학생의 국어, 영어, 수학, 물리, 국사 점수를 입력 받아서 
	총점과 석차를 구하는 프로그램을 작성하세요.	
	단, 입력, 총점계산, 석차계산, 출력은 함수로 처리하세요.
	
	단, 배열은 [5][7] 의 형태로 만든다.
	
 */
import java.util.*;

public class Solv03 {
	
	public static void main(String[] args) {
		Solv03_Ref c = new Solv03_Ref();
		c.score();
		c.addNum();
		c.grade();
		c.toPrint();
		

	}

}
