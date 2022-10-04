package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FibonacciSeries {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=0;
		int b=1;
		int sum=0;
		
		int fib=Integer.parseInt(br.readLine());
		System.out.println(a);
		System.out.println(b);
		while(fib>2)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
			fib--;
		}
	}

}
