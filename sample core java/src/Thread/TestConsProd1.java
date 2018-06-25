package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class TestConsProd1 {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Integer> aList=new ArrayList<>();
			Producer p1=new Producer(aList, 1, "p1");
			consumer p2=new consumer(aList, 1, "p2");
			p1.start();
			p2.start();
		 
		
		 System.out.println("main");
	}

}
class Producer extends Thread {
List<Integer> list=null;
int Max_size;

public Producer(List<Integer> list, int max_size,String threadname) {
	super(threadname);
	this.list = list;
	Max_size = max_size;
}

public void run() {
	for (int i = 0; i < 2; i++)
    {
	while (true) {
		synchronized(list) {
			System.out.println("Producing elements "+Thread.currentThread().getName());
			if (list.size()==Max_size) {
				
				try {
					System.out.println("list is full now");
					System.out.println("p1 in wait");
					System.out.println("notify by p1");
					list.wait();
					
					list.notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			} else {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					int random=ThreadLocalRandom.current().nextInt(1,1000);
					list.add(random);
					System.out.println(random);
					list.notify();
					
			}
		}
		
	}
		
	}
	}
}

class consumer extends Thread {
	List<Integer> list=null;
	int Max_size;
	
	public consumer(List<Integer> list, int max_size,String threadname) {
		super(threadname);
		this.list = list;
		Max_size = max_size;
	}

	public void run() {
		while (true) {
			synchronized (list) {
				System.out.println("consumer consumong elements "+Thread.currentThread().getName());
				if (list.isEmpty()) {
					try {
						System.out.println("list is Empty");
						
						System.out.println("p2 in wait");
						System.out.println("notify by p2");
						list.wait();
						
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} else {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					int num=list.remove(0);
					System.out.println("consume elements "+num);
					list.notify();
					
				}
			}
		}
	

	}
}