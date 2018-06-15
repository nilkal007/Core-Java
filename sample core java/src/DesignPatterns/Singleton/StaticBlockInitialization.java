package DesignPatterns.Singleton;

public class StaticBlockInitialization {

	private static StaticBlockInitialization obj;
	private StaticBlockInitialization(){}
	static {
		obj=new StaticBlockInitialization();
	}
	public static StaticBlockInitialization getInstance(){
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