package day12;

public class Test05 {
	
	public Test05() {
		Emp e1 = new Emp();
		// Emp �� �ִ� �������� Ȱ���ϰ� ������ ������ ���������ڰ� private ���� ���ѵǾ��ִ�
//		e1.sal = 10000;  �׷��� ������ �߻��ȴ�.
		e1.setEmpno(10000);
		int eno = e1.getEmpno();
		
	}
	public static void main(String[] args) {
		new Test05();

	}

}
