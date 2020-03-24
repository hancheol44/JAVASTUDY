package day12;
/*

���� 2]
	
	�л��� �̸�, java , db , html , js , css , ����, ���
	�� ������ Ŭ������ ����� 
	5�� �л��� �����͸� �Է��ؼ� ����ϼ���.
	��, ������ ����ȭ��Ű����.
			
			 
 */
public class Ex02_Ref {

	private String name;
	private int java;
	private int db;
	private int html;
	private int js;
	private int css;
	private int addScore;
	private double avg;
	
	public Ex02_Ref() {
		
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getJava() {
		return java;
	}


	public void setJava(int java) {
		this.java = java;
	}


	public int getDb() {
		return db;
	}


	public void setDb(int db) {
		this.db = db;
	}


	public int getHtml() {
		return html;
	}


	public void setHtml(int html) {
		this.html = html;
	}


	public int getJs() {
		return js;
	}


	public void setJs(int js) {
		this.js = js;
	}


	public int getCss() {
		return css;
	}


	public void setCss(int css) {
		this.css = css;
	}


	public int getAddScore() {
		return addScore;
	}


	public void setAddScore(int addScore) {
		this.addScore = addScore;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public Ex02_Ref(String name,int java,int db, int html,int js,int css) {
		this.name = name;
		this.java = java;
		this.db = db;
		this.html = html;
		this.js = js;
		this.css = css;
		setGrade();
	}
	
	public void setGrade() {
		
		setAddScore(java + db + html + js + css);
		setAvg(getAddScore() / 5.);
	}
	
	public void toPrint() {
		System.out.printf("�̸� : %4s | Java : %3d | DB : %3d | HTML : %3d | JS : %3d | css : %3d | ���� : %4d | ��� : %4.2f\n",name,java,db,html,js,css,addScore,avg);
	}
	
	
	
}
