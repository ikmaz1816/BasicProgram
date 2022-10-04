package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiplicationTableN {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int i=1;
		while(i<=10)
		{
			System.out.println(n+"x"+i+" = "+n*i);
			i++;
		}
	}

}
