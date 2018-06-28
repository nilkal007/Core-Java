package BlockingQueue;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class TestExecutor {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//ExecutorService ex=Executors.newCachedThreadPool();
		//ExecutorService ex1=Executors.newCachedThreadPool();
		//ExecutorService ex=Executors.newFixedThreadPool(2);
		//ExecutorService ex=Executors.newSingleThreadExecutor();
		ExecutorService ex=Executors.newScheduledThreadPool(5);
		
	//	ExecutorService ex=Executors.newSingleThreadScheduledExecutor();
		/*
		ex.execute(new A1());
		ex.execute(new B1());
		ex.execute(new C11());
		ex.execute(new D1());
		ex.execute(new E1());
		System.out.println(ex.isTerminated());
		ex.execute(new A1());
		ex.execute(new B1());
		ex.execute(new C11());
		ex.execute(new D1());
		ex.execute(new E1());
		Future<String> s1=ex.submit(new call());
		try {
			String string=s1.get();
		System.out.println(string);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ex1.shutdown();
		//ex.awaitTermination(2, TimeUnit.SECONDS);
		ex.shutdown();
		System.out.println(ex.isTerminated());
		System.out.println(ex.isShutdown());*/
ex.shutdown();
	}
}
class A1 implements Runnable{

	@Override
	public void run() {
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println(Thread.currentThread().getName()+"	A1");
	}
	
}
class call implements Callable<String>{

	@Override
	public String call() throws Exception {
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		String aString="callable";
		return aString;
	}

	
	
	
}
class B1 implements Runnable{

	@Override
	public void run() {
		/*try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println(Thread.currentThread().getName()+"	B1");
	}
	
}
class C11 implements Runnable{

	@Override
	public void run() {
		/*try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println(Thread.currentThread().getName()+"	C1");
	}
	}
class D1 implements Runnable{

		@Override
		public void run() {
			
			/*try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println(Thread.currentThread().getName()+"	D1");
		}
}
class E1 implements Runnable{

			@Override
			public void run() {
				
				/*try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				System.out.println(Thread.currentThread().getName()+"	E1");
			}
}			