package day19;
/*
 	���� 5 ] 
 		1. day19/etc �� ���� �ϳ� ������ �����.
 			day19/etc/snue
 		2. ��λ� ���� �������� ��� �Ѳ����� �����.
 			day19/etc/[zzz/abc]
 			
 		3. ������� ������ �ϳ��� �����Ѵ�.
 			(���� �� ������ �����ϴ�, ���ϵ� ����)
 */
import java.io.*;
import javax.swing.*;

public class Test05 {
	
	public Test05() {
		// ����� ���� ������ �����.
		// 1.
		/*
		File file = new File("src/day19/etc/snue");
		file.mkdir();
		*/
		
		/*
		// 2. �ѹ��� ���� ���� �����
		File file = new File("src/day19/etc/zzz/abc");
		file.mkdirs();
		*/
		
		/*
		// 3.  
		File file = new File("src/day19/etc/zzz/abc");
		file.delete();
		*/
				
		// 4. Ư�� ������ �̸��� �ٸ� �̸����� ��������.
		File oldF = new File("src/day19/etc/sample.txt");
		File newF = new File("src/day19/etc/sample.increpas");
		
		// �ٲ�����.
		oldF.renameTo(newF);
	}

	public static void main(String[] args) {
		new Test05();

	}

}
