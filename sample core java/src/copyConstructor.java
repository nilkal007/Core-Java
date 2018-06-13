import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class copyConstructor {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Parent p =new Parent();
		p.age=10;
		p.nm="nil";
		child c1=new child();
		c1.age=20;
		c1.cdage=30;
		c1.nm="nil";
		c1.cdnm="ak";
		
		Parent clone = c1;
		Parent cloned = new child(c1);
		Parent cloned2 = new Parent(p);
		
		System.out.println(clone);
		System.out.println(cloned);
		System.out.println(cloned2);
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Parent e2 = (Parent)ois.readObject(); // Clonning an object using deserization
		ois.close();
		fis.close();
		System.out.println(e2);
	}

}
class Parent{
	int age;
	String nm;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	@Override
	public String toString() {
		return "Parent [age=" + age + ", nm=" + nm + "]";
	}
	public Parent(Parent p) {
		age=p.age;
		nm=p.nm;
	}
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
class child extends Parent{
	int cdage;
	String cdnm;
	
	public int getCdage() {
		return cdage;
	}
	public void setCdage(int cdage) {
		this.cdage = cdage;
	}
	public String getCdnm() {
		return cdnm;
	}
	public void setCdnm(String cdnm) {
		this.cdnm = cdnm;
	}
	@Override
	public String toString() {
		return "child [cdage=" + cdage + ", cdnm=" + cdnm + "]";
	}
	public child(child c) {
		c.cdage=cdage;
		c.cdnm=cdnm;
		// TODO Auto-generated constructor stub
	}

	public child() {
		super();// TODO Auto-generated constructor stub
	}

	
	
	
	
}