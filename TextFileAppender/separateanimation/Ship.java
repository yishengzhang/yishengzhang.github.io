package animation;
import javax.swing.JFrame;
public class Ship extends JFrame {
    public Ship() {
	getContentPane().add(new Board());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(560, 480);
	setLocationRelativeTo(null);
	setTitle("Star");
	setResizable(false);
	setVisible(true);
    }
    public static void main(String[] args) {
	new Ship();
    }
}
