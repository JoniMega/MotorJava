package Joni.Motor.engine;

public class PantallaFactory {
	private final Motor motor;
	private Pantalla pantalla;
	public PantallaFactory(Motor motor){
		this.motor=motor;
	}
	
	public void showPantalla(Pantalla pantalla){
		this.pantalla=pantalla;
		this.pantalla.onCreate();
	}
	
	public Pantalla getCurrentPantalla(){
		return this.pantalla;
	}
	
	public Motor getMotor(){
		return motor;
	}
}
