package animation;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
public class Craft
{

    private String craft = "craft1.jpg";//spaceship picture
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    public Craft ()
    {
	ImageIcon ii = new ImageIcon (this.getClass ().getResource (craft));
	image = ii.getImage ();
	x = 240;
	y = 360;
    }
    public void move ()
    {
	x += dx;
	//y += dy;
    }
    public int getX ()
    {
	return x;
    }
    public int getY ()
    {
	return y;
    }
    public Image getImage ()
    {
	return image;
    }
    public void keyPressed (KeyEvent e)
    {
	int key = e.getKeyCode ();//allows user to enter key
	if (key == KeyEvent.VK_LEFT)//left
	{
	    dx = -1;
	}
	if (key == KeyEvent.VK_RIGHT)//right
	{
	    dx = 1;
	}
	/*if (key == KeyEvent.VK_UP)
	{
	    dy = -1;
	}
	if (key == KeyEvent.VK_DOWN)
	{
	    dy = 1;
	}*/
    }
    public void keyReleased (KeyEvent e)
    {
	int key = e.getKeyCode ();
	if (key == KeyEvent.VK_LEFT)//
	{
	    dx = 0;
	}
	if (key == KeyEvent.VK_RIGHT)
	{
	    dx = 0;
	}
	/* if (key == KeyEvent.VK_UP) {
	     dy = 0;
	 }

	 if (key == KeyEvent.VK_DOWN) {
	     dy = 0;
	 }*/
    }
}

