package personnages;

public class Ronin extends Humain {
	private int r�putation = 1;
	
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	
	public void donner(Commer�ant commer�ant) {
		int argentRoninDon = this.getArgent();
		if (argentRoninDon > 10) {
			this.parler(commer�ant.getNom() + " prend ces " + argentRoninDon/10 + " euros.");
			commer�ant.recevoirArgent(argentRoninDon/10);
			this.perdreArgent(argentRoninDon/10);
		}
		else {
			this.parler("Je n'ai pas assez d'argent pour pouvoir faire un don.");
		}
	}
	
	
}
