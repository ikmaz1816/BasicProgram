package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AverageOfThree {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		int average=(a+b+c)/3;
		System.out.println(average);
	}

}
