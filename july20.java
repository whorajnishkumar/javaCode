package basicAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class july20 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader source = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader value = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader target = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Source=");
		char inputSource = source.readLine().charAt(0);
//		System.out.print(inputSource);
		System.out.print("Value=");
		double inputvalue = Double.parseDouble(value.readLine());
//		System.out.println(inputvalue);
		System.out.print("target=");
		char inputtarget = target.readLine().charAt(0);
//		System.out.println(inputtarget);

		double celsius = inputvalue - 273.15;

		double kelvin = inputvalue + 273.15;

		double fahrenheit = celsius * 9 / 5 + 32;
		double ctofahrenheit = (inputvalue * 9 / 5) + 32;
		double ftocelsius=(inputvalue-32)*5/9;

		if ((inputSource == 'k' || inputSource == 'K') && (inputtarget == 'c' || inputtarget == 'C')) {
			System.out
					.println(inputvalue + " Degrees " + "kelvin" + " is equal to " + String.format("%.2f", celsius)+" Celsius.");
		} 
		else if ((inputSource == 'k' || inputSource == 'K') && (inputtarget == 'f' || inputtarget == 'f')) {
			System.out.println(
					inputvalue + " Degrees " + "kelvin" + " is equal to " + String.format("%.2f", fahrenheit)+" Fahrenheit.");
		}
		else if ((inputSource == 'c' || inputSource == 'C') && (inputtarget == 'k' || inputtarget == 'K')) {
			System.out
					.println(inputvalue + " Degrees "+ "Celsius" + " is equal to " + String.format("%.2f", kelvin)+" Kelvin.");
		}
		else if ((inputSource == 'c' || inputSource == 'C') && (inputtarget == 'f' || inputtarget == 'F')) {
			System.out.println(
					inputvalue + " Degrees " + "Celsius" + " is equal to " + String.format("%.2f", ctofahrenheit)+" Fahrenheit.");
		} 
		else if ((inputSource == 'f' || inputSource == 'F') && (inputtarget == 'C' || inputtarget == 'c')) {
			System.out.println(
					inputvalue + " Degrees " + "Fahrenheit" + " is equal to " + String.format("%.2f", ftocelsius)+" Celsius.");
		}
		else if ((inputSource == 'f' || inputSource == 'F') && (inputtarget == 'K' || inputtarget == 'k')) {
			System.out.println(
					inputvalue + " Degrees " + "Fahrenheit" + " is equal to " + String.format("%.2f", ftocelsius+273.15)+" Kelvin.");
		}

	}

}
