package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class chiDe_Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("chiser.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		child2 c1=(child2) ois.readObject();
		System.out.println(c1.a);
		System.out.println(c1.b);
	}
}
