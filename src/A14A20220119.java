import java.util.*;
import java.io.*;

public class A14A20220119 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n + 1];

		if (n == 0) {

			bw.write(Integer.toString(0));
		} else if (n == 1) {
			bw.write(Integer.toString(1));
		} else {
			arr[0] = 1;
			arr[1] = 1;
			for (int i = 2; i <= n; i++) {
				arr[i] = arr[i - 2] + arr[i - 1];

			}
			bw.write(Integer.toString(arr[n]) + "\n");
		}
		bw.close();
		br.close();
	}
}
