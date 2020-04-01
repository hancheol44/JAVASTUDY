package day18;

import java.util.Comparator;

/*
	문제 2] 
		학생의 이름, 번호, 반, 국어, 영어, 수학, 총점, 평균을 저장할 VO클래스를 만들고
		 		
		5 학생의 데이터를 입력해서 관리할 Set을 만들어서 
		이름 순으로 출력하세요.


	TreeSet 
	 
*/
public class Stud implements Comparable{
	private String name;
	private int no,ban,kor,eng,math,total;
	private double avg;
	
	public Stud() {}
	
	public Stud(String name ,int no, int ban, int kor, int eng, int math) {
		this.name = name;
		this.no = no;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal();
		setAvg();
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
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal() {
		this.total = kor+eng+math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public void setAvg() {
		this.avg = getTotal()/no;
	}

	@Override
	public int compareTo(Object o) {
		Stud s = (Stud) o;
		int result = this.name.compareTo(s.name);
		return result;
	}


	
}
