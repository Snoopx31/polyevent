package controller;

import view.FenetrePrincipale;

/**
 * Contr�leur principal lors du lancement de l'application
 * S'occupe de cr�er l'interface graphique et de lancer le premier controleur li� � la vue (login)
 * @author Nicolas
 */
public class FenetreController {

	private FenetrePrincipale fenetre;
	
	public FenetreController() {
		//On cr�er la vue principale qui contient la JFrame (li�e � ce contr�leur)
		this.fenetre = new FenetrePrincipale();
		//Puis on affiche la premi�re vraie interface graphique (authentification)
		this.loginPage();
	}
	
	/**
	 * Affiche la partie authentification de l'application
	 */
	public void loginPage() {
		//On cr�er d'abord le contr�leur (qui cr�� lui m�me la vue)
		LoginController login = new LoginController(this);
		//Puis on n'oublie pas de changer le panel affich� sur le JFrame principal
		fenetre.setPanelPrincipale(login.getView().getPanel());
	}
	
}
