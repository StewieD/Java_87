package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.ExampleView;

public class MouseExampleCotroller implements MouseListener{

	private ExampleView exampleView;
	
	
	public MouseExampleCotroller(ExampleView exampleView) {
		this.exampleView = exampleView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.exampleView.increaseClick();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
