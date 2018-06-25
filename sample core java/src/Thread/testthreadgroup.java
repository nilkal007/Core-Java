package Thread;


public class testthreadgroup {

	public static void main(String[] args) {
		threadgroup runnable1=new threadgroup();
		
		ThreadGroup tg =new ThreadGroup("Thread Group");
		
		Thread t1=new Thread(tg, runnable1, "thread 1");
		t1.start();
		Thread t2=new Thread(tg, runnable1, "thread 2");
		t2.start();
		Thread t3= new Thread(tg, runnable1, "thread 3");
		t3.start();
		Thread t4=new Thread(tg, runnable1, "thread 5");
		t4.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println("group nm"+tg.getName());
		tg.list();
		
	}

}
class threadgroup implements Runnable{

	@Override
	public void run() {
System.out.println(Thread.currentThread().getName());		
	}
	
}