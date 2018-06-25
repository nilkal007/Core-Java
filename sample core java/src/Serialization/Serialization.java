package Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Serialization {
	public static void main(String[] args) {
		company c1=new company(5000, "mumbai");
		try {
			File abc= new java.io.File("test.txt");
			FileOutputStream fos =new FileOutputStream(abc);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(c1);
			System.out.println(c1.headcount);
			System.out.println(c1.address);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class company implements Serializable{
	
	int headcount;
	String address;
	public company(int headcount, String address) {
		super();
		this.headcount = headcount;
		this.address = address;
	}
	
}
/*	the class we make object mandatory implements serialization 
 * 	create object of the user define class.
 * 	
 * 		#if we trying to get not serialize object we get the error NotSerializableException
 * 
 * 		#	with throw keyword or try catch block.with ioexception
 * 		
 * 		1.create file where object will be store.
 * 		2.create FileOutputStream	object.			
 * 		3.create ObjectOutputStream object .
 * 		4.with ObjectOutputStream object write in file.
 * 		
 * 		#	upper All classes in java.io package.
 * 
 * 
 */
 
