import java.util.*;
import java.io.*;

public class A26A20220126 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int min = 100;
		int sum = 0;
		
		for (int i = 0; i < Integer.parseInt(s); i++) {
			String s2 = br.readLine();
			String arr[] = s2.split(" ");
			for (int j = 0; j < arr.length; j++) {
				if (Integer.parseInt(arr[j]) % 2 == 0) {
					if (min > Integer.parseInt(arr[j]))
						min = Integer.parseInt(arr[j]);

					sum += Integer.parseInt(arr[j]);
					 
				}
				 
			}
			bw.write(Integer.toString(sum)+" "+Integer.toString(min)+"\n");
			sum=0;
			min=100;
		}
		bw.close();
		br.close();
	}
}
