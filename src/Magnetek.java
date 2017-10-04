
public class Magnetek extends DriveSelector{
	final private String MODEL[] = {
			"HPV900-2025-2E1-01",//0
			"HPV900-2031-2E1-01",//1
			"HPV900-2041-2E1-01",//2
			"HPV900-2052-2E1-01",//3
			"HPV900-2075-2E1-01",//4
			"HPV900-2088-2E1-01",//5
			"HPV900-2098-2E1-01",//6
			"HPV900-4008-2E1-01",//7
			"HPV900-4012-2E1-01",//8
			"HPV900-4016-2E1-01",//9
			"HPV900-4021-2E1-01",//10
			"HPV900-4027-2E1-01",//11
			"HPV900-4034-2E1-01",//12
			"HPV900-4041-2E1-01",//13
			"HPV900-4052-2E1-01",//14
			"HPV900-4065-2E1-01",//15
			"HPV900-4072-2E1-01",//16
			"HPV900-4096-2E1-01",//17
	};
	private final double twoThirty[][] = {
			{7.5,31},//1 // horse power and FLA
			{10,39},//2
			{15,51},//3
			{20,65},//4
			{25,75},//5
			{30,88},//6
			{40,98}//7
	};
	private final double fourEight[][] = {
			{5,10},//8
			{7.5,15},//9
			{10,20},//10
			{15,26},//11
			{20,34},//12
			{25,43},//13
			{30,51},//14
			{40,65},//15
			{50,65},//16
			{60,72},//17
			{75,96}//18
	};
	
	public String ChooseDrive(double motorVolt, double hp, double fla, String wires){
		//int col = 0;
		int row = 0;
		int horses = 0;
		int currents = 1;
		if(wires == "3"){
			if(motorVolt <= 250){
				for(row = 0; row <= twoThirty.length; row++){
					if(hp <= twoThirty[row][horses] && fla <= twoThirty[row][currents]){
						return MODEL[row];
					}
				}
			} else if (motorVolt <= 500){
				for(row = 0; row <= fourEight.length; row++){
					if(hp <= fourEight[row][horses] && fla <= fourEight[row][currents]){
						return MODEL[row + 7];
					}
				}
			} else {
				return "voltage is too high";
			}
		}else {
			return "Only 3 wires allowed";
		}
		return "didn't work";
		}
	}

