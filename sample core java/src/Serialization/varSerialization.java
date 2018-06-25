package Serialization;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class varSerialization {
	public static void main(String[] args) throws IOException {
		TranVar tv= new TranVar(10,"parameter constructor");
		FileOutputStream fis=new FileOutputStream("varSer.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		oos.writeObject(tv);
		System.out.println(tv.i);
		System.out.println(tv.age);
		System.out.println(tv.j);
		System.out.println(tv.k);
		
		
	}
}
class TranVar implements Serializable{
	transient final int i;
	 transient String age="nil";
	 transient static int j=20;
	 transient final int k=30;
	public TranVar(int i, String age) {
		super();
		this.i = i;
		this.age = age;
	}
	//public TranVar() {}
	
}
/*		Transient Keyword not write in main
 * 		final variable must initialization or take black constructor.
 * */
 