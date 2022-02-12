package lsa;

import java.util.*;
import java.io.*;

public class A43A20220211 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    
	    int n=Integer.parseInt(br.readLine());
	    int[] arr=new int[n*n];
	    int index=0;
	    
	    for(int i=0;i<n;i++)
	    {
	    	st=new StringTokenizer(br.readLine());
	    	for(int j=0;j<n;j++)
	    	{
	    		arr[index++]=Integer.parseInt(st.nextToken());
	    	}
	    }
	    Arrays.sort(arr);
	    bw.write(Integer.toString(arr[n*n-n]));
	    bw.close();
	    br.close();
	}
}
