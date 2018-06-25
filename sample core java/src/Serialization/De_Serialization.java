package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class De_Serialization {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis= new FileInputStream("test.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			company c2= (company)ois.readObject();
			System.out.println(c2.address);
			System.out.println(c2.headcount);
		} catch ( ClassNotFoundException |  IOException e) {
			e.printStackTrace();
		}
	}

}
/*
 * 	De-Serialization
 * 
 * 			all class object write in the try-catch block 
 * 		FileInputStream use to get file if file is not found it return FileNotFoundException
 * 		ObjectInputStream reflation create object to retrieve data from file
 * 		ObjectInputStream.readObject()file read file and return the object to 
 * 		
*/
 