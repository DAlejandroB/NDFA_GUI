package views.elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import views.main_frame.CanvasFA;

public class Transition {
	public String condicion;
	public StateElement start;
	public StateElement end;

	public void drawTransition(Graphics g) {
		g.setColor(Color.BLACK);
		if(end != null && start != null)
			g.drawLine(start.x + CanvasFA.CIRCLE_RADIUS/2, start.y + CanvasFA.CIRCLE_RADIUS/2, end.x + CanvasFA.CIRCLE_RADIUS/2, end.y + CanvasFA.CIRCLE_RADIUS/2);
	}
	public void drawCondition(Graphics g) {
		if(!condicion.isEmpty()) {
			Graphics2D gr = (Graphics2D) g;
			gr.drawString(condicion, start.x,  start.y- CanvasFA.CIRCLE_RADIUS/2);
			
		}
	}
}
