package MapViewer.Main;
import java.awt.image.BufferedImage;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();
            Scene scene = new Scene(root);
            //Parent content = FXMLLoader.load(getClass().getClassLoader().getResource("mapviewer.fxml"));
            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            GridPane gp = new GridPane();
            TileMap map = new TileMap(16);
            map.loadTiles("/Tilesets/testtileset.gif");
    		map.loadMap("/Maps/testmap.map");
    		
            for(int y = 0; y < map.getNumCols(); y++){
            	
            	for(int x = 0; x < map.getNumRows(); x++){
            		ImageView view = new ImageView();
            		
            		BufferedImage temp = map.getImage(x, y);
            		Image i = SwingFXUtils.toFXImage(temp, null);
            		view.setImage(i);
            		GridPane.setConstraints(view, y, x);
            		gp.getChildren().add(view);
            	}
            	
            }
            root.setCenter(gp);

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

