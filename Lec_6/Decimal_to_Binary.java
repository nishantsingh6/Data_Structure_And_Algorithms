package Lec_6;
import java.util.*;
public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int mult=1;
		int ans=0;
		while(n>0) {
		int rem=n%2;
		ans=ans+rem*mult;
		mult*=10;
		n=n/2;
		}
System.out.println(ans);
	}

}
