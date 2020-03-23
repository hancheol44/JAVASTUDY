package day09_sub;
/*
	 1   2   99  4   5
	 2   99  4   5   99
	 99  4   5   99  7	
 */
public class Ex03 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				
				int num = i+j+1;
				
				if(num ==3 || num==6) {
				   num = 99;
				}
				
				System.out.printf("%4d",num);
			}
			System.out.println();
		}
	}

}
