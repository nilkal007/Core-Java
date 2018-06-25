package Thread;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class textkillperchi {
	public static void main(String[] args) throws InterruptedException {
		ArrayList<Integer> aList=new ArrayList<>(10);
		P p=new P(aList, 10);
		C c=new C(aList, 10);
		p.start();
		c.start();
		p.join();
		System.out.println("main");
	}
}
class P extends Thread{
	ArrayList<Integer> al=null;
	int Max_Size;
	boolean flag=true;
	public P(ArrayList<Integer> al, int max_Size) {
		super();
		this.al = al;
		Max_Size = max_Size;
	}
	public void killThread(){
		flag=false;
		System.out.println("Killing --"+  Thread.currentThread().getName());
	}
	@Override
	public void run() {
		while (flag) {
			synchronized(al) {
				if (al.size()==Max_Size) {
					try {
						al.wait();al.notify();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					int random=ThreadLocalRandom.current().nextInt(1,100);
					System.out.println("add "+random);
					al.add(random);
					al.notify();
					if (random==10) {
						killThread();
					} else {

					}
				}
			}
		}
		
	}
}
class C extends Thread{
	ArrayList<Integer> al=null;
	int Max_Size;
	boolean flag=true;
	public C(ArrayList<Integer> al, int max_Size) {
		super();
		this.al = al;
		Max_Size = max_Size;
	}
	public void KillThread() {
	flag=false;
	System.out.println("consumer kill  "+Thread.currentThread().getName());
		
	}
	@Override
	public void run() {
		while (flag) {
			synchronized (al) {
				if (al.isEmpty()) {
				try {
					
					al.wait();
					al.notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				int a= al.remove(0);
				System.out.println("remove "+a);
				al.notify();
				if (a==15) {
					KillThread();
				} else {

				}
			}
		}
			}
			
		
	}
} 