package Atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;


public class AutomicInteger {

	

	public static void main(String[] args) throws InterruptedException {
		AIPT a1=new AIPT();
		Thread t1= new Thread(a1);
		Thread t2 =new Thread(a1);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Procesing Count"+a1.getCount());
//		AtomicInteger x=new AtomicInteger(10);
//		System.out.println(x.get());
//			System.out.println(x.incrementAndGet());
//		System.out.println(x.decrementAndGet());
//		System.out.println(x.compareAndSet(10, 20)+" x "+x);
//		System.out.println(x.addAndGet(30)+" x is "+x);
//		System.out.println(x.compareAndExchange(50, 10)+" x="+x);
//		System.out.println(x.doubleValue());
//		IntUnaryOperator fu;
//		//3System.out.println(x.getAndUpdate());
		
	}
}
class AIPT implements Runnable{
	AtomicInteger count=new AtomicInteger();
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			ProcessSomething(i);
			if(i==100||i==200||i==300||i==400||i==500||i==600||i==700||i==800||i==900||i==1000)
				try {
					Thread.sleep(i*10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName()+i);
			count.incrementAndGet();
		}
	}
	public Integer getCount() {
		return this.count.get();
		
	}

	private void ProcessSomething(int i) {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
}
