package Joni.Motor.engine;

import javax.swing.JFrame;

public class Joc {
	private final JFrame finestra = new JFrame();
	private final PantallaFactory pantallaFactory;
	private final Engine motor;
	private final TeclatListener teclatListener;
	private final RatoliListener ratorliListener;
	
	public Joc (int finestraX,int finestraY, String nom){
		finestra.setSize(finestraX,finestraY);
		finestra.setResizable(false);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.setFocusable(true);
		finestra.setLocationRelativeTo(null);
		finestra.setTitle(nom);
		finestra.setVisible(true);
		pantallaFactory=new PantallaFactory(this);
		motor=new Engine(this);
		teclatListener=new TeclatListener();
		ratorliListener=new RatoliListener();
		
		finestra.add(this.motor);
		finestra.addKeyListener(this.teclatListener);
		finestra.addMouseListener(this.ratorliListener);
		
		new Thread(motor).start();
	}
	
	public TeclatListener getTeclatListener(){
		return this.teclatListener;
	}
	
	public RatoliListener getRatorliListener() {
		return ratorliListener;
	}

	public PantallaFactory getPantallaFactory() {
		return pantallaFactory;
	}

	public JFrame getFinestra(){
		return this.finestra;
	}
}
