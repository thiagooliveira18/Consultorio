package gui;

import java.io.Serializable;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@FXML
	private TextField txtUser;
	
	@FXML
	private PasswordField txtPass;
	
	@FXML
	private Button btLogin;
	
	public void onBtLoginAction() {
		String username = txtUser.getText();
		String password = txtPass.getText();
		
		System.out.println("Usuário: " + username);
		System.out.println("Senha: " + password);
	}
	
}
