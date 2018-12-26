package Joni.Motor.engine;

public class PantallaFactory {
	private final Motor joc;
	private Pantalla pantalla;
	public PantallaFactory(Motor joc){
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
