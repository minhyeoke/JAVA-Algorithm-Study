import java.util.*;
import java.io.*;

public class A47A20220215 {

	public static void main(String[] args) throws IOException
	{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int s=Integer.parseInt(br.readLine());
	    bw.write(Integer.toString(s-543));
		
		bw.close();
		br.close();
	}
}
