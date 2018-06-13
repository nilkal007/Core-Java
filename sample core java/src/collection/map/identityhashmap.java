package collection.map;

import java.util.IdentityHashMap;
/*	IdentityHashMap
 * 	
 **/
public class identityhashmap {

	public static void main(String[] args) {
		IdentityHashMap<Integer, String> ihm=new IdentityHashMap<>();
		ihm.put(150, "nil1");
		ihm.put(150, "nil2");
		ihm.put(150, "nil3");
		System.out.println(ihm);
	}
}
