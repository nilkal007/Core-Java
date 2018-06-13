import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class imcwmftp {

	public static void main(String[] args) {
//		final List<Integer> listOfNums = Arrays.asList(12,4312,4,12,4,5,6,7,23,12);
//		listOfNums.add(102);
//		System.out.println(listOfNums);
		ArrayList<Integer> listOfNums = new ArrayList<>(Arrays.asList(12,31));
		final  prc samsung=prc.getmethod(listOfNums);
		System.out.println(samsung);
		
		ArrayList<Integer> nums = samsung.getListOfNums();
		nums.add(10);
		nums.add(20);
		System.out.println(nums);
		System.out.println(samsung);
	}
}
class prc{
	final private ArrayList<Integer> listOfNums;
	public ArrayList<Integer> getListOfNums() {
		//return listOfNums;
		return new ArrayList<>(listOfNums);
	}
	private prc(ArrayList<Integer> listOfNums) {
		super();
		this.listOfNums = listOfNums;
	}
	public static prc  getmethod(ArrayList<Integer> listOfNums) {
		return new prc(listOfNums);
		
	}
	@Override
	public String toString() {
		return "prc [listOfNums=" + listOfNums + "]";
	}
	
}