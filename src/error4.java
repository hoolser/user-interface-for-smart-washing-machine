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

public class error4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public error4() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 536, 418);
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
		
		JLabel lblhelloWorldblahblahblah = new JLabel("<html><b><center>\u0392\u03BF\u03AE\u03B8\u03B5\u03B9\u03B1:</center></b>\r\n<br/><br/>\u03A3\u03B5 \u03B1\u03C5\u03C4\u03CC \u03C4\u03BF \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF \u03BA\u03B1\u03BB\u03B5\u03AF\u03C3\u03C4\u03B5 \u03BD\u03B1 \u03B5\u03C0\u03B9\u03BB\u03AD\u03BE\u03B5\u03C4\u03B5 \u03B5\u03AF\u03C4\u03B5 \u03C4\u03B7\u03BD \u03BA\u03B1\u03BD\u03BF\u03BD\u03B9\u03BA\u03AE \u03BB\u03B5\u03B9\u03C4\u03BF\u03C5\u03C1\u03B3\u03B9\u03AC, \u03AE \u03BA\u03AC\u03C0\u03BF\u03B9\u03BF \u03C3\u03C5\u03BD\u03B4\u03C5\u03B1\u03C3\u03BC\u03CC \u03B1\u03C0\u03CC \u03C4\u03B9\u03C2 \u03AC\u03BB\u03BB\u03B5\u03C2 \u03BB\u03B5\u03B9\u03C4\u03BF\u03C5\u03C1\u03B3\u03AF\u03B5\u03C2.\r\n<br/><br/>\u03A3\u03C5\u03B3\u03BA\u03B5\u03BA\u03C1\u03B9\u03BC\u03AD\u03BD\u03B1 \u03BF\u03B9 \u03BB\u03B5\u03B9\u03C4\u03BF\u03C5\u03C1\u03B3\u03AF\u03B5\u03C2 \u03B5\u03AF\u03BD\u03B1\u03B9 \u03BF\u03B9 \u03C0\u03B1\u03C1\u03B1\u03BA\u03AC\u03C4\u03C9:\r\n<br/>-<u>\u039A\u03B1\u03BD\u03BF\u03BD\u03B9\u03BA\u03AE:</u> \u03B7 \u03B1\u03C0\u03BB\u03AE \u03BB\u03B5\u03B9\u03C4\u03BF\u03C5\u03C1\u03B3\u03B9\u03AC \u03C4\u03BF\u03C5 \u03C0\u03BB\u03C5\u03BD\u03C4\u03B7\u03C1\u03AF\u03BF\u03C5.\r\n<br/>-<u>\u039F\u03B9\u03BA\u03BF\u03BD\u03BF\u03BC\u03B9\u03BA\u03CC:</u> \u03C7\u03B1\u03BC\u03B7\u03BB\u03AE \u03BA\u03B1\u03C4\u03B1\u03BD\u03AC\u03BB\u03C9\u03C3\u03B7 \u03C1\u03B5\u03CD\u03BC\u03B1\u03C4\u03BF\u03C2.\r\n<br/>-<u>\u039C\u03B9\u03C3\u03CC \u03C0\u03C1\u03CC\u03B3\u03C1\u03B1\u03BC\u03BC\u03B1:</u> \u03B3\u03B9\u03B1 \u03C0\u03BB\u03CD\u03C3\u03B7 \u03BB\u03AF\u03B3\u03C9\u03BD \u03C1\u03BF\u03CD\u03C7\u03C9\u03BD.\r\n<br/>-<u>\u03A7\u03C9\u03C1\u03AF\u03C2 \u03C3\u03C4\u03CD\u03C8\u03B9\u03BC\u03BF:</u> \u03BC\u03CC\u03BB\u03B9\u03C2 \u03C4\u03B5\u03BB\u03B5\u03B9\u03CE\u03C3\u03B5\u03B9 \u03C4\u03BF \u03BE\u03AD\u03C0\u03BB\u03C5\u03BC\u03B1 \u03B4\u03B5\u03BD \u03C0\u03C1\u03B1\u03B3\u03BC\u03B1\u03C4\u03BF\u03C0\u03BF\u03B9\u03B5\u03AF\u03C4\u03B1\u03B9  \u03C3\u03C4\u03CD\u03C8\u03B9\u03BC\u03BF.\r\n</html>");
		lblhelloWorldblahblahblah.setHorizontalAlignment(SwingConstants.CENTER);
		lblhelloWorldblahblahblah.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblhelloWorldblahblahblah, BorderLayout.CENTER);
	}

}
