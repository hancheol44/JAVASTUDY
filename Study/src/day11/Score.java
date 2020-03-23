package day11;
/*
 	 ���� 2] 
 	 	�� Ŭ������ �л� �Ѹ��� 
 	 	�̸�, 
 	 	java, oracle, html, javascript, jsp, spring �� ������ ����� Ŭ�����̴�.
 	 	�� Ŭ������ ��ü�� �� �� �����͸� �Է� �޾Ƽ� �� ������ ����� �ǰ� 
 	 	Ŭ������ ���� �ϼ���.
 	 	
 	 	��, �����Ͱ� �Է��� �� �� ��� 
 	 		�̸��� "�ڱ�ȣ" �� �ϰ� 
 	 		������ �����ϰ� ���ǰ� �ϼ���.
 	 	 
 */
public class Score {

		String name;
		
		int java, oracle, html, javascript, jsp, spring;
		
		int total;
		
		double avg;
		
public Score() {
	this("�ڱ�ȣ");
}

public Score(String name) {
	/*
	this(name, (int)(Math.random()*61+40),(int)(Math.random()*61+40),
			(int)(Math.random()*61+40),(int)(Math.random()*61+40),
			(int)(Math.random()*61+40),(int)(Math.random()*61+40)
			);
	*/
	this(name, getJumsoo(),getJumsoo(),getJumsoo(),getJumsoo(),getJumsoo(),getJumsoo());
	/*
		 getJumsoo() �Լ��� �� Ŭ������ ����̰�
		 �� �Լ��� ����� �� �ִ� ������
		 �� Ŭ������ ��ü�� �� ���Ŀ� ��� ���� �ϴ�.
		 
		 ���� �� �Լ��� ���ٸ� �Ӽ��� ���� �����ϰ� �Ǹ�
		 ���� �޸𸮿� �÷����� ���� ���°�
		 ������ �Լ����� ȣ���� �� ���� �����̱� ������ ����� �� ����.
		 
		 �� �Լ��� ���� ����ؾ߰ڴٸ�
		 �� �Լ��� �̸� �޸𸮿� �÷��ָ� �� ���̴�.
		 �̶� ����� �� �ִ� �Ӽ��� 
		 	"static"
		 �Ӽ��̴�.
	 */
}


public Score(String name, int java,int oracle,int html,int javascript,int jsp,int spring) {
	this.name = name;
	this.java = java;
	this.oracle = oracle;
	this.html = html;
	this.javascript = javascript;
	this.jsp = jsp;
	this.spring = spring;
	setTotal();
	setAvg();
}

//�����ϰ� ���� ��ȯ���ִ� �Լ�
public static int getJumsoo() {     // static �Ӽ� �ο��� �� this(name, getJumsoo... �� ����������)
	return (int)(Math.random()*61+40);
}




// ���� �����ִ� �Լ�
public void setTotal() {
	this.total = java + oracle + html + javascript + jsp + spring;
}

// ��� �����ִ� �Լ�
public void setAvg() {
	this.avg = this.total / 6;
}
	
	
// ���	
public void toPrint() {
	System.out.printf("%5s : %5d | %5d | %5d | %5d | %5d | %5d | %5d | %5.2f\n",
					name,java,oracle,html,javascript,jsp,spring,total,avg);
}
	
	

	
	
	
	
	
}
