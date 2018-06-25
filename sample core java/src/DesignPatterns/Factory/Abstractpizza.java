package DesignPatterns.Factory;

public class Abstractpizza {

	public static void main(String[] args) {
		
		AbstractPizzaFactory apf=new PeapperoniPizzafactory();
		pizza p1= pizzafactory.getPizza(apf);
		System.out.println(p1);
		
	}

}
abstract class pizza{
	
	public abstract String name();
	public abstract String dough();
	public abstract  String sauce();
	public abstract  String Size();
	public abstract  float price();
	
	
	@Override
	public String toString() {
		return "pizza [name()=" + name() + ", dough()=" + dough() + ", sauce()=" + sauce() + "]";
	}
	
}
class CheesePizza extends pizza{

	String name;
	String dough;
	String sauce;
	String Size;
	 float price;
	

	public CheesePizza(String name, String dough, String sauce, String size, float price) {
		super();
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
		this.Size = size;
		this.price = price;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String dough() {
		// TODO Auto-generated method stub
		return this.dough;
	}

	@Override
	public String sauce() {
		// TODO Auto-generated method stub
		return this.sauce;
	}

	@Override
	public String Size() {
		// TODO Auto-generated method stub
		return this.Size;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return this.price();
	}
	
}
class PeapperoniPizza extends pizza{

	String name;
	String dough;
	String sauce;
	String Size;
	 float price;
	

	public PeapperoniPizza(String name, String dough, String sauce, String size, float price) {
		super();
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
		this.Size = size;
		this.price = price;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String dough() {
		// TODO Auto-generated method stub
		return this.dough;
	}

	@Override
	public String sauce() {
		// TODO Auto-generated method stub
		return this.sauce;
	}

	@Override
	public String Size() {
		// TODO Auto-generated method stub
		return this.Size;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return this.price();
	}
	
	
}
class veggiePizza extends pizza{

	String name;
	String dough;
	String sauce;
	String Size;
	 float price;
	

	public veggiePizza(String name, String dough, String sauce, String size, float price) {
		super();
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
		this.Size = size;
		this.price = price;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String dough() {
		// TODO Auto-generated method stub
		return this.dough;
	}

	@Override
	public String sauce() {
		// TODO Auto-generated method stub
		return this.sauce;
	}

	@Override
	public String Size() {
		// TODO Auto-generated method stub
		return this.Size;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return this.price();
	}
	
}
	interface AbstractPizzaFactory{
		
		pizza getpizza();
	}
class CheesePizzafactory implements AbstractPizzaFactory{

	@Override
	public pizza getpizza() {
		// TODO Auto-generated method stub
		return new CheesePizza("Cheese Pizza","Regular Crust" , "Marinara Pizza Sauce","Extra-large",500);
	}
	
}	
class PeapperoniPizzafactory implements AbstractPizzaFactory{

	@Override
	public pizza getpizza() {
		// TODO Auto-generated method stub
		return new PeapperoniPizza("Clam Pizza", "Thin crust", "White garlic sauce","large",200);
	}
	
}
class veggiePizzafactory implements AbstractPizzaFactory{

	@Override
	public pizza getpizza() {
		// TODO Auto-generated method stub
		return new veggiePizza("Veggie Pizza", "Crust", "Marinara sauce","Midium",100);
	}
	
}
class pizzafactory{
	public static pizza getPizza(AbstractPizzaFactory apf) {
		return apf.getpizza();
		
	}
}