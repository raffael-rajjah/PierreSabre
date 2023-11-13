package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private Humain[] memoire = new Humain[30]; 
	private int nbConnaissance = 0;
	
	public Humain(String nom, String boissonFavourite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavourite;
		this.argent = argent;
	}
	
	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(argent > prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		}
		
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux mÃªme pas m'offir " + bien + " à " + prix + " sous.");
		}
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	private void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
	
	private void memoriser(Humain autreHumain) {
		memoire[nbConnaissance] = autreHumain;
		nbConnaissance++;
	}
	
	public void listerConnaissance() {

		StringBuilder connaissances = new StringBuilder();
		for(int i = 0; i < nbConnaissance; i++) {
			connaissances.append(memoire[i].getNom());
			if(i < nbConnaissance - 1 ) {
				connaissances.append(", ");
			}
		}
		
		parler("Je connais beaucoup de monde dont : " + connaissances.toString());
	}
	
}
