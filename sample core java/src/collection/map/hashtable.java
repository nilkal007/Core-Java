package collection.map;

import java.util.Hashtable;
import resource.emp;
import resource.mobile;
import dummyrsrc.empmob;

/*
 *	 hash table
 *		--Data structure 	--size		--load factor	--Iterator
 *			-Hashtable     		-11			-0.75			-Enumeration (legacy classes)
 *
 *		--null not allowed As value or key
 *
 *		--Duplicate value- allowed
 *
 *		--duplicate key -allowed but value replaced with old value to new value.
 *
 * 		--Synchronous - yes
 * 			--thread safe
 * 			--Multi-threading env good
 *	 
 *	
 * */
public class hashtable {
	
	public static void main(String[] args) {
		Hashtable<emp, mobile> htable= new Hashtable<>();
		
		empmob empmob1=new empmob();
		//System.out.println(htable.put(null,empmob1.m1));
		htable.put(empmob1.e1,empmob1.m1);
		htable.put(empmob1.e2,empmob1.m2);
		htable.put(empmob1.e3,empmob1.m3);
		htable.put(empmob1.e4,empmob1.m4);
		System.out.println(htable.put(empmob1.e1,empmob1.m5));
		//htable.put(empmob1.e5,null );
		System.out.println(htable);
	}
}
