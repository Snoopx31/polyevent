package controller;

import database.Event;
import database.User;
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
		this.fenetre.setPanelPrincipale(new LoginController(this).getView().getPanel());
	}
	
	public void eventPage(User user) {
		this.fenetre.setPanelPrincipale(new EventController(this, user).getView().getPanel());
	}
	
	public void informationPage(User user, Event event) {
		this.fenetre.setPanelPrincipale(new InformationController(this, user, event).getView().getPanel());
	}
	
	public void addPage(User user) {
		this.fenetre.setPanelPrincipale(new AddController(this, user).getView().getPanel());
	}
	
}
