package day12;

public class SpeedTest {
	
	public SpeedTest() {
		Car car = new Car();
		car.speedUp();
		System.out.println("Car speed : "+ car.speed);
		
		Mini mini = new Mini();
		mini.speedUP();
		System.out.println("Mini speed : "+ mini.speed + "m/h");
		
		Lotze euns = new Lotze();
		euns.speedUp();
		euns.speedUp(20);
		System.out.println("euns speed : "+ euns.speed);
		
		Car lotze = new Lotze();
		
//		System.out.println("lotze colr : "+lotze.color);   Super class Car�� ���� ���� ������ ��� ����
//		System.out.println("lotze used : "+lotze.used);	   Super class Car�� ���� ���� ������ ��� ����
		System.out.println("lotze speed : "+ lotze.speed);
		
//		Mini m1 = (Mini) lotze;   �Ǳ� ������ ������ �̷��� ������� �ʴ� �������� �ڵ��ؾ� �Ѵ�.
		
//		Lotze car2 = (Lotze)new Car(); // ==>���Ļ󿡴� ������ ����. �׷��� �����ϻ󿡼� ������ �߻� ���� ���� ������ Super class�� lotze �Ӽ����� ���� ������ ���⶧����?   
		
//		System.out.println(car2.speed);
//		car2.speedUp();
//		System.out.println(car2.speed);
	}
	
	public static void main(String[] args) {
		new SpeedTest();
	}

}