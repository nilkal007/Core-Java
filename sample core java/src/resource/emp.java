package resource;


public class emp {

	private int empid;
	private String empnm;
	private long Salary;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpnm() {
		return empnm;
	}
	public void setEmpnm(String empnm) {
		this.empnm = empnm;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}
	public emp(int empid, String empnm, long salary) {
		super();
		this.empid = empid;
		this.empnm = empnm;
		Salary = salary;
	}
	/*public emp(int empid2, String empnm2, int salary2) {
		// TODO Auto-generated constructor stub
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (Salary ^ (Salary >>> 32));
		result = prime * result + empid;
		result = prime * result + ((empnm == null) ? 0 : empnm.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		emp other = (emp) obj;
		if (Salary != other.Salary)
			return false;
		if (empid != other.empid)
			return false;
		if (empnm == null) {
			if (other.empnm != null)
				return false;
		} else if (!empnm.equals(other.empnm))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "emp [\n empid=" + empid + ", empnm=" + empnm + ", Salary=" + Salary + "]";
	}
	
}
