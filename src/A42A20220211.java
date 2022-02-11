package lsa;
import java.io.*;
import java.util.*;

public class A42A20220211 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		int c=a*2-1;
		int d=0;
		while(b<=a)
		{
			for(int i=0;i<d;i++)
			{
				System.out.print(" ");
			}
			
			for(int i=0;i<c;i++)
			System.out.print("*");
			
			System.out.println();
			c-=2;
			b++;
			d++;
			
		}
	}
}
