import java.util.*;
import java.io.*;

public class A40A20220210 {

	public static void main(String[] args) throws IOException
	{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String arr[]=new String[2];
		while(true)
		{
			 s=br.readLine();
			 arr=s.split(" ");
			 if(arr[0].equals("0")&&arr[1].equals("0"))
				 break;
			 
			 if(Integer.parseInt(arr[0])>Integer.parseInt(arr[1]))
				 bw.write("Yes");
			 else
				 bw.write("No");
			 
			 bw.write("\n");
		}
		bw.close();
		br.close();
	}
}
