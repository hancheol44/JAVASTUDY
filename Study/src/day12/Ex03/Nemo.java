package day12.Ex03;

public class Nemo extends Figure {
	int garo,sero;
	double area;
	
	
	public Nemo() {
		
	}
	
	
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
		toPrint();
	}
	
	
	public void setArea() {
		area = garo * sero;
	}
	

	public void toPrint() {
		System.out.println("���� : "+garo+"���� : "+sero+"���� : "+area);
	}
	
		
}
