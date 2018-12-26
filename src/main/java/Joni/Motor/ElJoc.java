package Joni.Motor;

import Joni.Motor.engine.Joc;

public class ElJoc {
	private Joc joc;
	
	public ElJoc(){
		this.joc=new Joc(800,600,"Lo mola");
	}
	public static void main(String[] args){
		new ElJoc();
	}
}
