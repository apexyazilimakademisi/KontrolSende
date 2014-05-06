package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import Dao.BesinDAO;
import Dao.DiyetDAO;
import Dao.HastaDAO;
import Dao.MuayeneDAO;
import Pojo.DiyetListesiBesin;
import Pojo.Hasta;
import Pojo.Muayene;

public class YeniKayit extends JFrame {

	private JPanel contentPane;
	private JTextField adTxt;
	private JTextField soyadTxt;
	private JTextField tcTxt;
	private JTextField d_tarihiTxt;
	private JTextField telefonTxt;
	private JTextField emailTxt;
	private JTextField k_adiTxt;
	private JTextField kiloTxt;
	private JTextField y_oraniTxt;
	private JTextField k_sekeriTxt;
	private JTable ogunListesiTable;
	private JTextField boyTxt;
	private JTextField tiroitTxt;
	private JTextField tshTxt;
	private JTextField insulinTxt;
	private JTextField ogttTxt;
	private JTextField t_kolestrolTxt;
	private JTextField trigliseritTxt;
	private JTextField ldlTxt;
	private JTextField hdlTxt;
	private JTextField urikasitTxt;
	private JTextField kortizolTxt;
	private JTextField a_fosfatazTxt;
	private JTextField ggtTxt;
	private JTextField sgptTxt;
	private JTextField sgotTxt;
	private JTextField acthTxt;
	private JTextField ferritinTxt;
	private JTextField fshTxt;
	private JTextField lhTxt;
	private JTextField testosteronTxt;
	private JTextField prolaktinTxt;
	private JTextField homosisteinTxt;
	private JTextField crpTxt;
	private JTextField intoleransTxt;
	private JTextField besinaraTxt;
	private JTextField tarihTxt;
	private final DefaultTableModel model = new DefaultTableModel();
	private JTextField k_hastalikTxt;
	private JPasswordField k_sifreTxt;
	private JTextPane adresTxt;
	private JList besinAraList;
	private JComboBox ogunlerCbox;
	private JButton listeleBtn;
	private JButton düzenleBtn_diyetlistesi;
	private JButton k_tamamlaBtn;

	// ///////////
	private final DefaultTableModel tablemodel = new DefaultTableModel();
	private final DefaultListModel listmodel = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	MuayeneDAO mdao = new MuayeneDAO();
	HastaDAO hdao = new HastaDAO();
	DiyetDAO ddao = new DiyetDAO();
	BesinDAO bdao = new BesinDAO();
	Muayene muayene = new Muayene();
	DiyetListesiBesin dl = new DiyetListesiBesin();

	int idHasta = -1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					YeniKayit frame = new YeniKayit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void gorsel() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 696, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		final JTabbedPane kisiselbilgiTpane = new JTabbedPane(
				SwingConstants.TOP);
		kisiselbilgiTpane.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		contentPane.add(kisiselbilgiTpane, BorderLayout.CENTER);

		JPanel panel_kisiselBilgi = new JPanel();
		kisiselbilgiTpane.addTab("Kiþisel Bilgiler", null, panel_kisiselBilgi,
				null);
		GridBagLayout gbl_panel_kisiselBilgi = new GridBagLayout();
		gbl_panel_kisiselBilgi.columnWidths = new int[] { 0, 0, 0, 145, 0 };
		gbl_panel_kisiselBilgi.rowHeights = new int[] { 0, 0, 0, 0, 57, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_kisiselBilgi.columnWeights = new double[] { 0.0, 0.0, 1.0,
				0.0, Double.MIN_VALUE };
		gbl_panel_kisiselBilgi.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
				1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				Double.MIN_VALUE };
		panel_kisiselBilgi.setLayout(gbl_panel_kisiselBilgi);

		JLabel adLbl = new JLabel("Ad :");
		adLbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_adLbl = new GridBagConstraints();
		gbc_adLbl.anchor = GridBagConstraints.EAST;
		gbc_adLbl.insets = new Insets(0, 0, 5, 5);
		gbc_adLbl.gridx = 0;
		gbc_adLbl.gridy = 0;
		panel_kisiselBilgi.add(adLbl, gbc_adLbl);

		adTxt = new JTextField();
		GridBagConstraints gbc_adTxt = new GridBagConstraints();
		gbc_adTxt.insets = new Insets(0, 0, 5, 5);
		gbc_adTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_adTxt.gridx = 2;
		gbc_adTxt.gridy = 0;
		panel_kisiselBilgi.add(adTxt, gbc_adTxt);
		adTxt.setColumns(10);

		JLabel soyadLbl = new JLabel("Soyad :");
		GridBagConstraints gbc_soyadLbl = new GridBagConstraints();
		gbc_soyadLbl.anchor = GridBagConstraints.EAST;
		gbc_soyadLbl.insets = new Insets(0, 0, 5, 5);
		gbc_soyadLbl.gridx = 0;
		gbc_soyadLbl.gridy = 1;
		panel_kisiselBilgi.add(soyadLbl, gbc_soyadLbl);

		soyadTxt = new JTextField();
		GridBagConstraints gbc_soyadTxt = new GridBagConstraints();
		gbc_soyadTxt.insets = new Insets(0, 0, 5, 5);
		gbc_soyadTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_soyadTxt.gridx = 2;
		gbc_soyadTxt.gridy = 1;
		panel_kisiselBilgi.add(soyadTxt, gbc_soyadTxt);
		soyadTxt.setColumns(10);

		JLabel tcLbl = new JLabel("T.c. :");
		GridBagConstraints gbc_tcLbl = new GridBagConstraints();
		gbc_tcLbl.anchor = GridBagConstraints.EAST;
		gbc_tcLbl.insets = new Insets(0, 0, 5, 5);
		gbc_tcLbl.gridx = 0;
		gbc_tcLbl.gridy = 2;
		panel_kisiselBilgi.add(tcLbl, gbc_tcLbl);

