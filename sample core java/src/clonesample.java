
/*
 * 	Clone
 * 		--Shallow
 * 			Different variable Address but Same Reference Address 
 * 			object.clone(); -- method-throw-CloneNotSupportedException 
 * 				-- object class implement clonable 
 * 					--create clone method in class with throw  CloneNotSupportedException
 * 		example--	public object-type clone() throws CloneNotSupportedException
 * 					{
						return (object-type) super.clone();
					}
 * 		--Deep 
 * 			when we modified the variable value After cloning that time variable create new value address
 * 			when object class have child/child's class.that time  we need the also implementation clonable in that child class
 * 			  
 * 			
 * 		Example 	object2.id=20;
 * 
 * */
public class clonesample {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Adress adr1= new Adress("pune",400059 );
		emp1 em1= new emp1(128, "nilesh", adr1);
		
		emp1 em2=em1.clone();
		
		System.out.println(em1==em2);
		System.out.println(em1.i==em2.i);
		System.out.println(em1.nm==em2.nm);
		System.out.println(em1.ad==em2.ad);
		em2.i=20;
		System.out.println("after set i value");
		System.out.println(em1.i);
		System.out.println(em2.i);
		System.out.println(em1.i==em2.i);
		em2.ad.city="mumbai";
		System.out.println("after set city");
		System.out.println(em1.ad.city);
		System.out.println(em2.ad.city);
		System.out.println(em1.ad.city==em2.ad.city);
	}
	
}
class emp1 implements Cloneable{
	
	Integer i;
	String nm;
	Adress ad;

	
	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public Adress getAd() {
		return ad;
	}

	public void setAd(Adress ad) {
		this.ad = ad;
	}

	public emp1(Integer i, String nm, Adress ad) {
		super();
		this.i = i;
		this.nm = nm;
		this.ad = ad;
	}
	
	@Override
	public String toString() {
		return "emp1 [i=" + i + ", nm=" + nm + ", ad=" + ad + "]";
	}

	public emp1 clone() throws CloneNotSupportedException{
		emp1 clonedEmployee=(emp1) super.clone();
		clonedEmployee.setAd((Adress) clonedEmployee.getAd().clone());
		
		return clonedEmployee;
		
		//return  (emp1) super.clone(); 
		//return null;
	}
	
}
class Adress implements Cloneable{
	String city;
	int pin;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public Adress(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}
	public Adress clone() throws CloneNotSupportedException{
		
		return (Adress) super.clone();
	}
	@Override
	public String toString() {
		return "Adress [city=" + city + ", pin=" + pin + "]";
	} 
}