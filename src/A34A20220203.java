import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class A34A20220203 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        BigInteger a=new BigInteger(br.readLine());
        BigInteger b=new BigInteger(br.readLine());
  
        BigInteger a2=new BigInteger("1");
        BigInteger a3=new BigInteger("2");
        BigInteger a4=new BigInteger("3");
        a2=a.add(b);
        a3=a.subtract(b);
        a4=a.multiply(b);
        bw.write(a2.toString()+"\n"+a3.toString()+"\n"+a4.toString());
        bw.close();
        br.close();
	}
}
