package view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.LoginController;

/**
 * Vue qui s'occupe de g�rer l'interface graphique de la partie authentification (login)
 * @author Nicolas
 */
public class LoginView implements View {

	private LoginController controller;
	private JPanel panPrinc;

	private JButton butConnecter;

	/**
	 * Construit la vue, la lie avec le controleur et met � jour l'interface graphique
	 * @param controller
	 */
	public LoginView(LoginController controller) {
		this.controller = controller;
		this.afficher();
	}

	/**
	 * Affiche les �lements graphiques sur la fen�tre
	 */
	private void afficher() {
		this.panPrinc = new JPanel();
		this.panPrinc.setLayout(new BoxLayout(this.panPrinc, BoxLayout.PAGE_AXIS));

		//Label identifiant
		JLabel labIdentifiant = new JLabel("Identifiant");
		labIdentifiant.setFont(new Font("Arial", Font.PLAIN, 20));
		labIdentifiant.setAlignmentX(Component.CENTER_ALIGNMENT);

		//Label mot de passe
		JLabel labMdp = new JLabel("Mot de passe");
		labMdp.setFont(new Font("Arial", Font.PLAIN, 20));
		labMdp.setAlignmentX(Component.CENTER_ALIGNMENT);

		//Champ de l'identifiant
		JTextField fieldIdentifiant = new JTextField();
		fieldIdentifiant.setPreferredSize(new Dimension(150,25));
		fieldIdentifiant.setAlignmentX(Component.CENTER_ALIGNMENT);

		//Champ du mot de passe
		JTextField fieldMdp = new JTextField();
		fieldMdp.setPreferredSize(new Dimension(150,25));
		fieldMdp.setAlignmentX(Component.CENTER_ALIGNMENT);

		//Bouton connecter
		butConnecter = new JButton("Se connecter");
		butConnecter.setAlignmentX(Component.CENTER_ALIGNMENT);
		butConnecter.addActionListener(controller);

		this.panPrinc.add(Box.createVerticalStrut(180));
		this.panPrinc.add(labIdentifiant);
		this.panPrinc.add(fieldIdentifiant);
		this.panPrinc.add(Box.createVerticalStrut(10));
		this.panPrinc.add(labMdp);
		this.panPrinc.add(fieldMdp);
		this.panPrinc.add(Box.createVerticalStrut(40));
		this.panPrinc.add(butConnecter);
	}

	public JButton getButConnecter() {
		return this.butConnecter;
	}

	@Override
	public JPanel getPanel() {
		return this.panPrinc;
	}

}