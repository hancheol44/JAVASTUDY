package day12;
/*
 
문제 2]
	
	학생의 이름, java , db , html , js , css , 총점, 평균
	을 저장할 클래스를 만들고 
	5명 학생의 데이터를 입력해서 출력하세요.
	단, 변수는 은닉화시키세요.
			
			 
 */
public class Ex02 {
	
	public Ex02() {
		
		Ex02_Ref[] stud = new Ex02_Ref[5];
		stud[0] = new Ex02_Ref("이한철",80,90,70,70,77);
		stud[1] = new Ex02_Ref("손은진",90,100,77,77,66);
		stud[2] = new Ex02_Ref("김수진",100,100,100,100,100);
		stud[3] = new Ex02_Ref("김성현",98,77,88,55,99);
		stud[4] = new Ex02_Ref("이진수",48,100,65,98,74);

		
		for(int i = 0 ; i < stud.length ; i++) {
			stud[i].toPrint();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Ex02();
	
	
	}
	
	
}
