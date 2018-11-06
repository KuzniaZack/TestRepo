import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Controller is the class 
 * that handles click events for the {@link View}.
 * <p>
 * Controller implements {@link MouseListener}. 
 * Therefore, Controller implements a bunch methods of to handle 
 * mouse clicks. You can see this at the bottom the class definition. 
 * Most of these do nothing. {@link Controller#mousePressed(MouseEvent)} is 
 * the only method that does something interesting.
 * <p>
 * When the {@link javax.swing.JFrame} create in
 * in the {@link View} is "clicked", the {@link Controller#mousePressed(MouseEvent)} 
 * method is automatically called. 
 * <p>
 * Based on mouse clicks, the Controller will update the 
 * {@link Model} as needed.
 * 
 * <p>
 * Depends on:
 * <ul>
 * <li>{@link Model}
 * <li>{@link View}
 * </ul>
 * 
 * @author Freddy Falcon
 * @version 1.0.0
 * @since 1.0
 */
class Controller implements MouseListener, ActionListener {

	Model model;
	View view;

	/**
	 * A Controller constructor.
	 */
	Controller() {	
		System.out.println ("Controller()");
	} 
	
	/**
	 * A method that can be used to set the {@link Model} being used
	 * by the Controller. This is an example of "Method injection"
	 * 
 	 * @param m
	 *            A {@link Model} object reference. The model
	 *            used to keep track of character data.
	 */
	public void addModel(Model m){
		System.out.println("Controller: adding model");
		this.model = m;
	}

	/**
	 * A method that can be used to set the {@link View} being used
	 * by the Controller. This is an example of "Method injection"
	 * 
 	 * @param m
	 *            A {@link View} object reference. The view
	 *            used to show the characters.
	 */
	public void addView(View v){
		System.out.println("Controller: adding view");
		this.view = v;
	}
		
	/**
	 * The implementation of {@link MouseListener#mousePressed(MouseEvent)}
	 * that is called by the {@link View}. 
	 * 
	 * 
 	 * @param e
	 *            A {@link MouseEvent} object reference. 
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Controller sees mouse pressed: acting on Model");
		if (e.getButton() == MouseEvent.BUTTON1)
			model.setSpriteDestinations(e.getX(), e.getY());
	}

	/**
	 * Implementation of the {@link ActionListener#actionPerformed(ActionEvent)} 
	 * method in the {@link ActionListener} interface. 
	 * 
	 * As an example, this method can be called by a {@link javax.swing.Timer} every 50 milliseconds. 
	 * This method is used to refresh frames for an animation. 
	 *
	 * @param e
	 *            An {@link ActionEvent} object.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// force paintComponent of the JPanel to be called
		view.refresh();
	}
	
	/* The methods below run when different mouse events occur.
	 * These methods are not being used. In other words, the 
	 * mouse events that would trigger these methods are not being
	 * listened for.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

} 

