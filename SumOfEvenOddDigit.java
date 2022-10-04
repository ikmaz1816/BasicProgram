package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfEvenOddDigit {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int sume=0,sumo=0;
		while(n>0)
		{
			if((n%10)%2==0)
				sume+=n%10;
			else
				sumo+=n%10;
			n=n/10;
		}
		System.out.println("The sum of even number"+" "+sume);
		System.out.println("The sum of odd number"+" "+sumo);
	}

}
