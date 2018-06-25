package BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;


public class DealyQueue {

	public static void main(String[] args) {
		BlockingQueue<emp> bq = new DelayQueue();
		P1 p1=new P1(bq, "producer");
		C1 c1=new C1(bq, "Consumer");
		p1.start();
		c1.start();
		System.out.println(Thread.currentThread().getName()+"----Compleate");
		
	}
	
}
class P1 extends Thread{
	BlockingQueue<emp> bq=null;
	
	public P1(BlockingQueue<emp> bq,String tnm) {
		super(tnm);
		this.bq = bq;
	}

	@Override
	public void run() {
		
		emp e1=new emp("hello", 5000);
		try {
			bq.put(e1);
			System.out.println(" produce "+ e1 +Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
class C1 extends Thread{
	BlockingQueue<emp> bq=null;
	

	public C1(BlockingQueue<emp> bq,String tnm) {
		super(tnm);
		this.bq = bq;
	}


	@Override
	public void run() {
		
			try {
				System.out.println(bq);
				emp e1=bq.take();
				System.out.println(bq);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Consume--"+e1+"---"+Thread.currentThread().getName());
				System.out.println(bq);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
	
}
class emp implements Delayed{
	private String data;
	private long start_time;
	public emp(String data, long delay) {
		super();
		this.data = data;
		this.start_time = System.currentTimeMillis() + delay;
		
	}
	@Override
	public int compareTo(Delayed o) {
		if(this.start_time <((emp) o).start_time) {
			return -1;
		}
		if (this.start_time>((emp) o).start_time) {
			return 1;
		}
		return 0;
	}
	@Override
	public long getDelay(TimeUnit unit) {

		long diff=start_time-System.currentTimeMillis();
		
		return unit.convert(diff, TimeUnit.MILLISECONDS);
	}
	@Override
	public String toString() {
		return "emp [data=" + data + ", start_time=" + start_time + "]";
	}
	
	
}
