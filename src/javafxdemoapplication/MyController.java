package javafxdemoapplication;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyController {
	@FXML
	private Label myMessage;
	public void generateRandom(ActionEvent event) {
		Random rand = new Random();
		int myrand = rand.nextInt(50) + 1;
		myMessage.setText(Integer.toString(myrand));
	}
	

}
