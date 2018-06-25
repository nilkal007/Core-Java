package BlockingQueue;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;





public class TestPriorityBlokingQueue {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<stu> bqi=new PriorityBlockingQueue<>();
	/*	bqi.put(10);
		bqi.put(3);
		bqi.put(5);
		bqi.put(4);
		bqi.put(1);*/
		
		p4 p=new p4(bqi);
		p.start();
		p.join();
		System.out.println(bqi);
		c4 c=new c4(bqi);
		c.start();
		/*System.out.println(bqi.take());
		System.out.println(bqi.take());
		System.out.println(bqi.take());
		System.out.println(bqi.take());
		System.out.println(bqi.take());*/
		System.out.println(bqi);
		
		
	}

}
class p4 extends Thread{
	

	BlockingQueue<stu> bqi=null;
	public p4(BlockingQueue<stu> bqi) {
		super();
		this.bqi = bqi;
	}
	@Override
	public void run() {
		
		//while(true)
		{
			for (int i = 10; i > 0; i--) {
				try {
					stu s1= new stu("nilesh"+i, i);
					bqi.put(s1);
					System.out.println(bqi);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	
}
}
class c4 extends Thread{
	BlockingQueue<stu> bqi=null;
	public c4(BlockingQueue<stu> bqi) {
		super();
		this.bqi = bqi;
	}
	@Override
	public void run() {
	//	while(true)
		{
			for (int j = 0; j < 10; j++) {
				try {
					stu i=bqi.take();
					System.out.println("consumer"+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			}
		}
	}
 class stu implements Comparable<stu>{
	 String nm;
	 Integer id;
	 
	public stu(String nm, int id) {
		super();
		this.nm = nm;
		this.id = id;
	}

	@Override
	public int compareTo(stu o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

	@Override
	public String toString() {
		return "stu [nm=" + nm + ", id=" + id + "]";
	}



	
	
	

	
	
	 
	 
 }