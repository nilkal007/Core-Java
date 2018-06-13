package cursor;

import java.util.Comparator;

import resource.mobile;

public class MobiSortingLogicUtil {

	public static Comparator<mobile> bynmprc =new Comparator<mobile>() {

		@Override
		public int compare(mobile o1, mobile o2) {
			int temp =o1.getMobnm().compareTo(o2.getMobnm());
			if(temp==0)
					return (int) (o1.getPricce()-o1.getPricce());
			return temp;
		}
		
	};
	public static Comparator<mobile> byprcnm=new Comparator<mobile>() {

		@Override
		public int compare(mobile o1, mobile o2) {
			int temp=(int) (o1.getPricce()-o2.getPricce());// TODO Auto-generated method stub
			if (temp==0)
					return o1.getMobnm().compareTo(o2.getMobnm());
			return temp;
		}
	};
	public static Comparator<mobile> bynmid =new Comparator<mobile>() {

		@Override
		public int compare(mobile o1, mobile o2) {
		int temp =o1.getMobnm().compareTo(o2.getMobnm());	// TODO Auto-generated method stub
		if(temp==0)
			return o1.getMobid()-o2.getMobid();
		return temp;
		}
	};
}
