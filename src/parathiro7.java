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

public class parathiro7 extends JFrame {
	private JPanel contentPane;
	private ArrayList<String> info;
	JLabel lblclock;
	private int sec2=3; 
	private int min2=0;
	private int hour2=2;
	Thread clock;
	
	public void clock(){
			clock=new Thread(){
				public void run(){
					try {
						for(;;){
						
						if(min2==0 && hour2==0 && sec2==0){
							lblclock.setText(hour2+" h: "+min2+" m: "+sec2--+" s ");
							dispose();  //kleinei to paron parathiro.
							try {
								parathiro9 frame1 = new parathiro9();
								frame1.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
							break;
						}
						if(sec2==-1){
							sec2=59;
							min2-=1;
						}
						if(min2==-1 && hour2!=0){
							min2=59;
							hour2-=1;
						}
						
						lblclock.setText(hour2+" h: "+min2+" m: "+sec2--+" s ");
						Thread.sleep(1000);
						}
					}catch (InterruptedException e){
						Thread.currentThread().interrupt(); // restore interrupted status
					}
				}
			};
			clock.start();
		}
	
	public parathiro7(ArrayList<String> info,int hour, int min, int sec) {
		hour2=hour;
		min2=min;
		sec2=sec;
		this.info=info;
		setBackground(Color.WHITE);
		initialize();
		clock();
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
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 23, 637, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("\u03A0\u03B1\u03CD\u03C3\u03B7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();  //kleinei to paron parathiro.
				try {
					clock.interrupt();
					parathiro8 frame1 = new parathiro8(info,hour2,min2,++sec2);
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(305, 422, 322, 42);
		contentPane.add(btnNewButton);
		
		JLabel titlos = new JLabel("\u03A0\u03BB\u03CD\u03C3\u03B9\u03BC\u03BF \u03C1\u03BF\u03CD\u03C7\u03C9\u03BD.");
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
					clock.interrupt();
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
		
		lblclock = new JLabel("clock");
		lblclock.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblclock.setHorizontalAlignment(SwingConstants.CENTER);
		lblclock.setBounds(10, 208, 617, 124);
		contentPane.add(lblclock);
		
		JLabel lblNewLabel_6 = new JLabel("\u03A7\u03C1\u03CC\u03BD\u03BF\u03C2 \u03B3\u03B9\u03B1 \u03C4\u03AD\u03BB\u03BF\u03C2 \u03C0\u03BB\u03CD\u03C3\u03B7\u03C2:");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel_6.setBounds(10, 150, 617, 79);
		contentPane.add(lblNewLabel_6);
	}
}
