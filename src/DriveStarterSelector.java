import java.util.Scanner;

public class DriveStarterSelector {

	public static void main(String[] args){
		
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
	}
}
