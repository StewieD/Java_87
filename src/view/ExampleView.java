package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import controller.MouseExampleCotroller;
import model.MouseExampleModel;

public class ExampleView extends JFrame {
	private MouseExampleModel mouseExampleModel;
	private JPanel jPanel_Mouse;
	private JPanel jPanel_Info;
	private JLabel jLabel_x;
	private JLabel jLabel_y;
	private JLabel jLabel_count_value;
	private JLabel jLabel_check_in_value;
	
	public ExampleView() throws HeadlessException {
		this.mouseExampleModel = new MouseExampleModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Mouse Example");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		MouseExampleCotroller mouseExampleCotroller = new MouseExampleCotroller(this);
		jPanel_Mouse = new JPanel();
		jPanel_Mouse.setBackground(Color.LIGHT_GRAY);
		jPanel_Mouse.addMouseListener(mouseExampleCotroller);
		
		jPanel_Info = new JPanel();
		jPanel_Info.setLayout(new GridLayout(3,3,5,5));
		
		JLabel jLabel_position = new JLabel("Position: ");
		 jLabel_x = new JLabel("x= ");
		 jLabel_y = new JLabel("y= ");
		
		JLabel jLabel_count = new JLabel("Numble of click: ");
		 jLabel_count_value = new JLabel("0");
		JLabel jLabel_empty_1 = new JLabel();
		
		JLabel jLabel_check_in = new JLabel("Mouse is component: ");
		 jLabel_check_in_value = new JLabel("no");
		JLabel jLabel_empty_2 = new JLabel();
		jPanel_Info.add(jLabel_position);
		jPanel_Info.add(jLabel_x);
		jPanel_Info.add(jLabel_y);
		
		jPanel_Info.add(jLabel_count);
		jPanel_Info.add(jLabel_count_value);
		jPanel_Info.add(jLabel_empty_1);
		
		jPanel_Info.add(jLabel_check_in);
		jPanel_Info.add(jLabel_check_in_value);
		jPanel_Info.add(jLabel_empty_2);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_Mouse, BorderLayout.CENTER);
		this.add(jPanel_Info, BorderLayout.SOUTH);
	}
	public void increaseClick() {
		this.mouseExampleModel.increaseClick();
		this.jLabel_count_value.setText(this.mouseExampleModel.getCount()+"");
	}
	public void enter() {
		
	}
	public void exist() {
		
	}
}
