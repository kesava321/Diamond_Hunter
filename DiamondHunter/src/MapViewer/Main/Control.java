package MapViewer.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Control {

	private static String button = "";
	
	@FXML Button axeButton;
	@FXML Button boatButton;
	@FXML public void onAxeButtonPressed() {
		
		setButton("Axe");
		
	}
	@FXML public void onBoatButtonPressed() {
		setButton("Boat");
	}

	
	public static void setButton(String s){
		button = s;
	}
	
	public static String getButton(){
		return button;
	}
	
	
	
	
    
}


		