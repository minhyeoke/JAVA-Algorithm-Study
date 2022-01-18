import java.util.*;
import java.io.*;

public class A10A20220118 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int a = Integer.parseInt(br.readLine());
		int count = 0;

		for (int i = 0; i < a; i++) {
			if (check() == true) {
				count++;
			}
		}
		bw.write(Integer.toString(count));
		bw.close();
		br.close();
	}

	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);

			if (prev != now) {
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				} else
					return false;
			}
		}

		return true;

	}
}
