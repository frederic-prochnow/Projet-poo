/**
 * Class Explorateur
 * Classe de gestion des Explorateur
 * @author Team J3
 */
public class Explorateur extends Personnage {
	/**
	 * Constructeur de Explorateur
	 * @param nom Son nom
	 * @param equipe1 Appartient à l'équipe 1 
	 * @param energie Energie de base
	 * @param p Sa position de base
	 * @param type Son type selon Parcelle
	 */
	public Explorateur(String nom, boolean equipe, int energie, Position p, int type, int pointsMouvements){
		super(nom,equipe,energie,p,type,pointsMouvements);
	}
}
