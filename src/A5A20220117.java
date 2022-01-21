import java.io.*;
import java.util.*;

public class A5A20220117 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int arr[] = new int[26];
		int max=65;
		char charac = 'a';
		for (int i = 0; i < 26; i++)
			arr[i] = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((int)ch >= 97 && (int)ch <= 122)
				arr[ch - 'a']++;
			else if ((int)ch >= 65 && (int)ch <= 90)
				arr[ch - 'A']++;
		}
	 
		for (int i = 0; i < 26; i++) {
			 
			
			if (arr[i]+97 > (int)max)
				{
				max=arr[i]+97;
				charac = (char) (i+65);
				}
			else if (arr[i]+97 ==(int)max)
				charac = '?';
		}
		bw.write(charac);

		bw.close();
		br.close();
	}
}
