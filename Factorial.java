package basicprogram;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Factorial {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(br.readLine());
		int res=1;
		while(a>0)
		{
			res=res*a;
			a--;
		}
		System.out.println(res);
	}

}
