package cursor;

import java.util.Comparator;

import java.util.TreeSet;

import resource.mobile;

public class comparetoinsingleline {
	public static void main(String[] args) {
		mobile m1=new mobile(1, "nilesh", 40000);
		mobile m2=new mobile(3, "nilesh", 74000);
		mobile m3=new mobile(4, "nilesh", 460000);
		mobile m4=new mobile(2, "nilesh", 400000);
		mobile m5=new mobile(0, "nilesh", 440000);
		Comparator<mobile> com=new Comparator<mobile>() {

			@Override
			public int compare(mobile o1, mobile o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getMobnm().compareTo(o2.getMobnm())==0?(o1.getPricce()-o2.getPricce()):(o1.getMobnm().compareTo(o2.getMobnm())));
			}
			
		};
		TreeSet<mobile> t1 = new TreeSet<>(com);
		t1.add(m1);
		t1.add(m5);
		t1.add(m4);
		t1.add(m3);
		t1.add(m2);
		System.out.println(t1);
	}
}
