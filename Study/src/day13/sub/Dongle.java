package day13.sub;

public class Dongle implements Moyang {
	int banji;
	double area;
	

	public Dongle() {
		
	}
	
	public Dongle(int banji) {
		this.banji = banji;
		setArea();
	}
	@Override
	public void setArea() {
		area = banji * banji * 3.14;
	}

	@Override
	public void toPrint() {
		System.out.printf("������ : %4d   ���� : %4.2f\n",banji,area);
	}

}
