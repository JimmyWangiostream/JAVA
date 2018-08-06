package HW6;

import java.util.Scanner;

public class Comparison implements IOperation{
	public String perform(String num1,String num2) { 
		
		int abcom=0;
		String ans="";
 
		int n1l=num1.length();
		int n2l=num2.length();
		int len=(n1l>n2l)?n1l:n2l;
		int[] Num1 = new int[50];
		int[] Num2 = new int[50];
		int n1s=0;
		int n2s=0;
		int state=0;
		int n1zero=0;
		int n2zero=0;
		if(num1.equals("0")||num1.equals("-0")){n1zero=1;}
		if(num2.equals("0")||num2.equals("-0")){n2zero=1;}
		if (num1.substring(0,1).equals("-")){
			n1s=1;
		}
		if (num2.substring(0,1).equals("-")){
			n2s=1;
		}
		for(int i=n1l-1; i>=n1s; i--){
			Num1[n1l-1-i] = Integer.valueOf(num1.substring(i, i+1));
		}
		
		for(int i=n2l-1; i>=n2s; i--){
			Num2[n2l-1-i] = Integer.valueOf(num2.substring(i, i+1));
		}
		for(int i=0;i<len;i++){
			if(Num1[len-i]>Num2[len-i]){
				abcom=1;
				break;
			}
			if(Num2[len-i]>Num1[len-i]) {abcom=-1;	
			break;
		    }   
			}
		
		 //System.out.println(abcom);
		  if((n1l-n1s)>(n2l-n2s)){abcom=1;}
		   if((n1l-n1s)<(n2l-n2s)){abcom=-1;}
		   
		//
		   /*for(int i=0;i<n1l;i++)System.out.print(Num1[i]);
		   System.out.print("   ");
		   for(int i=0;i<n2l;i++)System.out.print(Num2[i]);
				
		   System.out.print("   ");
		   */
		   if((n1l-n1s)>(n2l-n2s)){abcom=1;}
		   if((n1l-n1s)<(n2l-n2s)){abcom=-1;}
		   
		if(abcom==0&&(n1s>n2s)){ans="-1";}
		if(abcom==0&&(n1s<n2s)){ans="1";}
		if(n1s<n2s&&abcom==1){ans="1";}//+大 -小
		if(n1s<n2s&&abcom==-1){ans="-1";}//+小 -大 655
		if(n1s>n2s&&abcom==1){ans="-1";}//-大 +小
		if(n1s>n2s&&abcom==-1){ans="-1";}//-小 +大
		if(n1zero+n2zero==2){ans="0";}
		if(num1.equals(num2)){ans="0";}
		else if(n1s==n2s){
			if(n1s==0){ //all positive

		if(n1l>n2l)ans="1";//+大 +小
		if(n1l<n2l)ans="-1";//+小 +大
		else if(n1l==n2l){		
				if(abcom==1)ans="1";//	+大 +小
				if(abcom==-1)ans="-1";//+小 +大
			}
			}
			else if(n1s==1){//all negative
				if(n1l<n2l)ans="1";//-小 -大
		if(n1l>n2l)ans="-1";//-大 -小
			else if(n1l==n2l){		
				if(abcom==1)ans="1";//-小 -大
				if(abcom==-1)ans="-1";//-大 -小
			}

		}
			}
		//System.out.println(state+" "+abcom);
		return ans;
	}

       
	
 


public String perform() {
	// TODO Auto-generated method stub
	return null;
}  
}
