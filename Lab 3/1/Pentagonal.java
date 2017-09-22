
public class Pentagonal {

	public static void main(String[] args) {
		
		System.out.println("                         Pentagonal Numbers");
		
		for (int i = 1; i <= 100; i++) {
			
			   // %7d spreads out output for better organization of table
			   System.out.printf("%7d", getPentagonalNumber(i));
			   if (i % 10 == 0) {
			    System.out.println("");
			   }
		}
	}

	private static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}

}
