package Joni.Motor.engine;

import java.awt.Graphics2D;

public abstract class Pantalla {
	private final PantallaFactory factory;
	public Pantalla(PantallaFactory factory){
		this.factory=factory;
	};
	
	public abstract void onCreate();
	
	public abstract void onUpdate();
	
	public abstract void onDraw(Graphics2D g2d);
	
	public PantallaFactory getPantallaFactory(){
		return this.factory;
	}
}
