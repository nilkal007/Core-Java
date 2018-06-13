package cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import resource.mobile;


public class annonimus {

	public static void main(String[] args) {
		//
		
		Usingcomparable();
		System.out.println("by Comparator");
		UsingComparator();
		System.out.println("by AnnounymousImplementation");
		UsingAnnounymousImplementation();
		System.out.println("by AnnounymousImplewith domainclass");
		UsingAnnounymousImplButInsideDomain();
	}

	private static void UsingAnnounymousImplButInsideDomain() {
		List<mobile> lm=CreateArrayList();// TODO Auto-generated method stub
		System.out.println("by name-id");
		Collections.sort(lm, MobiSortingLogicUtil.bynmid);
		System.out.println(lm);
		System.out.println("by name price");
		Collections.sort(lm, MobiSortingLogicUtil.bynmprc);
		System.out.println(lm);
		System.out.println("by price name");
		Collections.sort(lm, MobiSortingLogicUtil.byprcnm);
		System.out.println(lm);
	}

	private static void UsingAnnounymousImplementation() {
		
		List<mobile> lm = CreateArrayList();
		Comparator<mobile> byid = new Comparator<mobile>() {

			@Override
			public int compare(mobile o1, mobile o2) {
				// TODO Auto-generated method stub
				return o1.getMobid()-o2.getMobid();
			}
			
		};
		Collections.sort(lm, byid);
		System.out.println(lm);
		
		Comparator<mobile> bynm=new Comparator<mobile>() {

			@Override
			public int compare(mobile o1, mobile o2) {
				// TODO Auto-generated method stub
				return o1.getMobnm().compareTo(o2.getMobnm());
			}
		};
		Collections.sort(lm,bynm);
		System.out.println(lm);
		Comparator<mobile> bypr = new Comparator<mobile>() {

			@Override
			public int compare(mobile o1, mobile o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getPricce()-o1.getPricce());
			}
		};
		Collections.sort(lm, bypr);
		System.out.println(lm);
	}

	private static void UsingComparator() {
		List<mobile> lm=CreateArrayList();// TODO Auto-generated method stub
		Collections.sort(lm, new onid());
		System.out.println(lm);
		Collections.sort(lm, new onmn());
		System.out.println(lm);
		Collections.sort(lm, new onprice());
		System.out.println(lm);
	}

	private static List<mobile> CreateArrayList() {
		
		mobile m1 = new mobile(1102,"Samsung",20000);
		mobile m2 = new mobile(122,"iPhone",80000);
		mobile m3 = new mobile(64,"MI",10000);
		mobile m4 = new mobile(354,"LG",12000);
		mobile m5 = new mobile(57,"Vivo",7000);
		mobile m6 = new mobile(69,"Nokia",25000);
		mobile m7 = new mobile(64,"Nokia",50000);
		mobile m8 = new mobile(66,"Nokia",25000);
		List<mobile> listOfmobiles = new ArrayList<mobile>();
		listOfmobiles.add(m1);
		listOfmobiles.add(m2);
		listOfmobiles.add(m3);
		listOfmobiles.add(m4);
		listOfmobiles.add(m5);
		listOfmobiles.add(m6);
		listOfmobiles.add(m7);
		listOfmobiles.add(m8);

		return listOfmobiles;
	}

	private static void Usingcomparable() {
		List<mobile> lm =CreateArrayList();
		Collections.sort(lm);
		System.out.println(lm);
	}

}
class onid implements Comparator<mobile>{

	@Override
	public int compare(mobile o1, mobile o2) {
		// TODO Auto-generated method stub
		return o1.getMobid()-o2.getMobid();
	}
	
	
}
class onmn implements Comparator<mobile>{

	@Override
	public int compare(mobile o1, mobile o2) {
		// TODO Auto-generated method stub
		return o1.getMobnm().compareTo(o2.getMobnm());
	}
	
	
}
class onprice implements Comparator<mobile>{

	@Override
	public int compare(mobile o1, mobile o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getPricce()-o2.getPricce());
	}
	
}