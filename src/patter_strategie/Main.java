package patter_strategie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnage p1 = new Personnage("Harry", "Voleur");
		Personnage p2 = new Personnage("Aragorn", "Guerrier");
		Personnage p3 = new Personnage("Legolas", "lancier");
		
		p1.setAttack(new AttaqueAuCouteau());
		
		
		p1.lanceAttaque();
		
		p2.setAttack(new AttaqueAEpee());
		
		p2.lanceAttaque();
		
		System.out.println("Aragorn devient un lancier");		
		p2.setClasse("Lancier");
		p2.setAttack(new AttaqueALaLance());
		p2.lanceAttaque();
	}

}
