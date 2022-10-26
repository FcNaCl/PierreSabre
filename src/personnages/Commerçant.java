package personnages;

public class Commerçant extends Humain {
	
	// Constructeur
	public Commerçant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	// Méthodes spécifiques
	
	public void seFaireExtorquer() {
		this.setArgent(0);
		this.parler("J'ai tout perdu ! Le monde est trop injuste...");
	}
	
	public void recevoirArgent(int argent) {
		this.gainArgent(argent);
		this.parler(argent + " euros ! Je te remercie généreux donateur !");
	}
}
