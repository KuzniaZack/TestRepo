import java.awt.Graphics;
import java.util.Random;

/**
 * Model is the class 
 * that manages all data about 
 * game characters.
 * <p>
 * This class implements GraphicsUpdater, which means that
 * it can be used to update a frame of animation.
 * <p>
 * Depends on:
 * <ul>
 * <li>{@link Zombie}
 * </ul>
 * 
 * @author Freddy Falcon
 * @version 1.0.0
 * @since 1.0
 */
public class Model implements GraphicsUpdater {	
	
	private Zombie zombie;
	
	/**
	 * A Model constructor that creates a Zombie 
	 * with a random position. 
	 *
	 */
	public Model(){
		System.out.println("Model()");
		Random r = new Random();
		int x = r.nextInt(Settings.WIDTH);
		int y = r.nextInt(Settings.HEIGHT);
		zombie = new Zombie(x, y, Settings.ZOMBIE_SIZE, Settings.ZOMBIE_SPEED, Settings.ZOMBIE_IMAGE);		
	} 	

	/**
	 * A method that updates the {@link Graphics} object
	 * used by the view. The {@link Zombie} positions are also 
	 * updated when this method is called.
	 * 
 	 * @param g
	 *            A {@link Graphics} object reference. The model
	 *            can update a {@link Graphics} object with {@link Zombie} data.
	 */
	@Override
	public void update(Graphics g) {
		zombie.updatePosition();
		zombie.update(g);
	}
	
	/**
	 * A method for setting the (x, y) coordinates of a the characters 
	 * managed by the Model.
	 * 
 	 * @param x
	 *            the x-coordinate
	 * @param y
	 *            the y-coordinate
	 */
	public void setSpriteDestinations(int x, int y)
	{
		zombie.setDest(x, y);
	}
	

}