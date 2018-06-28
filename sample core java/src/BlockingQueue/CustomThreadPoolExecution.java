package BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPoolExecution {

	public static void main(String[] args) {
		
		
		int corePoolSize=2;
		int maximumPoolSize=10;
		long keepAliveTime=5;
		TimeUnit unit= TimeUnit.SECONDS;
		BlockingQueue<Runnable> workQueue=new SynchronousQueue<Runnable>();
		ThreadPoolExecutor tpe=new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
tpe.execute(new a());
tpe.execute(new a());
tpe.execute(new a());
tpe.execute(new a());
System.out.println(tpe.toString());
	}

}
class a implements Runnable{

	@Override
	public void run() {
System.out.println(Thread.currentThread().getName()+"");		
	
	}
	
}