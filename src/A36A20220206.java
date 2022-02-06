import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class A36A20220206 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String arr[] = s.split(" ");
		String buf;
		int d = 0;
		while (d < 2) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[i + 1])) {
					buf = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = buf;
				}
			}
			d++;
		}
		BigInteger b=new BigInteger(arr[0]);
		BigInteger b1=new BigInteger(arr[1]);
		BigInteger b2=new BigInteger(arr[2]);
		b2=b1.multiply(b2);
		b=b2.divide(b);
		bw.write(b.toString());
		bw.close();
		br.close();

	}
}
