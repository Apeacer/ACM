package com.jd.test0;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main 
{
	public static void main (String []args)
	{
		Scanner scanner = new Scanner(System.in);

		while(true)
		{
			double input = scanner.nextDouble();
			
			DecimalFormat   df   =new   java.text.DecimalFormat("#.00");  
			if(input<1 && input>-1)
			{
				System.out.println("0"+df.format(Math.abs(input)));
			}
			else
				System.out.println(df.format(Math.abs(input)));
		}
		
		
	}
}