package GUI;
import SystemClassAndMain.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SystemClassAndMain.ListingSys;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	SearchFrame sh =  new SearchFrame();
	private JTextArea textArea;
	AddFrame af = new AddFrame();
	
	DeleteFrame df = new DeleteFrame();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleOfSystem = new JLabel("VET PANEL SYSTEM");
		titleOfSystem.setBounds(178, 6, 150, 16);
		titleOfSystem.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		contentPane.add(titleOfSystem);
		
		JButton addButton = new JButton("ADD NEW RECORD");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				af.setVisible(true);
				setVisible(false);
			}
		});
		addButton.setBounds(178, 34, 150, 29);
		contentPane.add(addButton);
		
		JButton searchButton = new JButton("SEARCH RECORD");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sh.setVisible(true);
				setVisible(false);
				
			}
		});
		searchButton.setBounds(23, 280, 139, 29);
		contentPane.add(searchButton);
		
		JButton deleteButton = new JButton("DELETE RECORD");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				df.setVisible(true);
				setVisible(false);
			}
		});
		deleteButton.setBounds(368, 280, 139, 29);
		contentPane.add(deleteButton);
		
		JButton displayButton = new JButton("DISPLAY ALL RECORDS");
		displayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ListingSys.getListingSet().isEmpty()) {
					textArea.setText("array is empty no records");
				}else {
					textArea.setText(ListingSys.displayAll());
				}
			}
		});
		displayButton.setBounds(178, 280, 178, 29);
		contentPane.add(displayButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 64, 443, 204);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
