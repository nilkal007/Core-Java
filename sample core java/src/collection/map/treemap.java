package collection.map;

import java.util.Comparator;
import java.util.TreeMap;

import resource.emp;
/*
 * 		TreeMap
 * 		--no default size use red-black tree (balance tree)
 * 			--null-key not allowed 
 * 			--null-value allowed-multiple
 * 		--give always Ascending order based on key
 * 		--if class is user define the we need the comparator for Ascending order representation of entry's on which literal/variable
 * */
public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> th =new TreeMap<>();
		//th.put(null, "nil1");
		th.put(1, null);
		th.put(5, "nil5");
		th.put(4, "nil4");
		th.put(6, "nil6");
		th.put(2, "nil2");
		System.out.println(th.put(2, "nil9"));
		System.out.println(th.size());
		System.out.println(th);
		System.out.println(th);
		Comparator<emp> com =new Comparator<emp>() {

			@Override
			public int compare(emp o1, emp o2) {
				// TODO Auto-generated method stub
				return o1.getEmpid()-o2.getEmpid();
			}
		};
		TreeMap<emp, String> th1 =new TreeMap<>(com);
		emp e1=new  emp(1, "nilesh", 50000);
		emp e2=new  emp(2, "prasad", 60000);
		emp e3=new  emp(3, "akash", 70000);
		emp e4=new  emp(4, "tushar", 80000);
		System.out.println(th1.put(e4, "emp4"));
		System.out.println(th1.put(e3, "emp3"));
		System.out.println(th1.put(e2, "emp2"));
		System.out.println(th1.put(e1, "emp1"));
		System.out.println(th1.put(e1, "emp5"));
		System.out.println(th1);
			}

}
