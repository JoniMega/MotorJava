package Joni.Motor.engine;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Engine extends JPanel implements Runnable{
	
	private final Joc joc;
	
	public Engine(Joc joc){
		this.joc=joc;
		setFocusable(true);
	}

	public void run() {
		while(true){
			try{
				if(this.joc.getPantallaFactory().getCurrentPantalla()!=null){
					this.joc.getPantallaFactory().getCurrentPantalla().onUpdate();
				}
				Thread.sleep(10);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(this.joc.getPantallaFactory().getCurrentPantalla()!=null){
			this.joc.getPantallaFactory().getCurrentPantalla().onDraw(g2d);
		}
		this.repaint();
	}

}
