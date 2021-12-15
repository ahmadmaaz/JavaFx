package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.Node;
import java.io.File;

public class LoginPageController {
	private Stage stage;
	private Scene scene;
	@FXML
	private PasswordField Password;
	@FXML
	private Button Sign_btn;
    @FXML
    private ImageView pass_img;
    @FXML
    private ImageView user_img;
    @FXML
    private Hyperlink Create_Acc;
	@FXML
	private TextField Username;
    @FXML
    private Label case_error;
    @FXML
    
   
    
    void Sign_in(ActionEvent event) throws IOException{
    	
    	if (ReadAndCheck.Read_And_Check(Username.getText(),Password.getText(),0) != true) {
    		Parent root = FXMLLoader.load(getClass().getResource("prize.fxml"));
    		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    		scene= new Scene(root);
    		stage.setScene(scene);
    		stage.show();
    	}else { case_error.setText("Incorrect Password or username");}
    }
    
    @FXML
    void Create_Acc(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("SignUpPage.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene= new Scene(root);
		stage.setScene(scene);
		stage.show();
		
    }
}
