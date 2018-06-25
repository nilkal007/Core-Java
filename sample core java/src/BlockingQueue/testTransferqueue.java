package BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

import DesignPatterns.Singleton.threadsafe;

public class testTransferqueue {
	public static void main(String[] args) {
		TransferQueue<Integer> tqi=new LinkedTransferQueue<>();
		P6 p=new P6(tqi);
		C6 c= new C6(tqi);
		p.start();
		c.start();
		
	}
}
class P6 extends Thread{
	TransferQueue<Integer> tqi=null;
	public P6(TransferQueue<Integer> tqi) {
		super();
		this.tqi = tqi;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i+"is waiting ");
			
			try {
				boolean akn=tqi.tryTransfer(i,1, TimeUnit.SECONDS);
				System.out.println(akn);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*try {
				tqi.transfer(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			/*try {
				tqi.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
	
}
class C6 extends Thread{
	TransferQueue<Integer> tqi=null;
	public C6(TransferQueue<Integer> tqi) {
		super();
		this.tqi = tqi;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(10000);
				System.out.println("consume"+tqi.take());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}