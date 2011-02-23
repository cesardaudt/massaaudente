/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jwaghetti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    Main() {
		createMainWin();
	}

	public static void main(String[] args) {
        Main main = new Main();
    }

	private void createMainWin() {
		gui.mainWindow mainWin = new gui.mainWindow();
		mainWin.setVisible(true);
	}

}
