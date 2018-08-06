package hw4;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Babylonian {
public static void main (String[] args) {
			Scanner scan= new Scanner(System.in);
			double n,r,guess;
			double tm;
			n=scan.nextDouble();
			guess=n/2;
			r=n/guess;
			tm=guess;
			guess=(tm+r)/2;
			while((Math.abs(guess-tm)/tm>0.01)){
				tm=guess;
				r=n/guess;
				guess=(tm+r)/2;
			}
			
			DecimalFormat form=new DecimalFormat("#.##");
			String ans=form.format(guess);
			System.out.println(ans);
}
}