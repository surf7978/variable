package programTest1208;

public class Student{
	private String name;
	private int Escore;
	private int Mscore;
	
	public Student(String name, int escore, int mscore) {
		super();
		this.name = name;
		Escore = escore;
		Mscore = mscore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEscore() {
		return Escore;
	}
	public void setEscore(int escore) {
		Escore = escore;
	}
	public int getMscore() {
		return Mscore;
	}
	public void setMscore(int mscore) {
		Mscore = mscore;
	}
}
