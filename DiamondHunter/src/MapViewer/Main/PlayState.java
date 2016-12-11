// The main playing GameState.
// Contains everything you need for gameplay:
// Player, TileMap, Diamonds, etc.
// Updates and draws all game objects.

package MapViewer.Main;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;


import MapViewer.Main.GamePanel;
import MapViewer.Main.Data;
import MapViewer.Main.GameStateManager;
import MapViewer.Main.Keys;
import MapViewer.Main.TileMap;

public class PlayState extends GameState {
	
	// tilemap
	private TileMap tileMap;
	
	// camera position
	private int xsector;
	private int ysector;
	private int sectorSize;
	
	// events
	private boolean blockInput;
	private boolean eventStart;
	private boolean eventFinish;
	private int eventTick;
	
	// transition box
	private ArrayList<Rectangle> boxes;
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void init() {
		
		// load map
		tileMap = new TileMap(16);
		tileMap.loadTiles("testtileset.gif");
		tileMap.loadMap("testmap.map");
		
		// set up camera position
		sectorSize = GamePanel.WIDTH;
		xsector = 40 / sectorSize;
		ysector = 40 / sectorSize;
		tileMap.setPositionImmediately(-xsector * sectorSize, -ysector * sectorSize);
		
		// start event
		boxes = new ArrayList<Rectangle>();
		eventStart = true;
		eventStart();
	}
	
	public void update() {
		
		// check keys
		handleInput();
		
		// check events
		if(eventStart) eventStart();
		if(eventFinish) eventFinish();
		
		// update camera
		tileMap.update();
		
		if(tileMap.isMoving()) return;
	}
	
	public void draw(Graphics2D g) {
		
		// draw tilemap
		tileMap.draw(g);
		
		// draw transition boxes
		g.setColor(java.awt.Color.BLACK);
		for(int i = 0; i < boxes.size(); i++) {
			g.fill(boxes.get(i));
		}
		
	}
	
	public void handleInput() {
		if(blockInput) return;
	}
	
	//===============================================
	
	private void eventStart() {
		eventTick++;
		if(eventTick == 1) {
			boxes.clear();
			for(int i = 0; i < 9; i++) {
				boxes.add(new Rectangle(0, i * 40, GamePanel.WIDTH, 40));
			}
		}
		if(eventTick > 1 && eventTick < 32) {
			for(int i = 0; i < boxes.size(); i++) {
				Rectangle r = boxes.get(i);
				if(i % 2 == 0) {
					r.x -= 4;
				}
				else {
					r.x += 4;
				}
			}
		}
		if(eventTick == 33) {
			boxes.clear();
			eventStart = false;
			eventTick = 0;
		}
	}
	
	private void eventFinish() {
		eventTick++;
		if(eventTick == 1) {
			boxes.clear();
			for(int i = 0; i < 9; i++) {
				if(i % 2 == 0) boxes.add(new Rectangle(-128, i * 16, GamePanel.WIDTH, 16));
				else boxes.add(new Rectangle(128, i * 16, GamePanel.WIDTH, 16));
			}
		}
		if(eventTick > 1) {
			for(int i = 0; i < boxes.size(); i++) {
				Rectangle r = boxes.get(i);
				if(i % 2 == 0) {
					if(r.x < 0) r.x += 4;
				}
				else {
					if(r.x > 0) r.x -= 4;
				}
			}
		}
	}
	
}
