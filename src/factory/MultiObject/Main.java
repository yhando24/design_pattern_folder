package factory.MultiObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnage p1 = new Personnage("Harry", "Voleur");
		Personnage p2 = new Personnage("Aragorn", "Guerrier");
		Personnage p3 = new Personnage("Legolas", "lancier");
		
		// Appel de la factory qui va creer une arme en fonction de l'id de larme
		
		
		/* lanceAttaque ne fait que sortir les degats infliger par larme de la methode tirer qui retourne un int qui est la valeur des degat infligé, 
		 * methode redifinit dans chaque classe qui  implemente linterface IArme
		 */
		
		/* arme 1 qui va instancier un pistolet dans la factory */
		p1.setArme(1);
		p1.lanceAttaque();
		
		/* arme 2 qui va instancier un mitralette dans la factory */
		p1.setArme(2);
		p1.lanceAttaque();
		
		/* arme 3 qui va instancier un bazooka dans la factory */
		p1.setArme(3);
		p1.lanceAttaque();
		

	}

}
