package lsa;
import java.util.*;
import java.io.*;

public class A30A20220130 {

	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    String s=br.readLine();
	    String arr[]=s.split(" ");
	    if(Integer.parseInt(arr[1])<3)
	    {
	    	bw.write("NEWBIE!");
	    }
	    else if(Integer.parseInt(arr[0])>=Integer.parseInt(arr[1])&&Integer.parseInt(arr[1])>=3)
	    {
	    	bw.write("OLDBIE!");
	    }
	    else
	    	bw.write("TLE!");
	    
	    bw.close();
	    br.close();
	}
	
}
