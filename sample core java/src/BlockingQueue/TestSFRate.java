package BlockingQueue;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestSFRate {

	public static void main(String[] args) {
		ScheduledThreadPoolExecutor stfe=new ScheduledThreadPoolExecutor(4);
		//ThreadPoolExecutor tpe=new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue)
		Thread thread1= new Thread(new AAa());
		
		long initialDelay=5;
		long period=5;
		TimeUnit unit=TimeUnit.SECONDS;
		//stfe.scheduleAtFixedRate(thread1, initialDelay, period, unit);
		
		stfe.scheduleWithFixedDelay(thread1, initialDelay, period, unit);
		
		
	}

}
class AAa implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" A");		

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class BBb implements Runnable{

	@Override
	public void run() {
System.out.println(Thread.currentThread().getName()+" b");		
	}
	
}