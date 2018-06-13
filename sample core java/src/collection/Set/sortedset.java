package collection.Set;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;


import resource.mobile;
public class sortedset {
	public static void main(String[] args) {
		mobile m1 =new mobile(1, "nokia", 5000);
		mobile m2 =new mobile(2, "vivo", 10000);
		mobile m3 =new mobile(3, "lg", 15000);
		mobile m4 =new mobile(4, "sam", 20000);
		mobile m5 =new mobile(5, "iphone", 25000);
		mobile m6 =new mobile(6, "oppo", 20000);
		mobile m7 =new mobile(7, "sony", 20000);
		SortedSet <mobile> ss = new TreeSet<mobile>(new Comparator<mobile>() {

			
			@Override
			public int compare(mobile o1, mobile o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getPricce()-o2.getPricce());
			}
		
		});
		NavigableSet<mobile> nSet =new TreeSet<>();
	TreeSet<mobile> ts=new TreeSet<>();
	System.out.println(ss.add(m7));
		System.out.println(ss.add(m6));
		System.out.println(ss.add(m5));
		System.out.println(ss.add(m4));
		System.out.println(ss.add(m3));
		System.out.println(ss.add(m2));
		System.out.println(ss.add(m1));
		System.out.println(ss.add(m1));
		System.out.println(ss);
		System.out.println(ss.first());
		//Comparator comparator = ss.comparator();

		
		
		/*Comparator<mobile> com1=new Comparator<mobile>() {

			@Override
			public int compare(mobile o1, mobile o2) {
				// TODO Auto-generated method stub
				return o1.getMobid()-o2.getMobid();
			}
		};*/
		//Collections.sort(ss, com1);
		
		
	}
}
