package day09_sub;
/*
  		1 2 3 4 10
  		3 4 5 6 18
  		5 6 7 8 26
 */
public class Ex04 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 3 ; i++) {
			
			int sum = 0;   // ������ų�� ��� �ݺ����� ��ġ���Ѿ��ϴ��� �����ؾ��Ѵ�.
			for(int j = 0 ; j < 5 ; j++) {
			//int sum = 0 ;  ���ʿ� ������ų�� ���� for���� ���ư������� ���ڰ� ���µȴ�.	
				int result = (i*2)+1+j;
				
				if(j != 4) {
					sum += result;
				} else {
					result = sum;
				}
				System.out.printf("%4d",result);
			}
			System.out.println();
		}
	}

}
