package Thread;


public class waitnotift {

	public static void main(String[] args) {
		wn wn1=new wn();
		Thread t1=new Thread(wn1);
		t1.start();
	}

}
class wn extends Thread{
	@Override
	public void run() {
		System.out.println("run");
		try {
			wait(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.run();
	}
}