package lsa;
import java.util.*;
import java.io.*;

public class A29A20220129 {

	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    int sum=0;
		for(int i=0;i<5;i++)
		{
			int s=Integer.parseInt(br.readLine());
			if(s<40)
				s=40;
		    sum+=s;	
		}
		bw.write(Integer.toString(sum/5));
		bw.close();
		br.close();
	}
}
