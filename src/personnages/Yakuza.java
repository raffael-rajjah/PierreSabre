package personnages;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavourite, int argent, String clan) {
		super(nom, boissonFavourite, argent);
		this.clan = clan;

	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		int gain;
		
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J'ai piqué les " + gain + " sous de Marco, ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
		reputation++;
	}
	
	public int perdre() {
		parler("J'ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de " + clan);

		int tmpArgent = getArgent();
		perdreArgent(tmpArgent);
		
		reputation--;
		
		
		return tmpArgent;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
		gagnerArgent(gain);
		reputation++;
	}

}
