package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, String boissonFavourite, int argent) {
		super(nom, boissonFavourite, argent);
	}

	public int seFaireExtorquer() {
		int tmpArgent = getArgent();
		parler("J'ai tout perdu! Le monde est trop injuste...");
		
		perdreArgent(tmpArgent);
		
		return tmpArgent;
		
	}
}
