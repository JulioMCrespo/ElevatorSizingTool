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
	private JComboBox leads;
	private String moverBrands[] = {"Siemens","S&S","Magnetek HPV900","Serial KEB"};
	//private String wireLeads[] = {"2","3 or 9", "6 or 12"};
	private String wireLeads[] = {"3", "6", "9", "12"};
	private JLabel driveGauge;
	private JLabel motorGauge;
	private JLabel discSize;
	
	public DriveStarterSelector(){
		setLayout(new FlowLayout());
		motorVoltLabel = new JLabel("Enter Motor Volts:");
		motorVoltInput = new JTextField(5);
		hpLabel = new JLabel("Enter Horse Power");
		hpInput = new JTextField(5);
		flaLabel = new JLabel("Enter FLA:");
		flaInput = new JTextField(5);
		SDButton = new JButton("FIND");
		SDLabel = new JLabel("Drive/Starter: ");
		movers = new JComboBox(moverBrands);
		leads = new JComboBox(wireLeads);
		//wire gauges and disconnects
		driveGauge = new JLabel("Drive gauge is: ");
		motorGauge = new JLabel("Motor gauge is: ");
		discSize = new JLabel("Disconnect size is: ");
		
		add(motorVoltLabel);
		add(motorVoltInput);
		add(hpLabel);
		add(hpInput);
		add(flaLabel);
		add(flaInput);
		add(movers);
		add(leads);
		add(SDButton);
		add(SDLabel);
		add(driveGauge);
		add(motorGauge);
		add(discSize);
		SDButton.addActionListener(new finder());
	}
	
	private class finder implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			//Cindy's TEST AREA //WORKING!!!
//			System.out.println(motorVoltInput.getText());
//			System.out.println(Double.parseDouble(motorVoltInput.getText()));
			
			String x = (String) movers.getSelectedItem();
			String wires = (String) leads.getSelectedItem();
			HydroWiresDisc wireNdisc = new HydroWiresDisc();
			//String theGauges[] = wireNdisc.getGauge();
			if (x == "Siemens") {
				StarterSelector aSiemens = new Siemens();
				String modelOutput = aSiemens.ChooseStarter(Double.parseDouble(motorVoltInput.getText()), 
															Double.parseDouble(hpInput.getText()), 
															Double.parseDouble(flaInput.getText()), 
															wires);
				wireNdisc.setGauge(Double.parseDouble(flaInput.getText()));
				driveGauge.setText(wireNdisc.getDriveGauge());
				motorGauge.setText(wireNdisc.getMotorGauge());
				discSize.setText(wireNdisc.getDisconnect());
				SDLabel.setText(modelOutput);
			}
			else if(x == "S&S"){
				StarterSelector aSnS = new sprecherSchuh();
				String modelOutput = aSnS.ChooseStarter(Double.parseDouble(motorVoltInput.getText()), 
														Double.parseDouble(hpInput.getText()), 
														Double.parseDouble(flaInput.getText()), 
														wires);
				wireNdisc.setGauge(Double.parseDouble(flaInput.getText()));
				driveGauge.setText(wireNdisc.getDriveGauge());
				motorGauge.setText(wireNdisc.getMotorGauge());
				discSize.setText(wireNdisc.getDisconnect());
				SDLabel.setText("Sprecher and Schuh:" + modelOutput);
			} else if(x == "Magnetek HPV900"){
				DriveSelector aMag = new Magnetek();
				String modelOutput = aMag.ChooseDrive(	Double.parseDouble(motorVoltInput.getText()), 
														Double.parseDouble(hpInput.getText()), 
														Double.parseDouble(flaInput.getText()), 
														wires);
				SDLabel.setText(modelOutput);
				
			}else{
				SDLabel.setText("KEB and DC are not supported yet");
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
