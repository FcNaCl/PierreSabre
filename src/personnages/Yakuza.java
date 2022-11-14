package personnages;

public class Yakuza extends Humain {
	private String Clan;
	private int réputation = 4;

	public Yakuza(String nom, String boissonFavorite, int argent, String Clan) {
		super(nom, boissonFavorite, argent);
		this.setClan(Clan);
	}
	
	public String getClan() {
		return Clan;
	}

	public void setClan(String clan) {
		Clan = clan;
	}

	public int getRéputation() {
		return réputation;
	}

	public void setRéputation(int réputation) {
		this.réputation = réputation;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon clan est celui de " + this.getClan() + ".");
	}
	
	public void extorquer(Commerçant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse");
		int argentExtorque = victime.seFaireExtorquer();
		this.gainArgent(argentExtorque);
		this.parler("J'ai piqué les " + argentExtorque + " euros de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " euros dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argent = this.argent;
		if (this.getRéputation() > 0) {
			this.setRéputation(this.getRéputation() - 1);
		}
		this.argent = 0;
		return argent;
	}
	
	public void gagner(int gain) {
		this.argent += gain;
		this.setRéputation(this.getRéputation() + 1);
	}
}
