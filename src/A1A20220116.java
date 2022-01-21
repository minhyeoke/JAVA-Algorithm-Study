import java.util.*;
import java.io.*;

public class A1A20220116 {

	public static void main(String[] args) throws IOException {
		int a = 0;
		String b;

		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		a = Integer.parseInt(br.readLine());
		b = br.readLine();
		String arr[]=b.split("");
		
		for (int i = 0; i < a; i++) {
			sum+=Integer.parseInt(arr[i]);
		}
		
		bw.write(Integer.toString(sum));
		bw.close();
		br.close();
	}
}
