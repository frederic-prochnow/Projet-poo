# Treasure Hunt

### Version avec la souris
 
 * (1/4) IA basique, 1 chance sur 2 de se deplacer gauche/droite OU haut/bas/  
 A rajouter :
 * * Continuer dans son direction de deplacement
 * * Constitution de son propre equipe
 * * Retour vers navire quand possede tresor
 * * Retour vers navire quand energie est bas
 * * Possiblité de voler/pieger/combattre
 * * Stratégie de jeu ???
 
 * Choix du nombre de personnages dans le menu. Chaque personnage est associé à un élément dans
 un tableau (ex: JButton[])
 
 * Contrôle des niveaux d'énergie.
 * * Visualisation de l'énergie sur le plateau
 * * Mise à jour de l'énergie lorsqu'un personnage est resté sur son navire
 * * Séléction du personnage impossible lorsque son énergie == 0


 * (3/3) Brouillard de guerre, sauvegarde les positions deja vus et visualisation
 des positions pas encore decouverts.

 * (2/2) mise à jour de la case du plateau où on a dernierement vu un personnage si on le rencontre
 de nouveau sur une autre case. Attenion : s'il se déplace pendant son tour, alors quand cela revient
 a notre tour, on n'aura pas un tag car on peut actuellement voir où il était. C'est au joueur de retenir
 s'il quelqu'un a disparu entre temps.
