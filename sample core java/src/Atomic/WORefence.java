package Atomic;

import java.util.concurrent.atomic.AtomicStampedReference;

public class WORefence {

	public static void main(String[] args) throws InterruptedException {
	    

		//Integer s=10;
		int stampVal=1;
		 AtomicStampedReference<Integer> s  = new AtomicStampedReference<Integer>(20, stampVal);
		ar a1=new ar(s, stampVal);
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a1);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(a1.s.getReference());
	}

}
class ar implements Runnable{
	AtomicStampedReference<Integer> s=null;
	int stampVal;
	

	
		
		 public ar(AtomicStampedReference<Integer> s, int stampVal) {
		super();
		this.s = s;
		this.stampVal = stampVal;
	}




		@Override
		public String toString() {
			return "ar [s=" + s + ", stampVal=" + stampVal + "]";
		}




		public void run() {
             for(int i=1 ; i<=3 ; i++) {
            	 System.out.println("stamp value for second thread:"+stampVal);
                 s.compareAndSet(s.getReference(), s.getReference()+10, stampVal, ++stampVal);
                 System.out.println("Atomic Check by second thread : "+Thread.currentThread().getName()+" is "+s.getReference());
             
            	 
//                  s=s+10;
//            	 s.set(newReference, newStamp);
//                 System.out.println("Atomic Check by first thread: "+Thread.currentThread().getName()+" is "+s);
             }
        }
}