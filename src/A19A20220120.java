import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class A19A20220120 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int s = Integer.parseInt(br.readLine());
        BigInteger a=new BigInteger("1");
        BigInteger b=new BigInteger("1");
        BigInteger buf=new BigInteger("0");
        BigInteger result=new BigInteger("0");

		if (s <= 2) {
			bw.write(Integer.toString(1));
		} else {
			for (int i = 2; i < s; i++) {
				buf = b;
				result = a.add(b);
				b = result;
				a = buf;

			}
			bw.write(result.toString());
		}
		bw.close();
		br.close();
	}

}