import java.util.*;
import java.io.*;

public class A18A20220120 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int max = 0;
		int q = 0;
		for (int i = 0; i < Integer.parseInt(s); i++) {
			String ss = br.readLine();
			String arr[] = ss.split(" ");
			int arr2[] = new int[arr.length];

			for (int j = 0; j < arr.length; j++) {
				arr2[j] = Integer.parseInt(arr[j]);
			}
			while (q < arr2.length - 1) {
				for (int j = 0; j < arr2.length; j++) {
					if (j < arr2.length - 1) {
						if (arr2[j] > arr2[j + 1]) {
							max = arr2[j + 1];
							arr2[j + 1] = arr2[j];
							arr2[j] = max;
						}
					}

				}
				q++;
			}
			max = 0;
			q = 0;
			bw.write(Integer.toString(arr2[arr2.length - 3]) + "\n");
		}
		bw.close();
		br.close();

	}

}
