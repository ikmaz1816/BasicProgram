package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlphabeticCheck {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char c=br.readLine().charAt(0);
		if(Character.isAlphabetic(c))
		{
			if(Character.isUpperCase(c))
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
		}
		else
		{
			System.out.println("-1");
		}
	}

}
