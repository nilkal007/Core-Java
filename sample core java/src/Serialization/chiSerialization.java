package Serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class chiSerialization {
	public static void main(String[] args) throws IOException {
		child2 c2=new child2(10,20);
		FileOutputStream fis =new FileOutputStream("chiser.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		oos.writeObject(c2);
		System.out.println(c2);
		//System.out.println(c2);
	}
}
