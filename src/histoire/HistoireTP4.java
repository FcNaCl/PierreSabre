package histoire;

import personnages.Humain;
import personnages.Commer�ant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("prof", "Kambucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire(prof.getBoissonFavorite());
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		Commer�ant marco = new Commer�ant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoirArgent(15);
		marco.boire(marco.getBoissonFavorite());
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "Whisky", 30, "Warsong");
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
	}

}
