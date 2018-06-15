package DesignPatterns.Singleton;

public class Lazyini {

	private static Lazyini instance;
	private Lazyini(){}
	public static Lazyini getInstance() {
		if(instance==null) {
			
			instance =new Lazyini();
		}
		return instance;
		
	}
	
}
/*Lazy Initialization
 * 		creates the instance in the global access method. when method call.
 * 		best for Single thread.
 * 	Dis- when multiple thread inside if loop.both thread create instance(object)
 * 
 */
