package BlockingQueue;

import java.sql.Time;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import DesignPatterns.Singleton.threadsafe;


public class TestBlokingQueue {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> bk=new ArrayBlockingQueue<>(2);
		Producer p=new Producer(bk);
		Consumer c=new Consumer(bk);
		new Thread(p).start();
		Thread.sleep(5000);
		new Thread(c).start();
	}
}
class Producer implements Runnable{

	BlockingQueue<Integer> bk=null;
	//Boolean flag=true;
	public Producer(BlockingQueue<Integer> bk) {
		super();
		this.bk = bk;
	}

	@Override
	public void run() {
		
			
			/*return throws Exception
			 * bk.add(1);
			bk.add(2);
			bk.add(3);
			System.out.println(bk.toString());	
		*/
		/*return true false error null value
		 * 
		 * System.out.println(bk.offer(1));
		System.out.println(bk.offer(2));
		System.out.println(bk.offer(3));
		System.out.println(bk.toString());	*/
		/*wait until consumer remove it
		try {
			bk.put(1);
			System.out.println("producer"+bk.toString());
			bk.put(2);
			System.out.println("producer"+bk.toString());
			bk.put(3);
			System.out.println("producer"+bk.toString());

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			System.out.println(bk.offer(1, 1, TimeUnit.SECONDS));
			System.out.println(bk.offer(2,2,TimeUnit.SECONDS));
			System.out.println(bk.offer(3,5,TimeUnit.SECONDS));
			System.out.println(bk.toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
class Consumer implements Runnable{
BlockingQueue<Integer> bk=null;
//	boolean flag =true;
@Override
	public void run() {
	bk.remove();
			/*	throw Exception
			 * bk.remove();
			bk.remove();
			bk.remove();*/
	/*return true false error null value
	 * 
	 * System.out.println(bk.poll());
	System.out.println(bk.poll());
	System.out.println(bk.poll());
	System.out.println(bk.toString());	*/
	/*wait until consumer remove it
	 * try {
		Thread.sleep(5000);
		System.out.println(bk.take());
		System.out.println("consumer"+bk.toString());
		System.out.println(bk.take());
		System.out.println("consumer"+bk.toString());
		//System.out.println(bk.take());
		System.out.println("consumer"+bk.toString());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	try {
		System.out.println(bk.poll(2, TimeUnit.SECONDS));
		System.out.println(bk.poll(5,TimeUnit.SECONDS));
		System.out.println(bk.poll(5,TimeUnit.SECONDS));
		System.out.println(bk.toString());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	public Consumer(BlockingQueue<Integer> bk) {
		super();
		this.bk = bk;
	}
	
}