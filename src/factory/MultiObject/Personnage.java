package factory.MultiObject;

public class Personnage {

	private String nom;
	private String classe;
	private IArme arme;
	
	
	
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

	public void setArme(int idArme) {
		this.arme = Factory.creationArme(idArme);
	}
	
	
	public void lanceAttaque() {
		System.out.println(getNom() + " lance une attaque avec son " + this.arme.getTypeArme() + " et inflige " + this.arme.tirer() + " points de dégats");
	}
	
}
