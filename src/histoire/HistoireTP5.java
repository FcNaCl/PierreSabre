package histoire;
import personnages.*;
public class HistoireTP5 {
	
	public static void main(String[] args) {
		Commerçant marco = new Commerçant("Marco", 20);
		Commerçant chonin =  new Commerçant("Chonin", 40);
		Commerçant kumi =  new Commerçant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
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
	}
	
}
