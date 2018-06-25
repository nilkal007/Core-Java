package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_SerializeParentChild {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("ParChi.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		child pc=(child)ois.readObject();
		System.out.println(pc.a);
		System.out.println(pc.b);
		System.out.println(pc);
	}
}
