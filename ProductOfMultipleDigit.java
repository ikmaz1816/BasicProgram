package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProductOfMultipleDigit {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int res=1;
		while(a>0)
		{
			res*=a%10;
			a=a/10;
		}
		System.out.println(res);
	}
}
