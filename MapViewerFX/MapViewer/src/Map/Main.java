package Map;

package com.neet.DiamondHunter.Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import com.neet.DiamondHunter.TileMap.TileMap;

public class Main extends Application {




    public class Mymap extends Application{

        @Override
        public void start(Stage stage) throws Exception {
            //create a border pane
            Group root = new Group();
	  /*  BorderPane  borderPane = new BorderPane();
	    Scene scene = new Scene(borderPane);
	 // load map
 		TileMap tileMap = new TileMap(16);
 		tileMap.loadTiles("/Tilesets/testtileset.gif");
 		Node mvwNode = tileMap.loadMap("/Maps/testmap.map");

	 	borderPane.setCenter(tileMap);
	    */

            Scene scene = new Scene(root, 500, 500, Color.BLACK);
            // load map
            TileMap tileMap = new TileMap(16);
            tileMap.loadTiles("/Tilesets/testtileset.gif");
            tileMap.loadMap("/Maps/testmap.map");
}
        Rectangle r = new Rectangle(25,25,250,250);
       r.setFill(Color.BLUE);
       root.getChildren().add(r);


       stage.setTitle("JavaFX Scene Graph Demo");
       stage.setScene(scene);
       stage.show();

    }

    @Override public void stop() throws Exception {
        //release resources when the application closes

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}