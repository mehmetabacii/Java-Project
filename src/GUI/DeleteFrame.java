package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteFrame extends JFrame {

	private JPanel contentPane;
	MainFrame mf = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteFrame frame = new DeleteFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DeleteFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel deleteLabel = new JLabel("Delete Record");
		deleteLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		deleteLabel.setBounds(212, 6, 113, 16);
		contentPane.add(deleteLabel);
		
		JLabel listingIdForDeleteLabel = new JLabel("Listing ID:");
		listingIdForDeleteLabel.setBounds(67, 47, 65, 16);
		contentPane.add(listingIdForDeleteLabel);
		
		JComboBox listingIdForDeletecomboBox = new JComboBox();
		listingIdForDeletecomboBox.setBounds(144, 43, 113, 27);
		contentPane.add(listingIdForDeletecomboBox);
		
		JButton deleteButton = new JButton("Delete This Record");
		deleteButton.setBounds(281, 42, 146, 29);
		contentPane.add(deleteButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(59, 85, 420, 27);
		contentPane.add(scrollPane);
		
		JTextArea deleteInfotextArea = new JTextArea();
		scrollPane.setViewportView(deleteInfotextArea);
		
		JButton displayDeletedObjectButton = new JButton("Display Deleted Record");
		displayDeletedObjectButton.setBounds(132, 134, 257, 29);
		contentPane.add(displayDeletedObjectButton);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(82, 184, 374, 51);
		contentPane.add(scrollPane_1);
		
		JTextArea deletedRecordInfotextArea = new JTextArea();
		scrollPane_1.setViewportView(deletedRecordInfotextArea);
		
		JButton closeForDeleteFrameButton = new JButton("CLOSE");
		closeForDeleteFrameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainFrame mf = new MainFrame();
				mf.setVisible(true);
				
			}
		});
		closeForDeleteFrameButton.setBounds(210, 260, 117, 29);
		contentPane.add(closeForDeleteFrameButton);
	}

}
