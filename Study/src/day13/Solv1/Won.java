package day13.Solv1;

public class Won extends Figure {

	private int ban;
	@Override
	public double calcArea(int... a) {
		ban = a[0];
		
		return ban * ban * 3.14;
	}
	
	public void toPrint() {
//		System.out.println("반지름 : " + ban + "넓이 : " + calcArea());
		System.out.println("반지름 : " + ban * ban * 3.14);
	};

}
