import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class A37A20220207 {

	public static void main(String[] args) throws IOException {
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int s=Integer.parseInt(br.readLine());
	if(s==0)
		bw.write("YONSEI");
	else
		bw.write(" Leading the Way to the Future");
	
	br.close();
	bw.close();
	}
	
}
