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
		
//		System.out.println("lotze colr : "+lotze.color);   Super class Car에 값을 담을 변수가 없어서 오류
//		System.out.println("lotze used : "+lotze.used);	   Super class Car에 값을 담을 변수가 없어서 오류
		System.out.println("lotze speed : "+ lotze.speed);
		
//		Mini m1 = (Mini) lotze;   되긴 하지만 가급적 이렇게 사용하지 않는 방향으로 코딩해야 한다.
		
//		Lotze car2 = (Lotze)new Car(); // ==>형식상에는 에러는 없다. 그러나 컴파일상에서 오류가 발생 위와 같은 이유로 Super class에 lotze 속성값을 담을 변수가 없기때문에?   
		
//		System.out.println(car2.speed);
//		car2.speedUp();
//		System.out.println(car2.speed);
	}
	
	public static void main(String[] args) {
		new SpeedTest();
	}

}
