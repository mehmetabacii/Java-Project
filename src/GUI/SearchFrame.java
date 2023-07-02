package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchFrame extends JFrame {

	private JPanel contentPane;

	MainFrame mf = null;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public SearchFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel searchLabel = new JLabel("Search Record");
		searchLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		searchLabel.setBounds(210, 6, 124, 16);
		contentPane.add(searchLabel);
		
		JLabel listingIdLabel = new JLabel("Listing ID:");
		listingIdLabel.setBounds(18, 43, 82, 16);
		contentPane.add(listingIdLabel);
		
		JComboBox listingIDscomboBox = new JComboBox();
		listingIDscomboBox.setBounds(89, 39, 100, 27);
		contentPane.add(listingIDscomboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 81, 422, 213);
		contentPane.add(scrollPane);
		
		JTextArea listedIdtextArea = new JTextArea();
		scrollPane.setViewportView(listedIdtextArea);
		
		JButton closeSearchButton = new JButton("CLOSE");
		closeSearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainFrame mf = new MainFrame();
				mf.setVisible(true);
			}
		});
		closeSearchButton.setBounds(213, 306, 117, 29);
		contentPane.add(closeSearchButton);
	}
}
