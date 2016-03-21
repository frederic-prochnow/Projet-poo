import tps.Plateau;
public class Map {
	public static void main(String [] args) {
		
		/* DECLARATION DES VARIABLES */		
		String[] img = {"images/sable.png",
				"images/1.explorateur.png",
				"images/1.piegeur.png",
				"images/1.navire.png",
				"images/2.explorateur.png",
				"images/2.piegeur.png",
				"images/2.navire.png",
				"images/rocher.png",
				"images/coffre.png",
				"images/cle.jpg",
				"images/mer.png"};
		Ile plateau = new Ile();
		Plateau plateauGraph = new Plateau(img,plateau.getSize());
		
		/* ACTIONS */				
		plateauGraph.setJeu(plateau.getplateaugraphique());
		
		/* AFFICHAGE */
		plateauGraph.affichage(); // Affichage graphique
		System.out.println(plateau.toString()); // Affichage textuel
	}
}