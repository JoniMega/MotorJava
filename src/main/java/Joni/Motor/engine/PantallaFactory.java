package Joni.Motor.engine;

public class PantallaFactory {
	private final Joc joc;
	private Pantalla pantalla;
	public PantallaFactory(Joc joc){
		this.joc=joc;
	}
	
	public void showPantalla(Pantalla pantalla){
		this.pantalla=pantalla;
		this.pantalla.onCreate();
	}
	
	public Pantalla getCurrentPantalla(){
		return this.pantalla;
	}
}
