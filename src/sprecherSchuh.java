
public class sprecherSchuh extends StarterSelector{
	String output = "nothing came out";
	final  String[] MODEL = {
			//there are more models but they are not really used
			"PCEC-074-600V-120V",//0
			"PCEC-104-600V-120V",//1
			"PCEC-147-600V-120V",//2
			"PCEC-234-600V-120V",//3
			"Maybe get a Siemens bruh"
	};
	//6 wire table
	private int sixTbl[][] = {//this is the table for six-twelve wire config
			{200,240,480,575},
			{20,25,50,60,74},
			{30,40,75,100,104},
			{40,50,100,150,147},
			{75,75,150,200,234}
	};
	private int threeTbl[][] = {//this is the table for three-nine wire config
			{200,240,480,575},
			{10,15,30,40,43},
			{15,20,40,50,60},
			{25,30,60,75,85},
			{40,50,100,125,135}
	};
	public String ChooseStarter(double motorVolts, double hp, double fla, String wires){
		
		int column = 0;
		int row = 0;
		int flaloc = 4;//this is the location column for the fla
		try{
		if(wires == "6" || wires == "12"){
			//looks for the row of the model that is required
			for(column = 0; column<sixTbl[row].length; column++){//loops though only the first row
				if(motorVolts<=sixTbl[row][column]){//checks voltage
					for(row = 1;row<sixTbl.length;row++){
						if(hp<=sixTbl[row][column]){//checks horse power
							if(fla<=sixTbl[row][flaloc]){//checks FLA
								return MODEL[row-1];
							}
						}
					}
				}
			}
			return "no result for 6 or 12 wires";
		} else if(wires == "3" || wires == "9"){
			//looks for the row of the model that is required
			for(column = 0; column<threeTbl[row].length; column++){//loops though only the first row
				if(motorVolts<=threeTbl[row][column]){//checks voltage
					for(row = 1;row<threeTbl.length;row++){
						if(hp<=threeTbl[row][column]){//checks horse power
							if(fla<=threeTbl[row][flaloc]){//checks FLA
								return MODEL[row-1];
							}
						}
					}
				}
			}
			return "no result for 3 or 9 wires";
		} else {
			//you don't have the right wires
			return "across the line not ready yet";
		}
		} catch (Exception e){
			return "Sprecher and Schuh cannot handle this";
		}
		
		//return "some S&S junk hahaha";
	}
}
