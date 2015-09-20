package com.jd.test2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		DecimalFormat   df   =new   java.text.DecimalFormat("#.00"); 
		while(scanner.hasNext())
		{
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			double result = n;
			double n1 = n;
			for(int i=1;i<m;i++)
			{
				n1 = Math.sqrt(n1);
				result +=n1;
			}
			System.out.println(df.format(result));
		}
	}

}
