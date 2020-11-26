package variable6;

public class Member {
	private int id;
	private String name;
	private String ph;
	private String cls;
	
	public Member() {
		
	}
	
	
	public Member(int id, String name, String ph, String cls) {
		super();
		this.id = id;
		this.name = name;
		this.ph = ph;
		this.cls = cls;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", ph=" + ph + ", cls=" + cls + "]";
	}
	
	
}
