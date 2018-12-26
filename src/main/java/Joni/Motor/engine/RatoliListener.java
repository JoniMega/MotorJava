package Joni.Motor.engine;

import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RatoliListener implements MouseListener{
	
	private int pX,pY;
	private boolean clicat;

	public void mouseClicked(MouseEvent event) {
		this.pX=event.getX();
		this.pY=event.getY();
	}

	public void mouseEntered(MouseEvent event) {
		
		
	}

	public void mouseExited(MouseEvent event) {

		
	}

	public void mousePressed(MouseEvent event) {
		mouseClicked(event);
		this.clicat=true;
		
	}

	public void mouseReleased(MouseEvent event) {
		this.clicat=false;
		
	}
	
	public int getX(){
		return this.pX;
	}
	
	public int getY(){
		return this.getY();
	}

}
