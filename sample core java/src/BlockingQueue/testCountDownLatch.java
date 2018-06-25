package BlockingQueue;

import java.util.concurrent.CountDownLatch;


public class testCountDownLatch {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch adl=new CountDownLatch(4);
		Thread  e1= new Thread(new emp1("emp1", 5000, adl));
		Thread  e2= new Thread(new emp1("emp2", 5000, adl));
		Thread  e3= new Thread(new emp1("emp3", 5000, adl));
		Thread  e4= new Thread(new emp1("emp4", 5000, adl));
		e1.start();
		e1.join();
		System.out.println(adl);
		e2.start();
		e2.join();
		System.out.println(adl);
		e3.start();
		e3.join();
		System.out.println(adl);
		e4.start();
		e4.join();
		System.out.println(adl);
		
		try {
			adl.await();
			System.out.println("\"All employees got seat started the car\"");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
class emp1 implements Runnable{
	String nm;
	long timetoreachparking;
	CountDownLatch cdl=null;
	public emp1(String nm, long timetoreachparking, CountDownLatch cdl) {
		super();
		this.nm = nm;
		this.timetoreachparking = timetoreachparking;
		this.cdl = cdl;
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(timetoreachparking);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nm+" has taken seat");
		cdl.countDown();
	}
	
	
}