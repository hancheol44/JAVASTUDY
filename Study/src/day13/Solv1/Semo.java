package day13.Solv1;

public class Semo extends Figure {
	
	private int garo;
	private int sero;
	@Override
	public double calcArea(int... a) {
		garo = a[0];
		sero = a[1]; 
		
		return garo * sero * 0.5;
	}
	public void toPrint() {
//		System.out.println("가로 : " + garo + " 세로 :" + sero + "넓이 : " + calcArea());
		System.out.println("세모가로 : " + garo + " 세모세로 :" + sero + "넓이 : " + garo*sero);
	};

}
