package day14;

import javax.swing.JOptionPane;

public class Ex01_01 {
/*
  	蓄亜 俳柔 ] 
  		五昔 奄管聖 敗呪稽 薦拙背辞 坦軒馬室推.
  		
  		
 */
	public Ex01_01() {
	String age = JOptionPane.showInputDialog("蟹戚研 脊径背 爽室推(舛呪)!!!!");
	
	int age1 = 0; 
	String msg = "";
	try {
		age1 = Integer.parseInt(age);
		if(age1 < 10) {
			msg ="嬢鍵戚 脊艦陥ずず"; 
		} else if(age1 < 20) {
			msg ="10企 脊艦陥ずず";
		} else if (age1 < 30) {
			msg ="20企 脊艦陥ずず";
		} else if (age1 < 40) {
			msg ="30企 脊艦陥ずず";
		} else if (age1 < 50) {
			msg ="40企 脊艦陥ずず";
		} else if (age1 < 60) {
			msg ="50企 脊艦陥ずず";
		} else if (age1 < 70) {
			msg ="60企 脊艦陥ずず";
		} else if (age1 < 80) {
			msg ="70企 脊艦陥ずず";
		} else if (age1 < 90) {
			msg ="80企 脊艦陥ずず";
		} else if (age1 < 100) {
			msg ="90企 脊艦陥ずず";
		} else {
			msg = "舌呪馬室推~ずず";
		}
	} catch (Exception e) {
		msg = "蟹戚 莫縦戚 焼鑑艦陥";
	}
	
	JOptionPane.showMessageDialog(null, msg);
	
}
	public static void main(String[] args) {
		new Ex01_01();
		
		
		
		
		
	}
}


