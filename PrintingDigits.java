package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintingDigits {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n>0)
		{
			int digit=(int)Math.log10(n)+1;
			System.out.println(n/(int)(Math.pow(10, digit-1)));
			n=n-n/(int)(Math.pow(10, digit-1))*(int)Math.pow(10, digit-1);
		}

	}

}
