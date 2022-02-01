package lsa;
import java.util.*;
import java.io.*;

public class A32A20220201 {

	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    String s=br.readLine();
	    int arr[]=new int[4];
	    int q=0,buf=0;
	    String arr2[]=s.split(" ");
	    for(int i=0;i<4;i++)
	    {
	    	arr[i]=Integer.parseInt(arr2[i]);
	    }
	    
	    while(q<4)
	    {
	    	for(int i=0;i<3;i++)
	    	{
	    		if(arr[i]>arr[i+1])
	    		{
	    			buf=arr[i];
	    			arr[i]=arr[i+1];
	    			arr[i+1]=buf;
	    		}
	    	}
	    	q++;
	    }
	    bw.write(Integer.toString((arr[0]+arr[3])-(arr[1]+arr[2])));
	    
	    bw.close();
	    br.close();
	}
}
