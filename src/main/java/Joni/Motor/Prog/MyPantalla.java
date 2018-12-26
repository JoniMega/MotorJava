package Joni.Motor.Prog;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Joni.Motor.engine.Pantalla;
import Joni.Motor.engine.PantallaFactory;

public class MyPantalla extends Pantalla{
	
	private int x = 0, y = 0;
	private int sprint = 0;

	public MyPantalla(PantallaFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	}

	@Override
	public void onUpdate() {
		// TODO Auto-generated method stub
		if(this.getPantallaFactory().getMotor().getTeclatListener().isTeclaPremuda(KeyEvent.VK_A)){		
			if(sprint>=20){
				x-=6;
			}else{
				x-=2;
				sprint+=2;
			}
		}
		if(this.getPantallaFactory().getMotor().getTeclatListener().isTeclaPremuda(KeyEvent.VK_D)){
			if(sprint>=20){
				x+=6;
				sprint+=1;
			}else{
				x+=2;
				sprint+=2;
			}
		}
		if(this.getPantallaFactory().getMotor().getTeclatListener().isTeclaPremuda(KeyEvent.VK_W)){
			y-=2;
		}
		if(this.getPantallaFactory().getMotor().getTeclatListener().isTeclaPremuda(KeyEvent.VK_S)){
			y+=2;
		}
		sprint-=1;
		
		//if()
	}

	@Override
	public void onDraw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(Color.black);
		g2d.fillRect(x, y, 32, 32);
	}

}
