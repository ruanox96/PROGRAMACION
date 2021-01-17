package capitulo4.ejerciciosSobreHerencia.ventanaConCanvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Canvas;

public class Figuras extends Canvas{

	
//	public void dibujo(Graphics g) {
//		super.paint(g);
//		g.setColor(Color.red);
//		g.fillRect(30, 30, 60, 80);
//
//		g.setColor(Color.black);
//		g.drawRect(30, 30, 60, 80);
//		
//		g.setColor(Color.green);
//		g.fillOval(120, 120, 60, 80);
//		
//		g.setColor(Color.black);
//		g.drawOval(120, 120, 60, 80);
//		
//		g.setColor(Color.blue);
//		int [] vx2 = {400, 450, 350};
//        int [] vy2 = {170, 220, 220};
//        g.fillPolygon (vx2, vy2, 3);
//        
//        g.setColor(Color.black);
//        g.drawPolygon(vx2, vy2, 3);
//	
//	}
	
	public void rectangulo(Graphics g) {
		super.paint(g);
		
		g.drawRect(40, 50, 60, 30);
		g.setColor(Color.red);
	}
	
}
