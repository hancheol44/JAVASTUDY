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
		System.out.printf("반지름 : %4d   넓이 : %4.2f\n",banji,area);
	}

}
