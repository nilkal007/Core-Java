package Serialization;

import java.io.Serializable;

public class chiSer {

	int a;
	public chiSer() {
		
	}
	public chiSer(int a) {
		this.a=a;
	}
	@Override
	public String toString() {
		return "chiSer [a=" + a + "]";
	}

	
	
}
class child2 extends chiSer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int b;

	public child2() {}

	public child2(int a, int b) {
		super(a);
		this.b = b;
	}

	@Override
	public String toString() {
		return "child2 [b=" + b + ", a=" + a + "]";
	}

	



	

	
	
}