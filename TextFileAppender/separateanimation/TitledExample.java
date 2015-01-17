import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class TitledExample extends JPanel {

    public TitledExample() {
	super(true);

	this.setLayout(new GridLayout(1, 1, 5, 5));

	JLabel label = new JLabel("Titled Border");
	label.setHorizontalAlignment(JLabel.CENTER);

	TitledBorder titled = new TitledBorder("Title");
	label.setBorder(titled);

	add(label);
    }

    public static void main(String s[]) {
	 JFrame frame = new JFrame("Borders");
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setSize(200, 100);
	 frame.setContentPane(new TitledExample());
	 frame.setVisible(true);
    }
}




/*      Java Swing, Second Edition
 *      Tips and Tools for Killer GUIs
 *    By Marc Loy, Robert Eckstein, Dave Wood, James Elliott, Brian Cole
 *      Second Edition November 2002
 *      http://www.oreilly.com/catalog/jswing2/
 */
