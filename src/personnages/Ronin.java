package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	
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
	
	public void provoquer(Yakuza adversaire) {
		if (2*this.honneur > adversaire.getR�putation()) {
			int gain = adversaire.perdre();
			this.argent += gain;
			this.honneur += 1;
			this.parler("Je t'ai eu petit yakuza !");
			this.parler("J'ai perdu mon duel et mes " + gain + " euros, snif... J'ai d�shonor� le clan de " + adversaire.getClan() + ".");
		} else {
			int perte = this.argent;
			this.argent = 0;
			this.honneur -= 1;
			adversaire.gagner(perte);
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.parler("Ce ronin pensait vraiment battre " + adversaire.getNom() + " du clan de " + adversaire.getClan() + " ? Je l'ai d�pouill� de ses " + perte + " euros.");
		}
	}
	
}
