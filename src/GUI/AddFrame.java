
package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SystemClassAndMain.ListingSys;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddFrame extends JFrame {

	private JPanel contentPane;
	private JTextField ownerNameSurnametextField;
	private JTextField mailText;
	private JTextField incomeField;
	private JTextField expensesField;
	private JTextField revenuetextField;
	private JTextField listingNameText;
	private JTextField listingTypeText;
	private JTextField squremetText;
	private JTextArea InformationForAddtextArea = new JTextArea();
	AddFrame af;
	
	ButtonGroup bt = new ButtonGroup();
	/*private JRadioButton normalListingRadioButton = new JRadioButton("Normal Listing"); 
	private JRadioButton medicalListingRadioButton = new JRadioButton("Medical Listing"); */
	private JRadioButton normalListingRadioButton_1 = new JRadioButton("Normal Listing"); 
	private JRadioButton medicalListingRadioButton_1 = new JRadioButton("Medical Listing");
	private JTextArea InformationForAddtextArea_1 = new JTextArea();
	private JButton addButton;
	private JButton clearButton;
	private JButton closeButton;
	
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public AddFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ownerNameSurnameLabel = new JLabel("Owner Name Surname: ");
		ownerNameSurnameLabel.setBounds(6, 41, 146, 16);
		contentPane.add(ownerNameSurnameLabel);
		
		ownerNameSurnametextField = new JTextField();
		ownerNameSurnametextField.setBounds(151, 36, 146, 26);
		contentPane.add(ownerNameSurnametextField);
		ownerNameSurnametextField.setColumns(10);
		
		JLabel ownerAddressLabel = new JLabel("Owner E-Mail Address:");
		ownerAddressLabel.setBounds(6, 69, 146, 16);
		contentPane.add(ownerAddressLabel);
		
		mailText = new JTextField();
		mailText.setBounds(151, 64, 146, 26);
		contentPane.add(mailText);
		mailText.setColumns(10);
		
		addButton = new JButton("ADD");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				boolean res = false;
			
		        if (ownerNameSurnametextField.getText().isEmpty() || mailText.getText().isEmpty()) {
		        	InformationForAddtextArea.setText("Fill the necessary fields");
		        } else {
		            double income = Double.parseDouble(incomeField.getText());
		            double expenses = Double.parseDouble(expensesField.getText());
		            double revenue = Double.parseDouble(revenuetextField.getText());
		            String listingName = listingNameText.getText();
		            String listingType = listingTypeText.getText();
		            
		            if (normalListingRadioButton_1.isSelected()) 
		                if (squremetText.getText().isEmpty()) {
		                	InformationForAddtextArea_1.setText("Fill the necessary fields");
		                } else {
		                    int squareMeters = Integer.parseInt(squremetText.getText());
		              
		                    res =ListingSys.addListing(income, expenses, revenue, listingName, listingType,squareMeters);
		                    if (res) {
		                        
		                        InformationForAddtextArea_1.setText("Information is added.");

		                    } else {
		                    	InformationForAddtextArea_1.setText("An info with the same id already exists in the system");
		                    }
		                }
		            else {
		        
		            	int squareMeters = Integer.parseInt(squremetText.getText());
		                    res = ListingSys.addListing(income, expenses, revenue, listingName, listingType, squareMeters);
		                    if (res) {
		                   
		                        InformationForAddtextArea_1.setText("Information is added.");

		                    } else {
		                    	InformationForAddtextArea_1.setText("An info with the same id  already exists in the system");
		                    }
		                }
		        }}}
		
	
			//
		
		);
		addButton.setBounds(35, 349, 117, 29);
		contentPane.add(addButton);
		
		clearButton = new JButton("CLEAR");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ownerNameSurnametextField.setEditable(true);
				mailText.setText("");
				incomeField.setText("");
				expensesField.setText("");
				revenuetextField.setText("");
				listingNameText.setText("");
				listingTypeText.setText("");
				squremetText.setText("");
			}
		});
		clearButton.setBounds(234, 349, 117, 29);
		contentPane.add(clearButton);
		
		closeButton = new JButton("CLOSE");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//af.dispose();
				setVisible(false);
				MainFrame mf = new MainFrame();
				mf.setVisible(true);
				
			}
		});
		closeButton.setBounds(434, 349, 117, 29);
		contentPane.add(closeButton);
		
		JLabel incomeLabel = new JLabel("Income:");
		incomeLabel.setBounds(6, 125, 61, 16);
		contentPane.add(incomeLabel);
		
		incomeField = new JTextField();
		incomeField.setBounds(73, 120, 130, 26);
		contentPane.add(incomeField);
		incomeField.setColumns(10);
		
		JLabel expensesLabel = new JLabel("Expenses:");
		expensesLabel.setBounds(6, 153, 71, 16);
		contentPane.add(expensesLabel);
		
		expensesField = new JTextField();
		expensesField.setBounds(73, 148, 130, 26);
		contentPane.add(expensesField);
		expensesField.setColumns(10);
		
		JLabel revenueLabel = new JLabel("Revenue:");
		revenueLabel.setBounds(6, 181, 61, 16);
		contentPane.add(revenueLabel);
		
		revenuetextField = new JTextField();
		revenuetextField.setBounds(73, 176, 130, 26);
		contentPane.add(revenuetextField);
		revenuetextField.setColumns(10);
		
		JLabel listingNameLabel = new JLabel("Listing Name:");
		listingNameLabel.setBounds(6, 209, 87, 16);
		contentPane.add(listingNameLabel);
		
		listingNameText = new JTextField();
		listingNameText.setBounds(95, 204, 108, 26);
		contentPane.add(listingNameText);
		listingNameText.setColumns(10);
		
		JLabel listingTypeLabel = new JLabel("Listing Type:");
		listingTypeLabel.setBounds(6, 237, 87, 16);
		contentPane.add(listingTypeLabel);
		
		listingTypeText = new JTextField();
		listingTypeText.setBounds(95, 232, 108, 26);
		contentPane.add(listingTypeText);
		listingTypeText.setColumns(10);
		
		JLabel squareLabel = new JLabel("Square Meters:");
		squareLabel.setBounds(6, 265, 98, 16);
		contentPane.add(squareLabel);
		
		squremetText = new JTextField();
		squremetText.setBounds(102, 260, 101, 26);
		contentPane.add(squremetText);
		squremetText.setColumns(10);
		
		
		normalListingRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ownerNameSurnametextField.setEditable(true);
				mailText.setEditable(true);
				incomeField.setEditable(true);
				expensesField.setEditable(true);
				revenuetextField.setEditable(true);
				listingNameText.setEditable(true);
				listingTypeText.setEditable(true);
				squremetText.setEditable(true);
				
			}
		});
		bt.add(normalListingRadioButton_1);
		normalListingRadioButton_1.setBounds(95, 97, 141, 23);
		contentPane.add(normalListingRadioButton_1);
		
		
		medicalListingRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ownerNameSurnametextField.setEditable(true);
				mailText.setEditable(true);
				incomeField.setEditable(true);
				expensesField.setEditable(true);
				revenuetextField.setEditable(true);
				listingNameText.setEditable(true);
				listingTypeText.setEditable(true);
				squremetText.setEditable(false);
			}
		});
		bt.add(medicalListingRadioButton_1);
		medicalListingRadioButton_1.setBounds(270, 97, 141, 23);
		contentPane.add(medicalListingRadioButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 303, 450, 34);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(InformationForAddtextArea_1);
		
		JLabel addingLabel = new JLabel("Add New Record");
		addingLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		addingLabel.setBounds(219, 8, 141, 16);
		contentPane.add(addingLabel);
	}
}


