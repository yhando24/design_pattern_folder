package factory.oneObject;

public abstract class Factory {
	
	public static IArme creationPistolet() {
		
		return new Pistolet();
	}
	
}