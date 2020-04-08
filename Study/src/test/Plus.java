package test;

public class Plus implements Calc {

	public Plus() {
		cal(11,12);
	}

	@Override
	public double cal(int no1, int no2) {
	
		return  no1 + no2;
	}

}
