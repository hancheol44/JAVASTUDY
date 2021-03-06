package exam;
/*
  문제 2]
  	
  	
  	"President Trump said Sunday that the federal government’s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.
He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12.
 His announcement on Sunday indicated that he had backed down from that suggestion."
 
 	단어 단위로 문자열을 잘라서
 	단어길이가 제일 긴 단어의 글자수와 단어를 출력하세요.
 	
 	단,     , 와  . 그리고- , ? 는 단어에서 제외한다.
 */
import java.util.*;

import javax.swing.JOptionPane;
public class Ex02 {
	
	public Ex02() {
		String str =  	
			  	"President Trump said Sunday that the federal government’s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter. "+
				"He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12. "+
				 "His announcement on Sunday indicated that he had backed down from that suggestion.";
		
	/*
	  	참고 ] 
	  	
	  		거의 대부분의 언어에서 문자열 자체를 변경하는 기능은 없다.
	  		변경하는 작업을 하는 함수들은 변경 결과를 반환하는 기능만 가지고 있다.
	  		
	 */

	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
