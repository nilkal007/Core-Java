package DesignPatterns.Factory;

public class TestFactory {

	public static void main(String[] args) {
		computer Pc=ComputerFactory.getComputer("Pc", "8gb", "1tb", "i5");
		computer Server = ComputerFactory.getComputer("Server", "16gb", "tb", "i7");
		System.out.println(Pc);
		System.out.println(Server);
	}

}
/*
 * Factory Method Pattern
 * 	-subclasses are responsible to create the instance of the class.
 * 	
 * 		Advantage
 * 		-Factory Method Pattern allows the sub-classes to choose the type of objects to create.
 * 		
 * 		Usage of Factory Design Pattern
 * 		-When a class doesn't know what sub-classes will be required to create
 * 		-When a class wants that its sub-classes specify the objects to be created.
 * 		-When the parent classes choose the creation of objects to its sub-classes.
 * 
 */
 