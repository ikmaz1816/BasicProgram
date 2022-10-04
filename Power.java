package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Power {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		int res=1;
		for(int i=0;i<m;i++)
		{
			res=res*n;
		}
		System.out.println(res);
	}

}
