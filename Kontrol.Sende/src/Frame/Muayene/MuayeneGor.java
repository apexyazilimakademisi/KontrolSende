package Muayene;

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

public class MuayeneGor extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField m_araTxt;
	private JButton m_araBtn;
	private JButton btnGrntle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MuayeneGor frame = new MuayeneGor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void gorsel() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 717, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 83, 93, 96, 259, 91, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 149, 0, 61, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		m_araBtn = new JButton("Ara");
		GridBagConstraints gbc_m_araBtn = new GridBagConstraints();
		gbc_m_araBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_m_araBtn.insets = new Insets(0, 0, 5, 5);
		gbc_m_araBtn.gridx = 1;
		gbc_m_araBtn.gridy = 0;
		panel.add(m_araBtn, gbc_m_araBtn);

		m_araTxt = new JTextField();
		GridBagConstraints gbc_m_araTxt = new GridBagConstraints();
		gbc_m_araTxt.gridwidth = 2;
		gbc_m_araTxt.insets = new Insets(0, 0, 5, 5);
		gbc_m_araTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_m_araTxt.gridx = 2;
		gbc_m_araTxt.gridy = 0;
		panel.add(m_araTxt, gbc_m_araTxt);
		m_araTxt.setColumns(10);

		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		panel.add(scrollPane, gbc_scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, }, new String[] { "Ad", "Soyad",
				"Muayene Tarihi", "A\u00E7\u0131klama" }));
		table.getColumnModel().getColumn(1).setPreferredWidth(101);
		table.getColumnModel().getColumn(2).setPreferredWidth(126);
		table.getColumnModel().getColumn(3).setPreferredWidth(178);
		scrollPane.setViewportView(table);

		btnGrntle = new JButton("G\u00F6r\u00FCnt\u00FCle");
		GridBagConstraints gbc_btnGrntle = new GridBagConstraints();
		gbc_btnGrntle.insets = new Insets(0, 0, 5, 5);
		gbc_btnGrntle.gridx = 1;
		gbc_btnGrntle.gridy = 2;
		panel.add(btnGrntle, gbc_btnGrntle);
	}

	public MuayeneGor() {
		gorsel();

	}

}
