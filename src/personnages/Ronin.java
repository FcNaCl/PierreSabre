package personnages;

public class Ronin extends Humain {
	private int réputation = 1;
	
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	
	public void donner(Commerçant commerçant) {
		int argentRoninDon = this.getArgent();
		if (argentRoninDon > 10) {
			this.parler(commerçant.getNom() + " prend ces " + argentRoninDon/10 + " euros.");
			commerçant.recevoirArgent(argentRoninDon/10);
			this.perdreArgent(argentRoninDon/10);
		}
		else {
			this.parler("Je n'ai pas assez d'argent pour pouvoir faire un don.");
		}
	}
	
	
}
