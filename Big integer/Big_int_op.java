package HW6;
import java.util.Scanner;

public class Big_int_op {
	public static void main(String args[]){
		Scanner cin=new Scanner(System.in);
		String arg=cin.nextLine();
		String[] arg_term=arg.split(" ");
		String op="";
		String result=arg_term[0];
		for(int i=0;i<arg_term.length-1;i=i+2)
		{
			
			op=arg_term[i+1];
			
			String logic="";
			if(op.equals("+"))
					{IOperation operation = new Addition();
					result=operation.perform(result,arg_term[i+2]);
					//result="3";
					}
			if(op.equals("-"))
				{IOperation operation = new Subtraction();
				result=operation.perform(result,arg_term[i+2]);}
			if(op.equals(">")||op.equals("<")||op.equals("=")){
				IOperation operation = new Comparison();
				if(op.equals(">"))logic="1";
				else if(op.equals("="))logic="0";
				else if(op.equals("<"))logic="-1";
				result=operation.perform(result,arg_term[i+2]);
				if(result.equals(logic)){result="true";}
				else{result="false";}
			}
			
		}
		System.out.println(result);
		
		
}
	
}
