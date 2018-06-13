package collection.Set;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import resource.mobile;

/*
 * 	16 - 0.75f
 * data structure
 * 		--TreeSet +
 * 	 	--LinkedList
 * 	not duplicate allowed
 *	 sequence is  preserve
 * 	null
 * 		--1.6
 * 			--null allowed only first element After that not Allowed Anything.
 * 		--1.7
 * 			--null not allowed
 * 	
 * not Synchronized
 * 		--collections.syncronizedset(set);
 * head key value hash next after --> before key value hash next tail
 * */
public class linkedhashset {

	public static void main(String[] args) {
		mobile m1 =new mobile(1, "nokia", 200);
		mobile m2 =new mobile(2, "nokia", 200);
		mobile m3 =new mobile(3, "nokia", 200);
		mobile m4 =new mobile(5, "nokia", 200);
		mobile m5 =new mobile(1, "nokia", 200);
	Set<mobile> sm=new LinkedHashSet<mobile>();
	sm.add(m1);
	sm.add(m2);
	sm.add(m3);
	sm.add(m4);
	sm.add(m5);
	System.out.println(sm);
	
//	Collections.sort(sm, new Comparator<mobile>() {
//
//		@Override
//		public int compare(mobile o1, mobile o2) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	});
	}
	
}
