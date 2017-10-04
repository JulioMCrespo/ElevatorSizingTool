
public class HydroWiresDisc {
	private double floodLoad;
	private double driveGauge;
	private double motorGauge;
	private final int[] current75 = {
			15,//0
			20,//1
			30,//2
			50,//3
			65,//4
			85,//5
			100,//6
			115,//7
			130,//8
			150,//9
			175,//10
			200,//11
			230,//12
			255,//13
			285,//14
			310,//15
			380,//16
			420,//17
			475,//18
			545//19
		};
	private final String[] gaugeSize = {
			"14",//0
			"12",//1
			"10",//2
			"8",//3
			"6",//4
			"4",//5
			"3",//6
			"2",//7
			"1",//8
			"1/0",//9
			"2/0",//10
			"3/0",//11
			"4/0",//12
			"250",//13
			"300",//14
			"350",//15
			"500",//16
			"600",//17
			"750",//18
			"1000"//19
	};

	
	private final int[] disconnect = {
		15,20,25,30,35,40,45,50,60,70,80,90,100,110,125,150,175,200,225,250,300,350,400,
		450,500,600,700,800,1000,1200,1600,2000,2500,3000,4000,5000,6000
	};
	
	public void setGauge(double fla){
		this.floodLoad = fla;
		this.driveGauge = this.floodLoad * 1.25;
		this.motorGauge = (this.driveGauge)* .53;
	}
	/*
	public String[] getGauge(){
		
		
		int index = 0;
		String gauge[] = new String[2];
		for(index = 0; index < current75.length; index++){
			if(current75[index] < this.driveGauge[0]){
				gauge[0] = GaugeSizes[index];
				break;
			}
		}
		for(index = 0; index < current75.length; index++){
			if(current75[index] < this.driveGauge[1]){
				gauge[1] = GaugeSizes[index];
				break;
			}
		}
		return gauge;
	}
	*/
	/*
	public String getDriveGauge(){
		for(int index = 0; index < current75.length; index++){
			if(current75[index] >= this.driveGauge){
				return GaugeSizes[index];
			}
		}
		return "no Drive Gauge";
	}
	*/
	public String getDriveGauge(){
		int i = 0;
		while(i < current75.length){
			if(driveGauge <= current75[i]){
				//return Double.toString(current75[i]);
			
				return "Drive gauge is: "+ gaugeSize[i];
			}
			i++;
		}
		return "no drive gauge";
	}
	
	/*
	public String getMotorGauge(){
		for(int index = 0; index < current75.length; index++){
			if(current75[index] >= this.motorGauge){
				return GaugeSizes[index];
			}
		}
		return "no Drive Gauge";
	}
	*/
	public String getMotorGauge(){
		int i = 0;
		while(i<current75.length){
			if(motorGauge <= current75[i]){
				//return Double.toString(current75[i]);
				return "Motor gauge is: " + gaugeSize[i];
			}
			i++;
		}
		return "no Motor Gauge";
	}
	
	public String getDisconnect(){
		/*
		for(int i = 0; i < disconnects.length; i++){
			if(disconnects[i]<this.driveGauge){
				return disconnects[i];
			}
		}*/
		for(int i = 0; i < disconnect.length; i++){
			if(driveGauge <= disconnect[i]){
				return "Disconnect size is: " +Integer.toString(disconnect[i]);
			}
		}
		return "no disconnect size given";
	}
	
}
