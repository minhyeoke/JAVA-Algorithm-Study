import java.util.*;
import java.io.*;

public class A7A20220118 {

	public static void main(String[] args) throws IOException {
		int a = 100, sum1 = 0, sum2 = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String arr[] = s.split(" ");
		String arr1[];
		String arr2[];
		String buf, buf1;
		arr1 = arr[0].split("");
		arr2 = arr[1].split("");
		buf = arr1[0];
		buf1 = arr2[0];
		for (int i = 0; i < arr1.length; i++) {

			if (i == 2) {
				arr1[i] = buf;
				arr2[i] = buf1;
			} else {
				arr1[i] = arr1[(arr1.length - 1) - i];
				arr2[i] = arr2[(arr1.length - 1) - i];
			}
			arr1[i] = Integer.toString(Integer.parseInt(arr1[i]) * a);
			arr2[i] = Integer.toString(Integer.parseInt(arr2[i]) * a);

			a = a / 10;
			sum1 += Integer.parseInt(arr1[i]);
			sum2 += Integer.parseInt(arr2[i]);

		}
	 
		if (sum1 > sum2)
			bw.write(Integer.toString(sum1));
		else
			bw.write(Integer.toString(sum2));

		bw.close();
		br.close();

	}
}
