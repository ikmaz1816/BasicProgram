package basicprogram;

import java.util.Scanner;

public class AllPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=27;
		System.out.println("2");
		System.out.println("3");
		for(int i=4;i<n;i++)
		{
			if(!isPrime(i))
				System.out.println(i);
		}
		sc.close();
	}

	private static boolean isPrime(int i) {
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
				return true;
		}
		return false;
	}

}
