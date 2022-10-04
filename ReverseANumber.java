package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseANumber {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int sum=0;
		while(n>0)
		{
			sum=10*sum+(n%10);
			n=n/10;
		}
		System.out.println(sum);

	}

}
