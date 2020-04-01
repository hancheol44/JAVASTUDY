package exam;
/*
	  JOptionPane 으로 숫자를 입력받아서
	  배열을 만들고 
	  배열이 기억할 수 있는 갯수만큼 숫자를 입력받아서 
	  그 숫자들의 합을 구해주는 프로그램을 작성하세요
	  단, 합을 구하는 기능은 함수를 만들어서 처리하세요. 
 */
import javax.swing.*;

import java.util.*;

public class Ex01 {
	
	public Ex01() {
		
		String str = JOptionPane.showInputDialog("원하는 배열길이를 정수로 입력해주세요!");
		
		int ArrayNum = Integer.parseInt(str);
		
		int[] Array = new int[ArrayNum];
		
		setArray(Array);
		
		int alladd = addArray(Array);
		
		JOptionPane.showMessageDialog(null, "만들어진 배열의 길이 : "+str+"\n배열의 구성 :"+Arrays.toString(Array)
										+"\n배열에 생성된 숫자의 총합 : "+alladd);
		  
	}
	
	public int[] setArray(int...a) {
		
		for(int i = 0 ; i < a.length; i++) {
			a[i] = (int)(Math.random()*(10-1+1)+1);
		}
		return a;
	}
	
	
	public int addArray(int...a) {
		int num = 0;
		for(int i = 0 ; i < a.length ; i++) {
			num += a[i];
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		new Ex01();

	}

}
