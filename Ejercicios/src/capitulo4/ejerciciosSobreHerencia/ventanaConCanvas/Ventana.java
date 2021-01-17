package capitulo4.ejerciciosSobreHerencia.ventanaConCanvas;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JPanel;

public class Ventana extends JFrame{

public Ventana() throws HeadlessException{
	setSize(600, 600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Figuras rectangulo = new Figuras();
	add(rectangulo);
	PanelPrincipal();
	
	setVisible(true);
	
	
}

public void PanelPrincipal() {
	JPanel panel = new JPanel();
	panel.setBackground(Color.BLUE);	//Le asignamos el color al Panel
	panel.setLayout(new BorderLayout(5,5));		//Esto indica que va a haber una separacion de 5 pixeles entre cada boton
	panel.add(new Button("North"), BorderLayout.NORTH);
	panel.add(new Button("South"), BorderLayout.SOUTH);
	panel.add(new Button("East"), BorderLayout.EAST);
	panel.add(new Button("West"), BorderLayout.WEST);
	setTitle("Mi primer canvas");
	
	this.getContentPane().add(panel); //Esto es para agregar el panel a la ventana :)
	
}

}
