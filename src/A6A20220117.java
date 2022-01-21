import java.util.*;
import java.io.*;

public class A6A20220117 {

	public static void main(String[] args) throws IOException {
		String s;
        String arr[];
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		s = br.readLine();
		s=s.trim();
		arr=s.split(" ");
        
		for(int i=0; i<arr.length;i++)
			{
			if(arr[0].equals("")==false)
			  sum++;
			} 
		
		bw.write(Integer.toString(sum));
		bw.close();
		br.close();
	}
}
