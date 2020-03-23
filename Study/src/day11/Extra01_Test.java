package day11;
// Extra01 함수 활용해서 출력해보기


public class Extra01_Test {
	
	public Extra01_Test() {
		Extra01[] company = new Extra01[5];
		company[0] = new Extra01(1000,"이한철",3000,10,9999,"2020-03-23",1000);
		company[1] = new Extra01(1001,"손은진",4000,20,9999,"2020-03-23",2000);
		company[2] = new Extra01(9999,"김수진",9999,30,9999,"2020-03-23",9999);
		company[3] = new Extra01(1010,"이진수",1010,11,1010,"1010-11-11",1111);
		company[4] = new Extra01(7777,"김성현",9999,30,9999,"2020-03-23",9999);
		
		for(int i = 0 ; i < company.length; i++) {
			company[i].toPrint();
			System.out.println("----------------------------------------------------------------------------------------------------------");
			
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		new Extra01_Test();
		
	}

}
