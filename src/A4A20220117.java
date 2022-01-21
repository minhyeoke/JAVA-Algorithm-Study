import java.io.*;
import java.util.*;

public class A4A20220117 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int s=Integer.parseInt(br.readLine());
		 
		
		for(int i=0;i<s;i++)
		{
			String a=br.readLine();
			String arr[]=a.split(" ");
			String arr1[]=new String[arr[1].length()];
			arr1=arr[1].split("");
			
			for(int j=0;j<arr1.length;j++)
			{ 
				for(int k=0;k<Integer.parseInt(arr[0]);k++)
				  bw.write(arr1[j]);

			}
			bw.write("\n");
		}
		bw.close();
		br.close();
	}
}
