package basicprogram;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=(int)Math.sqrt(n);
		System.out.println(a);
		sc.close();
	}

}
