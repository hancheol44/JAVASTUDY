package day11;
/*
  	
  	����� �����ȣ, ����̸�, ����޿�, �μ���ȣ, ����ȣ, �Ի���, Ŀ�̼��� ������ Ŭ������ �ۼ��ϼ���.
  	
 */
public class Extra01 {
	// ������ �Է� ������ �������� ����
	int empno;
	String ename;
	int esal;
	int deptno;
	int mgrno;
	String hiredate;
	int comm;
	
	
	
	public Extra01() {
		
	}
	
	public Extra01(int empno,String ename,int esal, int deptno, int mgrno, String hiredate, int comm) {
		this.empno = empno;
		this.ename = ename;
		this.esal = esal;
		this.deptno = deptno;
		this.mgrno = mgrno;
		this.hiredate = hiredate;
		this.comm = comm;
		
	}
	
	public void toPrint() {
		System.out.printf("�����ȣ : %6d   ����̸� : %5s   ����޿� : %4d\n�μ���ȣ : %6d  ����ȣ : %5d\n�Ի��� : %10s   Ŀ�̼� : %4d\n",empno,ename,esal,deptno,mgrno,hiredate,comm);
	}
	
}
