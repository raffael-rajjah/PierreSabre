package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);
	}

	public int seFaireExtorquer() {
		int tmpArgent = getArgent();
		parler("J'ai tout perdu! Le monde est trop injuste...");
		
		perdreArgent(tmpArgent);
		
		return tmpArgent;
		
	}
}
