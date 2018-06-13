package collection.list;

public class roommate {
	
	private int rmnage;
	private String rmnm;
	private long salary;
	public int getRmnage() {
		return rmnage;
	}
	public void setRmnage(int rmnage) {
		this.rmnage = rmnage;
	}
	public String getRmnm() {
		return rmnm;
	}
	public void setRmnm(String rmnm) {
		this.rmnm = rmnm;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public roommate(int rmnage, String rmnm, long salary) {
		super();
		this.rmnage = rmnage;
		this.rmnm = rmnm;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\n"+"roommate [rmnage=" + rmnage + ", rmnm=" + rmnm + ", salary=" + salary + "]";
	}
	
}
