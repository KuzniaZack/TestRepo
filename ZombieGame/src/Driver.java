import javax.swing.Timer;

/**
 * Driver is the class that contains the main method.
 * 
 * This class "glues" other classes together. 
 * <p>
 * Depends on:
 * <ul>
 * <li>{@link Model}
 * <li>{@link View}
 * <li>{@link Controller}
 * </ul>
 * 
 * @author Freddy Falcon
 * @version 1.0.0
 * @since 1.0
 */
public class Driver {

	/**
	 * The main method instantiates 
	 * and sets up 
	 * a {@link Model}, {@link View}, and {@link Controller}.
	 * <p>
	 * A {@link javax.swing.Timer} is instantiated and started to drive the animation.
	 * Note that the {@link Controller} implements {@link java.awt.event.ActionListener}. 
	 * This means that {@link Controller} implements 
	 * {@link Controller#actionPerformed(java.awt.event.ActionEvent)}, 
	 * a method that is called when the timer goes off.
	 *
	 * @param args
	 *            command line arguments that we do not use
	 */
	public static void main(String[] args) {

		Model model = new Model();
		Controller controller = new Controller();
		View view = new View(controller, model);
		
		// give the controller a reference to the view and model
		controller.addModel(model);
		controller.addView(view);


		// start animation using a swing timer
		new Timer(10, controller).start();

	}

}
