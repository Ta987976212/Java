package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int input ;
		int counto = 0 ;
		int countj = 0 ;
		input = in.nextInt();
		
		do {
			
			if(0 < input || input < 100000)
			{
				input = in.nextInt();
				if(input % 2 == 0)
				{
					counto++;
				}
				else
				{
					countj++;
				}
				
			}
			else
			{
				input = in.nextInt();
			}
			
		}while(input != -1);
		
		
		
		System.out.println( countj+" "+counto);
	
}
	
}
