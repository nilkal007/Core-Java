package Atomic;

import java.util.concurrent.atomic.AtomicStampedReference;

public class StampReffrence {
	


	/*static int stampVal = 1;
    static AtomicStampedReference<Integer> s  = new AtomicStampedReference<Integer>(20, stampVal);
  
    public static void main(String[] args) throws InterruptedException {
       
    	Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=1 ; i<=3 ; i++) {
                    System.out.println("stamp value for first thread:"+stampVal);
                    s.compareAndSet(s.getReference(),s.getReference()+10, stampVal, ++stampVal);
                    System.out.println("Atomic Check by first thread: "+Thread.currentThread().getName()+" is "+s.getReference());
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1 ; i<=3 ; i++){
                    System.out.println("stamp value for second thread:"+stampVal);
                    s.compareAndSet(s.getReference(), s.getReference()+10, stampVal, ++stampVal);
                    System.out.println("Atomic Check by second thread : "+Thread.currentThread().getName()+" is "+s.getReference());
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final value: "+s.getReference());
    }
}
*/
public static void main(String[] args) throws InterruptedException {
    

	Integer s=10;
	//int stampVal=1;
	
	ar1 a1=new ar1(s);
	Thread t1=new Thread(a1);
	Thread t2=new Thread(a1);
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println(a1.s);
}

}
class ar1 implements Runnable{
Integer s=null;
//int stampVal;



	
	 public ar1(Integer s) {
	super();
	this.s = s;
	//this.stampVal = stampVal;
}




	@Override
	public String toString() {
		return "ar [s=" + s +  "]";
	}




	public void run() {
         for(int i=1 ; i<=3 ; i++) {
        	         	 
              s=s+10;
        	 
             System.out.println("Atomic Check by first thread: "+Thread.currentThread().getName()+" is "+s);
         }
    }
}