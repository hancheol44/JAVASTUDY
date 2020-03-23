package day11;
/*
  	
  	사원의 사원번호, 사원이름, 사원급여, 부서번호, 상사번호, 입사일, 커미션을 저장할 클래스를 작성하세요.
  	
 */
public class Extra01 {
	// 데이터 입력 저장할 전역변수 생성
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
		System.out.printf("사원번호 : %6d   사원이름 : %5s   사원급여 : %4d\n부서번호 : %6d  상사번호 : %5d\n입사일 : %10s   커미션 : %4d\n",empno,ename,esal,deptno,mgrno,hiredate,comm);
	}
	
}
