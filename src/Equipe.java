/**
 * Importation
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Class Equipe
 * Classe de gestion des Equipes
 * @author Team J3
 */
public class Equipe {
	
	/**
	 * Attribut
	 */
	private List<Personnage> liste;
	private boolean passerPlacement;
	
	/**
	 * Constructeur de classe
	 */
	public Equipe() {
		liste = new ArrayList<Personnage>();
		passerPlacement = false;
	}
	
	/**
	 * Recupere la liste de personnage
	 * @return Liste de personnage
	 */
	public List<Personnage> getListe() {
		return this.liste;
	}
	
	/**
	 * Recupere le personnage a une position donnee
	 * @param x abscisse
	 * @param y ordonnee
	 * @return personnage concernee
	 */
	public Personnage getPersoSurPosition(int x, int y) {
		Personnage temp;
		for (Iterator<Personnage> perso = liste.iterator();perso.hasNext();) {
			temp = perso.next();
			if (temp.getPos().equals(new Position(x, y))) {
				return temp;
			}
		}
		return new Personnage("existe pas", true, 0, new Position(-1, -1), 1, 0);
	}
	
	public Personnage getPersoSurPosition(Position pos) {
		Personnage temp;
		for (Iterator<Personnage> perso = liste.iterator();perso.hasNext();) {
			temp = perso.next();
			if (temp.getPos().equals(new Position(pos.x, pos.y))) {
				return temp;
			}
		}
		return new Personnage("existe pas", true, 0, new Position(-1, -1), 1, 0);
	}
	
	public void finPiege() {
		Personnage temp;
		for (Iterator<Personnage> perso = liste.iterator();perso.hasNext();) {
			temp = perso.next();
			if (temp.getNumTourPiege() > 0) {
				temp.setNumTourPiege(temp.getNumTourPiege() - 1);
			}
			if (temp.getNumTourPiege() == 0) {
				temp.setEstPiege(false);
			}
		}
	}
	/**
	 * A la base, on considere que tous ses personnages ont joués
	 * @return si un des personnages n'a pas joué ET n'a pas été ignoré
	 */
	public boolean finTour() {
		Personnage temp;
		for (Iterator<Personnage> perso = liste.iterator();perso.hasNext();) {
			temp = perso.next();
			if (!temp.getAJoue() || (!temp.getIgnorer() && temp.getPointsMouvement() > 0) ) {
				return false;
			}
		}
		return true;
	}
	
	public void resetFinTour() {
		Personnage temp;
		for (Iterator<Personnage> perso = liste.iterator();perso.hasNext();) {
			temp = perso.next();
			temp.setAJoue(false);
			temp.setPointsMouvement(temp.getMaxPointsMouvement());
			temp.setIgnorer(false);
		}
	}
	
	public boolean finPlacement() {
		Personnage temp;
		for (Iterator<Personnage> perso = liste.iterator();perso.hasNext();) {
			temp = perso.next();
			if (!temp.getFinPlacement()) {
				return false || passerPlacement;
			}
		}
		return true;
	}
	
	public void passerPlacement() {
		passerPlacement = true;
	}
	
	public boolean mouvementPossible(Ile ile, Plateau plateauGraph) {
		Personnage temp;
		for (Iterator<Personnage> perso = liste.iterator();perso.hasNext();) {
			temp = perso.next();
			if (ile.deplacementPossible(temp, plateauGraph) && !temp.finMouvement()) {
				System.out.println("deplacement possible avec " + temp);
				return true;
			}
		}
		return false;
	}
	
	public void clearRochersVus() {
		Personnage temp;
		for (Iterator<Personnage> perso = liste.iterator();perso.hasNext();) {
			temp = perso.next();
			temp.getRochersVus().clear();
		}
	}
		
}
