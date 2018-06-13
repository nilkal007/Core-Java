package DesignPatterns;

public class BillPugh {

	private static class billpugh2{
		private  final static  BillPugh bp=new BillPugh() ;
			
	}
	private BillPugh(){}
	public static  BillPugh getinstance() {
		
		//billpugh2 billpugh2=new billpugh2();
		
		return billpugh2.bp;
		
		
	}
}
/*
 * BillPugh --When the singleton class is loaded, inner class is not loaded into memory \
 * 				and only when someone calls the getInstance method,
 * 				 this class gets loaded and creates the Singleton class instance 
 * */
 