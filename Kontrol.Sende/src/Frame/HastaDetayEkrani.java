import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import Muayene.MuayeneGor;

public class HastaDetayEkrani extends JFrame {

	private JPanel contentPane;
	private JTextField adTxt;
	private JTextField soyadTxt;
	private JTextField tcTxt;
	private JTextField d_tarihiTxt;
	private JTextField telTxt;
	private JTextField emailTxt;
	private JTextField k_adiTxt;
	private JPasswordField k_sifreTxt;
	private JTextField boyTxt;
	private JTextField kronikTxt;
	private JComboBox cinsiyetCb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					HastaDetayEkrani frame = new HastaDetayEkrani();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void gorsel() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 669, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton silBtn_hastaDetay = new JButton("Sil");
		silBtn_hastaDetay.setBounds(5, 5, 123, 25);
		contentPane.add(silBtn_hastaDetay);

		JButton guncelleBtn_hastaDetay = new JButton("G\u00FCncelle");
		guncelleBtn_hastaDetay.setBounds(133, 5, 123, 25);
		contentPane.add(guncelleBtn_hastaDetay);

		JButton btnDlistesiniGr = new JButton("D.Listesini g\u00F6r");
		btnDlistesiniGr.setBounds(261, 5, 113, 25);
		contentPane.add(btnDlistesiniGr);

		JButton muyeneGecmisiBtn = new JButton("Muayene Ge\u00E7mi\u015Fi");
		muyeneGecmisiBtn.setBounds(386, 5, 131, 25);
		muyeneGecmisiBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MuayeneGor a = new MuayeneGor();
				a.setVisible(true);

			}
		});
		contentPane.add(muyeneGecmisiBtn);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 43, 609, 399);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel label = new JLabel("Ad :");
		label.setBounds(68, 1, 24, 16);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(label);

		adTxt = new JTextField();
		adTxt.setBounds(127, 0, 332, 20);
		adTxt.setColumns(10);
		panel_1.add(adTxt);

		JLabel label_1 = new JLabel("Soyad :");
		label_1.setBounds(48, 28, 44, 16);
		panel_1.add(label_1);

		soyadTxt = new JTextField();
		soyadTxt.setBounds(127, 25, 332, 22);
		soyadTxt.setColumns(10);
		panel_1.add(soyadTxt);

		JLabel label_2 = new JLabel("T.c. :");
		label_2.setBounds(61, 55, 31, 16);
		panel_1.add(label_2);

		tcTxt = new JTextField();
		tcTxt.setBounds(127, 52, 332, 22);
		tcTxt.setColumns(10);
		panel_1.add(tcTxt);

		JLabel label_3 = new JLabel("Do\u011Fum Tarihi :");
		label_3.setBounds(6, 82, 86, 16);
		panel_1.add(label_3);

		d_tarihiTxt = new JTextField();
		d_tarihiTxt.setBounds(127, 79, 332, 22);
		d_tarihiTxt.setColumns(10);
		panel_1.add(d_tarihiTxt);

		JLabel label_4 = new JLabel("Adres :");
		label_4.setBounds(50, 116, 42, 16);
		panel_1.add(label_4);

		JTextPane adresTxt = new JTextPane();
		adresTxt.setBounds(127, 106, 332, 36);
		panel_1.add(adresTxt);

		JLabel label_5 = new JLabel("Telefon :");
		label_5.setBounds(40, 150, 52, 16);
		panel_1.add(label_5);

		telTxt = new JTextField();
		telTxt.setBounds(127, 147, 332, 22);
		telTxt.setColumns(10);
		panel_1.add(telTxt);

		JLabel label_6 = new JLabel("Mail Adresi :");
		label_6.setBounds(20, 177, 72, 16);
		panel_1.add(label_6);

		emailTxt = new JTextField();
		emailTxt.setBounds(127, 174, 332, 22);
		emailTxt.setColumns(10);
		panel_1.add(emailTxt);

		JLabel label_7 = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		label_7.setBounds(15, 204, 77, 16);
		panel_1.add(label_7);

		k_adiTxt = new JTextField();
		k_adiTxt.setBounds(127, 201, 332, 22);
		k_adiTxt.setColumns(10);
		panel_1.add(k_adiTxt);

		JLabel label_8 = new JLabel("\u015Eifre :");
		label_8.setBounds(56, 231, 36, 16);
		panel_1.add(label_8);

		k_sifreTxt = new JPasswordField();
		k_sifreTxt.setBounds(127, 228, 332, 22);
		panel_1.add(k_sifreTxt);

		JLabel label_9 = new JLabel("Boy :");
		label_9.setBounds(63, 258, 29, 16);
		panel_1.add(label_9);

		boyTxt = new JTextField();
		boyTxt.setBounds(127, 255, 332, 22);
		boyTxt.setColumns(10);
		panel_1.add(boyTxt);

		JLabel label_10 = new JLabel("Kronik Hastal\u0131k :");
		label_10.setBounds(0, 285, 92, 16);
		panel_1.add(label_10);

		kronikTxt = new JTextField();
		kronikTxt.setBounds(127, 282, 332, 22);
		kronikTxt.setColumns(10);
		panel_1.add(kronikTxt);

		JLabel label_11 = new JLabel("Cinsiyet :");
		label_11.setBounds(19, 309, 53, 30);
		panel_1.add(label_11);

		cinsiyetCb = new JComboBox();
		cinsiyetCb.setBounds(127, 309, 332, 30);
		panel_1.add(cinsiyetCb);

	}

	public HastaDetayEkrani() {
		gorsel();

	}
}
