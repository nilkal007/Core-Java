package DesignPatterns;

public class singletone {

	public static void main(String[] args) {
		
			ei ei1= ei.getinstance();
			ei ei2= ei.getinstance();
			System.out.println(ei1==ei2);
			
			
			
			
			sbi s1= sbi.getInstance();
			sbi s2 =sbi.getInstance();
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