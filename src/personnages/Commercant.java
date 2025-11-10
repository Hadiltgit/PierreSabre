package personnages;

public class Commercant extends Humain {
    
	public Commercant(String nom , String boisson , int argent){
		super(nom , boisson , argent);
	}
	
	public int seFaireExtorquer() {
		return ;
	}
	
	public void recevoir(int Argent){
		argent = argent + Argent ;
	}
}
