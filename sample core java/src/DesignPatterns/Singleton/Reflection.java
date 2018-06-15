package DesignPatterns.Singleton;

import java.lang.reflect.Constructor;

public class Reflection {
	public static void main(String[] args) {
	EagerInitialization ei1= EagerInitialization.getinstance();
	EagerInitialization ei2=null;
	try {
		Constructor[] constructor1=EagerInitialization.class.getDeclaredConstructors();
		for (Constructor constructor : constructor1) {
			constructor.setAccessible(true);
			ei2=(EagerInitialization)constructor.newInstance();
			break;
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println(ei1==ei2);
	System.out.println(ei1.hashCode());
	System.out.println(ei2.hashCode());
	}
}
/*Reflection
 *			create 1st instance
 *			2nd instance set =null
 *			set Constructor[] array to classname.class.getDeclaredConstructors();
 *			take constructor Array in for-each
 *			set constructorobject.setAccessible(true);
 *			2nd instance set =(ei)constructor.newInstance();
 *			break;
 *outer loop
 *	check the comparison of two object
 * 
 * 
 * */
 