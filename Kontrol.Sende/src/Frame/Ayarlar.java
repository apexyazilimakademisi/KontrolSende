import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class Ayarlar extends JFrame {

	private JPanel contentPane;
	private JTextField kullanýcýAdiTxt;
	private JPasswordField g_sifreTxt;
	private JPasswordField y_sifreTxt;
	private JTextField y_sifre2Txt;
	private JTextField sifreTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Ayarlar frame = new Ayarlar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void gorsel() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 571, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Hesap Ayarlarý", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 86, 0, 0, 276, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 97, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblKullancAd = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		GridBagConstraints gbc_lblKullancAd = new GridBagConstraints();
		gbc_lblKullancAd.anchor = GridBagConstraints.EAST;
		gbc_lblKullancAd.insets = new Insets(0, 0, 5, 5);
		gbc_lblKullancAd.gridx = 1;
		gbc_lblKullancAd.gridy = 1;
		panel.add(lblKullancAd, gbc_lblKullancAd);

		kullanýcýAdiTxt = new JTextField();
		GridBagConstraints gbc_kullanýcýAdiTxt = new GridBagConstraints();
		gbc_kullanýcýAdiTxt.gridwidth = 2;
		gbc_kullanýcýAdiTxt.insets = new Insets(0, 0, 5, 5);
		gbc_kullanýcýAdiTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_kullanýcýAdiTxt.gridx = 3;
		gbc_kullanýcýAdiTxt.gridy = 1;
		panel.add(kullanýcýAdiTxt, gbc_kullanýcýAdiTxt);
		kullanýcýAdiTxt.setColumns(10);

		JLabel lblifre = new JLabel("\u015Eifre :");
		GridBagConstraints gbc_lblifre = new GridBagConstraints();
		gbc_lblifre.anchor = GridBagConstraints.EAST;
		gbc_lblifre.insets = new Insets(0, 0, 5, 5);
		gbc_lblifre.gridx = 1;
		gbc_lblifre.gridy = 2;
		panel.add(lblifre, gbc_lblifre);

		sifreTxt = new JTextField();
		GridBagConstraints gbc_sifreTxt = new GridBagConstraints();
		gbc_sifreTxt.gridwidth = 2;
		gbc_sifreTxt.insets = new Insets(0, 0, 5, 5);
		gbc_sifreTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_sifreTxt.gridx = 3;
		gbc_sifreTxt.gridy = 2;
		panel.add(sifreTxt, gbc_sifreTxt);
		sifreTxt.setColumns(10);

		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.gridwidth = 5;
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 5;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				1.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JLabel lblGeerliOlanifre = new JLabel("Ge\u00E7erli Olan \u015Eifre :");
		GridBagConstraints gbc_lblGeerliOlanifre = new GridBagConstraints();
		gbc_lblGeerliOlanifre.anchor = GridBagConstraints.EAST;
		gbc_lblGeerliOlanifre.insets = new Insets(0, 0, 5, 5);
		gbc_lblGeerliOlanifre.gridx = 0;
		gbc_lblGeerliOlanifre.gridy = 0;
		panel_2.add(lblGeerliOlanifre, gbc_lblGeerliOlanifre);

		g_sifreTxt = new JPasswordField();
		GridBagConstraints gbc_g_sifreTxt = new GridBagConstraints();
		gbc_g_sifreTxt.insets = new Insets(0, 0, 5, 0);
		gbc_g_sifreTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_g_sifreTxt.gridx = 2;
		gbc_g_sifreTxt.gridy = 0;
		panel_2.add(g_sifreTxt, gbc_g_sifreTxt);

		JLabel lblYeniifre = new JLabel("Yeni \u015Eifre :");
		GridBagConstraints gbc_lblYeniifre = new GridBagConstraints();
		gbc_lblYeniifre.anchor = GridBagConstraints.EAST;
		gbc_lblYeniifre.insets = new Insets(0, 0, 5, 5);
		gbc_lblYeniifre.gridx = 0;
		gbc_lblYeniifre.gridy = 1;
		panel_2.add(lblYeniifre, gbc_lblYeniifre);

		y_sifreTxt = new JPasswordField();
		GridBagConstraints gbc_y_sifreTxt = new GridBagConstraints();
		gbc_y_sifreTxt.insets = new Insets(0, 0, 5, 0);
		gbc_y_sifreTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_y_sifreTxt.gridx = 2;
		gbc_y_sifreTxt.gridy = 1;
		panel_2.add(y_sifreTxt, gbc_y_sifreTxt);

		JLabel lblYeniifreTekrar = new JLabel("Yeni \u015Eifre Tekrar :");
		GridBagConstraints gbc_lblYeniifreTekrar = new GridBagConstraints();
		gbc_lblYeniifreTekrar.anchor = GridBagConstraints.EAST;
		gbc_lblYeniifreTekrar.insets = new Insets(0, 0, 5, 5);
		gbc_lblYeniifreTekrar.gridx = 0;
		gbc_lblYeniifreTekrar.gridy = 2;
		panel_2.add(lblYeniifreTekrar, gbc_lblYeniifreTekrar);

		y_sifre2Txt = new JTextField();
		GridBagConstraints gbc_y_sifre2Txt = new GridBagConstraints();
		gbc_y_sifre2Txt.insets = new Insets(0, 0, 5, 0);
		gbc_y_sifre2Txt.fill = GridBagConstraints.HORIZONTAL;
		gbc_y_sifre2Txt.gridx = 2;
		gbc_y_sifre2Txt.gridy = 2;
		panel_2.add(y_sifre2Txt, gbc_y_sifre2Txt);
		y_sifre2Txt.setColumns(10);

		JButton duzenleBtn = new JButton("D\u00FCzenle");
		GridBagConstraints gbc_duzenleBtn = new GridBagConstraints();
		gbc_duzenleBtn.insets = new Insets(0, 0, 5, 0);
		gbc_duzenleBtn.gridx = 2;
		gbc_duzenleBtn.gridy = 3;
		panel_2.add(duzenleBtn, gbc_duzenleBtn);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Bildirim Ayarlarý", null, panel_1, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JCheckBox chckbxNewCheckBox = new JCheckBox(
				"Hastalardan Bildirim Almak \u0130stiyorum");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.gridwidth = 3;
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 1;
		panel_1.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
	}

	public Ayarlar() {
		gorsel();

	}

}
