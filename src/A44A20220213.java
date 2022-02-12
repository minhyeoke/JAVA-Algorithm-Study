package lsa;
import java.util.*;
import java.io.*;

public class A44A20220213 {

	public static void main(String [] args)throws IOException
	{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int a=Integer.parseInt(br.readLine());
	    int arr[]=new int[a];
	    for(int i=0;i<a;i++)
	    {
	    	arr[i]=Integer.parseInt(br.readLine());
	    	
	    }
	    Arrays.sort(arr);
	    for(int i=0;i<a;i++)
	    {
	    	bw.write(Integer.toString(arr[i])+"\n");
	    }
	    bw.close();
	    br.close();
	}
}
