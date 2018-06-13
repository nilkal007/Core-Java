package DesignPatterns;

public class threadsafe {

	private static threadsafe obj;
	private threadsafe(){};
	public static synchronized threadsafe getInstance(){
		if(obj==null) {
			obj=new threadsafe();
		}
		return obj;
		
	}
}
/**
 * Thread Safe
 * 		-only one thread can execute this method at a time
 * Dis--Reduce performance  because Associate functions in method.
 *  	we need it only for the first few threads who might create the separate instances.
 *  		Hence other thread wait who not need to implement instance until other execution complete.  
 */
 