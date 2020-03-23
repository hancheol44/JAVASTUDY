package day11.preSolv;
/**
 * 
 * 이 클래스는 학생 한명의 이름과 과목 점수를 저장할 용도의 클래스 
 * 
 * @author  이한철
 * @since   2020.03.23
 * @version v.1.0
 *
 */
public class Stud {
	// 이 클래스는 학생 한명의 데이터이므로 
	// 학생의 이름이 있어야 겠다.
	String name;
	
	// 과목 점수를 저장할 목적으로 변수를 만들어두자.
	int kor, eng, math, phys, cod;
	
	// 이 클래스가 인스턴스가 되는 순간 
	// 해당 인스턴스의 소유주를 기억시켜 놓으면 좋을것 같다.
	// 멤버의 초기화 역할을 하는 함수가 생성자 함수 이므로 
	// 생성자 함수에서 입력되는 이름으로 초기화 시키기로 하자.
	
	public Stud() {
		// 아무데이터도 입력하지 않으면 "우현우" 라는 학생의 데이터로 초기화 되게 하자.
//		this.kor = 100;   ==> 이 상태면 아래 에러발생 (this 함수 이전에는 명령이 오게되면 안된다!)
//		this("우현우");
		setSubj();
	
	}
	
	public Stud(String name) {
		this();
		this.name = name;
	}
	
	// 과목 점수 입력해주는 함수
	// 우리는 랜덤하게 입력이 되게 하자.
	public void setSubj() {
		kor = (int)(Math.random()*41+60);
		eng = (int)(Math.random()*41+60);
		math = (int)(Math.random()*41+60);
		phys = (int)(Math.random()*41+60);
		cod = (int)(Math.random()*41+60);
	}
	
	// 총점 구하는 함수. 우리는 총점을 담을 변수가 없다.
	// 따라서 이 함수가 실행되면 총점을 알려주도록 해야겠다.
	
	public int getSum() {
		//총점계산 후 반환
		return kor + eng + math + phys + cod; 
	}
	
	// 평균 구해주는 함수
	public double getAvg() {
		return getSum() / 5.;
	}
	
	public void toPrint() {
		System.out.printf("%5s : %5d | %5d | %5d | %5d | %5d | %5d | %7.2f\n",name, kor, eng, math, phys, cod, getSum(), getAvg());
	}
}
