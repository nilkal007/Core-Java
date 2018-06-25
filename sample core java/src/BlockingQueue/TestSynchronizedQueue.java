package BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

import DesignPatterns.Singleton.threadsafe;

public class TestSynchronizedQueue {

	public static void main(String[] args) {
		BlockingQueue<Integer> bqi=new SynchronousQueue<>();
		
		Shardclass sc=new Shardclass();
		ExecutorService executor=Executors.newFixedThreadPool(2);
		executor.execute(new P5(bqi));
		executor.execute(new C5(bqi));
		executor.shutdown();
	}

}
class P5 implements Runnable{
	BlockingQueue<Integer> buff;
	
	
public P5(BlockingQueue<Integer> buff) {
		super();
		this.buff = buff;
	}


//	public P5(Shardclass buff) {
//		super();
//		this.buff = buff;
//	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {	
			System.out.println("putting"+i);
			try {
				buff.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
}
class C5 implements Runnable{
	BlockingQueue<Integer> buff;
	
	
	public C5(BlockingQueue<Integer> buff) {
			super();
			this.buff = buff;
		}
	/*Shardclass buff;

	public C5(Shardclass buff) {
	super();
	this.buff = buff;
}*/

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			//buff.get();
			try {
				System.out.println(buff.take());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Shardclass{
	int i;
	BlockingQueue<Integer> bqi=new SynchronousQueue<>();
	public void get() {
		try {
			
			System.out.println("consumer read" +bqi.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void put(int i) {
		this.i=i;
		try {
			
			bqi.put(i); 
			 System.out.println("in queue" +i);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}