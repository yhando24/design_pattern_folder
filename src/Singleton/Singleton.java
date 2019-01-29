package Singleton;

public class Singleton {

	String name;
	String age;
	
	
	private static class instancier{
		public static final Singleton instance = new Singleton("Handoura","50 ans");
	}
	
	public static Singleton getInstance() {
		return instancier.instance;
	}

	public Singleton(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	
}
