package hw;



import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * 이 클래스는 calendar 함수 예제 클래스이다.
 * @author 이한철
 * 
 *
 */

public class Day16 {
	
	public Day16() {
//		ex_GetTimeInMillis();
//		ex_GetActualMaximum();
//		ex_Add_Roll();
//		ex_Before_After();
		
		
	}
	
	public void ex_GetTimeInMillis() {
		Calendar baseCal = new GregorianCalendar(2020, Calendar.JANUARY, 12);
		Calendar targetCal = new GregorianCalendar(2020, Calendar.MARCH, 30);
		// 기준날짜와 대상 날짜의 차이를 천분의 일초 단위로 변환 및 차를 구한다.
		long diffSec = (targetCal.getTimeInMillis() - baseCal.getTimeInMillis())/1000;
		
		// 초 단위를 일 단위로 변환한다.
		long diffDays = diffSec / (24*60*60);
		
		System.out.println("두 날짜간의 일수 차 = "+diffDays+" 일");
	}
	
	public void ex_GetActualMaximum() {
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		
		cal.set(2020,3,1);   // 월 부분은 0부터 시작 (0 = 1월)
		cal1.set(2019,12,1);   // 월 부분이 11을 넘어가면 다음년도로 넘어가집니다.
		
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("---------------------------");
		System.out.println(cal1.getActualMaximum(Calendar.DAY_OF_MONTH));
		
	}
	
	public void ex_Add_Roll() {
		Calendar date = Calendar.getInstance();
		
		date.set(2020, 3, 31); 
		
		System.out.println(toString(date));
		System.out.println("== 1일 후 ==");
		date.add(Calendar.DATE,1);
		System.out.println(toString(date));

		System.out.println("== 6달 전 ==");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("== 31일 후(roll) ==");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("== 31일 후(add) ==");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		/*
		 	roll 은 add 메서드와 다른점은
		 	다른필드에 영향을 미치지 않는다.
		 */
	}
	
	private static String toString(Calendar date) {
		// ex_Add_Roll 사용
		
		return date.get(Calendar.YEAR)+"년 "+
						(date.get(Calendar.MONTH))+"월 "
						+date.get(Calendar.DATE)+"일";
	}
//	위 함수는 Add_Roll에서 toString함수를 사용하기 위해 만든 함수 
	
	
	public void ex_Before_After() {
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		Calendar time3 = Calendar.getInstance();
		
		time2.set(1992,4,4);
		time3.set(2020,4,4);
		System.out.println("Before");
		System.out.println(time1.before(time2));
		System.out.println(time1.before(time3));
		System.out.println();
		System.out.println("After");
		System.out.println(time1.after(time2));
		System.out.println(time1.after(time3));
	}
	
	
	public static void main(String[] args) {
		new Day16();

	}

}
