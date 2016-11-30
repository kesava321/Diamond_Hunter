package Map;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  public static TileLayer FromFile (String fileName)
  {
      TileLayer layer = null;

      ArrayList<ArrayList<Integer>> tempLayout = new ArrayList<>();

      try(BufferReader br = new BufferReader(new FileReader(fileName)))
      {
            String currentLine;

            while(currentLine=br.readLine()) != null)
          {
              if (currentLine.isEmpty())
                  continue;

              ArrayList<Integer> row = new ArrayList<>();
              String[] values = currentLine.trim(). split("");

              for (String string :values)
              {
                  if(!string.isEmpty())
                  {
                      int id = Integer.parseInt(string);

                      row.add(id);
                  }
              }

              tempLayout.add(row)
          }
      }


  }




    public static void main(String[] args) {
        launch(args);
    }
}
