import java.io.*;
import java.util.*;

public class A50A20220218 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int s = Integer.parseInt(br.readLine());
		
		String a = br.readLine();
		String arr[] = a.split(" ");
		int arr2[] = new int[s];
		int buf = 0;
		int count = 0;
		int count3 = 0;
		
		
		for (int i = 0; i < s; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
			
			if (arr2[i] == 1)
				continue;
			if(arr2[i]==2)
			{
				count++;
				continue;
			}
			buf = arr2[i] - 1;

			for (int j = buf; j > 1; j--) {
				if (arr2[i] % buf == 0)
					count3++;

				if (buf == 2 && count3 == 0)
					count++;
				
				buf--;

			}
			count3 = 0;
         
		}
		bw.write(Integer.toString(count));
		bw.close();
		br.close();
	}
}
