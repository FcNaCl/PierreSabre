package personnages;

public class Yakuza extends Humain {
	private String Clan;
	private int réputation = 0;

	public Yakuza(String nom, String boissonFavorite, int argent, String Clan) {
		super(nom, boissonFavorite, argent);
		this.Clan = Clan;
	}
	
	public void extorquer(Commerçant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse");
		int argentExtorque = victime.seFaireExtorquer();
		this.gainArgent(argentExtorque);
		this.parler("J'ai piqué les " + argentExtorque + " euros de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " euros dans ma poche. Hi ! Hi !");
	}

}
