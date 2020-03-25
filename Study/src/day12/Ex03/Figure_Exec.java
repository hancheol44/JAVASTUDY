package day12.Ex03;

public class Figure_Exec {
	
	public Figure_Exec() {
		
		Figure[] f = new Figure[10];
		
		for(int i = 0 ; i < f.length; i++) {
			
			int no = (int)(Math.random()*3+1);
			int num1 = (int)(Math.random()*(10-5+1)+5);
			int num2 = (int)(Math.random()*(10-5+1)+5);
			
			if(no == 1) {
				f[i] = new Semo(num1,num2);
			} else if (no == 2) {
				f[i] = new Nemo(num1,num2);
			} else {
				f[i] = new Won(num1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Figure_Exec();

	}

}
