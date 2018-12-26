package Joni.Motor.engine;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class MotorThread extends JPanel implements Runnable{
	
	private final Motor motor;
	
	public MotorThread(Motor motor){
		this.motor=motor;
		setFocusable(true);
	}

	public void run() {
		while(true){
			try{
				if(this.motor.getPantallaFactory().getCurrentPantalla()!=null){
					this.motor.getPantallaFactory().getCurrentPantalla().onUpdate();
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
		if(this.motor.getPantallaFactory().getCurrentPantalla()!=null){
			this.motor.getPantallaFactory().getCurrentPantalla().onDraw(g2d);
		}
		this.repaint();
	}

}
