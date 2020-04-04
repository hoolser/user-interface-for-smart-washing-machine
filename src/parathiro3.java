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

public class parathiro3 extends JFrame {
	
	private JToggleButton tglbtnNewToggleButton_1;
	private JPanel contentPane;
	private ArrayList<String> info;

	public parathiro3(ArrayList<String> info) {
		this.info=info;
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
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("\u0388\u03BD\u03C4\u03BF\u03BD\u03BF \u03C0\u03BB\u03CD\u03C3\u03B9\u03BC\u03BF");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(tglbtnNewToggleButton_1.isSelected()){
					 tglbtnNewToggleButton_1.setSelected(!tglbtnNewToggleButton_1.isSelected());
				 }
			}
		});
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.BOLD, 28));
		tglbtnNewToggleButton.setBounds(10, 97, 300, 110);
		contentPane.add(tglbtnNewToggleButton);
		
		tglbtnNewToggleButton_1 = new JToggleButton("\u0391\u03C0\u03B1\u03BB\u03CC \u03C0\u03BB\u03CD\u03C3\u03B9\u03BC\u03BF");
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(tglbtnNewToggleButton.isSelected()){
					 tglbtnNewToggleButton.setSelected(!tglbtnNewToggleButton.isSelected());
				 }
			}
		});
		tglbtnNewToggleButton_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		tglbtnNewToggleButton_1.setBounds(337, 97, 300, 110);
		contentPane.add(tglbtnNewToggleButton_1);
		
		JLabel lblNewLabel = new JLabel("Έναρξη");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(5, 0, 100, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Λειτουργία");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(105, 0, 100, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ένταση");
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
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
		
		JButton btnNewButton = new JButton("\u0395\u03C0\u03CC\u03BC\u03B5\u03BD\u03BF");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!tglbtnNewToggleButton_1.isSelected() && !tglbtnNewToggleButton.isSelected()){
					try {
						error2 error = new error2();
						error.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else{
					if(tglbtnNewToggleButton.isSelected()){
						info.add("Έντονο");
						info.add("||");
						dispose();  //kleinei to paron parathiro.
						try {
							parathiro4a frame1 = new parathiro4a( new ArrayList<String>(info) );
							frame1.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}else{
						info.add("Απαλό");
						info.add("||");
						dispose();  //kleinei to paron parathiro.
						try {
							parathiro4b frame1 = new parathiro4b( new ArrayList<String>(info) );
							frame1.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
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
					parathiro2 frame1 = new parathiro2();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(205, 422, 208, 42);
		contentPane.add(button);
		
		JLabel titlos = new JLabel("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03AD\u03BD\u03C4\u03B1\u03C3\u03B7:");
		titlos.setFont(new Font("Tahoma", Font.PLAIN, 21));
		titlos.setHorizontalAlignment(SwingConstants.CENTER);
		titlos.setBounds(5, 31, 632, 42);
		contentPane.add(titlos);
		
		JSeparator separator_center = new JSeparator();
		separator_center.setForeground(Color.LIGHT_GRAY);
		separator_center.setBounds(5, 71, 632, 2);
		contentPane.add(separator_center);
		
		JLabel lblNewLabel_6 = new JLabel("-\u0392\u03B9\u03BF\u03BB\u03BF\u03B3\u03B9\u03BA\u03CC");
		lblNewLabel_6.setBounds(10, 218, 295, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel label = new JLabel("-\u03A0\u03BF\u03BB\u03CD \u03BB\u03B5\u03C1\u03C9\u03BC\u03AD\u03BD\u03B1");
		label.setBounds(10, 243, 295, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("-\u039A\u03B1\u03BD\u03BF\u03BD\u03B9\u03BA\u03AE \u03C0\u03BB\u03CD\u03C3\u03B7");
		label_1.setBounds(10, 268, 295, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("-\u0393\u03C1\u03AE\u03B3\u03BF\u03C1\u03BF \u03B3\u03B9\u03B1 \u03C7\u03C1\u03C9\u03BC\u03B1\u03C4\u03B9\u03C3\u03C4\u03AC");
		label_2.setBounds(10, 293, 295, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("-\u038C\u03C7\u03B9 \u03B3\u03C1\u03AE\u03B3\u03BF\u03C1\u03BF \u03B3\u03B9\u03B1 \u03C7\u03C1\u03C9\u03BC\u03B1\u03C4\u03B9\u03C3\u03C4\u03AC");
		label_3.setBounds(10, 318, 295, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("-\u0394\u03C5\u03BD\u03B1\u03C4\u03CC \u03BE\u03AD\u03C0\u03BB\u03C5\u03BC\u03B1");
		label_4.setBounds(10, 343, 295, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("-\u0395\u03B9\u03B4\u03B9\u03BA\u03AE \u03BC\u03B5\u03C4\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7");
		label_5.setBounds(10, 368, 295, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("-\u0388\u03BD\u03C4\u03BF\u03BD\u03B5\u03C2 \u03A3\u03C4\u03C1\u03BF\u03C6\u03AD\u03C2");
		label_6.setBounds(10, 393, 295, 14);
		contentPane.add(label_6);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBounds(0, 415, 647, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_7 = new JLabel("-\u03A0\u03C1\u03CC\u03C0\u03BB\u03C5\u03C3\u03B7");
		lblNewLabel_7.setBounds(337, 218, 280, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel label_7 = new JLabel("-\u03A3\u03C5\u03BD\u03B8\u03B5\u03C4\u03B9\u03BA\u03AC");
		label_7.setBounds(337, 243, 280, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("-\u039C\u03AC\u03BB\u03BB\u03B9\u03BD\u03B1");
		label_8.setBounds(337, 268, 280, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("-\u039C\u03B5\u03C4\u03B1\u03BE\u03C9\u03C4\u03AC");
		label_9.setBounds(337, 293, 280, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("-\u0386\u03C3\u03C0\u03C1\u03B1 \u03C3\u03C5\u03BD\u03B8\u03B5\u03C4\u03B9\u03BA\u03AC");
		label_10.setBounds(337, 318, 280, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("-\u0391\u03C0\u03B1\u03BB\u03CC \u03BE\u03AD\u03C0\u03BB\u03C5\u03BC\u03B1");
		label_11.setBounds(337, 343, 280, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("-\u0395\u03B9\u03B4\u03B7\u03BA\u03AE \u03BC\u03B5\u03C4\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7");
		label_12.setBounds(337, 368, 280, 14);
		contentPane.add(label_12);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.LIGHT_GRAY);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(10, 205, 1, 212);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.LIGHT_GRAY);
		separator_4.setBounds(337, 201, 1, 216);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.LIGHT_GRAY);
		separator_5.setBounds(636, 205, 1, 212);
		contentPane.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setForeground(Color.LIGHT_GRAY);
		separator_6.setBounds(309, 205, 1, 212);
		contentPane.add(separator_6);
		
		JButton button_1 = new JButton("\u0391\u03BA\u03CD\u03C1\u03C9\u03C3\u03B7");
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
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBounds(10, 422, 95, 42);
		contentPane.add(button_1);
		
		JButton btnNewButton_1 = new JButton("?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					error5 frame1 = new error5();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(592, 34, 45, 39);
		contentPane.add(btnNewButton_1);
	}
}
