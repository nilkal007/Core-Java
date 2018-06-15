package DesignPatterns.Singleton;

public class EagerInitialization
{

	private static final EagerInitialization instanceobj =new EagerInitialization();

	private EagerInitialization() {		
	}
	
	public static EagerInitialization getinstance() {
		return instanceobj; 
	}
			
	
}
/*
 * Eager Initialization
 * 	--Object created at the time loading.
 * Dis--Object is created even application might not use
 * 
 * 		not using of resources.
 * 		Use--File System, Database connections
 *  	Also this method doesn’t provide any options for exception handling.
 */