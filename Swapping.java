package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Swapping {

	public static void main(String[] args) throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int a=Integer.parseInt(br.readLine());
			int b=Integer.parseInt(br.readLine());
			
			 a=a^b;
			 b=a^b;
			 a=a^b;
			 System.out.println(a+" "+b);
			 
			 int temp=a;
			 a=b;
			 b=temp;
			 
			 System.out.println(a+" "+b);
			 
			 a=a+b;
			 b=a-b;
			 a=a-b;
			 
			 System.out.println(a+" "+b);

	}

}
