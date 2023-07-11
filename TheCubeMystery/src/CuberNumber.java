import java.util.Scanner;

public class CuberNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cube = scan.nextInt();
		System.out.println(cubeNumber(cube));
		scan.close();
	}
	public static int cubeNumber(int num) {
		return num*num*num;
	}
}
