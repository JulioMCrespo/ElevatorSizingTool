
public class Siemens extends StarterSelector{

	final  String[] MODEL = {
			"72EG34AFP",//0
			"72GG34AFP",//1
			"72HG34AFP",//2
			"72JG34AFP",//3
			"72KG34AFP",//4
			"72LG34AFP",//5
			"72MG34AFP",//6
			"72NG34AFP",//7
			"72PG34AFP",//8
			"72RG34AFP",//9
			"72EG35AFP",//10
			"72GG35AFP",//11
			"72HG35AFP",//12
			"72JG35AFP",//13
			"72KG35AFP",//14
			"72LG35AFP",//15
			"72MG35AFP",//16
			"72NG35AFP",//17
			"72PG35AFP" //18
	};
	
	public String ChooseStarter(double motorVolts, double fla, double hp, String wires){
		String output = "nothing came out";
		//String test[] = {Double.toString(motorVolts),Double.toString(fla),Double.toString(hp)};
		//String output = String.format("%s,%s,%s",test[0],test[1],test[2]);
		/*
		if(motorVolts <= 208){
			
		}else if(motorVolts <= 230){
		
		}else if(motorVolts <= 460){
			
		}else if(motorVolts <= 575){
			
		}
		*/
		if(motorVolts <= 208){
			if(hp<=5 && fla<=22){
				output = MODEL[0];
			}else if(hp<=7.5 && fla<=35){
				output = MODEL[1];
			}else if(hp<=10 && fla<=42){
				output = MODEL[2];
			}else if(hp<=15 && fla<=55){
				output = MODEL[3];
			}else if(hp<=20 && fla<=68){
				output = MODEL[4];
			}else if(hp<=25 && fla<=80){
				output = MODEL[5];
			}else if(hp<=30 && fla<=105){
				output = MODEL[6];
			}else if(hp<=40 && fla<=130){
				output = MODEL[7];
			}else if(hp<=50 && fla<=156){
				output = MODEL[8];
			}else if(hp<=75 && fla<=252){
				output = MODEL[9];
			}
		}else if(motorVolts <= 230){
			if(hp<=7.5 && fla<=22){
				output = MODEL[0];
			}else if(hp<=10 && fla<=35){
				output = MODEL[1];
			}else if(hp<=15 && fla<=42){
				output = MODEL[2];
			}else if(hp<=20 && fla<=55){
				output = MODEL[3];
			}else if(hp<=25 && fla<=68){
				output = MODEL[4];
			}else if(hp<=30 && fla<=80){
				output = MODEL[5];
			}else if(hp<=40 && fla<=105){
				output = MODEL[6];
			}else if(hp<=50 && fla<=130){
				output = MODEL[7];
			}else if(hp<=60 && fla<=156){
				output = MODEL[8];
			}else if(hp<=100 && fla<=252){
				output = MODEL[9];
			}			
		}else if(motorVolts <= 460){
			if(hp<=15 && fla<=22){
				output = String.format("%s or %s",MODEL[0],MODEL[10]);
			}else if(hp<=25 && fla<=35){
				output = String.format("%s or %s",MODEL[1],MODEL[11]);
			}else if(hp<=30 && fla<=42){
				output = String.format("%s or %s",MODEL[2],MODEL[12]);
			}else if(hp<=40 && fla<=55){
				output = String.format("%s or %s",MODEL[3],MODEL[13]);
			}else if(hp<=50 && fla<=68){
				output = String.format("%s or %s",MODEL[4],MODEL[14]);
			}else if(hp<=60 && fla<=80){
				output = String.format("%s or %s",MODEL[5],MODEL[15]);
			}else if(hp<=75 && fla<=105){
				output = String.format("%s or %s",MODEL[6],MODEL[16]);
			}else if(hp<=100 && fla<=130){
				output = String.format("%s or %s",MODEL[7],MODEL[17]);
			}else if(hp<=125 && fla<=156){
				output = String.format("%s or %s",MODEL[8],MODEL[18]);
			}else if(hp<=150 && fla<=252){
				output = String.format("%s or %s","-","-");
			}
		}else if(motorVolts <= 575){
			if(hp<=20 && fla<=22){
				output = MODEL[10];
			}else if(hp<=30 && fla<=35){
				output = MODEL[11];
			}else if(hp<=40 && fla<=42){
				output = MODEL[12];
			}else if(hp<=50 && fla<=55){
				output = MODEL[13];
			}else if(hp<=60 && fla<=68){
				output = MODEL[14];
			}else if(hp<=75 && fla<=80){
				output = MODEL[15];
			}else if(hp<=100 && fla<=105){
				output = MODEL[16];
			}else if(hp<=125 && fla<=130){
				output = MODEL[17];
			}else if(hp<=150 && fla<=156){
				output = MODEL[18];
			}
		}
		
		
		return "Siemens: " + output;
	}
	
}
