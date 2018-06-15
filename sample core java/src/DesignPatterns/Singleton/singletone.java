package DesignPatterns.Singleton;

public class singletone {

	public static void main(String[] args) {
		
			EagerInitialization ei1= EagerInitialization.getinstance();
			EagerInitialization ei2= EagerInitialization.getinstance();
			System.out.println(ei1==ei2);
			
			
			
			
			StaticBlockInitialization s1= StaticBlockInitialization.getInstance();
			StaticBlockInitialization s2 =StaticBlockInitialization.getInstance();
			System.out.println(s1==s2);
			Lazyini l1=Lazyini.getInstance();
			Lazyini l2=Lazyini.getInstance();
			System.out.println(l1==l2);
			threadsafe t1=threadsafe.getInstance();
			threadsafe t2=threadsafe.getInstance();
			System.out.println(t1==t2);
			
			BillPugh b1=BillPugh.getinstance();
			BillPugh b2=BillPugh.getinstance();
			System.out.println(b1==b2);
	}

}