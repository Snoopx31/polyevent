package view;

import javax.swing.JPanel;

/**
 * Chaque vue impl�mente View car au changement de fen�tre (vue) nous avons besoin
 * de mettre � jour la JFrame en remplacant le panel principal par le nouvel
 * @author Nicolas
 *
 */
public interface View {

	public JPanel getPanel();
	
}
