
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class RenterGUI {
	private JButton manageFeeBtn;
	private JButton sendEmailBtn;
	private JButton RentPropertyBtn;
	private JTextArea textArea;
	private JButton exitBtn;
	private JSpinner searchByTypeSpinner;
	private JSpinner searchByBedRoomNoSpinner;
	private JSpinner searchByBathRoomNoSpinner;
	private JSpinner searchByFurnishedStateSpinner;
	private JSpinner searchByCityQuadrantSpinner;
	private JFrame frame;

	public JFrame getFrame() {
		return this.frame;
	}

	/**
	 * Create the application.
	 */
	public RenterGUI() {
		initialize();
		frame.setVisible(true);
		frame.setResizable(true);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Segoe UI", Font.PLAIN, 16));
		frame.getContentPane().setBackground(new Color(122,71,221));
		frame.getContentPane().setLayout(null);
		
		JPanel sidepanel = new JPanel();
		sidepanel.setBackground(new Color(54,33,89));
		sidepanel.setBounds(0, 0, 296, 663);
		frame.getContentPane().add(sidepanel);
		sidepanel.setLayout(null);
		
		
		JPanel list2Panel = new JPanel();
		list2Panel.setLayout(null);
		list2Panel.setBackground(new Color(85, 85, 118));
		list2Panel.setBounds(0, 102, 281, 57);
		sidepanel.add(list2Panel);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("icons8_contacts_40px.png"));
		label_2.setBounds(12, 0, 40, 57);
		list2Panel.add(label_2);
		
		sendEmailBtn = new JButton("SEND EMAILS");
		sendEmailBtn.setForeground(Color.BLACK);
		sendEmailBtn.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		sendEmailBtn.setBackground(new Color(204, 204, 204));
		sendEmailBtn.setBounds(103, 13, 130, 25);
		list2Panel.add(sendEmailBtn);
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(85, 85, 118));
		panel.setBounds(0, 596, 291, 57);
		sidepanel.add(panel);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("icons8_exit_sign_40px.png"));
		label_9.setBounds(12, 0, 40, 57);
		panel.add(label_9);
		
		exitBtn = new JButton("EXIT");
		exitBtn.setForeground(Color.BLACK);
		exitBtn.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		exitBtn.setBackground(new Color(204, 204, 204));
		exitBtn.setBounds(113, 10, 130, 25);
		panel.add(exitBtn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(85, 85, 118));
		panel_1.setBounds(0, 201, 281, 57);
		sidepanel.add(panel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(12, 0, 40, 57);
		panel_1.add(label_1);
		
		RentPropertyBtn = new JButton("RENT PROPERTY");
		RentPropertyBtn.setForeground(Color.BLACK);
		RentPropertyBtn.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		RentPropertyBtn.setBackground(new Color(204, 204, 204));
		RentPropertyBtn.setBounds(92, 13, 166, 25);
		panel_1.add(RentPropertyBtn);
		
		searchByTypeSpinner = new JSpinner();
		searchByTypeSpinner.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		searchByTypeSpinner.setModel(new SpinnerListModel(new String[] {"none", "Appartment", "Attached house", "Detached house", "Townhouse"}));
		searchByTypeSpinner.setBounds(130, 271, 137, 22);
		sidepanel.add(searchByTypeSpinner);
		
		searchByBedRoomNoSpinner = new JSpinner();
		searchByBedRoomNoSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		searchByBedRoomNoSpinner.setBounds(237, 306, 30, 22);
		sidepanel.add(searchByBedRoomNoSpinner);
		
		searchByBathRoomNoSpinner = new JSpinner();
		searchByBathRoomNoSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		searchByBathRoomNoSpinner.setBounds(237, 342, 30, 22);
		sidepanel.add(searchByBathRoomNoSpinner);
		
		searchByFurnishedStateSpinner = new JSpinner();
		searchByFurnishedStateSpinner.setModel(new SpinnerListModel(new String[] {"none", "Furnished", "Unfurnished"}));
		searchByFurnishedStateSpinner.setBounds(171, 377, 96, 22);
		sidepanel.add(searchByFurnishedStateSpinner);
		
		searchByCityQuadrantSpinner = new JSpinner();
		searchByCityQuadrantSpinner.setModel(new SpinnerListModel(new String[] {"none", "NW", "NE", "SW", "SE"}));
		searchByCityQuadrantSpinner.setBounds(206, 412, 61, 22);
		sidepanel.add(searchByCityQuadrantSpinner);
		
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(new Color(122,71,221));
		headerPanel.setBounds(358, 13, 836, 220);
		frame.getContentPane().add(headerPanel);
		headerPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(369, 13, 85, 102);
		headerPanel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("icons8_small_business_80px.png"));
		
		JLabel lblEshop = new JLabel("");
		lblEshop.setHorizontalAlignment(SwingConstants.CENTER);
		lblEshop.setBounds(269, 115, 600, 92);
		headerPanel.add(lblEshop);
		lblEshop.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 32));
		lblEshop.setForeground(new Color(204, 204, 204));
		
		
	    textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBounds(114, 5, 410, 240);
		textArea.setBackground(new Color(240,240,240));
		JScrollPane scrollBar = new JScrollPane(textArea);
		scrollBar.setSize(898, 404);
		scrollBar.setLocation(334, 246);
		frame.getContentPane().add(scrollBar);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1281, 710);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void addSearchPropertyByTypeListener(ChangeListener listener) {
		this.searchByTypeSpinner.addChangeListener(listener);
	}
	public void addSearchByBedRoomNoListener(ChangeListener listener) {
		this.searchByBedRoomNoSpinner.addChangeListener(listener);
	}
	public void addSearchByBathRoomNoListener(ChangeListener listener) {
		this.searchByBathRoomNoSpinner.addChangeListener(listener);
	}
	public void addSearchByFurnishedStateListener(ChangeListener listener) {
		this.searchByFurnishedStateSpinner.addChangeListener(listener);
	}
	public void addsearchByCityQuadrantListener(ChangeListener listener) {
		this.searchByCityQuadrantSpinner.addChangeListener(listener);
	}
	/**
	 * Assigns a listener to mamange fees of renters.
	 * @param listener
	 */
	public void addManageFeeListener(ActionListener listener) {
		this.manageFeeBtn.addActionListener(listener);
	}
	/**
	 * Assigns a listener to send emails to landlords.
	 * @param listener an ActionListener.
	 */
	public void addSendEmailsListener(ActionListener listener) {
		this.sendEmailBtn.addActionListener(listener);
	}

	public void addExitListener(ActionListener listener) {
		this.exitBtn.addActionListener(listener);
	}
	
	public void addRentPropertyListener(ActionListener listener) {
		this.RentPropertyBtn.addActionListener(listener);
	}
	/**
	 * Clears out to the text area.
	 */
	public void clear() {
		textArea.setText("");
		textArea.repaint();
	}
	/**
	 * returns the text area.
	 * @return text area.
	 */
	public JTextArea getTextArea() {
		return textArea;
	}
}
