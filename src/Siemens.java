
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
		String test[] = {Double.toString(motorVolts),Double.toString(fla),Double.toString(hp)};
		String output = String.format("%s,%s,%s",test[0],test[1],test[2]);
		return output;
	}
	
}
