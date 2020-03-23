package day03;
/*
  	문제 2]
  			게시판에 글을 한 페이지에 15개 글을 표시할 수 있다.
  			게시물의 갯수를 랜덤하게 (0 ~ 100) 발생한 후
  			필요한 페이지 수를 계산해서 출력해주는 프로그램을 작성하세요.
  			단, 게시물 수가 0인 경우는 1페이지가 필요한 것으로 한다.
 */
public class Ex02 {
	
	public Ex02() {
		solv();
	}
	public void solv() {
		// 게시물의 갯수 랜덤하게 발생하고
		int num = (int)(Math.random()*(101));
		int result = 0;
		
		if(num <= 15) {
			result = 1;
		} else if(num % 15 == 0) {
			result = num/15;
		} else {
			result = num/15+1;
		}
		System.out.println("랜덤한 숫자"+ num + "\n페이지수"+result);
		


		
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
		
		System.out.println("게시물의 개수는 : "+ num);
		System.out.println("필요한 페이지 수는 : " + page);
		*/
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
