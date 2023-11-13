package personnages;

import java.util.Random;

public class Traitre extends Samourai{
	
	public Traitre(String seigneur, String nom, String boissonFavourite, int argent) {
		super(seigneur, nom, boissonFavourite, argent);
	}

	private int niveauTraitrise = 0;

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traitre et mon niveau de traitrise est : " + niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		
		if(niveauTraitrise < 3 ) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = argentCommercant * 2 / 10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argentRanconner + " sous ou gare à toi !");
			parler("Toute de suite grand " + commercant.getNom() + ".");
			
		}
		
		else {
			parler("Mince je ne peux plus rançonner personne sinon un samourai risque de me démasquer !");
		}
		
	}
	
	public void faireLeGentil() {
		if(nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
			
		}
		
		else {
			Random rand = new Random();
			int n = rand.nextInt(nbConnaissance);
			
			int don = memoire[n].getArgent();
			
			String nomAmi = memoire[n].getNom();
			
			
			
		}
	}
	

}
