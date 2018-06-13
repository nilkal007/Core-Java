package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		roommate rm1 = new roommate(21, "prasad", 100000);
		roommate rm2 = new roommate(22, "Nileshj", 100000);
		roommate rm3 = new roommate(23, "onkar", 100000);
		roommate rm4 = new roommate(24, "ganesh", 100000);
		roommate rm5 = new roommate(25, "Prasad", 100000);
		roommate rm6 = new roommate(21, "Amit", 100000);
		roommate rm7 =null;// new roommate(21, "prasad", 100000);
		roommate rm8 = null;//new roommate(21, "prasad", 100000);
		List<roommate> list=new ArrayList<roommate>();
		System.out.println(list.add(rm1));
		System.out.println(list.add(rm2));
		System.out.println(list.add(rm3));
		System.out.println(list.add(rm4));
		System.out.println(list.add(rm5));
		System.out.println(list.add(rm6));
		System.out.println(list.add(rm7));
		System.out.println(list.add(rm8));
		System.out.println(list);
	}

}
