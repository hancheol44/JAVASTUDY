package day19;

/*
  	���� 6 ]
  		doc ������ ������ ����� �˾Ƴ���.
  		
 */
import java.io.*;
import javax.swing.*;

public class Test06 {

	public Test06() {
		// 1. ����� �˾Ƴ��� ���� ������ ���Ϸ� �����.
		File dir = new File("doc");
		/*
		String[] list = dir.list();
		
		for(int i = 0 ; i < list.length ; i++) {
			String fname = list[i];
			System.out.println(fname);
		}
		System.out.println();
		*/
		/*
		File[] flist = dir.listFiles();
		for(int i = 0 ; i < flist.length ; i++) {
			File fileInfo = flist[i];
			String filename = fileInfo.getName(); // ���� �̸� ������
			long len = fileInfo.length();	// ���� ũ�� ������
			String folder = fileInfo.getParent();	// ���� ������ 
			
			// ����ϱ�
			System.out.print("�����̸� : "+filename +" | ���� : "+folder + " | ������ : "+len+"\n");
		}
		System.out.println();
		*/
		
		/*
		 	Ư�� ������ �ִ� ���� �߿��� Ȯ���ڰ� txt�� ���ϸ� ��� ����غ���.
		 	
		 	�̷� ��� ���͸� ���� ����� ������ �� �Է������ �ϴµ�....
		 	�� ���ʹ� ������� ������ ���� ���ݾ� �޶��� ���̴�.
		 	
		 	���� ���ʹ� �������̽��� ������ ���ְ� �ִ�.
		 	
		 	�츮�� �� �������̽��� �����ؼ� �ʿ��� ����� ����� �ȴ�.
		 */
		
		String[] fileList = dir.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				boolean bool = false;
				/*
				  	�Ű������� ����
				  		File dir 	: ���� ������ ������ �˷��ش�.
				  		String name : ���� ������ �̸��� �˷��ش�.
				  		
				  	�� �Լ��� �ڵ� ȣ��Ǵ� �Լ� 
				  	����� ���ϴ� ������ �ϳ��� �߰��� ������ �� �Լ��� ȣ��ȴ�.
				  	
				  	���� 
				  	�� �Լ��� ��ȯ���� true �̸� ��Ͽ� ���Խ�Ű��
				  	��ȯ���� false �̸� ��Ͽ��� ���ܸ� ��Ų��.
				  	
				 */
				/*
				if(name.endsWith("txt")) {
					bool = true;
				} [else {
					bool = false;
				}] ������ ����..  ��?? bool �⺻�� false����
				 	�Ʒ��� �����ų �� �ְ�
				*/
				return name.endsWith("txt");
			}
			
		});
		
		// fileList�� ����Ѵ�.
		int cnt = 0 ;
		for(String fName : fileList) {
			cnt++;
			System.out.println(fName);
		}
		JOptionPane.showMessageDialog(null, "txt ���� �˻� ��� �� : "+ cnt);
		
	}

	public static void main(String[] args) {
		new Test06();

	}

}
