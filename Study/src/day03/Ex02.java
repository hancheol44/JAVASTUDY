package day03;
/*
  	���� 2]
  			�Խ��ǿ� ���� �� �������� 15�� ���� ǥ���� �� �ִ�.
  			�Խù��� ������ �����ϰ� (0 ~ 100) �߻��� ��
  			�ʿ��� ������ ���� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
  			��, �Խù� ���� 0�� ���� 1�������� �ʿ��� ������ �Ѵ�.
 */
public class Ex02 {
	
	public Ex02() {
		solv();
	}
	public void solv() {
		// �Խù��� ���� �����ϰ� �߻��ϰ�
		int num = (int)(Math.random()*(101));
		int result = 0;
		
		if(num <= 15) {
			result = 1;
		} else if(num % 15 == 0) {
			result = num/15;
		} else {
			result = num/15+1;
		}
		System.out.println("������ ����"+ num + "\n��������"+result);
		


		
		/*
		if (num <= 15) {
			page = 1;
		}	else {
			if (num <= 30) {
				page = 2;
			} else {
				if (num <= 45) {
					page = 3;
				} else {
					if (num <= 60) {
						page =4;
					} else {
						if (num <= 75) {
							page = 5;
						} else {
							if(num <= 90) {
								page = 6;
							} else {
								page =7;
							}
						}
					}
				}
			}
		}
		
		System.out.println("�Խù��� ������ : "+ num);
		System.out.println("�ʿ��� ������ ���� : " + page);
		*/
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
