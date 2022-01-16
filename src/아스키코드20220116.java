import java.util.*;
import java.io.*;


public class 아스키코드20220116 {
 
	public static void main(String[] args) throws IOException
	{
		char a;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		a=br.readLine().charAt(0);

		bw.write(Integer.toString((int)a));
		
		bw.close();
		br.close();
	    
		
	}
	
}
