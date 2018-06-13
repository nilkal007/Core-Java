package collection.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

import resource.emp;
import resource.mobile;
public class treeset {

	public static void main(String[] args) {
		/*
		 * 		TreeSet
		 *
		 * 		-- Treeset allows only those objects which we can compare 
		 * 		--self-balancing binary search tree
		 * 		--red-black tree
		 * 		not Synchronous 
		 * 		null throw NullPointerException
		 * 		user define class is there then we used comparator for sorting 
		 * 			or give runtime error   java.lang.ClassCastException:
		 * */
		// TODO Auto-generated method stub
		TreeSet<Integer> tSet =new TreeSet<>();
		tSet.add(4);
		tSet.add(5);
		tSet.add(6);
		tSet.add(1);
		tSet.add(2);
		tSet.add(3);
		System.out.println(tSet);
		//tSet.add(null);
		//tSet.add(null);
		Comparator<emp> com =new Comparator<emp>(
				) {

					@Override
					public int compare(emp o1, emp o2) {
						// TODO Auto-generated method stub
						return o1.getEmpid()-o2.getEmpid();
					}
		}; 
		TreeSet<emp> tSet1 =new TreeSet<emp>(com);
		emp e1=new emp(1, "nil", 5000);
		emp e2=new emp(2, "nil", 5000);
		emp e3=new emp(3, "nil", 5000);
		emp e4=new emp(4, "nil", 5000);
		tSet1.add(e4);
		
		tSet1.add(e1);
		tSet1.add(e2);
		tSet1.add(e3);
			System.out.println(tSet1);
	}

}
