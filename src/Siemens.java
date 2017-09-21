
public class Siemens extends StarterSelector{

	final  String[] MODEL = {
			"72EG34AFP",
			"72GG34AFP",
			"72HG34AFP",
			"72JG34AFP",
			"72KG34AFP",
			"72LG34AFP",
			"72MG34AFP",
			"72NG34AFP",
			"72PG34AFP",
			"72RG34AFP",
			"72EG35AFP",
			"72GG35AFP",
			"72HG35AFP",
			"72JG35AFP",
			"72KG35AFP",
			"72LG35AFP",
			"72MG35AFP",
			"72NG35AFP",
			"72PG35AFP"
	};
	
	public String ChooseStarter(double motorVolts, double fla, double hp){
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
			
		}else if(motorVolts <= 460){
			
		}else if(motorVolts <= 575){
			
		}
		
		
		return output;
	}
	
}
