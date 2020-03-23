package day10;
/**
 *  ex03 ���� ����� �Լ��� �����ϴ� Ŭ����
 * 	
 *  �л� �Ѹ��� �̸�, ����, ����, ����, ����, �ڵ� ������ ������ �뵵�� Ŭ����
 *    
 * @author  ����ö
 * @since   2020.03.20	
 * @version v.1.0
 *
 *
 */
public class Report {
	// ��� ���� ����
	String name;
	int kor, eng, math, phys, cod;
	
	public Report() {}
	public Report(String name) {
		this.name = name;
		this.kor = (int)(Math.random()*(100-60+1)+60);
		this.eng = (int)(Math.random()*(100-60+1)+60);
		this.math = (int)(Math.random()*(100-60+1)+60);
		this.phys = (int)(Math.random()*(100-60+1)+60);
		this.cod = (int)(Math.random()*(100-60+1)+60);
	}
	
	// ���� ���ϴ� �Լ�
	public int getSum() {
		return kor + eng + math + phys + cod;
	}
	
	// ��� ���ϴ� �Լ�
	public double getAvg() {
		return getSum() / 5.; 
	}
	
	// ����ϴ� �Լ�
	public void toPrint() {
		System.out.printf("%5s : %5s\n","�� ��",name);
		System.out.printf("%5s : %5d\n","�� ��",kor);
		System.out.printf("%5s : %5d\n","�� ��",eng);
		System.out.printf("%5s : %5d\n","�� ��",math);
		System.out.printf("%5s : %5d\n","�� ��",phys);
		System.out.printf("%5s : %5d\n","�� ��",cod);
		System.out.printf("%5s : %5d\n","�� ��",getSum());
		System.out.printf("%5s : %5.2f\n","�� ��",getAvg());
		for(int i = 0 ; i < 16 ; i++)System.out.print("-");
		System.out.println();
	}
		
	
	
	
}

