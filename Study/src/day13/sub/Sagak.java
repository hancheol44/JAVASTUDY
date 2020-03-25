package day13.sub;

public class Sagak implements Moyang {
	private int garo;
	private int sero;
	private double area;
	
	
	public Sagak() {
		
	}
	
	public Sagak(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	@Override
	public void setArea() {
		area = garo * sero ;
	}

	@Override
	public void toPrint() {
		System.out.printf("가로 : %4d   세로 : %4d   넓이 : %4.2f\n",garo,sero,area);
	}

}
