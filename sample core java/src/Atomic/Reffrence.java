package Atomic;

import java.util.concurrent.atomic.AtomicReference;


public class Reffrence {
	
		
		static AtomicReference<Integer> p  = new AtomicReference<Integer>(20);
	    public static void main(String[] args) throws InterruptedException {
	        Thread t1 = new Thread(new Runnable(){
	            @Override
	            public void run() {
	                for(int i=1 ; i<=3 ; i++){
	                    p.set((p.get()+10));
	                    System.out.println("Atomic Check by thread: "+Thread.currentThread().getName()+" is "+p.get());
	                }
	            }
	        });
	        Thread t2 = new Thread(new Runnable(){
	            @Override
	            public void run() {
	                Integer per = p.get();
	                for(int i=1 ; i<=3 ; i++){
	                    System.err.println(p.get().equals(per)+"_"+per+"_"+p.get());
	                    p.compareAndSet(per,(p.get()+10));
	                    System.out.println("Atomic Check by  thread : "+Thread.currentThread().getName()+" is "+p.get());
	                }
	            }
	        });
	        t1.start();
	        t2.start();
	        t1.join();
	        t2.join();
	        System.out.println("Final value: "+p.get());
	        
	    }
	}

	
	

