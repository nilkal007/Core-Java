package DesignPatterns.Singleton;



public class threadsafe2check {
	private static threadsafe2check obj;
	private threadsafe2check() {};
	public static threadsafe2check getinstance(){
		if(obj==null) {
			//2
			
			synchronized(threadsafe2check.class){
				if(obj==null) {
					obj=new threadsafe2check();
				}
				
			}
			
			
			
			
		}
		return obj;
		
	}

}
/*
 * ThreadSafe with Double Check
 * 		in this approach Synchronize block inside if condition with Additional check 
 * 			 ensure that only one instance is created
 * 
 * Dis--This is break -- using reflection mechanism -- as you can changes constrctors access modier
 */ 