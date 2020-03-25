package day12.Ex03;

public class Won extends Figure {
	int banji;
	double area;
	
	
	public Won() {}
	
	public Won(int banji) {
		this.banji = banji;
		setArea();
		toPrint();
	}
	
	
	public void setArea() {
		area = banji * banji * 3.14;
	}
	

	public void toPrint() {
		System.out.println("반지름 : "+banji+"넓이 : "+area);
	}
	
}
