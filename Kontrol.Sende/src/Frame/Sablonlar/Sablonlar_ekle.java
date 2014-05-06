package Sablonlar;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Sablonlar_ekle extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField sabloAdiTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Sablonlar_ekle frame = new Sablonlar_ekle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void gorsel() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 698, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 300, 91, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 220, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		sabloAdiTxt = new JTextField();
		GridBagConstraints gbc_sabloAdiTxt = new GridBagConstraints();
		gbc_sabloAdiTxt.insets = new Insets(0, 0, 5, 5);
		gbc_sabloAdiTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_sabloAdiTxt.gridx = 2;
		gbc_sabloAdiTxt.gridy = 1;
		panel.add(sabloAdiTxt, gbc_sabloAdiTxt);
		sabloAdiTxt.setColumns(10);

		JButton kaydetBtn_sablolar = new JButton("Kaydet");
		GridBagConstraints gbc_kaydetBtn_sablolar = new GridBagConstraints();
		gbc_kaydetBtn_sablolar.fill = GridBagConstraints.HORIZONTAL;
		gbc_kaydetBtn_sablolar.insets = new Insets(0, 0, 5, 5);
		gbc_kaydetBtn_sablolar.gridx = 3;
		gbc_kaydetBtn_sablolar.gridy = 1;
		panel.add(kaydetBtn_sablolar, gbc_kaydetBtn_sablolar);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 2;
		panel.add(scrollPane, gbc_scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {
				{ "dgbfh", "hfdh", "1235" }, { "aasf", "sdfsdf", "3445" },
				{ "ssdfg", "sg", "8787" }, { null, null, null },
				{ null, null, null }, { null, null, null }, }, new String[] {
				"Besin Ad\u0131", "Besin Miktar\u0131",
				"Kalori Miktar\u0131(cal)" }));
		scrollPane.setViewportView(table);
	}

	public Sablonlar_ekle() {
		gorsel();

	}

}
