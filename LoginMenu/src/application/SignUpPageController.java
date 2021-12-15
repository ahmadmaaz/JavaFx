package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;


public class SignUpPageController {
	public static String Account_username;
	public static String Account_password;
	private Stage stage;
	private Scene scene;

    @FXML
    private Label case_error;
	@FXML
	private PasswordField Password;
	@FXML
	private Button Create_btn;
	@FXML
	private TextField Username;
	@FXML
	private Hyperlink Back_to_Log;
	@FXML
	private CheckBox Python_Que;
    @FXML
    private ImageView pass_img;
    @FXML
    private ImageView user_img;
	
	File db_file = new File("db.txt");
	// Event Listener on Button[#Create_btn].onAction
	@FXML
	public void Create_Acc(ActionEvent event) {
		try {
		
		PrintWriter out = new PrintWriter(new FileWriter(db_file, true));
		if (Username.getText()!="" && Password.getText()!="") {
		
		if(ReadAndCheck.Read_And_Check(Username.getText(),Password.getText(),1)) {
			out.append("\n"+ Username.getText()+"//"+Password.getText());
			out.close();
			case_error.setText("");
			Alert alert= new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Account");
			alert.setHeaderText("You have Created an account");
			alert.setContentText("Please return to login page");
			alert.showAndWait();
		}
		else { case_error.setText("This username is taken");}

		}else{
			case_error.setText("Please Fill Out All Fields"); 
			}
		}
		catch (IOException e) {
	      System.out.println("Error ");
	      e.printStackTrace();
	    }}
	// Event Listener on Hyperlink[#Back_to_Log].onAction
	@FXML
	public void Back_to_log(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		stage =( Stage)((Node)event.getSource()).getScene().getWindow();
		scene= new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
