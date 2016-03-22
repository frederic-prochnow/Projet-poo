public class Personnage {
	protected String nom;
	protected char symboleNom;
	protected int equipe;
	protected int energie;
	protected Position pos;
	protected boolean surNavire;

	
	Personnage(String nom, int equipe, int energie, Position p){
		this.nom = nom;
		this.energie = energie;
		this.equipe = equipe;
		this.surNavire = false;
		this.pos = p;
		
		if(equipe == 1){
			this.symboleNom = nom.charAt(0);
		}else{
			this.symboleNom = (nom.toUpperCase()).charAt(0);
		}
	}
	
	public void perdEnergie(int energie){
		this.energie -= energie;
	}
	
	public Position getPos(){
		return this.pos;
	}
	
	public void setPos(Position p){
		this.pos = p;
	}
	
	public String getNom(){
		return nom;
	}
	
	public char getSymbole(){
		return symboleNom;
	}
	
	public int getEquipe(){
		return equipe;
	}
	
	public int getEnergie(){
		return energie;
	}
	
	public String toString(){
		return nom+" de l'équipe "+equipe+" possede "+energie+" points d'energie.";
	}
}
