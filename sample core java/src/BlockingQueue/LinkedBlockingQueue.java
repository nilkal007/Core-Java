package BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class LinkedBlockingQueue {
	public static void main(String[] args) {
		BlockingQueue<Integer> bqi=new java.util.concurrent.LinkedBlockingQueue<>();
		P3 p3=new P3(bqi);
		C3 c3=new C3(bqi);
		p3.start();
		c3.start();
		
	}
}
class P3 extends Thread{
	BlockingQueue<Integer> bqi=null;
	
	public P3(BlockingQueue<Integer> bqi) {
		super();
		this.bqi = bqi;
	}

	@Override
	public void run() {
		while (true) {
			int random = ThreadLocalRandom.current().nextInt(1,100);
			//System.out.println(random);
			try {
				
				bqi.put(random);
				Thread.sleep(1000);
				System.out.println("Produce"+random);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class C3 extends Thread{
BlockingQueue<Integer> bqi=null;
	
	public C3(BlockingQueue<Integer> bqi) {
		super();
		this.bqi = bqi;
	}
	@Override
	public void run() {
		while (true) {
			try {
				
				
				int re=bqi.take();
				System.out.println("consume"+re);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}