package basicprogram;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PerfectNumber {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println("Perfect");
		else
			System.out.println("Not perfect");
	}

}
