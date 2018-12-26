package Joni.Motor.engine;

import javax.swing.JFrame;

public class Motor {
	private final JFrame finestra = new JFrame();
	private final PantallaFactory pantallaFactory;
	private final MotorThread exe;
	private final TeclatListener teclatListener;
	private final RatoliListener ratorliListener;
	
	public Motor (int finestraX,int finestraY, String nom){
		finestra.setSize(finestraX,finestraY);
		finestra.setResizable(false);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.setFocusable(true);
		finestra.setLocationRelativeTo(null);
		finestra.setTitle(nom);
		finestra.setVisible(true);
		pantallaFactory=new PantallaFactory(this);
		exe=new MotorThread(this);
		teclatListener=new TeclatListener();
		ratorliListener=new RatoliListener();
		
		finestra.add(this.exe);
		finestra.addKeyListener(this.teclatListener);
		finestra.addMouseListener(this.ratorliListener);
		
		new Thread(exe).start();
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
