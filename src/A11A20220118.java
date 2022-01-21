import java.util.*;
import java.io.*;

public class A11A20220118 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String s=br.readLine();
		String arr[]=s.split(" ");
		int Fix=Integer.parseInt(arr[0]);
		int Price=Integer.parseInt(arr[1]);
		int sell=Integer.parseInt(arr[2]);
        
		if(sell<=Price)
			 bw.write(Integer.toString(-1));
		else
			bw.write(Integer.toString(Fix/(sell-Price)+1));
       
   
        
        bw.close();
        br.close();
		 
	}
}
