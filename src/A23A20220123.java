package lsa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A23A20220123 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int y=0,buf=0;
        String s=br.readLine();
        String arr[]=s.split("");
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
        	arr2[i]=Integer.parseInt(arr[i]);
        	
        }
        while(y<arr.length)
        {
        	for(int i=0;i<arr2.length-1;i++)
        	{
        		if(arr2[i]<arr2[i+1])
        		{
        			buf=arr2[i];
        			arr2[i]=arr2[i+1];
        			arr2[i+1]=buf;
        		}
        	}
        	y++;
        }
        for(int i=0;i<arr2.length;i++)
    	{
        	  bw.write(Integer.toString(arr2[i]));
    	}
       
        bw.close();
        br.close();
    }
}