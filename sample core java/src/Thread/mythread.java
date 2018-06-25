package Thread;

import java.util.concurrent.Callable;

public class mythread {
	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();
		t1.run();
		t1.start();
		System.out.println(t1.getName());
		t1.setName("nil");
		System.out.println(t1.getName());
		
		runnable1 r1 = new runnable1();
		//Thread t2=new Thread(r1);
		Thread t2=new Thread(new runnable1());
		t2.start();
		Object o=new Object();
		System.out.println(o.getClass());
		callable1 c1=new callable1();
		try {
			Object object=c1.call();
			System.out.println(object);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Thread1  extends Thread{
	
	@Override
	public void run() {
		
		
		
		System.out.println(" run");
	}
}

class runnable1 implements Runnable{

	@Override
	public void run() {
		System.out.println(" run");
		
	}
	
	
}

class callable1 implements Callable{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		String s1="nilesh";
		return s1;
	}}
/**
 * 		-Extending Thread
 * 			optional run method- thread is the class hence not required 
 * 		-Implement Runnable 
 * 			Mandatory to take run method
 * 		-implement Callable with datatype return value
 * 			Mandatory to take call() method with throws Exception
 * 			have return type object/datatype 
 * 
 * 		start() method
 * 			-Create thread
 * 			-Add that thread OS(Operating System)  Scheduler
 * 			-Assign Task to Thread
 * 		Deadlock not will be Solve
 * 		Deadlock is Prevent
 * 		
 * 			Difference Between sleep and wait
 * 		
 * 					sleep			wait
 * queue		sleeping 			waiting
 * 	method		Thread Class		Object Class
 * 					static 			instance
 * Exception	checked	 			Predefine	
 *  			t1.sleep()			wait();
 *  				|				wait(ms);
 *  				|				wait(ms,ns);
 *before		hold Resource		releaseResource
 *call  	call from anywhere in	Synchronize block method
 *				class				Static method
 *									instance method	
 *weak	 	after time complete		notify()-weak Random one in
 *									notifyAll()-weak All
 *									Time Complete
 *
 *								
 *
 */