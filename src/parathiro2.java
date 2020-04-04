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
import javax.swing.JProgressBar;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.Button;

public class parathiro2 extends JFrame {
	private JPanel contentPane;
	private JCheckBox checkBox;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2;
	
	public parathiro2() {
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
		
		JLabel lblNewLabel = new JLabel("Έναρξη");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(5, 0, 100, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Λειτουργία");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(105, 0, 100, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ένταση");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setEnabled(false);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(205, 0, 100, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Θερμοκρασία");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setEnabled(false);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(405, 0, 100, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Πρόγραμμα");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setEnabled(false);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(305, 0, 100, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Τέλος");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setEnabled(false);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(505, 0, 100, 25);
		contentPane.add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u039A\u03B1\u03BD\u03BF\u03BD\u03B9\u03BA\u03AE");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(checkBox.isSelected()){
					 checkBox.setSelected(!checkBox.isSelected());
					 
				 }
				 if(checkBox_1.isSelected()){
					 checkBox_1.setSelected(!checkBox_1.isSelected());
				 }
				 if(checkBox_2.isSelected()){
					 checkBox_2.setSelected(!checkBox_2.isSelected());
				 }
			}
		});
		chckbxNewCheckBox.setBackground(new Color(175, 238, 238));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(124, 153, 404, 42);
		contentPane.add(chckbxNewCheckBox);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(105, 0, 1, 25);
		contentPane.add(separator);
		
		JSeparator separator2 = new JSeparator();
		separator2.setForeground(Color.BLACK);
		separator2.setOrientation(SwingConstants.VERTICAL);
		separator2.setBounds(205, 0, 1, 25);
		contentPane.add(separator2);
		
		JSeparator separator3 = new JSeparator();
		separator3.setForeground(Color.BLACK);
		separator3.setOrientation(SwingConstants.VERTICAL);
		separator3.setBounds(305, 0, 1, 25);
		contentPane.add(separator3);
		
		JSeparator separator4 = new JSeparator();
		separator4.setForeground(Color.BLACK);
		separator4.setOrientation(SwingConstants.VERTICAL);
		separator4.setBounds(405, 0, 1, 25);
		contentPane.add(separator4);
		
		JSeparator separator5 = new JSeparator();
		separator5.setForeground(Color.BLACK);
		separator5.setOrientation(SwingConstants.VERTICAL);
		separator5.setBounds(505, 0, 1, 25);
		contentPane.add(separator5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 23, 637, 2);
		contentPane.add(separator_1);
		
		checkBox = new JCheckBox("\u039C\u03B9\u03C3\u03CC \u03C0\u03C1\u03CC\u03B3\u03C1\u03B1\u03BC\u03BC\u03B1");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(chckbxNewCheckBox.isSelected()){
					 chckbxNewCheckBox.setSelected(!chckbxNewCheckBox.isSelected());
				 }
			}
		});
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		checkBox.setBackground(new Color(175, 238, 238));
		checkBox.setBounds(234, 270, 171, 42);
		contentPane.add(checkBox);
		
		checkBox_1 = new JCheckBox("\u039F\u03B9\u03BA\u03BF\u03BD\u03BF\u03BC\u03B9\u03BA\u03CC");
		checkBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(chckbxNewCheckBox.isSelected()){
					 chckbxNewCheckBox.setSelected(!chckbxNewCheckBox.isSelected());
				 }
			}
		});
		checkBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		checkBox_1.setBackground(new Color(175, 238, 238));
		checkBox_1.setBounds(16, 270, 171, 42);
		contentPane.add(checkBox_1);
		
		checkBox_2 = new JCheckBox("\u03A7\u03C9\u03C1\u03AF\u03C2 \u03A3\u03C4\u03CD\u03C8\u03B9\u03BC\u03BF");
		checkBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(chckbxNewCheckBox.isSelected()){
					 chckbxNewCheckBox.setSelected(!chckbxNewCheckBox.isSelected());
				 }
			}
		});
		checkBox_2.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		checkBox_2.setBackground(new Color(175, 238, 238));
		checkBox_2.setBounds(456, 270, 171, 42);
		contentPane.add(checkBox_2);
		
		JButton btnNewButton = new JButton("\u0395\u03C0\u03CC\u03BC\u03B5\u03BD\u03BF");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<String> info = new ArrayList<String>();
				if(chckbxNewCheckBox.isSelected()){
					info.add("Κανονική");
				}
				if(checkBox.isSelected()){
					info.add("Μισό πρόγραμμα");
				}
				if(checkBox_1.isSelected()){
					info.add("Οικονομικό");
				}
				if(checkBox_2.isSelected()){
					info.add("Χωρίς Στύψιμο");
				}
				if(info.size()==0){
					try {
						error1 error = new error1();
						error.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else{
					info.add("||");
					dispose();  //kleinei to paron parathiro.
					try {
						parathiro3 frame1 = new parathiro3( new ArrayList<String>(info) );
						frame1.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(419, 422, 208, 42);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button.addActionListener(new ActionListener() {
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
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(5, 422, 208, 42);
		contentPane.add(button);
		
		JLabel titlos = new JLabel("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03BB\u03B5\u03B9\u03C4\u03BF\u03C5\u03C1\u03B3\u03B9\u03B1/\u03B9\u03B5\u03C2:");
		titlos.setFont(new Font("Tahoma", Font.PLAIN, 21));
		titlos.setHorizontalAlignment(SwingConstants.CENTER);
		titlos.setBounds(5, 31, 632, 42);
		contentPane.add(titlos);
		
		JSeparator separator_center = new JSeparator();
		separator_center.setForeground(Color.LIGHT_GRAY);
		separator_center.setBounds(5, 71, 632, 2);
		contentPane.add(separator_center);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBounds(0, 415, 647, 2);
		contentPane.add(separator_2);
		
		JButton btnNewButton_1 = new JButton("?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					error4 frame1 = new error4();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(592, 34, 45, 39);
		contentPane.add(btnNewButton_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(5, 232, 632, 2);
		contentPane.add(separator_3);
	}
}
