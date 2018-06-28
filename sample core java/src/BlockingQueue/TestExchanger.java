package BlockingQueue;

import java.util.concurrent.Exchanger;

public class TestExchanger {

	public static void main(String[] args) {
		
		Exchanger<String> ex= new Exchanger<>();
		Aa a=new Aa(ex, "A1");
		B b=new B(ex, "B1");
		new Thread(a).start();
		new Thread(b).start();
	}

}
class Aa implements Runnable{
	Exchanger<String> ex=null;
	String nm;
	
	public Aa(Exchanger<String> ex, String nm) {
		super();
		this.ex = ex;
		this.nm = nm;
	}

	@Override
	public void run() {
	
	try {
		String s1=this.nm;
		this.nm=this.ex.exchange(this.nm);
		System.out.println(Thread.currentThread().getName()+"exchange "+s1+"for"+this.nm);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
}
class B implements Runnable{
	Exchanger<String> ex=null;
	String nm;
	
	public B(Exchanger<String> ex, String nm) {
		super();
		this.ex = ex;
		this.nm = nm;
	}

	@Override
	public void run() {
		try {
			String s2=this.nm;
			this.nm=this.ex.exchange(this.nm);
			System.out.println(Thread.currentThread().getName()+"exchange"+s2+"for"+this.nm);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
}