import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Zombie is a class defining the data of a 
 * character in the game - a Zombie in particular.
 * <p>
 * Zombie implements {@link GraphicsUpdater}, which 
 * means a Zombie object can draw itself to a {@link Graphics} object.
 * <p>

 * @author Freddy Falcon
 * @version 1.0.0
 * @since 1.0
 */
class Zombie implements GraphicsUpdater
{	
	private Image image;
	private int x;
	private int y;
	private int dest_x;
	private int dest_y;
	private int size;
	private int speed = 10;
	private int test;

	/**
	 * A Zombie constructor. 
	 *
	 * @param x
	 *            x-coordinate of a Zombie object.
	 * @param y
	 *            y-coordinate of a Zombie object.
	 * @param size
	 *            size of a Zombie object.
	 * @param speed
	 *            speed of a Zombie object.
	 * @param imagePath
	 *            path to an image file.
	 */
	Zombie(int x, int y, int size, int speed, String imagePath){
		try {
	    	image = ImageIO.read(new File(imagePath));
	    } catch (IOException ioe) {
	    	System.out.println("Unable to load image file.");
	    }
		setPos(x,y);
		setDest(x,y);
		setSize(size);
		setSpeed(speed);
	}	

	/**
	 * Implementation of {@link GraphicsUpdater#update}. 
	 *
	 * @param g
	 *         The {@link Graphics} object to be modified.
	 */
	@Override
    public void update(Graphics g) {
		g.drawImage(image, x, y, size, size, null);
	}
	
	/**
	 * A method that uses a Zombie object's current 
	 * position, destination, and speed to calculate 
	 * a new (x, y) position for the Zombie object.
	 * <p>
	 * This method modifies the x and y fields of a Zombie object. 
	 *
	 */
	public void updatePosition() {
    	if (x < dest_x) {
    		int min = dest_x - x < speed ? dest_x - x : speed; 
    		x += min;
    	} else if (x > dest_x) {
    		int min = x - dest_x < speed ? x - dest_x : speed; 
    		x -= min;
    	}
    	        
    	if (y < dest_y) {
    		int min = dest_y - y < speed ? dest_y - y : speed; 
    		y += min;
    	} else if (y > dest_y) {
    		int min = y - dest_y < speed ? y - dest_y : speed; 
    		y -= min;
    	}
	}
         	

    // Misc. setters and getters
	public Image getImage() { return image; }
    public int getX() { return x; }
    public int getY() { return y; }

    public void setDest(int x, int y) {
		dest_x = x - getSize()/2;
    	dest_y = y - getSize()/2;
	}
    
    public void setPos(int x, int y) {
		this.x = x - getSize()/2;
		this.y = y - getSize()/2;
	}
    
	public int getSize() {	return size; }
	public void setSize(int size)   { this.size = size;   }
	public void setSpeed(int speed)   { this.speed = speed;   }
}