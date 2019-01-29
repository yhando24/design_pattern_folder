package patter_strategie;

public class Personnage {

	String nom;
	String classe;
	Attack attack;
	
	
	
	public Personnage(String nom, String classe) {

		this.nom = nom;
		this.classe = classe;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}

	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	
	
	public void lanceAttaque() {
		System.out.println(getNom() + " de type " + getClasse() + " lance une attaque et inflige "+ this.attack.attaquer() + " points de dégats");
	}
	
}
