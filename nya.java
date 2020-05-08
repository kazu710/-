import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Nya extends Application {


    public void start(Stage primaryStage) {

        Button btn = new Button();
        btn.setText("(」・ω・)」うー！(／・ω・)／にゃー！");
        btn.setOnAction(new EventHandler<ActionEvent>() {

        	int i=0;
            public void handle(ActionEvent event) {
            	if((i%2)==0) {
                    System.out.print("(」・ω・)」うー！");
            	}else {
                    System.out.println("(／・ω・)／にゃー！");
            	}
            	i++;
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("(」・ω・)」うー！(／・ω・)／にゃー！");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
