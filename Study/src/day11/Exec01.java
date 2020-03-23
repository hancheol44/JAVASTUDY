package day11;

public class Exec01 {

	public static void main(String[] args) {
		Dohyung[] d1 = new Dohyung[3];
		d1[0] = new Dongl(10);
		d1[1] = new Semo();
		d1[2] = new Nemo(6,6);
		
		// 출력하기
		for(int i = 0 ; i < d1.length ; i++) {
			d1[i].toPrint();
			System.out.println("--------------------");
		}
	}

}
