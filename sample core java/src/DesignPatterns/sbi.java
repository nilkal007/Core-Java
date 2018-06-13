package DesignPatterns;

public class sbi {

	private static sbi obj;
	private sbi(){}
	static {
		obj=new sbi();
	}
	public static sbi getInstance(){
		return obj;
		
	}
}
/* Static block Initialization
 * 		same As eager but  but instance created in static block provide option exceptional handling.
 * 		
 * Dis- creates the instance even before it’s being used.
 *
 * 
 * 
 */