		tcTxt = new JTextField();
		GridBagConstraints gbc_tcTxt = new GridBagConstraints();
		gbc_tcTxt.insets = new Insets(0, 0, 5, 5);
		gbc_tcTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tcTxt.gridx = 2;
		gbc_tcTxt.gridy = 2;
		panel_kisiselBilgi.add(tcTxt, gbc_tcTxt);
		tcTxt.setColumns(10);

		JLabel d_tarihiLbl = new JLabel("Doðum Tarihi :");
		GridBagConstraints gbc_d_tarihiLbl = new GridBagConstraints();
		gbc_d_tarihiLbl.anchor = GridBagConstraints.EAST;
		gbc_d_tarihiLbl.insets = new Insets(0, 0, 5, 5);
		gbc_d_tarihiLbl.gridx = 0;
		gbc_d_tarihiLbl.gridy = 3;
		panel_kisiselBilgi.add(d_tarihiLbl, gbc_d_tarihiLbl);

		d_tarihiTxt = new JTextField();
		GridBagConstraints gbc_d_tarihiTxt = new GridBagConstraints();
		gbc_d_tarihiTxt.insets = new Insets(0, 0, 5, 5);
		gbc_d_tarihiTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_d_tarihiTxt.gridx = 2;
		gbc_d_tarihiTxt.gridy = 3;
		panel_kisiselBilgi.add(d_tarihiTxt, gbc_d_tarihiTxt);
		d_tarihiTxt.setColumns(10);

		JLabel adresLbl = new JLabel("Adres :");
		GridBagConstraints gbc_adresLbl = new GridBagConstraints();
		gbc_adresLbl.anchor = GridBagConstraints.EAST;
		gbc_adresLbl.insets = new Insets(0, 0, 5, 5);
		gbc_adresLbl.gridx = 0;
		gbc_adresLbl.gridy = 4;
		panel_kisiselBilgi.add(adresLbl, gbc_adresLbl);

		adresTxt = new JTextPane();
		GridBagConstraints gbc_adresTxt = new GridBagConstraints();
		gbc_adresTxt.insets = new Insets(0, 0, 5, 5);
		gbc_adresTxt.fill = GridBagConstraints.BOTH;
		gbc_adresTxt.gridx = 2;
		gbc_adresTxt.gridy = 4;
		panel_kisiselBilgi.add(adresTxt, gbc_adresTxt);

		JLabel telefonLbl = new JLabel("Telefon :");
		GridBagConstraints gbc_telefonLbl = new GridBagConstraints();
		gbc_telefonLbl.anchor = GridBagConstraints.EAST;
		gbc_telefonLbl.insets = new Insets(0, 0, 5, 5);
		gbc_telefonLbl.gridx = 0;
		gbc_telefonLbl.gridy = 5;
		panel_kisiselBilgi.add(telefonLbl, gbc_telefonLbl);

		telefonTxt = new JTextField();
		GridBagConstraints gbc_telefonTxt = new GridBagConstraints();
		gbc_telefonTxt.insets = new Insets(0, 0, 5, 5);
		gbc_telefonTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_telefonTxt.gridx = 2;
		gbc_telefonTxt.gridy = 5;
		panel_kisiselBilgi.add(telefonTxt, gbc_telefonTxt);
		telefonTxt.setColumns(10);

		JLabel mailLbl = new JLabel("Mail Adresi :");
		GridBagConstraints gbc_mailLbl = new GridBagConstraints();
		gbc_mailLbl.anchor = GridBagConstraints.EAST;
		gbc_mailLbl.insets = new Insets(0, 0, 5, 5);
		gbc_mailLbl.gridx = 0;
		gbc_mailLbl.gridy = 6;
		panel_kisiselBilgi.add(mailLbl, gbc_mailLbl);

		emailTxt = new JTextField();
		GridBagConstraints gbc_emailTxt = new GridBagConstraints();
		gbc_emailTxt.insets = new Insets(0, 0, 5, 5);
		gbc_emailTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailTxt.gridx = 2;
		gbc_emailTxt.gridy = 6;
		panel_kisiselBilgi.add(emailTxt, gbc_emailTxt);
		emailTxt.setColumns(10);

		JLabel k_adiLbl = new JLabel("Kullanýcý Adý :");
		GridBagConstraints gbc_k_adiLbl = new GridBagConstraints();
		gbc_k_adiLbl.anchor = GridBagConstraints.EAST;
		gbc_k_adiLbl.insets = new Insets(0, 0, 5, 5);
		gbc_k_adiLbl.gridx = 0;
		gbc_k_adiLbl.gridy = 7;
		panel_kisiselBilgi.add(k_adiLbl, gbc_k_adiLbl);

		k_adiTxt = new JTextField();
		GridBagConstraints gbc_k_adiTxt = new GridBagConstraints();
		gbc_k_adiTxt.insets = new Insets(0, 0, 5, 5);
		gbc_k_adiTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_k_adiTxt.gridx = 2;
		gbc_k_adiTxt.gridy = 7;
		panel_kisiselBilgi.add(k_adiTxt, gbc_k_adiTxt);
		k_adiTxt.setColumns(10);

		JLabel k_sifreLbl = new JLabel("Þifre :");
		GridBagConstraints gbc_k_sifreLbl = new GridBagConstraints();
		gbc_k_sifreLbl.anchor = GridBagConstraints.EAST;
		gbc_k_sifreLbl.insets = new Insets(0, 0, 5, 5);
		gbc_k_sifreLbl.gridx = 0;
		gbc_k_sifreLbl.gridy = 8;
		panel_kisiselBilgi.add(k_sifreLbl, gbc_k_sifreLbl);

