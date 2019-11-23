package ClientGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



/**
 * Provides data fields and methods to create a Java data-type, representing a GUI controller in a java application.
 *
 * @author Y. Attia
 * @author H. Muhamad
 * @author Y. Khalil
 * @version 1.0
 * @since April 4th, 2019
 */

public class RenterGUIController {
	private RenterGUI mainGui;
	private PrintWriter out;


	
	/**
	 * Creates a gui controller object , which assigns a gui and a print writer to its fields, and creates action listeners to the buttons of the gui.
	 * @param aGUI gui to be assigned to the gui in the controller.
	 * @param out print writer to write into the socket.
	 */
	public RenterGUIController(RenterGUI aGUI, PrintWriter out){
		this.out = out;
		this.mainGui = aGUI;
		mainGui.addRentPropertyListener(new RentPropertyListener());
		mainGui.addSearchPropertyByTypeListener(new SearchPropertyByTypeListener());
		mainGui.addSearchByBedRoomNoListener(new SearchByBedRoomNoListener());
		mainGui.addSearchByBathRoomNoListener(new SearchByBathRoomNoListener());
		mainGui.addSearchByFurnishedStateListener(new SearchByFurnishedStateListener());
		mainGui.addsearchByCityQuadrantListener(new SearchByCityQuadrantListener());
		mainGui.addExitListener(new ExitListener());


		out.println(" ");
	}
	public static void main(String[] args) {

		
	}
	/**
	 * Provides data fields and methods to create a Java data-type, representing a listener for a button in a java application that is an inner class of the GUIController class.
	 *
	 * @author Y. Attia
	 * @author H. Muhamad
	 * @author Y. Khalil
	 * @version 1.0
	 * @since April 4th, 2019
	 */
	class RentPropertyListener implements ActionListener{
		/**
		 * Creates a text field that takes input from user and prints it out to the socket with a unique indicator.
		 */
		@Override
		public void actionPerformed(ActionEvent e1) {
			Object[] message = {"Property selected: ",mainGui.getTextArea().getSelectedText()};
			int option = JOptionPane.showConfirmDialog(null, message,"Property to rent",JOptionPane.OK_CANCEL_OPTION);
			
			if(option == JOptionPane.OK_OPTION)
			{
				out.println("RENT");
			}	
	}
}
	class SearchPropertyByTypeListener implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent e) {
			if(((JSpinner)e.getSource()).getValue() == "Attached house") {
				out.println("ATTACHEDHOUSE");
			}
			else if(((JSpinner)e.getSource()).getValue() == "Detached house") {
				out.println("DETACHEDHOUSE");
			}
			else if(((JSpinner)e.getSource()).getValue() == "Townhouse") {
				out.println("TOWNHOUSE");
			}
			else if(((JSpinner)e.getSource()).getValue() == "Appartment") {
				out.println("APPARTMENT");
			}
			else if(((JSpinner)e.getSource()).getValue() == "none") {
				out.println("NONE");
			}
		}
	}
	class SearchByBedRoomNoListener implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent e) {
			System.out.println(((JSpinner)e.getSource()).getValue().toString());
			out.println(((JSpinner)e.getSource()).getValue().toString()+"BED");

	}
	}
	class SearchByBathRoomNoListener implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent e) {
			out.println(((JSpinner)e.getSource()).getValue().toString()+"BATH");
			}	
		}
	
	class SearchByFurnishedStateListener implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent e) {
			out.println(((JSpinner)e.getSource()).getValue().toString());
			}
		}
	
	class SearchByCityQuadrantListener implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent e) {
			out.println(((JSpinner)e.getSource()).getValue().toString());
		}
	}

	class ExitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			out.println("QUIT");
			System.exit(0);
	}
	}
	/**
	 * prints out a message on a joption pane window.
	 * @param message
	 */
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	/**
	 * printing out the string passed to the text area of the gui.
	 * @param text
	 */
	public void printOnTextArea(String text) {
		mainGui.clear();
		mainGui.getTextArea().setText(text);
		
	}
	
	
	public void setVisible() {
		this.mainGui.getFrame().setVisible(true);
		
	}
	}