import java.util.*;
import java.io.*;

public class A13A20220119 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int s=1;
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			s=s*i;
		}
		bw.write(Integer.toString(s));
		bw.close();
		br.close();
	}
}
