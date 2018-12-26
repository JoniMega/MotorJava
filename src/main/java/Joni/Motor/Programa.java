package Joni.Motor;

import Joni.Motor.engine.Motor;

public class Programa {
	private Motor joc;
	
	public Programa(){
		this.joc=new Motor(800,600,"Lo mola");
	}
	public static void main(String[] args){
		new Programa();
	}
}
