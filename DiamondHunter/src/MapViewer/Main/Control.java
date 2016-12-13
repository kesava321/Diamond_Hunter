package MapViewer.Main;

import java.awt.Point;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Control {

	private static String button = "";
	private static Point axe = null;
	private static Point boat = null;
	
	@FXML Button axeButton;
	@FXML Button boatButton;
	@FXML public void onAxeButtonPressed() {
		
		setButton("axe");
		
	}
	@FXML public void onBoatButtonPressed() {
		setButton("boat");
	}

	
	public static void setButton(String s){
		button = s;
	}
	
	public static String getButton(){
		return button;
	}
	
	
	
	public static void setAxe(int x, int y){
		axe.x = x;
		axe.y = y;
	}
	
	public static Point getAxe(){
		return axe;
	}
	
	public static void setBoat(int x, int y){
		boat.x = x;
		boat.y = y;
	}
	
	public static Point getBoat(){
		return boat;
	}
	
	
    
}


		