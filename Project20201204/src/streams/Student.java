package streams;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Student o) {
		//오름차순 : 음수, 같다 : 0, 내림차순 : 양수로 나타내게 하시오.
//		if(this.score < o.score) return -1;
//		else return 1;
		//같은 뜻1
//		return this.score > o.score ? 1 : -1; 
		//같은 뜻2
		return this.score - o.score; //이렇게 하면 오름차순 정렬임 
									 //o.score - this.score 이렇게 하면 내림차순
	}
	
}