		k_sifreTxt = new JPasswordField();
		GridBagConstraints gbc_k_sifreTxt = new GridBagConstraints();
		gbc_k_sifreTxt.insets = new Insets(0, 0, 5, 5);
		gbc_k_sifreTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_k_sifreTxt.gridx = 2;
		gbc_k_sifreTxt.gridy = 8;
		panel_kisiselBilgi.add(k_sifreTxt, gbc_k_sifreTxt);

		JLabel lblBoy_1 = new JLabel("Boy :");
		GridBagConstraints gbc_lblBoy_1 = new GridBagConstraints();
		gbc_lblBoy_1.anchor = GridBagConstraints.EAST;
		gbc_lblBoy_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblBoy_1.gridx = 0;
		gbc_lblBoy_1.gridy = 9;
		panel_kisiselBilgi.add(lblBoy_1, gbc_lblBoy_1);

		boyTxt = new JTextField();
		GridBagConstraints gbc_boyTxt = new GridBagConstraints();
		gbc_boyTxt.insets = new Insets(0, 0, 5, 5);
		gbc_boyTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_boyTxt.gridx = 2;
		gbc_boyTxt.gridy = 9;
		panel_kisiselBilgi.add(boyTxt, gbc_boyTxt);
		boyTxt.setColumns(10);

		JLabel lblKronikHastalk = new JLabel("Kronik Hastal\u0131k :");
		GridBagConstraints gbc_lblKronikHastalk = new GridBagConstraints();
		gbc_lblKronikHastalk.anchor = GridBagConstraints.EAST;
		gbc_lblKronikHastalk.insets = new Insets(0, 0, 5, 5);
		gbc_lblKronikHastalk.gridx = 0;
		gbc_lblKronikHastalk.gridy = 10;
		panel_kisiselBilgi.add(lblKronikHastalk, gbc_lblKronikHastalk);

