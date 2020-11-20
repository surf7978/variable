package variable5;

public class Member {
	private int id;
	private String name;
	private String ph;
	private String cls;
	
	public Member() {
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPh() {
		return ph;
	}
	public String getCls() {
		return cls;
	}

	
	
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Member(int id, String name, String ph, String cls) {
		this.id=id;
		this.name=name;
		this.ph=ph;
		this.cls=cls;
	}
	
}
