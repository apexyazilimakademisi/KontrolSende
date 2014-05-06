package Muayene;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class MuayeneKaydet extends JFrame {

	private JPanel contentPane;
	private JTextField kiloTxt;
	private JTextField y_oraniTxt;
	private JTextField LdlTxt;
	private JTextField sgptTxt;
	private JTextField sgotTxt;
	private JTextField acthTxt;
	private JTextField k_sekeriTxt;
	private JTextField ferritinTxt;
	private JTextField tiroitTxt;
	private JTextField fshTxt;
	private JTextField tshTxt;
	private JTextField lhTxt;
	private JTextField insulinTxt;
	private JTextField testosteronTxt;
	private JTextField ogttTxt;
	private JTextField prolaktinTxt;
	private JTextField t_kolestrolTxt;
	private JTextField homosisteinTxt;
	private JTextField trigliseritTxt;
	private JTextField crpTxt;
	private JTextField tarihTxt;
	private JTextField hdlTxt;
	private JTextField urikasitTxt;
	private JTextField kortizolTxt;
	private JTextField a_fosfatazTxt;
	private JTextField intoleransTxt;
	private JTextField ggtTxt;
	private JButton kaydetBtn;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MuayeneKaydet frame = new MuayeneKaydet();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}// elle muayene ekle veri tabanýna,muayene id kullanarak getmuayane
		// metodunu çaðýr,muayene nesnesi gelecek-muyenennin getmetodlarýný
		// kullanarak
		// textboxlara yaz

	public void gorsel() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 750, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel_vucutDegerleri = new JPanel();
		panel_vucutDegerleri.setBackground(Color.pink);
		contentPane.add(panel_vucutDegerleri, BorderLayout.CENTER);
		GridBagLayout gbl_panel_vucutDegerleri = new GridBagLayout();
		gbl_panel_vucutDegerleri.columnWidths = new int[] { 0, 150, 0, 164, 0,
				0, 0 };
		gbl_panel_vucutDegerleri.rowHeights = new int[] { 13, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_vucutDegerleri.columnWeights = new double[] { 0.0, 0.0, 0.0,
				0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_vucutDegerleri.rowWeights = new double[] { 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 1.0, Double.MIN_VALUE };
		panel_vucutDegerleri.setLayout(gbl_panel_vucutDegerleri);

		JLabel lblBoy = new JLabel("Kilo :");
		GridBagConstraints gbc_lblBoy = new GridBagConstraints();
		gbc_lblBoy.anchor = GridBagConstraints.EAST;
		gbc_lblBoy.insets = new Insets(0, 0, 5, 5);
		gbc_lblBoy.gridx = 0;
		gbc_lblBoy.gridy = 1;
		panel_vucutDegerleri.add(lblBoy, gbc_lblBoy);

		kiloTxt = new JTextField();
		GridBagConstraints gbc_kiloTxt = new GridBagConstraints();
		gbc_kiloTxt.insets = new Insets(0, 0, 5, 5);
		gbc_kiloTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_kiloTxt.gridx = 1;
		gbc_kiloTxt.gridy = 1;
		panel_vucutDegerleri.add(kiloTxt, gbc_kiloTxt);
		kiloTxt.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("SGPT :");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 2;
		gbc_lblNewLabel_11.gridy = 1;
		panel_vucutDegerleri.add(lblNewLabel_11, gbc_lblNewLabel_11);

		sgptTxt = new JTextField();
		GridBagConstraints gbc_sgptTxt = new GridBagConstraints();
		gbc_sgptTxt.insets = new Insets(0, 0, 5, 5);
		gbc_sgptTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_sgptTxt.gridx = 3;
		gbc_sgptTxt.gridy = 1;
		panel_vucutDegerleri.add(sgptTxt, gbc_sgptTxt);
		sgptTxt.setColumns(10);

		JLabel lblKilo = new JLabel("Ya\u011F Oran\u0131 :");
		GridBagConstraints gbc_lblKilo = new GridBagConstraints();
		gbc_lblKilo.anchor = GridBagConstraints.EAST;
		gbc_lblKilo.insets = new Insets(0, 0, 5, 5);
		gbc_lblKilo.gridx = 0;
		gbc_lblKilo.gridy = 2;
		panel_vucutDegerleri.add(lblKilo, gbc_lblKilo);

		y_oraniTxt = new JTextField();
		GridBagConstraints gbc_y_oraniTxt = new GridBagConstraints();
		gbc_y_oraniTxt.insets = new Insets(0, 0, 5, 5);
		gbc_y_oraniTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_y_oraniTxt.gridx = 1;
		gbc_y_oraniTxt.gridy = 2;
		panel_vucutDegerleri.add(y_oraniTxt, gbc_y_oraniTxt);
		y_oraniTxt.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("SGOT :");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 2;
		gbc_lblNewLabel_10.gridy = 2;
		panel_vucutDegerleri.add(lblNewLabel_10, gbc_lblNewLabel_10);

		sgotTxt = new JTextField();
		GridBagConstraints gbc_sgotTxt = new GridBagConstraints();
		gbc_sgotTxt.insets = new Insets(0, 0, 5, 5);
		gbc_sgotTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_sgotTxt.gridx = 3;
		gbc_sgotTxt.gridy = 2;
		panel_vucutDegerleri.add(sgotTxt, gbc_sgotTxt);
		sgotTxt.setColumns(10);

		JLabel lblNewLabel_22 = new JLabel("\u0130ntolerans :");
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_22.gridx = 0;
		gbc_lblNewLabel_22.gridy = 3;
		panel_vucutDegerleri.add(lblNewLabel_22, gbc_lblNewLabel_22);

		intoleransTxt = new JTextField();
		GridBagConstraints gbc_intoleransTxt = new GridBagConstraints();
		gbc_intoleransTxt.insets = new Insets(0, 0, 5, 5);
		gbc_intoleransTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_intoleransTxt.gridx = 1;
		gbc_intoleransTxt.gridy = 3;
		panel_vucutDegerleri.add(intoleransTxt, gbc_intoleransTxt);
		intoleransTxt.setColumns(10);

		JLabel acth = new JLabel("ACTH :");
		GridBagConstraints gbc_acth = new GridBagConstraints();
		gbc_acth.anchor = GridBagConstraints.EAST;
		gbc_acth.insets = new Insets(0, 0, 5, 5);
		gbc_acth.gridx = 2;
		gbc_acth.gridy = 3;
		panel_vucutDegerleri.add(acth, gbc_acth);

		acthTxt = new JTextField();
		GridBagConstraints gbc_acthTxt = new GridBagConstraints();
		gbc_acthTxt.insets = new Insets(0, 0, 5, 5);
		gbc_acthTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_acthTxt.gridx = 3;
		gbc_acthTxt.gridy = 3;
		panel_vucutDegerleri.add(acthTxt, gbc_acthTxt);
		acthTxt.setColumns(10);

		JLabel lblNewLabel = new JLabel("Kan \u015Eekeri :");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		panel_vucutDegerleri.add(lblNewLabel, gbc_lblNewLabel);

		k_sekeriTxt = new JTextField();
		GridBagConstraints gbc_k_sekeriTxt = new GridBagConstraints();
		gbc_k_sekeriTxt.insets = new Insets(0, 0, 5, 5);
		gbc_k_sekeriTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_k_sekeriTxt.gridx = 1;
		gbc_k_sekeriTxt.gridy = 4;
		panel_vucutDegerleri.add(k_sekeriTxt, gbc_k_sekeriTxt);
		k_sekeriTxt.setColumns(10);

		JLabel lblNewLabel_16 = new JLabel("Ferritin :");
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 2;
		gbc_lblNewLabel_16.gridy = 4;
		panel_vucutDegerleri.add(lblNewLabel_16, gbc_lblNewLabel_16);

		ferritinTxt = new JTextField();
		GridBagConstraints gbc_ferritinTxt = new GridBagConstraints();
		gbc_ferritinTxt.insets = new Insets(0, 0, 5, 5);
		gbc_ferritinTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_ferritinTxt.gridx = 3;
		gbc_ferritinTxt.gridy = 4;
		panel_vucutDegerleri.add(ferritinTxt, gbc_ferritinTxt);
		ferritinTxt.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Troit :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 5;
		panel_vucutDegerleri.add(lblNewLabel_1, gbc_lblNewLabel_1);

		tiroitTxt = new JTextField();
		GridBagConstraints gbc_tiroitTxt = new GridBagConstraints();
		gbc_tiroitTxt.insets = new Insets(0, 0, 5, 5);
		gbc_tiroitTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tiroitTxt.gridx = 1;
		gbc_tiroitTxt.gridy = 5;
		panel_vucutDegerleri.add(tiroitTxt, gbc_tiroitTxt);
		tiroitTxt.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("FSH :");
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 2;
		gbc_lblNewLabel_17.gridy = 5;
		panel_vucutDegerleri.add(lblNewLabel_17, gbc_lblNewLabel_17);

		fshTxt = new JTextField();
		GridBagConstraints gbc_fshTxt = new GridBagConstraints();
		gbc_fshTxt.insets = new Insets(0, 0, 5, 5);
		gbc_fshTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_fshTxt.gridx = 3;
		gbc_fshTxt.gridy = 5;
		panel_vucutDegerleri.add(fshTxt, gbc_fshTxt);
		fshTxt.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("TSH :");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 6;
		panel_vucutDegerleri.add(lblNewLabel_2, gbc_lblNewLabel_2);

		tshTxt = new JTextField();
		GridBagConstraints gbc_tshTxt = new GridBagConstraints();
		gbc_tshTxt.insets = new Insets(0, 0, 5, 5);
		gbc_tshTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tshTxt.gridx = 1;
		gbc_tshTxt.gridy = 6;
		panel_vucutDegerleri.add(tshTxt, gbc_tshTxt);
		tshTxt.setColumns(10);

		JLabel lblNewLabel_18 = new JLabel("LH :");
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 2;
		gbc_lblNewLabel_18.gridy = 6;
		panel_vucutDegerleri.add(lblNewLabel_18, gbc_lblNewLabel_18);

		lhTxt = new JTextField();
		GridBagConstraints gbc_lhTxt = new GridBagConstraints();
		gbc_lhTxt.insets = new Insets(0, 0, 5, 5);
		gbc_lhTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_lhTxt.gridx = 3;
		gbc_lhTxt.gridy = 6;
		panel_vucutDegerleri.add(lhTxt, gbc_lhTxt);
		lhTxt.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("\u0130ns\u00FClin :");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 7;
		panel_vucutDegerleri.add(lblNewLabel_3, gbc_lblNewLabel_3);

		insulinTxt = new JTextField();
		GridBagConstraints gbc_insulinTxt = new GridBagConstraints();
		gbc_insulinTxt.insets = new Insets(0, 0, 5, 5);
		gbc_insulinTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_insulinTxt.gridx = 1;
		gbc_insulinTxt.gridy = 7;
		panel_vucutDegerleri.add(insulinTxt, gbc_insulinTxt);
		insulinTxt.setColumns(10);

		JLabel lblNewLabel_19 = new JLabel("Testosteron :");
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 2;
		gbc_lblNewLabel_19.gridy = 7;
		panel_vucutDegerleri.add(lblNewLabel_19, gbc_lblNewLabel_19);

		testosteronTxt = new JTextField();
		GridBagConstraints gbc_testosteronTxt = new GridBagConstraints();
		gbc_testosteronTxt.insets = new Insets(0, 0, 5, 5);
		gbc_testosteronTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_testosteronTxt.gridx = 3;
		gbc_testosteronTxt.gridy = 7;
		panel_vucutDegerleri.add(testosteronTxt, gbc_testosteronTxt);
		testosteronTxt.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("OGTT :");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 8;
		panel_vucutDegerleri.add(lblNewLabel_4, gbc_lblNewLabel_4);

		ogttTxt = new JTextField();
		GridBagConstraints gbc_ogttTxt = new GridBagConstraints();
		gbc_ogttTxt.insets = new Insets(0, 0, 5, 5);
		gbc_ogttTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_ogttTxt.gridx = 1;
		gbc_ogttTxt.gridy = 8;
		panel_vucutDegerleri.add(ogttTxt, gbc_ogttTxt);
		ogttTxt.setColumns(10);

		JLabel lblNewLabel_20 = new JLabel("Prolaktin :");
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 2;
		gbc_lblNewLabel_20.gridy = 8;
		panel_vucutDegerleri.add(lblNewLabel_20, gbc_lblNewLabel_20);

		prolaktinTxt = new JTextField();
		GridBagConstraints gbc_prolaktinTxt = new GridBagConstraints();
		gbc_prolaktinTxt.insets = new Insets(0, 0, 5, 5);
		gbc_prolaktinTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_prolaktinTxt.gridx = 3;
		gbc_prolaktinTxt.gridy = 8;
		panel_vucutDegerleri.add(prolaktinTxt, gbc_prolaktinTxt);
		prolaktinTxt.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Total Kolestrol :");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 9;
		panel_vucutDegerleri.add(lblNewLabel_5, gbc_lblNewLabel_5);

		t_kolestrolTxt = new JTextField();
		GridBagConstraints gbc_t_kolestrolTxt = new GridBagConstraints();
		gbc_t_kolestrolTxt.insets = new Insets(0, 0, 5, 5);
		gbc_t_kolestrolTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_t_kolestrolTxt.gridx = 1;
		gbc_t_kolestrolTxt.gridy = 9;
		panel_vucutDegerleri.add(t_kolestrolTxt, gbc_t_kolestrolTxt);
		t_kolestrolTxt.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("Homosistein :");
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 2;
		gbc_lblNewLabel_15.gridy = 9;
		panel_vucutDegerleri.add(lblNewLabel_15, gbc_lblNewLabel_15);

		homosisteinTxt = new JTextField();
		GridBagConstraints gbc_homosisteinTxt = new GridBagConstraints();
		gbc_homosisteinTxt.insets = new Insets(0, 0, 5, 5);
		gbc_homosisteinTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_homosisteinTxt.gridx = 3;
		gbc_homosisteinTxt.gridy = 9;
		panel_vucutDegerleri.add(homosisteinTxt, gbc_homosisteinTxt);
		homosisteinTxt.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Trigliserid :");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 10;
		panel_vucutDegerleri.add(lblNewLabel_6, gbc_lblNewLabel_6);

		trigliseritTxt = new JTextField();
		GridBagConstraints gbc_trigliseritTxt = new GridBagConstraints();
		gbc_trigliseritTxt.insets = new Insets(0, 0, 5, 5);
		gbc_trigliseritTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_trigliseritTxt.gridx = 1;
		gbc_trigliseritTxt.gridy = 10;
		panel_vucutDegerleri.add(trigliseritTxt, gbc_trigliseritTxt);
		trigliseritTxt.setColumns(10);

		JLabel lblNewLabel_21 = new JLabel("CRP :");
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_21.gridx = 2;
		gbc_lblNewLabel_21.gridy = 10;
		panel_vucutDegerleri.add(lblNewLabel_21, gbc_lblNewLabel_21);

		crpTxt = new JTextField();
		GridBagConstraints gbc_crpTxt = new GridBagConstraints();
		gbc_crpTxt.insets = new Insets(0, 0, 5, 5);
		gbc_crpTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_crpTxt.gridx = 3;
		gbc_crpTxt.gridy = 10;
		panel_vucutDegerleri.add(crpTxt, gbc_crpTxt);
		crpTxt.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("LDL :");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 11;
		panel_vucutDegerleri.add(lblNewLabel_7, gbc_lblNewLabel_7);

		LdlTxt = new JTextField();
		GridBagConstraints gbc_ldlTxt = new GridBagConstraints();
		gbc_ldlTxt.insets = new Insets(0, 0, 5, 5);
		gbc_ldlTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_ldlTxt.gridx = 1;
		gbc_ldlTxt.gridy = 11;
		panel_vucutDegerleri.add(LdlTxt, gbc_ldlTxt);

		JLabel lblTarih = new JLabel("Tarih :");
		GridBagConstraints gbc_lblTarih = new GridBagConstraints();
		gbc_lblTarih.anchor = GridBagConstraints.EAST;
		gbc_lblTarih.insets = new Insets(0, 0, 5, 5);
		gbc_lblTarih.gridx = 2;
		gbc_lblTarih.gridy = 11;
		panel_vucutDegerleri.add(lblTarih, gbc_lblTarih);

		tarihTxt = new JTextField();
		GridBagConstraints gbc_tarihTxt = new GridBagConstraints();
		gbc_tarihTxt.insets = new Insets(0, 0, 5, 5);
		gbc_tarihTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tarihTxt.gridx = 3;
		gbc_tarihTxt.gridy = 11;
		panel_vucutDegerleri.add(tarihTxt, gbc_tarihTxt);
		tarihTxt.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("HDL :");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 12;
		panel_vucutDegerleri.add(lblNewLabel_8, gbc_lblNewLabel_8);

		hdlTxt = new JTextField();
		GridBagConstraints gbc_hdlTxt = new GridBagConstraints();
		gbc_hdlTxt.insets = new Insets(0, 0, 5, 5);
		gbc_hdlTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_hdlTxt.gridx = 1;
		gbc_hdlTxt.gridy = 12;
		panel_vucutDegerleri.add(hdlTxt, gbc_hdlTxt);
		hdlTxt.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("\u00DCrik Asit :");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 13;
		panel_vucutDegerleri.add(lblNewLabel_9, gbc_lblNewLabel_9);

		urikasitTxt = new JTextField();
		GridBagConstraints gbc_urikasitTxt = new GridBagConstraints();
		gbc_urikasitTxt.insets = new Insets(0, 0, 5, 5);
		gbc_urikasitTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_urikasitTxt.gridx = 1;
		gbc_urikasitTxt.gridy = 13;
		panel_vucutDegerleri.add(urikasitTxt, gbc_urikasitTxt);
		urikasitTxt.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("Kortizol :");
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 0;
		gbc_lblNewLabel_14.gridy = 14;
		panel_vucutDegerleri.add(lblNewLabel_14, gbc_lblNewLabel_14);

		kortizolTxt = new JTextField();
		GridBagConstraints gbc_kortizolTxt = new GridBagConstraints();
		gbc_kortizolTxt.insets = new Insets(0, 0, 5, 5);
		gbc_kortizolTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_kortizolTxt.gridx = 1;
		gbc_kortizolTxt.gridy = 14;
		panel_vucutDegerleri.add(kortizolTxt, gbc_kortizolTxt);
		kortizolTxt.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("Alkalenfosfataz :");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 0;
		gbc_lblNewLabel_13.gridy = 15;
		panel_vucutDegerleri.add(lblNewLabel_13, gbc_lblNewLabel_13);

		a_fosfatazTxt = new JTextField();
		GridBagConstraints gbc_a_fosfatazTxt = new GridBagConstraints();
		gbc_a_fosfatazTxt.insets = new Insets(0, 0, 5, 5);
		gbc_a_fosfatazTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_a_fosfatazTxt.gridx = 1;
		gbc_a_fosfatazTxt.gridy = 15;
		panel_vucutDegerleri.add(a_fosfatazTxt, gbc_a_fosfatazTxt);
		a_fosfatazTxt.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("GGT :");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 0;
		gbc_lblNewLabel_12.gridy = 16;
		panel_vucutDegerleri.add(lblNewLabel_12, gbc_lblNewLabel_12);

		ggtTxt = new JTextField();
		GridBagConstraints gbc_ggtTxt = new GridBagConstraints();
		gbc_ggtTxt.insets = new Insets(0, 0, 5, 5);
		gbc_ggtTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_ggtTxt.gridx = 1;
		gbc_ggtTxt.gridy = 16;
		panel_vucutDegerleri.add(ggtTxt, gbc_ggtTxt);
		ggtTxt.setColumns(10);

		kaydetBtn = new JButton("Kaydet");
		GridBagConstraints gbc_kaydetBtn = new GridBagConstraints();
		gbc_kaydetBtn.insets = new Insets(0, 0, 5, 0);
		gbc_kaydetBtn.gridx = 5;
		gbc_kaydetBtn.gridy = 16;
		panel_vucutDegerleri.add(kaydetBtn, gbc_kaydetBtn);
	}

	public MuayeneKaydet() {
		gorsel();
	}

}
