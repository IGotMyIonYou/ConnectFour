import javax.swing.JFrame;

/**
 * This displays a blank window with a title.
 * @author Lach and Ion!
 */
public class GameWindow extends JFrame {
	/**
	 * The constructor sets the title.
	 */
	public GameWindow() {
		super("Connect Four by Lach and Ion!");
	}

	/**
	 * The main method to test this class.
	 */
	public static void main(String[] args) {
		GameWindow window = new GameWindow();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 300);
		window.setVisible(true);
		
		GameWindow window2 = new GameWindow();
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window2.setSize(400, 300);
        window2.setVisible(true);
	}
}
