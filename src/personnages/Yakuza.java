package personnages;

public class Yakuza extends Humain {
	private String Clan;
	private int r�putation = 0;

	public Yakuza(String nom, String boissonFavorite, int argent, String Clan) {
		super(nom, boissonFavorite, argent);
		this.Clan = Clan;
	}
	
	public void extorquer(Commer�ant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		this.parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse");
		int argentExtorque = victime.seFaireExtorquer();
		this.gainArgent(argentExtorque);
		this.parler("J'ai piqu� les " + argentExtorque + " euros de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " euros dans ma poche. Hi ! Hi !");
	}

}
