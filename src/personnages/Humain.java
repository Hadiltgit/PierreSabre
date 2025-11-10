package personnages;

public class Humain {
	
   private String nom;
   private String boisson;
   private int argent;
   
   public String getNom() {
	   return nom;
   }
   
   public int getArgent() {
	   return argent;
   }
   
   public void parler(String texte) {
		System.out.println(nom+ "\"" + texte + "\"");
   }
   
   public void direBonjour() {
	   parler( "Bonjour ! Je m’appelle "+nom+"... et j’aime boire du "+boisson);
   }
   
   private void boire() {
	   parler( "Mmmm, un bon verre de "+boisson+" ! GLOUPS ! ");
   }
   
   private void acheter(String bien, int prix) {
	   if(argent >= prix) {
	      parler( " J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
	   }else {
		  parler( " Je n'ai plus que  "+argent+" sous en poche. Je ne peux meme pas m'offrir "+bien+" à "+prix+" sous");   
	   }
   }
   
   public void gagnerArgent(int gain) {
	  argent = argent + gain; 
   }

   public void perdreArgent(int perte) {
	   argent = argent - perte;
   }
   
}
