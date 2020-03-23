package day07;
import javax.swing.*;
import java.util.*;
/*
  문제 1]
	
	알파벳 10개를 저장할 배열을 만들고
	대문자 10개를 랜덤하게 추출해서 배열에 저장하고
	저장된 배열을 얕은 복사로 복사해서
	출력하고,
	원래 배열을 소문자로 변경한 후
	두 배열을 출력하세요.
	
문제 2]
	
	정수 10개를 저장할 배열을 만들고
	랜덤하게 1 ~ 50까지 수 중 발생시켜서
	배열에 담고
	배열의 5번째까지의 데이터를 깊은 복사로 복사하세요.
	
문제 3]
	
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고 - 문자열 배열 3개
	데이터를 입력해 놓고
	
	이름을 입력하면
	그 사람의 데이터를 모두 저장할 배열을 만들어서
	데이터를 넣고 출력하세요.
	
문제 4]
	전화번호를 입력하면
	'-'를 기준으로 데이터를 분리해서
	저장할 배열을 만들고 분리된 데이터를 순서에 맞게 입력하고 출력하세요.
	indexOf(),substring()

extra ]
	영문 문자열을 입력받아서
	해당 알파벳이 출현하는 빈도를 저장하고
	빈도를  * 로 표시하세요.
 */
public class Ex01 {

	public Ex01() {
//		solv1();
//		solv2();
//		solv3();
//		solv4();
		solv5();
	}
	
	public void solv1() {
		char ch[] = new char[10];
		char ch1[] = ch;
		
		
		for(int i=0; i<10; i++) {
			char tmp =(char)(Math.random()*('Z' - 'A' +1) +'A');
			ch[i] = tmp;
				
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch1));
		for(int i=0;i<10;i++) {
		char tmp =(char)(Math.random()*('Z' - 'A' +1) +'A');
		ch[i] = tmp;
		ch1[i] = (char)(('a'-'A')+(ch[i]));
		
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch1));
		
	}
	
	public void solv2() {
		int [] arr = new int[10];
		int [] arr1 = new int[10];
		for(int i=0; i<10;i++) {
			arr[i] = (int)(Math.random()*(50))+1;
			System.arraycopy(arr,0, arr1,0,5);
			
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		
	}
	
	public void solv3() {
		String name[] = new String[] {"이한철","손은진","김수진","이진수","김성현"};
		String tel[] = new String[] {"010-1111-1111","010-2222-2222","010-3333-3333","010-5555-5555","010-6666-6666"};
		String mail[] = new String[] {"lee@naver.com","son@naver.com","kim@naver.com","lee1@naver.com","kim1@naver.com"};
		
		String str = JOptionPane.showInputDialog("이름을 입력하세요 ! : ");
		int idx = -1;
		
		for(int i=0;i<5;i++) {
			if(name[i].equals(str)){
				idx = i;
				
				String info[] = new String[] {name[idx],tel[idx],mail[idx]};	
				JOptionPane.showMessageDialog(null, info);
				System.out.println(Arrays.toString(info));
			}
		}
	}
	
	public void solv4() {
		String tel = JOptionPane.showInputDialog("전화번호를 입력하세요 ! :");
		
		int no1 = tel.indexOf('-');
		String[] num = new String[3];

			num[0] = tel.substring(0,no1);
			
			String tmp = tel.substring(no1+1);
			no1 = tmp.indexOf('-');
			num[1] = tmp.substring(0,no1);
			num[2] = tmp.substring(no1 +1);
			
	
			JOptionPane.showMessageDialog(null, num);
			System.out.println(Arrays.toString(num));
	}
	
	
	public void solv5() {
		String str = JOptionPane.showInputDialog("영문자를 입력하세요 ! : ");
		String tmp = str.charAt(0)+"";
		
		
		
		loop :
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<tmp.length(); j++ ) {
				if(str.charAt(i) == tmp.charAt(j)) {
					continue loop;			
				}				
			}
			tmp+= str.charAt(i);
		}
			
		char arr[] = tmp.toCharArray();
			
		int cnt[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == arr[i]) {
					cnt[i] += 1;
				}

			}
			
		}
			for(int i=0; i<arr.length;i++) {
				System.out.printf("%3c : " , arr[i]);
				for(int j=0; j<cnt[i]; j++) {
					System.out.print("*");
					
				}
				System.out.println();
			}
		
	}
	
	
	public static void main(String[] args) {
		new Ex01();
	}

}
