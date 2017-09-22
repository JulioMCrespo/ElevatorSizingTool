
public class StarterSelector extends Siemens{
	
	/* Julio's Code
	public String ChooseStarter(double motorVolts, double fla, double hp){
		return "nothing";
	}
	*/
	
	public String selectStarter(String starterType, double motorVolts, double fla, double hp) {
//		System.out.println("drive: " + driveType + " mv: " + motorVolts + " fla: "+ fla + " hp: " +  hp);
		String modelBrand;
		if (starterType == "Siemens") {
			Siemens driverSiemens = new Siemens();
			modelBrand = driverSiemens.ChooseStarter(motorVolts, fla, hp);
			//System.out.println(motorBrand);
		}
		else if (starterType == "S&S") {
			modelBrand = "S&S not supported yet";
		}
		else {
			//System.out.println("starter is not yet supported (starterselector.java)");
			modelBrand = "starter is not yet supported (starterselector.java)";
		}
		return modelBrand;
		
	}
	
}
