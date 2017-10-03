
public class HydroWiresDisc {
	private double floodLoad;
	private double driveGauge;
	private double motorGauge;
	private final String[] GaugeSizes = {
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
	private final int[] current75 = {
		15,20,30,50,65,85,100,115,130,150,175,
		200,230,255,285,310,380,420,475,545
	};
	
	private final int[] disconnects = {
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
	public String getDriveGauge(){
		for(int index = 0; index < current75.length; index++){
			if(current75[index] >= this.driveGauge){
				return GaugeSizes[index];
			}
		}
		return "no Drive Gauge";
	}
	
	public String getMotorGauge(){
		for(int index = 0; index < current75.length; index++){
			if(current75[index] >= this.motorGauge){
				return GaugeSizes[index];
			}
		}
		return "no Drive Gauge";
	}
	
	public int getDisconnect(){
		for(int i = 0; i < disconnects.length; i++){
			if(disconnects[i]<this.driveGauge){
				return disconnects[i];
			}
		}
		return 1;
	}
	
}
