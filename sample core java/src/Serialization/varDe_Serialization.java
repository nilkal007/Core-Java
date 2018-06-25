package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class varDe_Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		FileInputStream fis= new FileInputStream("varSer.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		TranVar tv=(TranVar)ois.readObject();
		System.out.println(tv.i);
		System.out.println(tv.age);
		System.out.println(tv.j);
		System.out.println(tv.k);
		
	}

}
/**
 *		transient keyword frrom De-Serialization  return the the default value. int 0 String null.  	
 * final return same value not hide value		
 * class level ini static-transient-- not hide value 
 * 		class level initialization final-transient-- not hide value
 * 		final-transient with parameterize constructor return int 0
 */
 
 