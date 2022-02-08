import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class A38A20220208 {

	public static void main(String[] args) throws IOException {
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine();
	String arr[]=s.split(" ");
	long a=Integer.parseInt(arr[0]);
	long b=Integer.parseInt(arr[1]);
	long c=a-b;
	if(c<0)
		c=c*-1;
	
	bw.write(Long.toString(a));
	br.close();
	bw.close();
	}
	
}
