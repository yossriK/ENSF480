package ClientGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LandLordGUIController {
	private LandLordGUI landLordGui;
	private PrintWriter out;

	
	/**
	 * Creates a gui controller object , which assigns a gui and a print writer to its fields, and creates action listeners to the buttons of the gui.
	 * @param aGUI gui to be assigned to the gui in the controller.
	 * @param out print writer to write into the socket.
	 */
	public LandLordGUIController(LandLordGUI aGUI, PrintWriter out){
		this.out = out;
		this.landLordGui = aGUI;
		landLordGui.addPostListingListener(new PostListingListener());
		landLordGui.addChangePropertyStateListener(new ChangePropertyStateListener());
		landLordGui.addListPostedPropertiesListener(new ListPostedPropertiesListener());
		landLordGui.addViewEmailsListener(new ViewEmailsListener());
		landLordGui.addExitListener(new ExitListener());


		out.println(" ");
	}
	/*public static void main(String[] args) {
		RenterGUI gui;
		PrintWriter out;
		GUIController control = new GUIController(gui,out);
	}*/
	/**
	 * Provides data fields and methods to create a Java data-type, representing a listener for a button in a java application that is an inner class of the GUIController class.
	 *
	 * @author Y. Attia
	 * @author H. Muhamad
	 * @author Y. Khalil
	 * @version 1.0
	 * @since April 4th, 2019
	 */
	class PostListingListener implements ActionListener{
		
		/**
		 * Creates a text field that takes input from user and prints it out to the socket with a unique indicator.
		 */
		@Override
		public void actionPerformed(ActionEvent e1) {
			JTextField listingDetails = new JTextField();
			Object[] message = {"Enter listing details: ", listingDetails};
			
			int option = JOptionPane.showConfirmDialog(null, message, "Listing a property",JOptionPane.OK_CANCEL_OPTION);
			
			if(option == JOptionPane.OK_OPTION)
			{
				out.println("POSTLISTING" +listingDetails.getText()) ;		
		}
	}
}
	class ChangePropertyStateListener implements ActionListener{
		/**
		 * Creates a text field that takes input from user and prints it out to the socket with a unique indicator.
		 */
		@Override
		public void actionPerformed(ActionEvent e1) {
			Object[] message = {"Property selected: ",landLordGui.getTextArea().getSelectedText()};
			int option = JOptionPane.showConfirmDialog(null, message,"Property to change state for",JOptionPane.OK_CANCEL_OPTION);
			
			if(option == JOptionPane.OK_OPTION)
			{
				JTextField propertyState = new JTextField();
				Object[] state = {"Property selected: ", propertyState};
				JOptionPane.showConfirmDialog(null,state,"Property to change state for",JOptionPane.OK_CANCEL_OPTION);
				if(propertyState.getText() == "Rented") {
					out.println("RENTED");
				}
				else if(propertyState.getText() == "Cancelled") {
					out.println("CANCELLED");
				}
				else if(propertyState.getText() == "Suspended") {
					out.println("SUSPENDED");
				}
				else {
					showMessage("Invalid state!");
				}
			}	
	}
}
	class ListPostedPropertiesListener implements ActionListener {
		/**
		 * prints an indicator to the socket.
		 */
		@Override
		public void actionPerformed(ActionEvent e2) {			
			out.println("LISTPROPERTIES");
		}
	}
	class ViewEmailsListener implements ActionListener{
		
		/**
		 * prints an indicator to the socket.
		 */
		@Override
		public void actionPerformed(ActionEvent e2) {			
			out.println("VIEWEMAILS");
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
		landLordGui.clear();
		landLordGui.getTextArea().setText(text);
		
	}
	
	
	public void setVisible() {
		this.landLordGui.getFrame().setVisible(true);
		
	}
	
}

