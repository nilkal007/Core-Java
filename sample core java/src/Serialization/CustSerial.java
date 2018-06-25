package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustSerial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(++i);
		}
		/*b b1=new b("nilesh", "123");
		System.out.println(b1);
		FileOutputStream fos=new FileOutputStream("cs.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(b1);
		
		FileInputStream fis=new FileInputStream("cs.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		b b2 =(b)ois.readObject();
		System.out.println(b2);*/
				

}

}
class A implements Serializable {
	String un;

	public A(String un) {
		super();
		this.un = un;
	}
	

}
class b extends A {
	
	 transient String pw;

	public b(String un, String pw) {
		super(un);
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "B [pw=" + pw + ", un=" + un + "]";
	}
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		String pwd="o1o".concat(pw);
		oos.writeObject(pwd);
		System.out.println("Encrypted while se--"+pwd);
	}
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		String dummy=(String)ois.readObject();
		pw =dummy.substring(3);
		//System.out.println();
		
	}
}

