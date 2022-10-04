package basicprogram;

import java.util.Scanner;

public class AP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=3*i+2;
			if(sum%4==0)
			{
				n=n+1;
				continue;
			}
			System.out.print(sum+" ");
			sc.close();
		}

	}

}
