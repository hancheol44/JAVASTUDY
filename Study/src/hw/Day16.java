package hw;



import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * �� Ŭ������ calendar �Լ� ���� Ŭ�����̴�.
 * @author ����ö
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
		// ���س�¥�� ��� ��¥�� ���̸� õ���� ���� ������ ��ȯ �� ���� ���Ѵ�.
		long diffSec = (targetCal.getTimeInMillis() - baseCal.getTimeInMillis())/1000;
		
		// �� ������ �� ������ ��ȯ�Ѵ�.
		long diffDays = diffSec / (24*60*60);
		
		System.out.println("�� ��¥���� �ϼ� �� = "+diffDays+" ��");
	}
	
	public void ex_GetActualMaximum() {
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		
		cal.set(2020,3,1);   // �� �κ��� 0���� ���� (0 = 1��)
		cal1.set(2019,12,1);   // �� �κ��� 11�� �Ѿ�� �����⵵�� �Ѿ���ϴ�.
		
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("---------------------------");
		System.out.println(cal1.getActualMaximum(Calendar.DAY_OF_MONTH));
		
	}
	
	public void ex_Add_Roll() {
		Calendar date = Calendar.getInstance();
		
		date.set(2020, 3, 31); 
		
		System.out.println(toString(date));
		System.out.println("== 1�� �� ==");
		date.add(Calendar.DATE,1);
		System.out.println(toString(date));

		System.out.println("== 6�� �� ==");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("== 31�� ��(roll) ==");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("== 31�� ��(add) ==");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		/*
		 	roll �� add �޼���� �ٸ�����
		 	�ٸ��ʵ忡 ������ ��ġ�� �ʴ´�.
		 */
	}
	
	private static String toString(Calendar date) {
		// ex_Add_Roll ���
		
		return date.get(Calendar.YEAR)+"�� "+
						(date.get(Calendar.MONTH))+"�� "
						+date.get(Calendar.DATE)+"��";
	}
//	�� �Լ��� Add_Roll���� toString�Լ��� ����ϱ� ���� ���� �Լ� 
	
	
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
