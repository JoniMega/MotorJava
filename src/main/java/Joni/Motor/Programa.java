package Joni.Motor;

import Joni.Motor.Prog.MyPantalla;
import Joni.Motor.engine.Motor;

public class Programa {
	private Motor joc;
	
	public Programa(){
		this.joc=new Motor(800,600,"Lo mola");
		this.joc.getPantallaFactory().showPantalla(new MyPantalla(this.joc.getPantallaFactory()));
	}
	public static void main(String[] args){
		new Programa();
	}
}
