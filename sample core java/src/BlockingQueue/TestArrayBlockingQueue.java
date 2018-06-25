package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

import DesignPatterns.Singleton.threadsafe;

public class TestArrayBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			BlockingQueue<Integer> abq=new ArrayBlockingQueue<Integer>(1);
			P p=new P(abq);
			C c=new C(abq);
			new Thread(p).start();
			new Thread(c).start();
			
			/*abq.put(1);
			abq.put(2);
			//abq.put(3);
			int i=abq.take();
			int j=abq.take();
			//int k=abq.take();
			
			System.out.println(i);
			System.out.println(j);
			//System.out.println(k);
*/			
	}

}
class P implements Runnable{
BlockingQueue<Integer> abp=null;
	
	public P(BlockingQueue<Integer> abp) {
	super();
	this.abp = abp;
}

	@Override
	public void run() {
		while (true) {
			int i=ThreadLocalRandom.current().nextInt(1,100);
			try {
				abp.put(i);
			
				System.out.println("Produscr "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class C implements Runnable{
	BlockingQueue<Integer> abp=null;
	
	public C(BlockingQueue<Integer> abp) {
		super();
		this.abp = abp;
	}

	@Override
	public void run() {
		while (true) {
			try {
				
				int i=(int)abp.take();
				System.out.println("Consumer "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}