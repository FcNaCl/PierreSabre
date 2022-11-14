package personnages;

public class Yakuza extends Humain {
	private String Clan;
	private int r�putation = 4;

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

	public int getR�putation() {
		return r�putation;
	}

	public void setR�putation(int r�putation) {
		this.r�putation = r�putation;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon clan est celui de " + this.getClan() + ".");
	}
	
	public void extorquer(Commer�ant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		this.parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse");
		int argentExtorque = victime.seFaireExtorquer();
		this.gainArgent(argentExtorque);
		this.parler("J'ai piqu� les " + argentExtorque + " euros de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " euros dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argent = this.argent;
		if (this.getR�putation() > 0) {
			this.setR�putation(this.getR�putation() - 1);
		}
		this.argent = 0;
		return argent;
	}
	
	public void gagner(int gain) {
		this.argent += gain;
		this.setR�putation(this.getR�putation() + 1);
	}
}
