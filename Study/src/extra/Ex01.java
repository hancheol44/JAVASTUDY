package extra;

/*
	 학생 성적을 관리하기 위한 클래스를 제작하세요.
	 class name : Stud
	 
	 변수 
	 	String name;
	 	int ban;
	 	int no;
	 	int kor, eng, math, physics, cod, total;
	 
	 과목점수는 객체를 만들때 랜덤하게 입력되는 것으로 하고
	 반은 한반으로만 하고
	 데이터를 입력해서
	 	ArrayList 를 사용해서 
	 총점이 높은 순으로 정렬해서
	 출력하세요.
	 
	 
 */
import java.util.*;
public class Ex01 {

	public Ex01() {
		String[] member = new String[] {"김수진","손은진","이한철","이진수","김성현",
										"김이슬","서동혁","박기윤","이명환","우현우"};
		
		ArrayList<Stud> list = new ArrayList<Stud>();
		// 10명의 학생의 성적을 랜덤하게 입력받는다.
		// list 에 데이터를 넣는다.
		for(int i = 0 ; i < 10 ; i++) {
			String str = member[i];
			int no1 = (int)(Math.random()*101);
			int no2 = (int)(Math.random()*101);
			int no3 = (int)(Math.random()*101);
			int no4 = (int)(Math.random()*101);
			int no5 = (int)(Math.random()*101);
			
			list.add(new Stud(str,no1,no2,no3,no4,no5));
		}
		// 향상된 for문으로 list를 Stud 인스턴스 s 에 담는다
		for(Stud s : list) {
			System.out.print(s.getTotal()+ " | ");
		}
		System.out.println();
		System.out.println();
		
		// Stud 클래스에 정의된 
		Collections.sort(list, new Stud());
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i).getName()+ " : "+list.get(i).getTotal() + " | ");
		}
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
