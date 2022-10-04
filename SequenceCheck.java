package basicprogram;

import java.util.Scanner;

public class SequenceCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isGoing=false;
		boolean isValid=false;
		int previous=sc.nextInt();
		n--;
		while(n>0)
		{
			int current=sc.nextInt();
			int diff=current-previous;
			if(diff>0)
				isGoing=true;
			else if(isGoing && diff<0)
				isValid=false;
			else if(diff==0)
				isValid=false;
			else
				isValid=true;
			previous =current;
			n--;
				
		}
		if(isValid)
			System.out.println("true");
		else
			System.out.println("false");
		sc.close();

	}

}
