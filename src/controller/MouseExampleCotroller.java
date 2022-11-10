package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.ExampleView;

public class MouseExampleCotroller implements MouseListener, MouseMotionListener{

	private ExampleView exampleView;
	
	
	public MouseExampleCotroller(ExampleView exampleView) {
		this.exampleView = exampleView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.exampleView.increaseClick();		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.exampleView.enter();
		int x = e.getX();
		int y = e.getY();
		this.exampleView.updateXY(x,y);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.exampleView.exist();
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		this.exampleView.updateXY(x,y);
	}
	
}
