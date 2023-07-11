import java.util.Scanner;

public class SquareApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sqr = scan.nextInt();
		System.out.println(squareNumber(sqr));
		scan.close();
	}
	public static int squareNumber(int num) {
		return num*num;
	}
}