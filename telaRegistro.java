package telaRegistro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class telaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JPanel panel_3;
	private JTextField txtEmail;
	private JPanel panel_1_1;
	private JPasswordField txtSenha1;
	private JLabel lblNewLabel;
	private JButton btnEnviar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaRegistro frame = new telaRegistro();
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
	public telaRegistro() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new LineBorder(new Color(255, 218, 185), 2));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 225));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(170, 116, 266, 38);
		panel.add(panel_1);
		
		txtNome = new JTextField();
		txtNome.setText("Nome completo");
		txtNome.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNome.setColumns(10);
		txtNome.setBorder(null);
		txtNome.setBounds(10, 11, 153, 20);
		panel_1.add(txtNome);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(170, 165, 266, 38);
		panel.add(panel_3);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBounds(10, 11, 153, 20);
		panel_3.add(txtEmail);
		
		panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(170, 214, 266, 38);
		panel.add(panel_1_1);
		
		txtSenha1 = new JPasswordField();
		txtSenha1.setText("password");
		txtSenha1.setBorder(null);
		txtSenha1.setBounds(10, 11, 173, 20);
		panel_1_1.add(txtSenha1);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Você tem certeza que quer sair?", "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
					telaRegistro.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.red);
			}
		});
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblX.setBounds(576, 0, 20, 20);
		panel.add(lblX);
		
		lblNewLabel = new JLabel("FA\u00C7A O SEU CADASTRO!");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel.setBounds(145, 11, 317, 113);
		panel.add(lblNewLabel);
		
		btnEnviar = new JButton("  ENVIAR");
		btnEnviar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = txtEmail.getText();
				String nomecompleto = txtNome.getText();
				String senha = txtSenha1.getText();
			}
		});
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setFont(new Font("Arial", Font.BOLD, 14));
		btnEnviar.setBorder(null);
		btnEnviar.setBackground(new Color(255, 182, 193));
		btnEnviar.setBounds(257, 263, 99, 40);
		panel.add(btnEnviar);
	}
}
