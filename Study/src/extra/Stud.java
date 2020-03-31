package extra;
/*
�л� ������ �����ϱ� ���� Ŭ������ �����ϼ���.
class name : Stud

���� 
	String name;
	
	int no;
	int kor, eng, math, physics, cod, total;

���������� ��ü�� ���鶧 �����ϰ� �ԷµǴ� ������ �ϰ�
���� �ѹ����θ� �ϰ�
�����͸� �Է��ؼ�
	ArrayList �� ����ؼ� 
������ ���� ������ �����ؼ�
����ϼ���.


toSTring �Լ��� �������ؼ� (�������̵�)
����� ���Ͻ�ų�� �ִ�.

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
	
	// �����ε�
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
