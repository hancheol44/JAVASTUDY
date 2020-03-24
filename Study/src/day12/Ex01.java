package day12;

/*
 	  문제 1 ]
 	 		
 	 		5 학생의 java, db, html, javascript, spring, sum, avg
 	 		
 	 		점수를 관리할 배열을 만들고 
 	 		
 	 		총점과 평균을 구해서 출력하세요.
 	 		
 	 		단, 과목별 총점과 평균도 같이 배열에서 관리하세요
 	 		
 	 		
 	 	day 11 bonus 문제 심화
 	 
 */
public class Ex01 {

	double[][] grade;
	
	public Ex01() {
		
	
		
	}
	// 점수 생성하는 함수
	public void score() {
		for(int i = 0 ; i < grade.length-2; i++) {
			for(int j = 0 ; j < grade[i].length -2 ; j++) {
				grade[i][j] = (int)(Math.random()*(100-60+1)+60);
			}
		}
	}
	
	// 생성된 점수로 합계와 평균을 구하는 함수
	public void setGrade() {
	for(int i = 0 ; i < grade.length; i++) {
			
			int sum = 0; 
			int sum1 = 0; 
			
			for(int j = 0 ; j < grade[i].length ; j++) {
				
				if(j == 5) {
					grade[i][j] = sum;
					grade[j][i] = sum1;
				} else if(j == 6) {
					grade[i][j] = (sum / 5.);
					grade[j][i] = (sum1 / 5.);
				} else {
					sum += grade[i][j];
					sum1 += grade[j][i];
				}
				
			}
			
		}
	}
	
	public void toPrint() {
		for(int i = 0 ; i < grade.length ; i++) {
			for(int j = 0 ; j < grade[i].length ; j++) {
				System.out.print(grade[i][j]+"   |   ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Ex01 c = new Ex01();
		
		c.grade = new double[7][7];
		
		c.score();
		c.setGrade();
		c.toPrint();
		
	}
	
	
	/*
	원본
	 for(int j = 0 ; j < grade[i].length ; j++) {
				
				if(j != 5 && j !=6) {
					sum += grade[i][j];
					sum1 += grade[j][i];
				} else if(j == 5) {
					grade[i][j] = sum;
					grade[j][i] = sum1;
				} else if(j == 6) {
					grade[i][j] = (sum / 5.);
					grade[j][i] = (sum1 / 5.);
				}
	 */
	
	
	
	
	
	
	
	
	
	
}
