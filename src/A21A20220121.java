package lsa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A21A20220121 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int min = 0, max = 0, o = 0, y = 0;
		int s = Integer.parseInt(br.readLine());
		String arr[] = new String[s];
		String arr2[] = new String[3];
		String arr3[] = new String[3];
		String arr4[] = new String[3];
		String arr5[] = new String[3];
		String arr6[] = new String[3];
		String r;
		for (int i = 0; i < s; i++) {
			arr[i] = br.readLine();

		}
		while (o < s) {
			for (int i = 0; i < s - 1; i++) {
				arr4 = arr[i].split(" ");
				arr5 = arr[i + 1].split(" ");
				if (Integer.parseInt(arr4[2]) > Integer.parseInt(arr5[2])) {
					{
						r = arr[i + 1];
						arr[i + 1] = arr[i];
						arr[i] = r;
					}
				}
			}
			o++;

		}
		y = s;
		arr4 = arr[s - 1].split(" ");
		arr5 = arr[s - 2].split(" ");

		while (y - 3 > 0) {
			arr6 = arr[y - 3].split(" ");

			if (arr4[0].equals(arr5[0]) && arr5[0].equals(arr6[0])) {
				y--;
				continue;
			} else {
				arr[s - 3] = arr[y - 3];
				break;
			}
		}

		for (int i = 0; i < 3; i++) {
			arr2 = arr[s - i - 1].split(" ");
			bw.write(arr2[0] + " " + arr2[1] + "\n");
		}
		br.close();
		bw.close();
	}

}
