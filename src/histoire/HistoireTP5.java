package histoire;
import personnages.*;
public class HistoireTP5 {
	
	public static void main(String[] args) {
		Commer�ant marco = new Commer�ant("Marco", 20);
		Commer�ant chonin =  new Commer�ant("Chonin", 40);
		Commer�ant kumi =  new Commer�ant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Samourai akimoto = new Samourai("Miyamoto","Akimoto", "sak�", 80);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		System.out.println("Le marchand Marco rencontre le ronin.");
		marco.faireConnaissance(roro);
		System.out.println("Le marchand Marco rencotre le yakuza.");
		marco.faireConnaissance(yaku);
		System.out.println("Le marchand rencontre un autre marchand.");
		marco.faireConnaissance(chonin);
		System.out.println("Le marchand rencontre un autre marchand.");
		marco.faireConnaissance(kumi);
		marco.listerConnaissance();
		kumi.listerConnaissance();
		yaku.listerConnaissance();
		akimoto.faireConnaissance(marco);
		akimoto.listerConnaissance();
		akimoto.boire("th�");
	}
	
}
