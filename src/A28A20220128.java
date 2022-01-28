import java.util.*;
import java.io.*;

public class A28A20220128 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String buf;
		int n = 0;
		String arr[] = s.split("/");
	    int a=Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
	    if(a<Integer.parseInt(arr[1])||Integer.parseInt(arr[1])==0)
	    	bw.write("hasu");
	    else
	    	bw.write("gosu");
		bw.close();
		br.close();
	}
}
