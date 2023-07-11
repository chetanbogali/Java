import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double fahrenheit = scan.nextDouble();
		TemperatureConverter t = new TemperatureConverter();
		System.out.printf("%.2f",t.convertFahrenheitToCelsius(fahrenheit));
		
	}
	
}

// Scanner --> to import Scanner we Write Scanner and press Ctrl + space.