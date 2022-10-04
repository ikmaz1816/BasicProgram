package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factors {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}
	}

}
