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
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.Button;

public class parathiro5 extends JFrame {
	private JPanel contentPane;
	private ArrayList<String> info;
	private int Temprature;

	public parathiro5(ArrayList<String> info) {
		this.info=info;
		setBackground(Color.WHITE);
		initialize();
		
	}

	/**
	 * Create the frame.
	 */
	private void initialize() {
		if(info.size()>2){
			if(info.get(info.size()-2).equals("Πρόπλυση") || info.get(info.size()-2).equals("Συνθετικά") || info.get(info.size()-2).equals("Γρήγορο για χρωματιστά") ){
				this.Temprature=60;
			}else if(info.get(info.size()-2).equals("Βιολογικό") || info.get(info.size()-2).equals("Πολύ λερωμένα") || info.get(info.size()-2).equals("Κανονική πλύση") ){
				this.Temprature=90;
			}else if(info.get(info.size()-2).equals("Όχι γρήγορο για χρωματιστά") || info.get(info.size()-2).equals("’σπρα συνθετικά")  ){
				this.Temprature=40;
			}else{
				this.Temprature=35;
			}
		}else{
			this.Temprature=35;
		}
		
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
		lblNewLabel_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
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
				info.add(Temprature+"");
				dispose();  //kleinei to paron parathiro.
				try {
					parathiro6 frame1 = new parathiro6( new ArrayList<String>(info) );
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
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
					String str;
					info.remove(info.size()-1);
					int i=0;
					for( i=info.size()-1; i>=0; i--){
						if(!info.get(i).equals("||")){
							str=info.remove(i);
						}else{
							break;
						}
					}
					if(info.get(i-1).equals("Απαλό")){
						parathiro4b frame1 = new parathiro4b(info);
						frame1.setVisible(true);
					}else if(info.get(i-1).equals("Έντονο")){
						parathiro4a frame1 = new parathiro4a(info);
						frame1.setVisible(true);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(205, 422, 208, 42);
		contentPane.add(button);
		
		JLabel titlos = new JLabel("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03B8\u03B5\u03C1\u03BC\u03BF\u03BA\u03C1\u03B1\u03C3\u03AF\u03B1:");
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
		
		JLabel temprature = new JLabel("\u03A0\u03C1\u03BF\u03B5\u03C0\u03B9\u03BB\u03B5\u03B3\u03BC\u03AD\u03BD\u03B7 \u03B8\u03B5\u03C1\u03BC\u03BF\u03BA\u03C1\u03B1\u03C3\u03AF\u03B1 \u03C0\u03C1\u03BF\u03B3\u03C1\u03AC\u03BC\u03BC\u03B1\u03C4\u03BF\u03C2: "+ Temprature +" C");
		temprature.setFont(new Font("Tahoma", Font.PLAIN, 19));
		temprature.setHorizontalAlignment(SwingConstants.CENTER);
		temprature.setBounds(10, 102, 627, 138);
		contentPane.add(temprature);
		
		JButton change_temprature = new JButton("\u0391\u03BB\u03BB\u03B1\u03B3\u03AE \u03C0\u03C1\u03BF\u03B5\u03C0\u03B9\u03BB\u03B5\u03B3\u03BC\u03AD\u03BD\u03B7\u03C2 \u03B8\u03B5\u03C1\u03BC\u03BF\u03BA\u03C1\u03B1\u03C3\u03AF\u03B1\u03C2");
		change_temprature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();  //kleinei to paron parathiro
				try {
					info.add(Temprature+"");
					set_temp frame1 = new set_temp(info);
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		change_temprature.setFont(new Font("Tahoma", Font.PLAIN, 15));
		change_temprature.setBounds(56, 324, 522, 80);
		contentPane.add(change_temprature);
	}
}
