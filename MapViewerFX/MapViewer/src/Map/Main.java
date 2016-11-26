package Map;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mapviewer.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        try {
            BorderPane root = new BorderPane();
            Scene scene = new Scene(root,600,600);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            Parent content = FXMLLoader.load(getClass().getClassLoader().getResource("mapviewer.fxml"));
            root.setCenter(content);

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
