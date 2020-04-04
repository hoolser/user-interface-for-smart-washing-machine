package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class error2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					error2 frame = new error2();
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
	public error2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnOk = new JButton("\u039A\u03B1\u03C4\u03AC\u03BB\u03B1\u03B2\u03B1");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();  //kleinei to paron parathiro.
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnOk, BorderLayout.SOUTH);
		
		JLabel label = new JLabel("\u03A0\u03B1\u03C1\u03B1\u03BA\u03B1\u03BB\u03CE \u03B5\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03BC\u03B9\u03B1 \u03B1\u03C0\u03BF \u03C4\u03B9\u03C2 \u03B4\u03C5\u03BF \u03B5\u03C0\u03B9\u03BB\u03BF\u03B3\u03AD\u03C2 \u03B3\u03B9\u03B1 \u03C4\u03B7\u03BD \u03AD\u03BD\u03C4\u03B1\u03C3\u03B7.");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(label, BorderLayout.CENTER);
	}

}
