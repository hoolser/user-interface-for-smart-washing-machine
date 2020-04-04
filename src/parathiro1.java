package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class parathiro1 extends JFrame {
	
	JLabel lblclock;
	private JPanel contentPane;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					parathiro1 frame = new parathiro1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void clock(){
		
		Thread clock=new Thread(){
			public void run(){
				try {
					for(;;){
					Calendar cal= new GregorianCalendar();
					int day=cal.get(Calendar.DAY_OF_MONTH);
					int monnth=cal.get(Calendar.MONTH);
					int year=cal.get(Calendar.YEAR);
					int sec=cal.get(Calendar.SECOND);
					int min=cal.get(Calendar.MINUTE);
					int hour=cal.get(Calendar.HOUR);
					lblclock.setText("øÒ· "+hour+":"+min+":"+sec+"\n"+" - «Ï/Ìﬂ· "+day+":"+(monnth+1)+":"+year);
					Thread.sleep(1000);
					}
				}catch (InterruptedException e){
					Thread.currentThread().interrupt(); // restore interrupted status
				}
			}
		};
		
		clock.start();
		
	}
	
	public parathiro1() {
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
		lblclock = new JLabel("clock");
		lblclock.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblclock.setHorizontalAlignment(SwingConstants.CENTER);
		lblclock.setBounds(10, 122, 617, 124);
		contentPane.add(lblclock);
		btnNewButton = new JButton("≈Õ¡—Œ«");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();  //kleinei to paron parathiro.
				try {
					parathiro2 frame2 = new parathiro2();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(10, 312, 617, 142);
		contentPane.add(btnNewButton);
	}
}
