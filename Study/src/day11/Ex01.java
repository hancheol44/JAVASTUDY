package day11;

public class Ex01 {
/*
	
	 ���� 3]
	  ���� 1, 2������ ���� Ŭ������ ��ü�� ����
	  �� �������Լ��� �ùٸ��� �۵��ϴ��� �����ϼ���.
	  
 */
	public Ex01() {
		// �� 10���� ���� ��������.
		Circle[] won = new Circle[10];
		for(int i = 0 ; i < won.length ; i++) {
			if(i < 5 ) {
				won[i] = new Circle((int)(Math.random()*16+5));
			} else {
				won[i] = new Circle();      
			}
		}
		
		// �� ����ϱ�
		for(int i = 0 ; i < won.length ; i++) {
			won[i].toPrint();
			}
		System.out.println("---------------------------------------------------------");
		
		
		// score 
		
		System.out.printf("%5s : %5s | %5s | %5s | %5s | %5s | %5s | %5s | %5s\n",
				"�̸�","java","oracle","html","javascript","jsp","spring","�� ��","�� ��");
		
		Score[] score = new Score[3];
		score[0] = new Score();    // �⺻�� "�ڱ�ȣ" ���
		score[1] = new Score("������");
		score[2] = new Score("���",100,100,100,100,100,100);
		
		for(int i = 0 ; i< score.length ; i++) {
			score[i].toPrint();
		}
		
		System.out.println("--------------------------------------------------------------");
		
			
		}
		
	
	public static void main(String[] args) {
		new Ex01();
	}
	
	
	
	

}
