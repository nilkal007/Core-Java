package BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class TestDealyQueue {

	public static void main(String[] args) {
		BlockingQueue<Integer> integers=(BlockingQueue<Integer>) new DealyQueue();

	}

}
class P2 extends Thread{
	@Override
	public void run() {
		
		
	}
}
class C2 extends Thread{
	@Override
	public void run() {
		
	}
} 