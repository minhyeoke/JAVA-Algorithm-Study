import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		int sum = 0;
		int a = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		a = Integer.parseInt(br.readLine());

		if (a == 1000)
			a = 999;

		if (a >= 100) {
			sum += 99;
			for (int i = 100; i <= a; i++) {
				int getdn = getDn(i);
				if (getdn == 1)
					sum++;

			}
			 
			bw.write(Integer.toString(sum));
		} else
			bw.write(Integer.toString(a));

		bw.close();

	}

	public static int getDn(int n) {
		int getdn = 0;
		int arr[] = new int[3];
		int i = 0;
		arr[1] = 0;
		arr[2] = 0;
		getdn = n;

		while (n > 0) {
			arr[i] = n % 10;
			n = n / 10;
			i++;
		}

		if (arr[1] - arr[0] == arr[2] - arr[1]) {
			return 1;
		} else
			return 0;

	}
}