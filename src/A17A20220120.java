import java.util.*;
import java.io.*;

public class A17A20220120 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String arr[] = s.split(" ");
		int arr2[] = new int[arr.length];
		arr2[0] = Integer.parseInt(arr[0]);
		arr2[1] = Integer.parseInt(arr[1]);
		int s1 = r(arr2[0], arr2[1]);
		bw.write(Integer.toString(s1) + "\n" + Integer.toString((arr2[0]*arr2[1])/s1));
		bw.close();
		br.close();
	}

	public static int r(int a, int b) {
		int q;
		if (a > b) {
			q = a;
			while (a % b != 0) {

				q = a % b;
				a = b;
				b = q;
			}
			return b;
		}

		else {
			q = b;
			while (b % a != 0) {

				q = b % a;
				b = a;
				a = q;
			}
			return a;
		}

	}

}