		JButton ileriBtn_1 = new JButton("\u0130leri");
		ileriBtn_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				kisiselbilgiTpane.setSelectedIndex(1);
				hastaEkle();
			}
		});

		k_hastalikTxt = new JTextField();
		GridBagConstraints gbc_k_hastalikTxt = new GridBagConstraints();
		gbc_k_hastalikTxt.insets = new Insets(0, 0, 5, 5);
		gbc_k_hastalikTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_k_hastalikTxt.gridx = 2;
		gbc_k_hastalikTxt.gridy = 10;
		panel_kisiselBilgi.add(k_hastalikTxt, gbc_k_hastalikTxt);
		k_hastalikTxt.setColumns(10);

		JLabel lblCinsiyet = new JLabel("Cinsiyet :");
		GridBagConstraints gbc_lblCinsiyet = new GridBagConstraints();
		gbc_lblCinsiyet.insets = new Insets(0, 0, 5, 5);
		gbc_lblCinsiyet.gridx = 0;
		gbc_lblCinsiyet.gridy = 11;
		panel_kisiselBilgi.add(lblCinsiyet, gbc_lblCinsiyet);

		JComboBox cinsiyetCbox = new JComboBox();
		cinsiyetCbox.setModel(new DefaultComboBoxModel(new String[] { "Erkek",
				"Kad\u0131n", "Di\u011Fer" }));
		GridBagConstraints gbc_sinsiyetCbox = new GridBagConstraints();
		gbc_sinsiyetCbox.insets = new Insets(0, 0, 5, 5);
		gbc_sinsiyetCbox.fill = GridBagConstraints.HORIZONTAL;
		gbc_sinsiyetCbox.gridx = 2;
		gbc_sinsiyetCbox.gridy = 11;
		panel_kisiselBilgi.add(cinsiyetCbox, gbc_sinsiyetCbox);

		GridBagConstraints gbc_ileriBtn_1 = new GridBagConstraints();
		gbc_ileriBtn_1.gridx = 3;
		gbc_ileriBtn_1.gridy = 15;
		panel_kisiselBilgi.add(ileriBtn_1, gbc_ileriBtn_1);
		model.addColumn("Besin Adý");
		model.addColumn("Besin Miktarý");
		model.addColumn("Kalori Miktarý");

		JPanel panel_vucutDegerleri = new JPanel();
		kisiselbilgiTpane.addTab("Vücut Deðerleri", null, panel_vucutDegerleri,
				null);
		GridBagLayout gbl_panel_vucutDegerleri = new GridBagLayout();
		gbl_panel_vucutDegerleri.columnWidths = new int[] { 0, 134, 123, 137,
				0, 0, 0, 0, 0 };
		gbl_panel_vucutDegerleri.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_vucutDegerleri.columnWeights = new double[] { 0.0, 1.0, 0.0,
				1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_vucutDegerleri.rowWeights = new double[] { 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 1.0, Double.MIN_VALUE };
		panel_vucutDegerleri.setLayout(gbl_panel_vucutDegerleri);

		JLabel lblBoy = new JLabel("Kilo :");
		GridBagConstraints gbc_lblBoy = new GridBagConstraints();
		gbc_lblBoy.anchor = GridBagConstraints.EAST;
		gbc_lblBoy.insets = new Insets(0, 0, 5, 5);
		gbc_lblBoy.gridx = 0;
		gbc_lblBoy.gridy = 0;
		panel_vucutDegerleri.add(lblBoy, gbc_lblBoy);

		kiloTxt = new JTextField();
		GridBagConstraints gbc_kiloTxt = new GridBagConstraints();
		gbc_kiloTxt.insets = new Insets(0, 0, 5, 5);
		gbc_kiloTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_kiloTxt.gridx = 1;
		gbc_kiloTxt.gridy = 0;
		panel_vucutDegerleri.add(kiloTxt, gbc_kiloTxt);
		kiloTxt.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("SGPT :");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 2;
		gbc_lblNewLabel_11.gridy = 0;
		panel_vucutDegerleri.add(lblNewLabel_11, gbc_lblNewLabel_11);

		sgptTxt = new JTextField();
		GridBagConstraints gbc_sgptTxt = new GridBagConstraints();
		gbc_sgptTxt.insets = new Insets(0, 0, 5, 5);
		gbc_sgptTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_sgptTxt.gridx = 3;
		gbc_sgptTxt.gridy = 0;
		panel_vucutDegerleri.add(sgptTxt, gbc_sgptTxt);
		sgptTxt.setColumns(10);

		JLabel lblKilo = new JLabel("Ya\u011F Oran\u0131 :");
		GridBagConstraints gbc_lblKilo = new GridBagConstraints();
		gbc_lblKilo.anchor = GridBagConstraints.EAST;
		gbc_lblKilo.insets = new Insets(0, 0, 5, 5);
		gbc_lblKilo.gridx = 0;
		gbc_lblKilo.gridy = 1;
		panel_vucutDegerleri.add(lblKilo, gbc_lblKilo);

		y_oraniTxt = new JTextField();
		GridBagConstraints gbc_y_oraniTxt = new GridBagConstraints();
		gbc_y_oraniTxt.insets = new Insets(0, 0, 5, 5);
		gbc_y_oraniTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_y_oraniTxt.gridx = 1;
		gbc_y_oraniTxt.gridy = 1;
		panel_vucutDegerleri.add(y_oraniTxt, gbc_y_oraniTxt);
		y_oraniTxt.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("SGOT :");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 2;
		gbc_lblNewLabel_10.gridy = 1;
		panel_vucutDegerleri.add(lblNewLabel_10, gbc_lblNewLabel_10);

		sgotTxt = new JTextField();
		GridBagConstraints gbc_sgotTxt = new GridBagConstraints();
		gbc_sgotTxt.insets = new Insets(0, 0, 5, 5);
		gbc_sgotTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_sgotTxt.gridx = 3;
		gbc_sgotTxt.gridy = 1;
		panel_vucutDegerleri.add(sgotTxt, gbc_sgotTxt);
		sgotTxt.setColumns(10);

		JLabel lblNewLabel_22 = new JLabel("\u0130ntolerans :");
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_22.gridx = 0;
		gbc_lblNewLabel_22.gridy = 2;
		panel_vucutDegerleri.add(lblNewLabel_22, gbc_lblNewLabel_22);

		intoleransTxt = new JTextField();
		GridBagConstraints gbc_intoleransTxt = new GridBagConstraints();
		gbc_intoleransTxt.insets = new Insets(0, 0, 5, 5);
		gbc_intoleransTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_intoleransTxt.gridx = 1;
		gbc_intoleransTxt.gridy = 2;
		panel_vucutDegerleri.add(intoleransTxt, gbc_intoleransTxt);
		intoleransTxt.setColumns(10);

		JLabel acth = new JLabel("ACTH :");
		GridBagConstraints gbc_acth = new GridBagConstraints();
		gbc_acth.anchor = GridBagConstraints.EAST;
		gbc_acth.insets = new Insets(0, 0, 5, 5);
		gbc_acth.gridx = 2;
		gbc_acth.gridy = 2;
		panel_vucutDegerleri.add(acth, gbc_acth);

		acthTxt = new JTextField();
		GridBagConstraints gbc_acthTxt = new GridBagConstraints();
		gbc_acthTxt.insets = new Insets(0, 0, 5, 5);
		gbc_acthTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_acthTxt.gridx = 3;
		gbc_acthTxt.gridy = 2;
		panel_vucutDegerleri.add(acthTxt, gbc_acthTxt);
		acthTxt.setColumns(10);

		JLabel lblNewLabel = new JLabel("Kan \u015Eekeri :");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		panel_vucutDegerleri.add(lblNewLabel, gbc_lblNewLabel);

		k_sekeriTxt = new JTextField();
		GridBagConstraints gbc_k_sekeriTxt = new GridBagConstraints();
		gbc_k_sekeriTxt.insets = new Insets(0, 0, 5, 5);
		gbc_k_sekeriTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_k_sekeriTxt.gridx = 1;
		gbc_k_sekeriTxt.gridy = 3;
		panel_vucutDegerleri.add(k_sekeriTxt, gbc_k_sekeriTxt);
		k_sekeriTxt.setColumns(10);

		JLabel lblNewLabel_16 = new JLabel("Ferritin :");
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 2;
		gbc_lblNewLabel_16.gridy = 3;
		panel_vucutDegerleri.add(lblNewLabel_16, gbc_lblNewLabel_16);

		ferritinTxt = new JTextField();
		GridBagConstraints gbc_ferritinTxt = new GridBagConstraints();
		gbc_ferritinTxt.insets = new Insets(0, 0, 5, 5);
		gbc_ferritinTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_ferritinTxt.gridx = 3;
		gbc_ferritinTxt.gridy = 3;
		panel_vucutDegerleri.add(ferritinTxt, gbc_ferritinTxt);
		ferritinTxt.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Troit :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		panel_vucutDegerleri.add(lblNewLabel_1, gbc_lblNewLabel_1);

		tiroitTxt = new JTextField();
		GridBagConstraints gbc_tiroitTxt = new GridBagConstraints();
		gbc_tiroitTxt.insets = new Insets(0, 0, 5, 5);
		gbc_tiroitTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tiroitTxt.gridx = 1;
		gbc_tiroitTxt.gridy = 4;
		panel_vucutDegerleri.add(tiroitTxt, gbc_tiroitTxt);
		tiroitTxt.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("FSH :");
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 2;
		gbc_lblNewLabel_17.gridy = 4;
		panel_vucutDegerleri.add(lblNewLabel_17, gbc_lblNewLabel_17);

		fshTxt = new JTextField();
		GridBagConstraints gbc_fshTxt = new GridBagConstraints();
		gbc_fshTxt.insets = new Insets(0, 0, 5, 5);
		gbc_fshTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_fshTxt.gridx = 3;
		gbc_fshTxt.gridy = 4;
		panel_vucutDegerleri.add(fshTxt, gbc_fshTxt);
		fshTxt.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("TSH :");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 5;
		panel_vucutDegerleri.add(lblNewLabel_2, gbc_lblNewLabel_2);

		tshTxt = new JTextField();
		GridBagConstraints gbc_tshTxt = new GridBagConstraints();
		gbc_tshTxt.insets = new Insets(0, 0, 5, 5);
		gbc_tshTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tshTxt.gridx = 1;
		gbc_tshTxt.gridy = 5;
		panel_vucutDegerleri.add(tshTxt, gbc_tshTxt);
		tshTxt.setColumns(10);

		JLabel lblNewLabel_18 = new JLabel("LH :");
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 2;
		gbc_lblNewLabel_18.gridy = 5;
		panel_vucutDegerleri.add(lblNewLabel_18, gbc_lblNewLabel_18);

		lhTxt = new JTextField();
		GridBagConstraints gbc_lhTxt = new GridBagConstraints();
		gbc_lhTxt.insets = new Insets(0, 0, 5, 5);
		gbc_lhTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_lhTxt.gridx = 3;
		gbc_lhTxt.gridy = 5;
		panel_vucutDegerleri.add(lhTxt, gbc_lhTxt);
		lhTxt.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("\u0130ns\u00FClin :");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 6;
		panel_vucutDegerleri.add(lblNewLabel_3, gbc_lblNewLabel_3);

		insulinTxt = new JTextField();
		GridBagConstraints gbc_insulinTxt = new GridBagConstraints();
		gbc_insulinTxt.insets = new Insets(0, 0, 5, 5);
		gbc_insulinTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_insulinTxt.gridx = 1;
		gbc_insulinTxt.gridy = 6;
		panel_vucutDegerleri.add(insulinTxt, gbc_insulinTxt);
		insulinTxt.setColumns(10);

		JLabel lblNewLabel_19 = new JLabel("Testosteron :");
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 2;
		gbc_lblNewLabel_19.gridy = 6;
		panel_vucutDegerleri.add(lblNewLabel_19, gbc_lblNewLabel_19);

		testosteronTxt = new JTextField();
		GridBagConstraints gbc_testosteronTxt = new GridBagConstraints();
		gbc_testosteronTxt.insets = new Insets(0, 0, 5, 5);
		gbc_testosteronTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_testosteronTxt.gridx = 3;
		gbc_testosteronTxt.gridy = 6;
		panel_vucutDegerleri.add(testosteronTxt, gbc_testosteronTxt);
		testosteronTxt.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("OGTT :");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 7;
		panel_vucutDegerleri.add(lblNewLabel_4, gbc_lblNewLabel_4);

		ogttTxt = new JTextField();
		GridBagConstraints gbc_ogttTxt = new GridBagConstraints();
		gbc_ogttTxt.insets = new Insets(0, 0, 5, 5);
		gbc_ogttTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_ogttTxt.gridx = 1;
		gbc_ogttTxt.gridy = 7;
		panel_vucutDegerleri.add(ogttTxt, gbc_ogttTxt);
		ogttTxt.setColumns(10);

		JLabel lblNewLabel_20 = new JLabel("Prolaktin :");
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 2;
		gbc_lblNewLabel_20.gridy = 7;
		panel_vucutDegerleri.add(lblNewLabel_20, gbc_lblNewLabel_20);

		prolaktinTxt = new JTextField();
		GridBagConstraints gbc_prolaktinTxt = new GridBagConstraints();
		gbc_prolaktinTxt.insets = new Insets(0, 0, 5, 5);
		gbc_prolaktinTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_prolaktinTxt.gridx = 3;
		gbc_prolaktinTxt.gridy = 7;
		panel_vucutDegerleri.add(prolaktinTxt, gbc_prolaktinTxt);
		prolaktinTxt.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Total Kolestrol :");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 8;
		panel_vucutDegerleri.add(lblNewLabel_5, gbc_lblNewLabel_5);

		t_kolestrolTxt = new JTextField();
		GridBagConstraints gbc_t_kolestrolTxt = new GridBagConstraints();
		gbc_t_kolestrolTxt.insets = new Insets(0, 0, 5, 5);
		gbc_t_kolestrolTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_t_kolestrolTxt.gridx = 1;
		gbc_t_kolestrolTxt.gridy = 8;
		panel_vucutDegerleri.add(t_kolestrolTxt, gbc_t_kolestrolTxt);
		t_kolestrolTxt.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("Homosistein :");
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 2;
		gbc_lblNewLabel_15.gridy = 8;
		panel_vucutDegerleri.add(lblNewLabel_15, gbc_lblNewLabel_15);

		homosisteinTxt = new JTextField();
		GridBagConstraints gbc_homosisteinTxt = new GridBagConstraints();
		gbc_homosisteinTxt.insets = new Insets(0, 0, 5, 5);
		gbc_homosisteinTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_homosisteinTxt.gridx = 3;
		gbc_homosisteinTxt.gridy = 8;
		panel_vucutDegerleri.add(homosisteinTxt, gbc_homosisteinTxt);
		homosisteinTxt.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Trigliserid :");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 9;
		panel_vucutDegerleri.add(lblNewLabel_6, gbc_lblNewLabel_6);

		trigliseritTxt = new JTextField();
		GridBagConstraints gbc_trigliseritTxt = new GridBagConstraints();
		gbc_trigliseritTxt.insets = new Insets(0, 0, 5, 5);
		gbc_trigliseritTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_trigliseritTxt.gridx = 1;
		gbc_trigliseritTxt.gridy = 9;
		panel_vucutDegerleri.add(trigliseritTxt, gbc_trigliseritTxt);
		trigliseritTxt.setColumns(10);

		JLabel lblNewLabel_21 = new JLabel("CRP :");
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_21.gridx = 2;
		gbc_lblNewLabel_21.gridy = 9;
		panel_vucutDegerleri.add(lblNewLabel_21, gbc_lblNewLabel_21);

		crpTxt = new JTextField();
		GridBagConstraints gbc_crpTxt = new GridBagConstraints();
		gbc_crpTxt.insets = new Insets(0, 0, 5, 5);
		gbc_crpTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_crpTxt.gridx = 3;
		gbc_crpTxt.gridy = 9;
		panel_vucutDegerleri.add(crpTxt, gbc_crpTxt);
		crpTxt.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("LDL :");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 10;
		panel_vucutDegerleri.add(lblNewLabel_7, gbc_lblNewLabel_7);

		ldlTxt = new JTextField();
		GridBagConstraints gbc_ldlTxt = new GridBagConstraints();
		gbc_ldlTxt.insets = new Insets(0, 0, 5, 5);
		gbc_ldlTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_ldlTxt.gridx = 1;
		gbc_ldlTxt.gridy = 10;
		panel_vucutDegerleri.add(ldlTxt, gbc_ldlTxt);
		ldlTxt.setColumns(10);

		JLabel lblTarih = new JLabel("Tarih :");
		GridBagConstraints gbc_lblTarih = new GridBagConstraints();
		gbc_lblTarih.anchor = GridBagConstraints.EAST;
		gbc_lblTarih.insets = new Insets(0, 0, 5, 5);
		gbc_lblTarih.gridx = 2;
		gbc_lblTarih.gridy = 10;
		panel_vucutDegerleri.add(lblTarih, gbc_lblTarih);

		tarihTxt = new JTextField();
		GridBagConstraints gbc_tarihTxt = new GridBagConstraints();
		gbc_tarihTxt.insets = new Insets(0, 0, 5, 5);
		gbc_tarihTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tarihTxt.gridx = 3;
		gbc_tarihTxt.gridy = 10;
		panel_vucutDegerleri.add(tarihTxt, gbc_tarihTxt);
		tarihTxt.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("HDL :");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 11;
		panel_vucutDegerleri.add(lblNewLabel_8, gbc_lblNewLabel_8);

		hdlTxt = new JTextField();
		GridBagConstraints gbc_hdlTxt = new GridBagConstraints();
		gbc_hdlTxt.insets = new Insets(0, 0, 5, 5);
		gbc_hdlTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_hdlTxt.gridx = 1;
		gbc_hdlTxt.gridy = 11;
		panel_vucutDegerleri.add(hdlTxt, gbc_hdlTxt);
		hdlTxt.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("\u00DCrik Asit :");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 12;
		panel_vucutDegerleri.add(lblNewLabel_9, gbc_lblNewLabel_9);

		urikasitTxt = new JTextField();
		GridBagConstraints gbc_urikasitTxt = new GridBagConstraints();
		gbc_urikasitTxt.insets = new Insets(0, 0, 5, 5);
		gbc_urikasitTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_urikasitTxt.gridx = 1;
		gbc_urikasitTxt.gridy = 12;
		panel_vucutDegerleri.add(urikasitTxt, gbc_urikasitTxt);
		urikasitTxt.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("Kortizol :");
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 0;
		gbc_lblNewLabel_14.gridy = 13;
		panel_vucutDegerleri.add(lblNewLabel_14, gbc_lblNewLabel_14);

		kortizolTxt = new JTextField();
		GridBagConstraints gbc_kortizolTxt = new GridBagConstraints();
		gbc_kortizolTxt.insets = new Insets(0, 0, 5, 5);
		gbc_kortizolTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_kortizolTxt.gridx = 1;
		gbc_kortizolTxt.gridy = 13;
		panel_vucutDegerleri.add(kortizolTxt, gbc_kortizolTxt);
		kortizolTxt.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("Alkalenfosfataz :");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 0;
		gbc_lblNewLabel_13.gridy = 14;
		panel_vucutDegerleri.add(lblNewLabel_13, gbc_lblNewLabel_13);

		a_fosfatazTxt = new JTextField();
		GridBagConstraints gbc_a_fosfatazTxt = new GridBagConstraints();
		gbc_a_fosfatazTxt.insets = new Insets(0, 0, 5, 5);
		gbc_a_fosfatazTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_a_fosfatazTxt.gridx = 1;
		gbc_a_fosfatazTxt.gridy = 14;
		panel_vucutDegerleri.add(a_fosfatazTxt, gbc_a_fosfatazTxt);
		a_fosfatazTxt.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("GGT :");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 0;
		gbc_lblNewLabel_12.gridy = 15;
		panel_vucutDegerleri.add(lblNewLabel_12, gbc_lblNewLabel_12);

		ggtTxt = new JTextField();
		GridBagConstraints gbc_ggtTxt = new GridBagConstraints();
		gbc_ggtTxt.insets = new Insets(0, 0, 5, 5);
		gbc_ggtTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_ggtTxt.gridx = 1;
		gbc_ggtTxt.gridy = 15;
		panel_vucutDegerleri.add(ggtTxt, gbc_ggtTxt);
		ggtTxt.setColumns(10);

		JButton ileriBtn_2 = new JButton("\u0130leri");
		ileriBtn_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				kisiselbilgiTpane.setSelectedIndex(2);
				muayeneEkle();
			}
		});
		GridBagConstraints gbc_ileriBtn_2 = new GridBagConstraints();
		gbc_ileriBtn_2.gridx = 7;
		gbc_ileriBtn_2.gridy = 16;
		panel_vucutDegerleri.add(ileriBtn_2, gbc_ileriBtn_2);

		JPanel panel_ogunEkle = new JPanel();
		kisiselbilgiTpane.addTab("Diyet Listesi", null, panel_ogunEkle, null);
		GridBagLayout gbl_panel_ogunEkle = new GridBagLayout();
		gbl_panel_ogunEkle.columnWidths = new int[] { 0, 241, 191, 62, 0, 0 };
		gbl_panel_ogunEkle.rowHeights = new int[] { 0, 0, 156, 35, 89, 91, 0, 0 };
		gbl_panel_ogunEkle.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0,
				1.0, Double.MIN_VALUE };
		gbl_panel_ogunEkle.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0,
				1.0, 1.0, Double.MIN_VALUE };
		panel_ogunEkle.setLayout(gbl_panel_ogunEkle);

		ogunlerCbox = new JComboBox();
		ogunlerCbox.addItem("Sabah");
		ogunlerCbox.addItem("1. Ara Öðün");
		ogunlerCbox.addItem("Öðlen");
		ogunlerCbox.addItem("2. Ara Öðün");
		ogunlerCbox.addItem("Akþam");
		ogunlerCbox.addItem("3. Ara Öðün");

		GridBagConstraints gbc_ogunlerCbox = new GridBagConstraints();
		gbc_ogunlerCbox.insets = new Insets(0, 0, 5, 5);
		gbc_ogunlerCbox.fill = GridBagConstraints.HORIZONTAL;
		gbc_ogunlerCbox.gridx = 1;
		gbc_ogunlerCbox.gridy = 0;
		panel_ogunEkle.add(ogunlerCbox, gbc_ogunlerCbox);

		listeleBtn = new JButton("Listele");
		listeleBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				listmodel.addElement(bdao.getBesinwIsim(besinaraTxt.getText())
						.getIsim());
			}
		});
		GridBagConstraints gbc_listeleBtn = new GridBagConstraints();
		gbc_listeleBtn.insets = new Insets(0, 0, 5, 5);
		gbc_listeleBtn.gridx = 2;
		gbc_listeleBtn.gridy = 0;
		panel_ogunEkle.add(listeleBtn, gbc_listeleBtn);

		besinaraTxt = new JTextField();
		GridBagConstraints gbc_besinaraTxt = new GridBagConstraints();
		gbc_besinaraTxt.insets = new Insets(0, 0, 5, 5);
		gbc_besinaraTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_besinaraTxt.gridx = 1;
		gbc_besinaraTxt.gridy = 1;
		panel_ogunEkle.add(besinaraTxt, gbc_besinaraTxt);
		besinaraTxt.setColumns(10);

		besinAraList = new JList();
		besinAraList.setModel(listmodel);
		GridBagConstraints gbc_besinAraList = new GridBagConstraints();
		gbc_besinAraList.gridwidth = 2;
		gbc_besinAraList.insets = new Insets(0, 0, 5, 5);
		gbc_besinAraList.fill = GridBagConstraints.BOTH;
		gbc_besinAraList.gridx = 1;
		gbc_besinAraList.gridy = 2;
		panel_ogunEkle.add(besinAraList, gbc_besinAraList);

		JButton secBtn_diyetlist = new JButton("se\u00E7");
		secBtn_diyetlist.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					besinEkle();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_secBtn_diyetlist = new GridBagConstraints();
		gbc_secBtn_diyetlist.insets = new Insets(0, 0, 5, 5);
		gbc_secBtn_diyetlist.gridx = 3;
		gbc_secBtn_diyetlist.gridy = 2;
		panel_ogunEkle.add(secBtn_diyetlist, gbc_secBtn_diyetlist);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		panel_ogunEkle.add(scrollPane, gbc_scrollPane);

		ogunListesiTable = new JTable();
		scrollPane.setViewportView(ogunListesiTable);
		ogunListesiTable.setModel(tablemodel);
		scrollPane.setViewportView(ogunListesiTable);

		k_tamamlaBtn = new JButton("Kaydý Tamamla");
		GridBagConstraints gbc_k_tamamlaBtn = new GridBagConstraints();
		gbc_k_tamamlaBtn.insets = new Insets(0, 0, 0, 5);
		gbc_k_tamamlaBtn.gridx = 2;
		gbc_k_tamamlaBtn.gridy = 6;
		panel_ogunEkle.add(k_tamamlaBtn, gbc_k_tamamlaBtn);

		düzenleBtn_diyetlistesi = new JButton("Düzenle");
		GridBagConstraints gbc_düzenleBtn_diyetlistesi = new GridBagConstraints();
		gbc_düzenleBtn_diyetlistesi.insets = new Insets(0, 0, 0, 5);
		gbc_düzenleBtn_diyetlistesi.gridx = 3;
		gbc_düzenleBtn_diyetlistesi.gridy = 6;
		panel_ogunEkle
				.add(düzenleBtn_diyetlistesi, gbc_düzenleBtn_diyetlistesi);
	}

	public YeniKayit() {
		gorsel();
	}

	public void sonEklenen() {
		try {

			HastaDAO hdao = new HastaDAO();
			idHasta = hdao.sonEklenen();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void hastaEkle() {
		HastaDAO hdao = new HastaDAO();
		Hasta hasta = new Hasta();

		hasta.setAd(adTxt.getText());
		hasta.setSoyad(soyadTxt.getText());
		hasta.setTc(tcTxt.getText());
		hasta.setD_tarihi(d_tarihiTxt.getText());
		hasta.setTelefon(telefonTxt.getText());
		hasta.setAdres(adresTxt.getText());
		hasta.setEmail(emailTxt.getText());
		hasta.setBoy(boyTxt.getText());
		hasta.setK_adi(k_adiTxt.getText());
		hasta.setK_sifre(k_sifreTxt.getText());

		hdao.ekleHasta(hasta);
		sonEklenen();
	}

	public void muayeneEkle() {

		if (!kiloTxt.getText().equals("")) {
			muayene.setKilo(Integer.parseInt(kiloTxt.getText()));
		}
		if (!tiroitTxt.getText().equals("")) {
			muayene.setTiroit(Double.parseDouble(tiroitTxt.getText()));
		}
		if (!tshTxt.getText().equals("")) {
			muayene.setTsh(Double.parseDouble(tshTxt.getText()));
		}
		if (!k_sekeriTxt.getText().equals("")) {
			muayene.setKansekeri(Double.parseDouble(k_sekeriTxt.getText()));
		}
		if (!insulinTxt.getText().equals("")) {
			muayene.setInsulin(Double.parseDouble(insulinTxt.getText()));
		}
		if (!ogttTxt.getText().equals("")) {
			muayene.setOgtt(Double.parseDouble(ogttTxt.getText()));
		}
		if (!t_kolestrolTxt.getText().equals("")) {
			muayene.setTotalkolestrol(Double.parseDouble(t_kolestrolTxt
					.getText()));
		}
		if (!trigliseritTxt.getText().equals("")) {
			muayene.setTrigliserid(Double.parseDouble(trigliseritTxt.getText()));
		}
		if (!ldlTxt.getText().equals("")) {
			muayene.setLdl(Double.parseDouble(ldlTxt.getText()));
		}
		if (!hdlTxt.getText().equals("")) {
			muayene.setHdl(Double.parseDouble(hdlTxt.getText()));
		}
		if (!urikasitTxt.getText().equals("")) {
			muayene.setUrikasit(Double.parseDouble(urikasitTxt.getText()));
		}
		if (!kortizolTxt.getText().equals("")) {
			muayene.setKortizol(Double.parseDouble(kortizolTxt.getText()));
		}
		if (!a_fosfatazTxt.getText().equals("")) {
			muayene.setAlkalenfosfataz(Double.parseDouble(a_fosfatazTxt
					.getText()));
		}
		if (!ggtTxt.getText().equals("")) {
			muayene.setGgt(Double.parseDouble(ggtTxt.getText()));
		}
		if (!sgptTxt.getText().equals("")) {
			muayene.setSgpt(Double.parseDouble(sgptTxt.getText()));
		}
		if (!sgotTxt.getText().equals("")) {
			muayene.setSgot(Double.parseDouble(sgotTxt.getText()));
		}
		if (!acthTxt.getText().equals("")) {
			muayene.setActh(Double.parseDouble(acthTxt.getText()));
		}
		if (!ferritinTxt.getText().equals("")) {
			muayene.setFerritin(Double.parseDouble(ferritinTxt.getText()));
		}
		if (!fshTxt.getText().equals("")) {
			muayene.setFsh(Double.parseDouble(fshTxt.getText()));
		}
		if (!lhTxt.getText().equals("")) {
			muayene.setLh(Double.parseDouble(lhTxt.getText()));
		}
		if (!testosteronTxt.getText().equals("")) {
			muayene.setTestosteron(Double.parseDouble(testosteronTxt.getText()));
		}
		if (!prolaktinTxt.getText().equals("")) {
			muayene.setProlaktin(Double.parseDouble(prolaktinTxt.getText()));
		}
		if (!homosisteinTxt.getText().equals("")) {
			muayene.setHomosistein(Double.parseDouble(homosisteinTxt.getText()));
		}
		if (!crpTxt.getText().equals("")) {
			muayene.setCrp(Double.parseDouble(crpTxt.getText()));
		}
		if (!intoleransTxt.getText().equals("")) {
			muayene.setIntolerans(Double.parseDouble(intoleransTxt.getText()));
		}
		if (!tarihTxt.getText().equals("")) {
			muayene.setTarih(tarihTxt.getText());
		}
		System.out.println(idHasta);
		muayene.getH().setIdHasta(idHasta);

		mdao.ekleMuayene(muayene);

	}

	public static int parseOgun(String ogun) {
		int idOgun = -1;
		if (ogun.equals("Sabah")) {
			idOgun = 1;
		} else if (ogun.equals("1. Ara Öðün")) {
			idOgun = 2;
		} else if (ogun.equals("Öðlen")) {
			idOgun = 3;
		} else if (ogun.equals("2. Ara Öðün")) {
			idOgun = 4;
		} else if (ogun.equals("Akþam")) {
			idOgun = 5;
		} else if (ogun.equals("3. Ara Öðün")) {
			idOgun = 6;
		} else {
			idOgun = -1;
		}

		return idOgun;
	}

	public void besinEkle() throws Exception {
		// idhasta ogun idbesin4
		dl.getH().setIdHasta(idHasta);
		dl.setOgun(parseOgun(ogunlerCbox.getSelectedItem().toString()));
		/*
		 * dl.setIdBesin(bdao.getBesinwIsim(
		 * besinAraList.getSelectedValue().toString()).getIdBesin());
		 */
		dl.getB().setIdBesin(
				bdao.getBesinwIsim(besinAraList.getSelectedValue().toString())
						.getIdBesin());
		// miktar ekle

		ddao.ekleBesin(dl);
		tabloYaz();

	}

	public void tabloYaz() throws Exception {

		String[] kolon = { "kolon1", "kolon2" };

		ddao.diyetListesiTablo(ogunListesiTable, kolon,
				ddao.getHastaDL(idHasta));
	}

}
