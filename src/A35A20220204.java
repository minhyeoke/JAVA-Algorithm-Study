import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class A35A20220204 {

	public static void main(String[] args) throws IOException {
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine();
	String arr[]=s.split(" ");
	BigInteger a=new BigInteger(arr[0]);
	BigInteger a1=new BigInteger(arr[1]);
	BigInteger a2=new BigInteger(arr[2]);
	a=a.add(a1);
	a=a.add(a2);
	bw.write(a.toString());
	bw.close();
	br.close();
	}
}
