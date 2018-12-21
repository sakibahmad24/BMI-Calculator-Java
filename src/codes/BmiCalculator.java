package codes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BmiCalculator implements ActionListener {
	

	JFrame window = new JFrame();
	JButton calculate = new JButton("Calculate");
	JButton cancel = new JButton("Cancel");
	
	JTextField weight = new JTextField();
	JTextField height = new JTextField();

	public void initWindow(){
		JLabel weightLabel = new JLabel("Weight");
		JLabel heightLabel = new JLabel("Height (in meter)");
		
		calculate.addActionListener(this);
		cancel.addActionListener(this);
		
		GridLayout g1 = new GridLayout(4, 2, 5, 5);
		window.setLayout(g1);
		
		window.add(weightLabel);
		window.add(weight);
		
		window.add(heightLabel);
		window.add(height);
		
		window.add(calculate);
		window.add(cancel);
	}
	
	public void showWindow(){
		initWindow();
		window.setTitle("BMI Calculator");
		window.setSize(350,200);
		window.setLocation(200, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == cancel){
			window.dispose();
		}
		
		else if(e.getSource() == calculate){
			
			String w = weight.getText();
			String h = height.getText();
			
			double n1 = Double.parseDouble(w);
			double n2 = Double.parseDouble(h);
			
			double bmi = n1/Math.pow(n2, 2);
			
			JOptionPane.showMessageDialog(null, "::Calculated BMI::\n" + bmi);
			
			if(bmi<18.5){
				JOptionPane.showMessageDialog(null, "You are under weighted!");
			}
			else if(bmi>=18.5 && bmi<=25){
				JOptionPane.showMessageDialog(null, "You are normal weighted!");
			}
			else if(bmi>25 && bmi<=30){
				JOptionPane.showMessageDialog(null, "You are over weighted!");
			}
			else{
				JOptionPane.showMessageDialog(null, "You are obesed!");
			}
		}
			
	}
}
