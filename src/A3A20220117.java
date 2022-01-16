import java.io.*;
import java.util.*;

public class A3A20220117 {
	public static void main(String[] args) throws IOException {
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		s = br.readLine();

		int arr2[] = new int[26];

		for (int i = 0; i < arr2.length; i++) {

			arr2[i] = -1;

		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (arr2[ch - 'a'] == -1) {
				arr2[ch - 'a'] = i;
			}

		}

		for (int i = 0; i < arr2.length; i++) {
			bw.write(Integer.toString(arr2[i]) + " ");
		}
		bw.close();
		br.close();

	}

}
