package extra;
/*
학생 성적을 관리하기 위한 클래스를 제작하세요.
class name : Stud

변수 
	String name;
	
	int no;
	int kor, eng, math, physics, cod, total;

과목점수는 객체를 만들때 랜덤하게 입력되는 것으로 하고
반은 한반으로만 하고
데이터를 입력해서
	ArrayList 를 사용해서 
총점이 높은 순으로 정렬해서
출력하세요.


toSTring 함수를 재정의해서 (오버라이딩)
출력을 통일시킬수 있다.

*/
import java.util.*;

public class Stud implements Comparator{
	private String name;
	private int no,kor,eng,math,physics,cod,total;
	
	public Stud() {}
	public Stud(String name ,int kor, int eng, int math, int physics, int cod) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.physics = physics;
		this.cod = cod;
		setTotal();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	// 오버로딩
	public void setTotal() {
		this.total = kor + eng + math + physics + cod;
	}
	@Override
	public int compare(Object o1, Object o2) {
		Stud s1 = (Stud) o1;
		Stud s2 = (Stud) o2;
		
		int result = s1.getTotal() - s2.getTotal();
		return result;
	}
	
	

}
