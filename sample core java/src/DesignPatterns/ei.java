package DesignPatterns;

public class ei//eagarInitialization
{

	private static final ei instanceobj =new ei();

	private ei() {		
	}
	
	public static ei getinstance() {
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