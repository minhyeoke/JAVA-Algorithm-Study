import java.util.*;
import java.io.*;

public class A16A20220119 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int ar1;
		int ar2;
		int s = 1;

		for (int i = 0; i < n; i++) {
			String a = br.readLine();
			String arr[] = a.split(" ");
			ar1 = Integer.parseInt(arr[0]);
			ar2 = Integer.parseInt(arr[1]);

			if (ar1 > ar2) {
				int ar3 = ar1 * ar2;
				s = ar2;
				while (ar1 % s != 0) {
					s = ar1 % ar2;
					ar1 = ar2;
					ar2 = s;

				}
				bw.write(Integer.toString(ar3 / s));
			} else {
				int ar3 = ar1 * ar2;
				s = ar1;
				while (ar2 % s != 0) {
					s = ar2 % ar1;
					ar2 = ar1;
					ar1 = s;
				}
				bw.write(Integer.toString(ar3 / s));
			}
			bw.write("\n");
		}

		bw.close();
		br.close();

	}
}