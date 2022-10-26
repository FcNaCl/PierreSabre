package personnages;

public class Commer�ant extends Humain {
	
	// Constructeur
	public Commer�ant(String nom, int argent) {
		super(nom, "th�", argent);
	}

	// M�thodes sp�cifiques
	
	public int seFaireExtorquer() {
		int argentExtorquer = this.getArgent();
		this.setArgent(0);
		this.parler("J'ai tout perdu ! Le monde est trop injuste...");
		return argentExtorquer;
	}
	
	public void recevoirArgent(int argent) {
		this.gainArgent(argent);
		this.parler(argent + " euros ! Je te remercie g�n�reux donateur !");
	}
}
