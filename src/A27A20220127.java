import java.util.*;
import java.io.*;

public class A27A20220127 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
	    String arr[]=s.split(" ");
	   bw.write(Integer.toString(Integer.parseInt(arr[1])-Integer.parseInt(arr[0]))+" "+arr[1]);
		bw.close();
		br.close();
	}
}
