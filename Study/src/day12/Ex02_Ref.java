package day12;
/*

문제 2]
	
	학생의 이름, java , db , html , js , css , 총점, 평균
	을 저장할 클래스를 만들고 
	5명 학생의 데이터를 입력해서 출력하세요.
	단, 변수는 은닉화시키세요.
			
			 
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
	
	public Ex02_Ref(String name) {
		this.name = name;
		setGrade();
	}
	
	public void setGrade() {
		
		java = (int)(Math.random()*41+60);
		db = (int)(Math.random()*41+60);
		html = (int)(Math.random()*41+60);
		js = (int)(Math.random()*41+60);
		css = (int)(Math.random()*41+60);
		
		setAddScore(java + db + html + js + css);
		setAvg(getAddScore() / 5.);
	}
	

	
	
	
}
