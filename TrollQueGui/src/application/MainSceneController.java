package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.input.MouseEvent;

public class MainSceneController {
	@FXML
	private Button No_btn;
	@FXML
	private Button Yes_btn;
	@FXML
	private Label Text1;

	@FXML
	public void No_hover(MouseEvent event) {
		No_btn.setLayoutY(Math.random()*(250-160+1)+160  );
		No_btn.setLayoutX(Math.random()*(140-0+1)+0  );
	}
	@FXML
	public void No_click(ActionEvent event) {
		No_btn.setLayoutY(Math.random()*(250-160+1)+160  );
		No_btn.setLayoutX(Math.random()*(140-0+1)+0  );
	}
	// Event Listener on Button[#Yes_btn].onAction
	@FXML
	public void Yes_click(ActionEvent event) {
		Text1.setText("Good Boy/Girl!");
		
		
	}
	public void Yes_hover_1(MouseEvent event) {
		Text1.setText("GO ON CLICK IT");
		
	}
	public void Yes_hover_2(MouseEvent event) {
		Text1.setText("Are You Stupid??");
	}
}
