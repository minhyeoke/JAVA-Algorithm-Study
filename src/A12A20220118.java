import java.util.*;
import java.io.*;

public class A12A20220118 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int s = Integer.parseInt(br.readLine());
		int count = 1;
		int range = 2;

		if (s == 1) {
			bw.write(Integer.toString(1));

		} else {
			while (range <= s) {
				range = range + (6 * count);
				count++;
			}
		}
		bw.write(Integer.toString(count));
		bw.close();
		br.close();
	}
}
