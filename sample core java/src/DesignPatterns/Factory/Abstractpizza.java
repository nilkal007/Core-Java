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
	@Override
	public String toString() {
		return "pizza [name()=" + name() + ", dough()=" + dough() + ", sauce()=" + sauce() + "]";
	}
	
}
class CheesePizza extends pizza{

	String name;
	String dough;
	String sauce;
	
	public CheesePizza(String name, String dough, String sauce) {
		super();
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
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
	
}
class PeapperoniPizza extends pizza{

	String name;
	String dough;
	String sauce;
	
	public PeapperoniPizza(String name, String dough, String sauce) {
		super();
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
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


	
}
class veggiePizza extends pizza{

	String name;
	String dough;
	String sauce;
	
	public veggiePizza(String name, String dough, String sauce) {
		super();
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String dough() {
		// TODO Auto-generated method stub
		return this.dough ;
	}

	@Override
	public String sauce() {
		// TODO Auto-generated method stub
		return this.sauce;
	}
}
	interface AbstractPizzaFactory{
		
		pizza getpizza();
	}
class CheesePizzafactory implements AbstractPizzaFactory{

	@Override
	public pizza getpizza() {
		// TODO Auto-generated method stub
		return new CheesePizza("Cheese Pizza","Regular Crust" , "Marinara Pizza Sauce");
	}
	
}	
class PeapperoniPizzafactory implements AbstractPizzaFactory{

	@Override
	public pizza getpizza() {
		// TODO Auto-generated method stub
		return new PeapperoniPizza("Clam Pizza", "Thin crust", "White garlic sauce");
	}
	
}
class veggiePizzafactory implements AbstractPizzaFactory{

	@Override
	public pizza getpizza() {
		// TODO Auto-generated method stub
		return new veggiePizza("Veggie Pizza", "Crust", "Marinara sauce");
	}
	
}
class pizzafactory{
	public static pizza getPizza(AbstractPizzaFactory apf) {
		return apf.getpizza();
		
	}
}