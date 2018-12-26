package Joni.Motor.engine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TeclatListener implements KeyListener{
	
	private boolean[] keys =new boolean[256];

	public void keyPressed(KeyEvent event) {
		keys[event.getKeyCode()]=true;
	}

	public void keyReleased(KeyEvent event) {
		keys[event.getKeyCode()]=false;
	}

	public void keyTyped(KeyEvent event) {
		
	}
	
	public boolean isTeclaPremuda(int tecla){
		return keys[tecla];
	}
	
	public boolean isTeclaFora(int tecla){
		return !keys[tecla];
	}
}
