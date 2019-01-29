package Singleton;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton singleton = Singleton.getInstance();
		
		System.out.println(singleton.name + singleton.age);
	}
	
}
