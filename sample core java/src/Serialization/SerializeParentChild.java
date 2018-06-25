package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeParentChild {

	public static void main(String[] args) throws IOException {
		child c=new child();
		FileOutputStream fos=new FileOutputStream("ParChi.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		System.out.println(c.a);

		System.out.println(c.b);
	}

}
