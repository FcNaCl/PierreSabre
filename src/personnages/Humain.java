package personnages;

public class Humain {
	protected String nom;
	protected String boissonFavorite;
	protected int argent;
	
	// Constructor
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	// getters
	
	public String getNom() {
		return nom;
	}
	
	public String getBoissonFavorite() {
		return boissonFavorite;
	}
	
	public int getArgent() {
		return argent;
	}
	
	// setters
	
	public void setArgent(int argent) {
		this.argent = argent;
	}
	
	// méthodes spécifiques
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFavorite + ".");
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int argent) {
		if (this.getArgent() >= argent) {
			parler("J'ai " + this.argent + " euros en poche. Je vais pouvoir m'offrir " + bien + " à " + argent + " euros.");
			this.perdreArgent(argent);
		}
		else {
			parler("Je n'ai plus que " + this.argent + " euros en poche. Je ne peux même pas m'offrir " + bien + " à " + argent + " euros .");
		}
		
	}
	
	public void perdreArgent(int argent) {
		this.setArgent(this.getArgent()-argent);
	}
	
	public void gainArgent(int argent) {
		this.setArgent(this.getArgent()+argent);
	}
	
	protected void parler(String texte) {
		System.out.println("(this.nom) - " + texte);
	}
}
