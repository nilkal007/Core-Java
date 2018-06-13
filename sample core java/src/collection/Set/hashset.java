package collection.Set;


import java.util.HashSet;

import resource.emp;

public class hashset {
	
	public static void main(String[] args) {
		
		HashSet<emp> hSet=new HashSet<>();
		HashSet hSet1=new HashSet();
		hSet1.add(2);
		hSet1.add("nilesh");
		hSet1.add(4);
		System.out.println(hSet1);
		emp e1=new emp(1, "nilesh", 80000);
		 emp e2=new emp(2, "prasad", 185000);
		emp e3=new emp(3, "akash", 90000);
		 emp e4=new emp(4, "abhi", 95000);
		emp e5=new emp(5, "tushar", 100000);
		hSet.add(null);
		
		System.out.println(hSet.add(e1));
		System.out.println(hSet.add(e2));
		System.out.println(hSet.add(e3));
		System.out.println(hSet.add(e4));
		System.out.println(hSet.add(e5));
		
		System.out.println(hSet.size());
		System.out.println(hSet);
		
	}
}
