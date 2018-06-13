package resource;

public class mobile implements Comparable<mobile>{
	public static void main(String[] args) {
		mobile mobile =new mobile(1, "nil", 1000);
		mobile mobile2 =new mobile(2, "nil2", 2000);
		mobile mobile3 =new mobile(3, "nil3", 3000);
		mobile mobile4 =new mobile(4, "nil4", 4000);
		
		
	}
	private int mobid;
	private String mobnm;
	private long pricce;
	
	public int getMobid() {
		return mobid;
	}
	public void setMobid(int mobid) {
		this.mobid = mobid;
	}
	public String getMobnm() {
		return mobnm;
	}
	public void setMobnm(String mobnm) {
		this.mobnm = mobnm;
	}
	public long getPricce() {
		return pricce;
	}
	public void setPricce(long pricce) {
		this.pricce = pricce;
	}
	public mobile(int mobid, String mobnm, long pricce) {
		super();
		this.mobid = mobid;
		this.mobnm = mobnm;
		this.pricce = pricce;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mobid;
		result = prime * result + ((mobnm == null) ? 0 : mobnm.hashCode());
		result = prime * result + (int) (pricce ^ (pricce >>> 32));
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
		mobile other = (mobile) obj;
		if (mobid != other.mobid)
			return false;
		if (mobnm == null) {
			if (other.mobnm != null)
				return false;
		} else if (!mobnm.equals(other.mobnm))
			return false;
		if (pricce != other.pricce)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\n"+"mobile [mobid=" + mobid + ", mobnm=" + mobnm + ", pricce=" + pricce + "]";
	}
	@Override
	public int compareTo(mobile o) {
		int temp = this.mobnm.compareTo(o.mobnm);
		if(temp==0)// TODO Auto-generated method stub
		temp = (int)(this.pricce-o.pricce);
		return temp;
	}
	
	
	
}