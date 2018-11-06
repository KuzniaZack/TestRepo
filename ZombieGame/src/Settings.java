/**
 * A class that holds static final variables.
 * Note that this class cannot be instantiated
 * as the constructor is private. So, Settings is 
 * basically a bag of constants.
 * 
 * 
 * @author Freddy Falcon
 * @version 1.0.0
 * @since 1.0
 */
public final class Settings {

	private Settings () {}
	public static final int WIDTH               = 1000;
	public static final int HEIGHT              = 700;
	
	public static final int ZOMBIE_SIZE         = 200;
	public static final int ZOMBIE_SPEED        = 5;
	public static final String ZOMBIE_IMAGE     = "zombie.png";
		
}
