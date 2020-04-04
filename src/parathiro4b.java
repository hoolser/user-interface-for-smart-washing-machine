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

public class parathiro4b extends JFrame {
	private JToggleButton tglbtnNewToggleButton;
	private JToggleButton toggleButton;
	private JToggleButton toggleButton_1;
	private JToggleButton toggleButton_2;
	private JToggleButton toggleButton_3;
	private JToggleButton toggleButton_4;
	private JToggleButton toggleButton_5;
	private JToggleButton toggleButton_6;
	private JPanel contentPane;
	private ArrayList<String> info;
	
	public parathiro4b(ArrayList<String> info) {
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
		lblNewLabel_2.setEnabled(false);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
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
		lblNewLabel_4.setForeground(new Color(139, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
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
				if(!tglbtnNewToggleButton.isSelected() && !toggleButton.isSelected() && !toggleButton_1.isSelected() && !toggleButton_2.isSelected() && !toggleButton_3.isSelected() && !toggleButton_4.isSelected() && !toggleButton_5.isSelected() ){
					try {
						error3 error = new error3();
						error.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else{
					if(tglbtnNewToggleButton.isSelected()){
						info.add("Πρόπλυση");
					}else if(toggleButton.isSelected()){
						info.add("Συνθετικά");
					}else if(toggleButton_1.isSelected()){
						info.add("Μάλλινα");
					}else if(toggleButton_2.isSelected()){
						info.add("Μεταξωτά");
					}else if(toggleButton_3.isSelected()){
						info.add("’σπρα συνθετικά");
					}else if(toggleButton_4.isSelected()){
						info.add("Απαλό ξέπλυμα");
					}else if(toggleButton_5.isSelected()){
						info.add("Ειδηκή μεταχείριση");
					}
					info.add("||");
					dispose();  //kleinei to paron parathiro.
					try {
						parathiro5 frame1 = new parathiro5( new ArrayList<String>(info) );
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
					info.remove(info.size()-1);
					for(int i=info.size()-1; i>=0; i--){
						if(!info.get(i).equals("||")){
							info.remove(i);
						}else{
							break;
						}
					}
					parathiro3 frame1 = new parathiro3(info);
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(205, 422, 208, 42);
		contentPane.add(button);
		
		JLabel titlos = new JLabel("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03C0\u03C1\u03CC\u03B3\u03C1\u03B1\u03BC\u03BC\u03B1:");
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
		
		tglbtnNewToggleButton = new JToggleButton("\u03A0\u03C1\u03CC\u03C0\u03BB\u03C5\u03C3\u03B7");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(toggleButton.isSelected()){
					 toggleButton.setSelected(!toggleButton.isSelected());
					 
				 }
				 if(toggleButton_1.isSelected()){
					 toggleButton_1.setSelected(!toggleButton_1.isSelected());
				 }
				 if(toggleButton_2.isSelected()){
					 toggleButton_2.setSelected(!toggleButton_2.isSelected());
				 }
				 if(toggleButton_3.isSelected()){
					 toggleButton_3.setSelected(!toggleButton_3.isSelected());
				 }
				 if(toggleButton_4.isSelected()){
					 toggleButton_4.setSelected(!toggleButton_4.isSelected());
				 }
				 if(toggleButton_5.isSelected()){
					 toggleButton_5.setSelected(!toggleButton_5.isSelected());
				 }
				 
			}
		});
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		tglbtnNewToggleButton.setBounds(5, 84, 622, 30);
		contentPane.add(tglbtnNewToggleButton);
		
		toggleButton = new JToggleButton("\u03A3\u03C5\u03BD\u03B8\u03B5\u03C4\u03B9\u03BA\u03AC");
		toggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(tglbtnNewToggleButton.isSelected()){
					 tglbtnNewToggleButton.setSelected(!tglbtnNewToggleButton.isSelected());
				 }
				 if(toggleButton_1.isSelected()){
					 toggleButton_1.setSelected(!toggleButton_1.isSelected());
				 }
				 if(toggleButton_2.isSelected()){
					 toggleButton_2.setSelected(!toggleButton_2.isSelected());
				 }
				 if(toggleButton_3.isSelected()){
					 toggleButton_3.setSelected(!toggleButton_3.isSelected());
				 }
				 if(toggleButton_4.isSelected()){
					 toggleButton_4.setSelected(!toggleButton_4.isSelected());
				 }
				 if(toggleButton_5.isSelected()){
					 toggleButton_5.setSelected(!toggleButton_5.isSelected());
				 }
				 
			}
		});
		toggleButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton.setBounds(5, 125, 622, 30);
		contentPane.add(toggleButton);
		
		toggleButton_1 = new JToggleButton("\u039C\u03AC\u03BB\u03BB\u03B9\u03BD\u03B1");
		toggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(toggleButton.isSelected()){
					 toggleButton.setSelected(!toggleButton.isSelected());
					 
				 }
				 if(tglbtnNewToggleButton.isSelected()){
					 tglbtnNewToggleButton.setSelected(!tglbtnNewToggleButton.isSelected());
				 }
				 if(toggleButton_2.isSelected()){
					 toggleButton_2.setSelected(!toggleButton_2.isSelected());
				 }
				 if(toggleButton_3.isSelected()){
					 toggleButton_3.setSelected(!toggleButton_3.isSelected());
				 }
				 if(toggleButton_4.isSelected()){
					 toggleButton_4.setSelected(!toggleButton_4.isSelected());
				 }
				 if(toggleButton_5.isSelected()){
					 toggleButton_5.setSelected(!toggleButton_5.isSelected());
				 }
				
			}
		});
		toggleButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_1.setBounds(5, 166, 622, 30);
		contentPane.add(toggleButton_1);
		
		toggleButton_2 = new JToggleButton("\u039C\u03B5\u03C4\u03B1\u03BE\u03C9\u03C4\u03AC");
		toggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(toggleButton.isSelected()){
					 toggleButton.setSelected(!toggleButton.isSelected());
				 }
				 if(tglbtnNewToggleButton.isSelected()){
					 tglbtnNewToggleButton.setSelected(!tglbtnNewToggleButton.isSelected());
				 }
				 if(toggleButton_1.isSelected()){
					 toggleButton_1.setSelected(!toggleButton_1.isSelected());
				 }
				 if(toggleButton_3.isSelected()){
					 toggleButton_3.setSelected(!toggleButton_3.isSelected());
				 }
				 if(toggleButton_4.isSelected()){
					 toggleButton_4.setSelected(!toggleButton_4.isSelected());
				 }
				 if(toggleButton_5.isSelected()){
					 toggleButton_5.setSelected(!toggleButton_5.isSelected());
				 }
			}
		});
		toggleButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_2.setBounds(5, 207, 622, 30);
		contentPane.add(toggleButton_2);
		
		toggleButton_3 = new JToggleButton("\u0386\u03C3\u03C0\u03C1\u03B1 \u03C3\u03C5\u03BD\u03B8\u03B5\u03C4\u03B9\u03BA\u03AC");
		toggleButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(toggleButton.isSelected()){
					 toggleButton.setSelected(!toggleButton.isSelected());
				 }
				 if(tglbtnNewToggleButton.isSelected()){
					 tglbtnNewToggleButton.setSelected(!tglbtnNewToggleButton.isSelected());
				 }
				 if(toggleButton_1.isSelected()){
					 toggleButton_1.setSelected(!toggleButton_1.isSelected());
				 }
				 if(toggleButton_2.isSelected()){
					 toggleButton_2.setSelected(!toggleButton_2.isSelected());
				 }
				 if(toggleButton_4.isSelected()){
					 toggleButton_4.setSelected(!toggleButton_4.isSelected());
				 }
				 if(toggleButton_5.isSelected()){
					 toggleButton_5.setSelected(!toggleButton_5.isSelected());
				 }
			}
		});
		toggleButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_3.setBounds(5, 248, 622, 30);
		contentPane.add(toggleButton_3);
		
		toggleButton_4 = new JToggleButton("\u0391\u03C0\u03B1\u03BB\u03CC \u03BE\u03AD\u03C0\u03BB\u03C5\u03BC\u03B1");
		toggleButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(toggleButton.isSelected()){
					 toggleButton.setSelected(!toggleButton.isSelected());
				 }
				 if(tglbtnNewToggleButton.isSelected()){
					 tglbtnNewToggleButton.setSelected(!tglbtnNewToggleButton.isSelected());
				 }
				 if(toggleButton_1.isSelected()){
					 toggleButton_1.setSelected(!toggleButton_1.isSelected());
				 }
				 if(toggleButton_2.isSelected()){
					 toggleButton_2.setSelected(!toggleButton_2.isSelected());
				 }
				 if(toggleButton_3.isSelected()){
					 toggleButton_3.setSelected(!toggleButton_3.isSelected());
				 }
				 if(toggleButton_5.isSelected()){
					 toggleButton_5.setSelected(!toggleButton_5.isSelected());
				 }
				
			}
		});
		toggleButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_4.setBounds(5, 289, 622, 30);
		contentPane.add(toggleButton_4);
		
		toggleButton_5 = new JToggleButton("\u0395\u03B9\u03B4\u03B7\u03BA\u03AE \u03BC\u03B5\u03C4\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7");
		toggleButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(toggleButton.isSelected()){
					 toggleButton.setSelected(!toggleButton.isSelected());
				 }
				 if(tglbtnNewToggleButton.isSelected()){
					 tglbtnNewToggleButton.setSelected(!tglbtnNewToggleButton.isSelected());
				 }
				 if(toggleButton_1.isSelected()){
					 toggleButton_1.setSelected(!toggleButton_1.isSelected());
				 }
				 if(toggleButton_2.isSelected()){
					 toggleButton_2.setSelected(!toggleButton_2.isSelected());
				 }
				 if(toggleButton_3.isSelected()){
					 toggleButton_3.setSelected(!toggleButton_3.isSelected());
				 }
				 if(toggleButton_4.isSelected()){
					 toggleButton_4.setSelected(!toggleButton_4.isSelected());
				 }
			
			}
		});
		toggleButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_5.setBounds(5, 330, 622, 30);
		contentPane.add(toggleButton_5);
		
		JButton btnNewButton_1 = new JButton("?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					error6b frame1 = new error6b();
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
