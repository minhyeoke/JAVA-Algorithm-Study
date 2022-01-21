import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		int a = 0;
		int sum = 99;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		a = Integer.parseInt(br.readLine());
		if (a < 100)
			sum = a;
		else if (a == 1000)
			a = 999;

		for (int i = 100; i <= a; i++) {
			int b = getDn(i);
			if(b==1)
				sum++;
		}
		bw.write(Integer.toString(sum));
		bw.close();
		br.close();
	}

	public static int getDn(int n) {
		int result = 0;
		int one = n % 10;
		int ten = (n / 10) % 10;
		int hun = (n / 100) % 10;

		if (ten - one == hun - ten)
			result = 1;

		return result;

	}
}