package ventanas;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	public VentanaPrincipal() {
		
		inicializarComponente();
	}
	
	public void inicializarComponente() {
		
		this.setSize(600,500);
		this.setLocation(150,40);
		this.setTitle("Nueva ventana");
		this.setVisible(true);
	}

}
