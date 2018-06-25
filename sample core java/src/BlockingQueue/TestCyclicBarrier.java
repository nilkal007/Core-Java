package BlockingQueue;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {

	public static void main(String[] args) {

		CyclicBarrier cp=new CyclicBarrier(4);
		Thread t1=new Thread(new bike(cp));
		Thread t2=new Thread(new bike(cp));
		Thread t3=new Thread(new car(cp));
		Thread t4=new Thread(new car(cp));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
class bike implements Runnable{
	CyclicBarrier chechpoint=null;
	
	public bike(CyclicBarrier chechpoint) {
		super();
		this.chechpoint = chechpoint;
	}
	@Override
	public void run() {
	
		
		try {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"leave pune");
			chechpoint.await();
			Thread.sleep(10000);
			System.out.println(Thread.currentThread().getName()+"reach lonavala");
			chechpoint.await();
			Thread.sleep(15000);
			System.out.println(Thread.currentThread().getName()+"reach vashi");
			chechpoint.await();
			Thread.sleep(20000);
			System.out.println(Thread.currentThread().getName()+"finally mumbai");
			chechpoint.await();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
class car implements Runnable{
	
	CyclicBarrier checkpoint=null;
	
	public car(CyclicBarrier checkpoint) {
		super();
		this.checkpoint = checkpoint;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName()+"leave pune");
		try {
			Thread.sleep(10000);
			checkpoint.await();
			System.out.println(Thread.currentThread().getName()+"reach lonavala");
			checkpoint.await();
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"reach vashi");
			checkpoint.await();
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"finally mumbai");
			checkpoint.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}