package com.java.awt.practice;


import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.crypto.spec.RC2ParameterSpec;

public class Components {

	

	public static void main(String[] args) {
		
		//frame creation
		Frame frame = new Frame("Button creation");
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setSize(600, 600);
		
		
		
		
		//code for exit point of the window
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w) {
				System.exit(0);
				
			}
		});

		
//		button creation
		
		Button btn=new Button("click");
		frame.add(btn);
        btn.setBounds(160, 80, 80, 40); 

	   btn.setBackground(Color.red);
	   btn.setForeground(Color.white);
	   
	   
	   
	   
//	   creating label
	   Label label= new Label();
	   label.setBounds(80, 140, 280, 20); 
	   frame.add(label);
	   
	  btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setText("Hey,Aditya");
			
		}
	});
		
	  
	  
//	  canvas creation
	  
	  Canvas canvas= new Canvas();
	  canvas.setBounds(20, 50, 80, 80);
	  canvas.setBackground(Color.blue);
	  frame.add(canvas);
	  canvas.addMouseListener(new MouseAdapter() {
		  public void mouseClicked(MouseEvent e) {
			  System.out.println("jnbknknj");
		  }
	});
		
	
//	   vertical scroll bar creation
	  Scrollbar scrollbar = new Scrollbar();
	  scrollbar.setBounds(280, 140, 20, 175);
	  frame.add(scrollbar);
	  
//	  horizontal scroll bar creation
	  Scrollbar scrollbar2= new Scrollbar(Scrollbar.HORIZONTAL);
	  scrollbar2.setBounds(50, 250, 175, 20);
	  frame.add(scrollbar2);
	  
	  
	  
//	  checkbox creation
	  Checkbox checkbox= new Checkbox("I agree");
	  checkbox.setBounds(50, 300, 250, 30);
	  frame.add(checkbox);
	  
	  checkbox.addItemListener(new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(checkbox.getState()) {
				System.out.println("Feature is Enabled ");
			}
			else {
				System.out.println("Feature is Disabled");
			}
		}
	});
		
		
	  
//	  choice creation
	  Choice choice= new Choice();
	 choice.setBounds(100, 350, 100, 50);
	  choice.add("aditya");
	  choice.add("rashi");
	  choice.add("ayush");
	  frame.add(choice);
		
		
	}
}
