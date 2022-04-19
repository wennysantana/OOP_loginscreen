package trabalhopoo;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import Jogo.JogoDaVelha;
import telaRegistro.telaRegistro;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaLogin extends JFrame {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaLogin frame = new telaLogin();
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
	public telaLogin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new LineBorder(new Color(255, 218, 185), 2, true));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 225));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(181, 147, 250, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBorder(null);
		txtUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsuario.setText("Login");
		txtUsuario.setBounds(10, 11, 173, 20);
		panel_1.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(181, 198, 250, 40);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		txtSenha = new JPasswordField();
		txtSenha.setBorder(null);
		txtSenha.setText("password");
		txtSenha.setBounds(10, 11, 173, 20);
		panel_1_1.add(txtSenha);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Você tem certeza que quer sair?", "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
					telaLogin.this.dispose();
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
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setBounds(176, 31, 250, 105);
		panel.add(lblIconLogo);
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.setLayout(null);
		pnlBtnLogin.setBackground(new Color(255, 182, 193));
		pnlBtnLogin.setBounds(181, 249, 99, 40);
		panel.add(pnlBtnLogin);
		
		JButton btnEntrar = new JButton("  ENTRAR");
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setFont(new Font("Arial", Font.BOLD, 14));
		btnEntrar.setBorder(null);
		btnEntrar.setBackground(new Color(255, 182, 193));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = txtSenha.getText();
				String username = txtUsuario.getText();
				
				if (password.contains("wenny") && username.contains("wennysantana")){
					txtSenha.setText(null);
					txtUsuario.setText(null);

					JogoDaVelha info = new JogoDaVelha();
					JogoDaVelha.main(null);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Dados Inválidos\nTente novamente!", "Erro ao logar", JOptionPane.ERROR_MESSAGE);
					txtSenha.setText(null);
					txtUsuario.setText(null);	
				}
				
			}
		});
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setBounds(0, 0, 99, 40);
		pnlBtnLogin.add(btnEntrar);
		
		JLabel lblNewLabel = new JLabel("FA\u00C7A O SEU LOGIN!");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 34));
		lblNewLabel.setBounds(166, 48, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FA\u00C7A O SEU LOGIN!");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_1.setBounds(176, 31, 317, 113);
		panel.add(lblNewLabel_1);
		
		JButton btnCadastro = new JButton("  CADASTRE-SE");
		btnCadastro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaRegistro info = new telaRegistro();
				telaRegistro.main(null);
				dispose();
				
			}
		});
		btnCadastro.setForeground(Color.WHITE);
		btnCadastro.setFont(new Font("Arial", Font.BOLD, 14));
		btnCadastro.setBorder(null);
		btnCadastro.setBackground(new Color(255, 182, 193));
		btnCadastro.setBounds(303, 249, 128, 40);
		panel.add(btnCadastro);
//		lblIconLogo.setIcon(new ImageIcon(img_logo));
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
