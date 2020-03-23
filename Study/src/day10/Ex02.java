package day10;
/*
 문제 2]
	
	10개의 과목의 점수를 입력할 배열을 만들고 (배열의 길이는 10으로 한다.)
	그 배열에 담긴 점수의 총점, 평균을 구해서 출력해주는 프로그램을 작성하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수를 제작해서 처리하세요.
	 
 */
public class Ex02 {
	
	
	public static void main(String[] args) {
		Array c = new Array();
		
		c.input();
		c.sumscore();
		c.numavg();
		c.toPrint();
		
	}

}
