import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt(), y = fs.nextInt();
			int mid = (x + y) / 2;
			System.out.println(Math.max(Math.abs(x - mid), Math.abs(mid - y)));
		}
		fs.close();
	}
}
