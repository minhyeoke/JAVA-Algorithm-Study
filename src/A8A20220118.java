import java.util.*;
import java.io.*;

public class A8A20220118 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String arr1[];
		String arr2[];
		arr2 = s.split("");
		int time = 0;
		String arr[] = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr1 = arr[j].split("");
				for (int k = 0; k < arr1.length; k++) {
					if (arr2[i].equals(arr1[k]))
						time += j + 1;
				}

			}
			time += 2;
		}
		bw.write(Integer.toString(time));
		bw.close();
		br.close();
	}
}
