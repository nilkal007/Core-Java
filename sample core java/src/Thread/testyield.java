package Thread;

public abstract class testyield {

	public static void main(String[] args) {

		A1 a1=new A1();
		B1 b1=new B1();
		C1 c1=new C1();
		c1.setPriority(10);
		a1.setPriority(10);
		
		
		a1.start();
		b1.start();
		c1.start();
		a1.yield();
		c1.yield();
		System.out.println("main");
	}

}
class A1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" class A");
	}
}
class B1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("class B");
	}
}
class C1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("class C");
	}
}