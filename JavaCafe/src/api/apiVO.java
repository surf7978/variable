package api;

public class apiVO {
	private String name;
	private String position;
	private String office;
	private int extn;
	private String Start_date;
	private String salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getExtn() {
		return extn;
	}
	public void setExtn(int extn) {
		this.extn = extn;
	}
	public String getStart_date() {
		return Start_date;
	}
	public void setStart_date(String start_date) {
		Start_date = start_date;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "apiDAO [name=" + name + ", position=" + position + ", office=" + office + ", extn=" + extn
				+ ", Start_date=" + Start_date + ", salary=" + salary + "]";
	}
	
	
	
}
