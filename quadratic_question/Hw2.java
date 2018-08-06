package hw2;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Scanner;
public class Hw2 {
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
			double a=kb.nextDouble();
			double b=kb.nextDouble();
			double c=kb.nextDouble();
		String pattern=kb.next();
		DecimalFormat pat=new DecimalFormat(pattern);
		    
			double ans1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
			double ans2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
			if(a>0)
		    {
			System.out.print(pat.format(ans1)+'\n');
			System.out.print(pat.format(ans2));
				
		    }
			else{
				System.out.print(pat.format(ans2)+'\n');
				System.out.print(pat.format(ans1));
			}
}
}