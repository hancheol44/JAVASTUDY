package day10;
/**
 * 	�� Ŭ������ ���� ������, �ѷ�, ���̸� ����� Ŭ����
 * @author ����ö
 * 
 *
 */
public class Circle {
	
	int banji;
	double PI;
	double area;
	double gil;
	
	public void setCir(int no1, double no2) {
		banji = no1;
		PI = no2;
		
		area = no1 * no1 * no2;
		gil = 2 * no1 * no2;
	}
	
	public void toPrint() {
		System.out.println("������ : "+banji+"\n���� �ѷ� : " + gil +"\n���� ���� : "+ area);
		System.out.println();
	}
	
	
	
	
	
	
}
