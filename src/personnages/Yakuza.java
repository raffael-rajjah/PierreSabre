package personnages;

public class Yakuza extends Humain{
	
//	private String clan;
//	private int reputation;

	public Yakuza(String nom, String boissonFavourite, int argent) {
		super(nom, boissonFavourite, argent);

	}
	
	public void extorquer(Commercant victime) {
		int gain;
		
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		gain = victime.seFaireExtorquer();
		parler("J'ai piqué les " + gain + " sous de Marco, ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
	}

}
