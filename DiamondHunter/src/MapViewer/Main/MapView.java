package MapViewer.Main;/**
 * Created by Kesava on 04/12/2016.
 */

import javafx.application.Application;
import javafx.stage.Stage;


import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MapView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    public static TileGrid loadMap(String mapName){
        TileGrid grid = new TileGrid();
        try{

        } catch (Exception e){
            e.printStackTrace();
        }
        for (int i=0; i<grid.getTileWidth();i++){
            for (int j=0; j< grid.getTilesHight(); j++){

            }
        }
        return grid
    }

    /*
    public MapView (int width, int height)
    {
        map = new int[height][width];
    }
    public static MapView FromFile(String fileName)
    {
        MapView layer = null;
        ArrayList<ArrayList<Integer>> tempLayout = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String currentLine;

            while((currentLine = br.readLine())!=null)
            {
                if(currentLine.isEmpty())
                    continue;
                ArrayList<Integer> row = new ArrayList<>();
                String[] values = currentLine.trim().split ("");
                for (String string : values)
                {
                    if(!string.isEmpty())
                    {
                        int id = Integer.parseInt(string);
                        row.add(id);
                    }
                }
                tempLayout.add(row);
            }
        }
        catch(IOException e)
        {

        }
        int width = tempLayout.get(0).size();
        int height= tempLayout.size();

        layer = new MapView(width, height);

        for(int y=0;y<height;y++)
        {
            for(int x=0;x<width;x++)
            {
                layer.map[y][x] = tempLayout.get(y).get(x);
            }
        }
        layer.tileSheet = layer.LoadTileSheet("stackedTileSheet.jpg");

                return layer;
    }
    public DrawPanel()
    {
        layer = TileLayer.FromFile("map.txt");
    }

    @Override public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        layer.DrawLayer(g);
    }
*/
}
