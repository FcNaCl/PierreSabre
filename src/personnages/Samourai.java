package personnages;

public class Samourai extends Ronin{
	private String nomSeigneur;
	
	public Samourai(String nomSeigneur, String nom, String boissonFav, int argent) {
		// TODO Auto-generated constructor stub
		super(nom, boissonFav, argent);
		this.nomSeigneur = nomSeigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur " + this.nomSeigneur + ".");
	}
	
	public void boire(String nomBoisson) {
		this.parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du "+ nomBoisson + ".");
	}
}
