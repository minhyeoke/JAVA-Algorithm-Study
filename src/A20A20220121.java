package lsa;
import java.util.*;
import java.io.*;

public class A20A20220121 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int s = Integer.parseInt(br.readLine());
		String s2 = br.readLine();
		String arr[] = s2.split(" ");
		long min = Integer.parseInt(arr[0]);
		long max = Integer.parseInt(arr[0]);
		if (s == 1) {

				int ss = Integer.parseInt(arr[0]);
				bw.write(Integer.toString(ss*ss));
			

		} else {
			for (int i = 0; i < arr.length; i++) {
				if (Integer.parseInt(arr[i]) > max)
					max = Integer.parseInt(arr[i]);
				else if (Integer.parseInt(arr[i]) < min)
					min = Integer.parseInt(arr[i]);

			}

			bw.write(Long.toString(min * max));
		}
		br.close();
		bw.close();
	}

}
