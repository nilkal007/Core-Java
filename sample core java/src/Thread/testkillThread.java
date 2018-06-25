package Thread;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class testkillThread {

	public static void main(String[] args) throws InterruptedException {
		KillThreadDemo t1 = new KillThreadDemo("t1");
							//KillThreadDemo t2= new KillThreadDemo("t2");
							t1.start();
							//t2.start();
							//t1.join();
							
							System.out.println("Completed Thread name  -- "+Thread.currentThread().getName());
	}
}

class KillThreadDemo extends Thread{ 
			volatile boolean flag=true;
			volatile int count =0;
			public void killThread(){
				flag=false;
				System.out.println("Killing --"+  Thread.currentThread().getName());
			}
			public KillThreadDemo(String name) {
				super(name);
			}
			public void run(){
					while(flag ){
						System.out.println("Count value -- "+count);
						try {
							TimeUnit.SECONDS.sleep(1);
							count++;
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						if(Thread.currentThread().getName().equals("t1")){
							
							if(count>=10){
								killThread();
								
							}
						}
						
						
						
						
						System.out.println(Thread.currentThread().getName() +" -- Running --"+ThreadLocalRandom.current().nextInt());
					}
					System.out.println("Terminating the thread" +Thread.currentThread().getName());
			}
		}
		
		
		
		
		
		
		
/*class killthread extends Thread{
	
	volatile boolean flag=true;
	volatile int count=0;
	
	public void kill() {
		flag =true;
		System.out.println("thread is kill"Thread.currentThread().getName());
	}
	public  killthread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void run() {
		while (flag) {
			System.out.println("count.."count);
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (Thread.currentThread().getName().equals("p2"));
			if(count>=10)
				kill();
		super.run();
	}
}*/