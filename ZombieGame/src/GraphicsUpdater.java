import java.awt.Graphics;

/**
 * A GraphicsUpdater can update a {@link Graphics} object.
 * In other words, you can give a GraphicsUpdater a Graphics object
 * and it will "draw" something to the Graphics object. 
 * 
 * @author Freddy Falcon
 * @version 1.0.0
 * @since 1.0
 */
public interface GraphicsUpdater {

	/**
	 * A method taht can update a {@link Graphics} object.
	 * 
	 * @author Freddy Falcon
	 * @version 1.0.0
	 * @since 1.0
	 */
	public void update(Graphics g);
	
}
