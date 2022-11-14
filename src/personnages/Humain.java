package personnages;

public class Humain {
	
	protected static final int NB_HUMAIN = 3;
	protected String nom;
	protected String boissonFavorite;
	protected int argent;
	protected Humain[] memoire;
	protected int nbConnaissance = 0;
	
	// Constructor
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		this.memoire = new Humain[NB_HUMAIN];
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
	
	public int getNbConnaissance() {
		if (this.nbConnaissance > NB_HUMAIN) return NB_HUMAIN;
		else return nbConnaissance;
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
	
	public void parler(String texte) {
		System.out.println(this.nom +" - " + texte);
	}
	
	public void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}
	
	public void memoriser(Humain humain) {
		this.memoire[nbConnaissance%NB_HUMAIN] = humain;
		this.nbConnaissance += 1;
	}
	
	
	public void faireConnaissance(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		String rep = "";
		for (int i = 0; i < this.getNbConnaissance(); i++) {
			rep += memoire[i].getNom()+((i == this.getNbConnaissance()-1)?".": ", ");
		}
		this.parler("Je connais beaucoup de monde dont : " + rep);
	}
}
