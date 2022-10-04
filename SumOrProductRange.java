package basicprogram;

import java.util.Scanner;

public class SumOrProductRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int sum=0,prod=1;
		switch(c)
		{
		case 1:
			for(int i=1;i<=n;i++)
				sum+=i;
			System.out.println(sum);
			break;
		case 2:
			for(int i=1;i<=n;i++)
				prod*=i;
			System.out.println(prod);
			break;
		default:
			System.out.println("-1");
		}
		sc.close();
	}

}
