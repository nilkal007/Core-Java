package DesignPatterns.Factory;



public abstract class computer {

	
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getCPU();
	@Override
	public String toString() {
		return "computer [getRam()=" + getRam() + ", getHDD()=" + getHDD() + ", getCPU()=" + getCPU() + "]";
	}
	
	
	
}
 class Pc extends computer{

	 private String ram;
		private String hdd;
		private String cpu;
		public Pc(String ram, String hdd, String cpu) {
			super();
			this.ram = ram;System.out.println("pc ram class Constructor");
			this.hdd = hdd;System.out.println("pc hddclass Constructor");
			this.cpu = cpu;System.out.println("pc cpuclass Constructor");
			System.out.println("pc class Constructor");
		}
		@Override
		public String getRam() {
			return this.ram;
		}
		@Override
		public String getHDD() {
			return this.hdd;
		}
		@Override
		public String getCPU() {
			return this.cpu;
		}
		
	  
 }
 class Server extends computer{
	 private String ram;
		private String hdd;
		private String cpu;
		public Server(String ram, String hdd, String cpu) {
			super();
			this.ram = ram;System.out.println("pc ram class Constructor");
			this.hdd = hdd;System.out.println("pc hddclass Constructor");
			this.cpu = cpu;System.out.println("pc cpuclass Constructor");
			System.out.println("Server class Constructor");
		}
	@Override
	
		public String getRam() {
		System.out.println("pc ram class Constructor");
			return this.ram;
		}
		@Override
		public String getHDD() {
			System.out.println("pc hdd class Constructor");
			return this.hdd;
		}
		@Override
		public String getCPU() {
			System.out.println("pc cpu class Constructor");
			return this.cpu;
		}
	 
 }
 class ComputerFactory{
	 
	 public static computer getComputer(String type,String ram,String hdd,String cpu) {
		 
		 if("Pc".equalsIgnoreCase(type)) 
			 return new Pc(ram, hdd, cpu);
		 else if ("Server".equalsIgnoreCase(type)) 
			 return new Server(ram, hdd, cpu);
			 
		return null;
		 
		 
	 }
	 
 }