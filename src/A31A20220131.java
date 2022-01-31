package lsa;
import java.util.*;
import java.io.*;

public class A31A20220131 {

	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    int max=0;
	    int arr[]=new int[5];
	    for(int i=0;i<5;i++)
	    { 
	    	arr[i]=Integer.parseInt(br.readLine());
	     	
	    }
	    int n=arr[1]/arr[3];
	    if(arr[1]%arr[3]!=0)
	    	n++;
	    int q=arr[2]/arr[4];
	    if(arr[2]%arr[4]!=0)
	    	q++;
	    
	    if(n>q)
	    	max=n;
	    else
	    	max=q;
	    
	    bw.write(Integer.toString((arr[0]-max)));
	    
	    bw.close();
	    br.close();
	}
}
