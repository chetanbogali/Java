import java.util.Scanner;

public class SecretMessageDecoder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		System.out.println(MessageDecoder.decodeCharacter(ch));
		scan.close();
	}
}
