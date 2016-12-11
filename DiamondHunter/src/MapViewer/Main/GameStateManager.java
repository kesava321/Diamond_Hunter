// The GameStateManager does exactly what its
// name says. It contains a list of GameStates.
// It decides which GameState to update() and
// draw() and handles switching between different
// GameStates.

package MapViewer.Main;

import java.awt.Graphics2D;

import MapViewer.Main.PlayState;


public class GameStateManager {
	
	private PlayState gameState;
	
	public GameStateManager() {
		
		gameState = new PlayState(this);
		gameState.init();
		
	}
	
	public void update() {
		gameState.update();
	}
	
	public void draw(Graphics2D g) {
		gameState.draw(g);
	}
	
}
