package factory.oneObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnage p1 = new Personnage("Harry", "Voleur");
		Personnage p2 = new Personnage("Aragorn", "Guerrier");
		Personnage p3 = new Personnage("Legolas", "lancier");
		
		// Appel de la factory qui va creer un pistolet et le donner au personnage
		p1.setArme();
		
		
		p1.lanceAttaque();
		

	}

}
