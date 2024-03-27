package javafxdemoapplication;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button btn =new Button();
		Button exit =new Button();
		btn.setText("Say Hello World");
		exit.setText("Cancle");
		exit.setOnAction(e->System.exit(0)); 
		btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				System.out.println("Hello Guys");
			}
		});
		VBox root = new VBox();
		root.getChildren().addAll(btn,exit);
		try {
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("Hello Wolrd");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
