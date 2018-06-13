package collection.map;

import java.util.WeakHashMap;

import resource.emp;
import resource.mobile;
/*
 * 	WeakHashMap
 * 	-- Hashtable 	-16 	-0.75 	-1.8 v show result direct.
 * 	
 * 	-- if key become weak/null Automatically delete the null key Entry from hashtable.
 * 	-- it happen by  garbage collectors.we not handle by programmatically.
 *	-- use browser cashing
 * */
public class weakhashmap {

	public static void main(String[] args) {
		WeakHashMap<Integer,String > whm= new WeakHashMap<>();
		Integer integer = 1;
		whm.put(null, "nil");
		whm.put(2, "nil");
		whm.put(3, "nil");
		whm.put(4, "nil");
		whm.put(5, "nil");
		System.out.println(whm.size());
		integer = null;
System.gc();
		System.out.println(whm.size());
		
		
	}
}
