package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
//		Humain prof = new Humain("Prof", "kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
		
		
		Commercant marco = new Commercant("Marco", 15);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.parler("15 sous ! Je te remercie  g�n�reux donateur!");
//		marco.boire();
		
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		
		roro.provoquer(yakuLeNoir);
		
	}
}
