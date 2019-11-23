package ClientGUI;

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
import java.awt.event.ActionEvent;


public class LandLordGUI {
	private JButton postListingBtn;
	private JButton viewEmailsBtn;
	private JButton changePropertyStateBtn;
	private JButton listPostedPropertiesBtn;
	private JTextArea textArea;
	private JButton exitBtn;
	private JFrame frame;

	public JFrame getFrame() {
		return this.frame;
	}

	/**
	 * Create the application.
	 */
	public LandLordGUI() {
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
		
		JPanel buyPanel = new JPanel();
		buyPanel.setLayout(null);
		buyPanel.setBackground(new Color(85, 85, 118));
		buyPanel.setBounds(0, 136, 281, 57);
		sidepanel.add(buyPanel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("icons8_buy_48px.png"));
		label.setBounds(12, 0, 56, 57);
		buyPanel.add(label);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(12, 0, 40, 57);
		buyPanel.add(label_7);
		
		 postListingBtn = new JButton("POST LISTING");
		 postListingBtn.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 	}
		 });
		 postListingBtn.setForeground(new Color(0, 0, 0));
		 postListingBtn.setBackground(new Color(204, 204, 204));
		postListingBtn.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));

		postListingBtn.setBounds(102, 13, 130, 25);
		buyPanel.add(postListingBtn);
		
		JPanel list2Panel = new JPanel();
		list2Panel.setLayout(null);
		list2Panel.setBackground(new Color(85, 85, 118));
		list2Panel.setBounds(0, 447, 281, 57);
		sidepanel.add(list2Panel);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("icons8_contacts_40px.png"));
		label_2.setBounds(12, 0, 40, 57);
		list2Panel.add(label_2);
		
		viewEmailsBtn = new JButton("VIEW EMAILS");
		viewEmailsBtn.setForeground(Color.BLACK);
		viewEmailsBtn.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		viewEmailsBtn.setBackground(new Color(204, 204, 204));
		viewEmailsBtn.setBounds(103, 13, 130, 25);
		list2Panel.add(viewEmailsBtn);
		
		
		
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
		panel_1.setBounds(0, 248, 281, 57);
		sidepanel.add(panel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(12, 0, 56, 57);
		panel_1.add(label_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(12, 0, 40, 57);
		panel_1.add(label_3);
		
		changePropertyStateBtn = new JButton("CHANGE PROPERTY'S STATE");
		changePropertyStateBtn.setForeground(Color.BLACK);
		changePropertyStateBtn.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		changePropertyStateBtn.setBackground(new Color(204, 204, 204));
		changePropertyStateBtn.setBounds(102, 13, 130, 25);
		panel_1.add(changePropertyStateBtn);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(85, 85, 118));
		panel_2.setBounds(0, 346, 281, 57);
		sidepanel.add(panel_2);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(12, 0, 56, 57);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(12, 0, 40, 57);
		panel_2.add(label_5);
		
		listPostedPropertiesBtn = new JButton("LIST POSTED PROPERTIES");
		listPostedPropertiesBtn.setForeground(Color.BLACK);
		listPostedPropertiesBtn.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		listPostedPropertiesBtn.setBackground(new Color(204, 204, 204));
		listPostedPropertiesBtn.setBounds(102, 13, 130, 25);
		panel_2.add(listPostedPropertiesBtn);
		
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
		lblEshop.setFont(new Font("Segoe UI", Font.PLAIN, 32));
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
	/**
	 * Assigns a listener to the buy button.
	 * @param listener an ActionListener.
	 */
	public void addPostListingListener(ActionListener listener) {
		this.postListingBtn.addActionListener(listener);
	}
	
	public void addViewEmailsListener(ActionListener listener) {
		this.viewEmailsBtn.addActionListener(listener);
	}
	public void addChangePropertyStateListener(ActionListener listener) {
		this.changePropertyStateBtn.addActionListener(listener);
	}
	public void addListPostedPropertiesListener(ActionListener listener) {
		this.listPostedPropertiesBtn.addActionListener(listener);
	}

	public void addExitListener(ActionListener listener) {
		this.exitBtn.addActionListener(listener);
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
