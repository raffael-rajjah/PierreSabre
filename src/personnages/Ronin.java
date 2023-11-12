package personnages;

public class Ronin extends Humain{

	public Ronin(String nom, String boissonFavourite, int argent) {
		super(nom, boissonFavourite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int perte = getArgent() / 10;
		parler(beneficiaire.getNom() + " prend ces " + perte + " sous");
		perdreArgent(perte);
		beneficiaire.parler(perte + " sous ! Je te remercie généreux donateur!");
	}

}
