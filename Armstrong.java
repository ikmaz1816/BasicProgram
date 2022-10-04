package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Armstrong {

	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int n1=n;
		int sum=0;
		while(n>0)
		{
			sum+=Math.pow(n%10, 3);
			n=n/10;
		}
		if(n1==sum)
			System.out.println("Armstrong");
		else
			System.out.println("Not armstrong");
	}

}
