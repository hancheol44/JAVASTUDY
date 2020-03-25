package day13.sub;

public class Samgak implements Moyang {
	private int width;
	private int height;
	private double area;
	
	
	public Samgak() {
		
	}
	
	public Samgak(int width, int height) {   // 함수의 오버로딩
		this.width = width;
		this.height = height;
		setArea();
	}
	@Override
	public void setArea() {
		area = width * height * 0.5;
	}

	@Override
	public void toPrint() {
		System.out.printf("밑변 : %4d   높이 : %4d   넓이 : %4.2f\n",width,height,area);
	}

}
