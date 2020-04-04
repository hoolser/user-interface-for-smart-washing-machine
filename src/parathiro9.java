package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.Button;

public class parathiro9 extends JFrame {
	private JPanel contentPane;

	public parathiro9() {
		setBackground(Color.WHITE);
		initialize();
	}

	/**
	 * Create the frame.
	 */
	private void initialize() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 504);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator_center = new JSeparator();
		separator_center.setForeground(Color.LIGHT_GRAY);
		separator_center.setBounds(0, 65, 647, 2);
		contentPane.add(separator_center);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBounds(0, 397, 647, 2);
		contentPane.add(separator_2);
		
		JButton button_1 = new JButton("\u0395\u03BD\u03C4\u03AC\u03BE\u03B5\u03B9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();  //kleinei to paron parathiro.
				try {
					parathiro1 frame1 = new parathiro1();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		button_1.setBounds(61, 410, 517, 54);
		contentPane.add(button_1);
		
		JLabel lblNewLabel_6 = new JLabel("\u03A4\u03BF \u03C0\u03BB\u03CD\u03C3\u03B9\u03BC\u03BF \u03C4\u03B5\u03BB\u03B5\u03AF\u03C9\u03C3\u03B5.");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel_6.setBounds(10, 171, 617, 95);
		contentPane.add(lblNewLabel_6);
		

	}
}
