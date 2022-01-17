import java.util.*;
import java.io.*;

public class A9A20220118 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String arr[];
		arr = s.split("");
		int sum = 0, j = 0, k = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr.length == 1) {

				if (arr[0].equals(""))
					sum = 0;
				else
					sum++;
			}

			else if (arr.length > 2) {
				if (arr[i].equals("-") || arr[i].equals("="))
					sum += 0;
				else if (arr[i].equals("n") && arr[j + 1].equals("j"))
					sum += 0;
				else if (arr[i].equals("l") && arr[j + 1].equals("j"))
					sum += 0;
				else if (arr[i].equals("d") && arr[j + 1].equals("z") && arr[k + 2].equals("="))
					sum += 0;
				else
					sum++;

				if (i < arr.length - 2) {
					j++;

				}

				if (i < arr.length - 3) {
					k++;

				}
			} else if (arr.length > 1) {
				if (arr[i].equals("-") || arr[i].equals("="))
					sum += 0;
				else if (arr[i].equals("n") && arr[j + 1].equals("j"))
					sum += 0;
				else if (arr[i].equals("l") && arr[j + 1].equals("j"))
					sum += 0;
				else
					sum++;

				if (i < arr.length - 2) {
					j++;

				}
			}
		}
		bw.write(Integer.toString(sum));
		bw.close();
		br.close();

	}
}
