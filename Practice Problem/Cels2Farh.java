import java.util.*;

public class Cels2Farh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float celsius = sc.nextFloat();
		float faherenhite = (celsius * 9 / 5) + 32;
		System.out.print(faherenhite);
		sc.close();
	}
}
