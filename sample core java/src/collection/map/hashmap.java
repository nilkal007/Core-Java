package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import resource.emp;
import resource.mobile;
import dummyrsrc.empmob;
/*
 * HashMap
 * 		-Data Structure	-Size	-Load factor	-Iterator		-Synchronous 
 * 		--HashTable 	-16		-075			--not direct	--no--Collections.SynchronousMap(Object hmap);
 * 													-EntrySet()
 * 													-KeySet()
 * 													-values()
 * key -null-single allowed 2nd null value replace value of first null value
 * value-null-allowed
 * 		
 * */
public class hashmap {
	
	public static void main(String[] args) {


		HashMap<emp, mobile> hMap =new HashMap<>();
		empmob empmob1=new empmob();
		hMap.put(null,null);
		System.out.println(hMap.put(null,empmob1.m1));
		hMap.put(empmob1.e1,empmob1.m1);
		hMap.put(empmob1.e2,empmob1.m2);
		hMap.put(empmob1.e3,empmob1.m3);
		hMap.put(empmob1.e4,empmob1.m4);
		hMap.put(empmob1.e5,empmob1.m5);
		System.out.println(hMap.put(null,null));
		hMap.put(empmob1.e1,null);
		Set<Entry<emp, mobile>> set = hMap.entrySet();
		Iterator<Entry<emp, mobile>> mobemp=set.iterator();
		while (mobemp.hasNext()) {
			Entry<emp, mobile>  entry=mobemp.next();
			System.out.println(entry.getKey()+"............."+entry.getValue());
		}
	}
}
