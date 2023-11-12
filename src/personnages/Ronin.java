package personnages;

public class Ronin extends Humain{
	
	private int honneur = 1;

	public Ronin(String nom, String boissonFavourite, int argent) {
		super(nom, boissonFavourite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int perte = getArgent() / 10;
		parler(beneficiaire.getNom() + " prend ces " + perte + " sous");
		perdreArgent(perte);
		beneficiaire.parler(perte + " sous ! Je te remercie généreux donateur!");
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if(honneur * 2 > adversaire.getReputation()) {
		
			parler("Je t'ai eu petit yakuza!");
			
			honneur++;
			gagnerArgent(adversaire.perdre());
			
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			honneur--;
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
		}
	}

}
