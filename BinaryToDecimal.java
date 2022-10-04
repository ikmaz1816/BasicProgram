package basicprogram;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem*(int)Math.pow(2, i);
			i++;
			n/=10;
		}
		System.out.println(sum);
		sc.close();
	}

}
