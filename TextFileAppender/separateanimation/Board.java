package animation;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Board extends JPanel implements Runnable
{
    private Image star1, star2, star3;
    private Thread animator;
    private int x, y;
    private Craft craft;
    private final int DELAY = 50;
    public Board ()
    {
	addKeyListener (new TAdapter ());
	craft = new Craft ();
	setBackground (Color.BLACK);
	setDoubleBuffered (true);
	ImageIcon ii1 = new ImageIcon (this.getClass ().getResource ("sprite30.jpg"));
	star1 = ii1.getImage ();
	ImageIcon ii2 = new ImageIcon (this.getClass ().getResource ("sprite25.jpg"));
	star2 = ii2.getImage ();
	ImageIcon ii3 = new ImageIcon (this.getClass ().getResource ("sprite26.jpg"));
	star3 = ii3.getImage ();
	x = y = 10;
    }
    public void addNotify ()
    {
	super.addNotify ();
	animator = new Thread (this);
	animator.start ();
    }
    public void paint (Graphics g)
    {
	super.paint (g);
	Graphics2D g2d = (Graphics2D) g;
	g2d.drawImage (craft.getImage (), craft.getX (), craft.getY (), this);
	g2d.drawImage (star1, x, y, this);
	g2d.drawImage (star2, x, y + 40, this);
	g2d.drawImage (star3, x, y + 80, this);
	Toolkit.getDefaultToolkit ().sync ();
	g.dispose ();
    }
    public void cycle ()
    {
	x += 2;
	//y += 1;
	if (x > 500)
	{
	    //y = -45;
	    x = 0;
	}
    }
    public void actionPerformed (ActionEvent e)
    {
	craft.move ();
	repaint ();
    }
    private class TAdapter extends KeyAdapter
    {

	public void keyReleased (KeyEvent e)
	{
	    craft.keyReleased (e);
	}

	public void keyPressed (KeyEvent e)
	{
	    craft.keyPressed (e);
	}
    }
    public void run ()
    {
	long beforeTime, timeDiff, sleep;
	beforeTime = System.currentTimeMillis ();
	while (true)
	{

	    cycle ();
	    repaint ();
	    timeDiff = System.currentTimeMillis () - beforeTime;
	    sleep = DELAY - timeDiff;
	    if (sleep < 0)
		sleep = 2;
	    try
	    {
		Thread.sleep (sleep);
	    }
	    catch (InterruptedException e)
	    {
		System.out.println ("interrupted");
	    }
	    beforeTime = System.currentTimeMillis ();
	}
    }
}
