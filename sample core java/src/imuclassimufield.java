

public class imuclassimufield {

	public static void main(String[] args) {
//		Per p1 = new Per(1, "nile", 80000);
//		Per p2 = new Per(1, "nile", 820000);
		
		Per p1 =Per.getPerInstance(1, "nil", 8000);
		p1=Per.getPerInstance(2, "sam", 2000);
		System.out.println(p1);
	}

}
final class Per{
	 private final int id;
	 private final String nm;
	 private final long Salary;
	private Per(int id, String nm, long salary) {
		super();
		this.id = id;
		this.nm = nm;
		Salary = salary;
	}
	public static Per getPerInstance(int id, String nm, long salary) {
		return new Per(id, nm, salary);
	}
	public int getId() {
		return id;
	}
	public String getNm() {
		return nm;
	}
	public long getSalary() {
		return Salary;
	}
	@Override
	public String toString() {
		return "Per [id=" + id + ", nm=" + nm + ", Salary=" + Salary + "]";
	}
	
}