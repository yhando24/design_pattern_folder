
package factory.MultiObject;


public abstract class Factory {
	
	public static IArme creationArme(int idArme) {
		
		return idArme == 1? new Pistolet(): idArme == 2? new Mitralette():new Bazooka();
		
		
	}
	
}
