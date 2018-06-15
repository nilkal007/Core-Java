//package DesignPatterns.Builder;
//
//import DesignPatterns.Builder.Persone.PersoneBuilder;
//



//	


//	
//	
//	
//}
package DesignPatterns.Builder;

import DesignPatterns.Builder.Persone.PersoneBuilder;



public class TestBuilder {

	public static void main(String[] args) {
		PersoneBuilder persone=new PersoneBuilder("wadapav", "ghorne", "track").setCoding("reguler").setEntertainment("games"); 
		Persone p=new Persone(persone);
		Persone persone2= new PersoneBuilder("pizza", "shant", "run").setCoding("java").setEntertainment("tv").build();
		System.out.println(p);
		System.out.println(persone2);
	}

}

	class Persone{
		
		@Override
		public String toString() {
			return "Persone [eating=" + eating + ", sleeping=" + sleeping + ", walking=" + walking + ", coding=" + coding
					+ ", Entertainment=" + Entertainment + "]";
		}
		public Persone(PersoneBuilder personeBuilder) {

		this.coding=personeBuilder.coding;
		this.eating=personeBuilder.eating;
		this.sleeping=personeBuilder.sleeping;
		this.walking=personeBuilder.walking;
		this.Entertainment=personeBuilder.Entertainment;
	}
	
		String eating;
		String sleeping;
		String walking;
	//	
		String coding;
		String Entertainment;
		public static class PersoneBuilder{
		//mandatory
		
		String eating;
		String sleeping;
		String walking;
		
		String coding;
		String Entertainment;
		public PersoneBuilder(String eating, String sleeping, String walking) {
			super();
			this.eating = eating;
			this.sleeping = sleeping;
			this.walking = walking;
		}
	
	public PersoneBuilder setCoding(String coding){
	this.coding=coding;
	return this;
}

public PersoneBuilder setEntertainment(String Entertainment){
	this.Entertainment=Entertainment;
	return this;
}
public Persone build() {
	return new Persone(this);
	
}
}	
	
	
	
	
	
	
	
	
	
}
