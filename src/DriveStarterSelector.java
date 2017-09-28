import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class DriveStarterSelector extends JFrame{
	
	private JLabel motorVoltLabel;
	private JTextField motorVoltInput;
	private JLabel hpLabel;
	private JTextField hpInput;
	private JLabel flaLabel;
	private JTextField flaInput;
	private JButton SDButton; //drive and starter button
	private JLabel SDLabel; //tells you the starter or drive that you need
	private JComboBox movers;
	String moverBrands[] = {"Siemens","S&S","Magnetek HPV900","Serial KEB"};
	
	public DriveStarterSelector(){
		setLayout(new FlowLayout());
		motorVoltLabel = new JLabel("Enter Motor Volts:");
		motorVoltInput = new JTextField(5);
		hpLabel = new JLabel("Enter Horse Power");
		hpInput = new JTextField(5);
		flaLabel = new JLabel("Enter FLA:");
		flaInput = new JTextField(5);
		SDButton = new JButton("FIND");
		SDLabel = new JLabel("Answer");
		movers = new JComboBox(moverBrands);
		
		add(motorVoltLabel);
		add(motorVoltInput);
		add(hpLabel);
		add(hpInput);
		add(flaLabel);
		add(flaInput);
		add(movers);
		add(SDButton);
		add(SDLabel);
		SDButton.addActionListener(new finder());
	}
	
	private class finder implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			//Cindy's TEST AREA //WORKING!!!
//			System.out.println(motorVoltInput.getText());
//			System.out.println(Double.parseDouble(motorVoltInput.getText()));
			//StarterSelector motorParams = new StarterSelector((String) movers.getSelectedItem(), Double.parseDouble(motorVoltInput.getText()), Double.parseDouble(hpInput.getText()), Double.parseDouble(flaInput.getText()));
			String x = (String) movers.getSelectedItem();
			if (x == "Siemens" || x == "S&S") {
				StarterSelector motorParams = new StarterSelector();
				String modelOutput = motorParams.selectStarter(x, Double.parseDouble(motorVoltInput.getText()), Double.parseDouble(hpInput.getText()), Double.parseDouble(flaInput.getText()));
				SDLabel.setText(modelOutput);
			}
			else {
				SDLabel.setText("Drivers are not supported yet");
			}
			
			/* Julio's code
			Double info[] = new Double[3];
			info[0] = Double.parseDouble(motorVoltInput.getText());
			info[1] = Double.parseDouble(hpInput.getText());
			info[2] = Double.parseDouble(flaInput.getText());
			String x = (String) movers.getSelectedItem();
			if(x.equals("Siemens")){
				//if(movers.get)
				StarterSelector siemens = new Siemens();
				//System.out.println(siemens.ChooseStarter(info[0], info[1], info[2]));
				SDLabel.setText(siemens.ChooseStarter(info[0], info[2], info[1]));
			} else {
				SDLabel.setText("nothing :(");
			}
			*/
		
		}
	}
	
	public static void main(String[] args){
		DriveStarterSelector siemens = new DriveStarterSelector();
		siemens.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		siemens.setSize(400,400);
		siemens.setVisible(true);
		/*
		Scanner input = new Scanner(System.in);
		Double info[] = new Double[3];
		for(int i = 0; i < 3; i++){
			switch (i) {
			case 0: System.out.println("provide motor volts");
			break;
			case 1: System.out.println("provide FLA");
			break;
			case 2: System.out.println("privide HP");
			break;
			}
			info[i] = input.nextDouble();
		}
		StarterSelector siemens = new Siemens();
		System.out.println(siemens.ChooseStarter(info[0], info[1], info[2]));
		*/
	}
}
