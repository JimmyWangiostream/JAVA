package HW6;

import java.util.Scanner;

public class Subtraction implements IOperation{
	public String perform(String num1, String num2) { 
		int abcom=0;
		String[] tmp=new String[50];
		//takenum	
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
		   
		   
		   
		   if(abcom==0&&(n1s==1&&n2s==0)){state=4;}//-9 - 9
		   if(abcom==0&&(n1s==0&&n2s==1)){state=1;}//9 - -9 
		   //System.out.println(state);
		   //System.out.println(abcom);
		   //take state
		//if(abcom==0){state=0;}
		if(n1s<n2s&&abcom==1){state=1;}//+大 -小
		if(n1s<n2s&&abcom==-1){state=2;}//+小 -大 
		if(n1s>n2s&&abcom==1){state=3;}//-大 +小
		if(n1s>n2s&&abcom==-1){state=4;}//-小 +大
		
		if(n1zero+n2zero==2){state=0;}
		if(num1.equals(num2)){state=0;}
		
		
		
		else if(n1s==n2s){
			if(n1s==0){ //all positive

		if(n1l>n2l)state=5;//+大 +小
		if(n1l<n2l)state=6;//+小 +大
		else if(n1l==n2l){		
				if(abcom==1)state=5;//	+大 +小
				if(abcom==-1)state=6;//+小 +大
			}
			}
			else if(n1s==1){//all negative
				if(n1l<n2l)state=7;//-小 -大
		if(n1l>n2l)state=8;//-大 -小
			else if(n1l==n2l){		
				if(abcom==1)state=7;//-小 -大
				if(abcom==-1)state=8;//-大 -小
			}

		}
			}
		//System.out.println(state);
		String answer="";
			   if(state==3||state==4||state==6||state==8){
				  answer+="-";
			   }		   	
		//take state
		int[] Res=new int[50];
		//minus
		if(state==5||state==6||state==7||state==8){
			 if(state==5||state==8){//1-2of minus			
			int i = 0,count=0;
			  int borrow = 0;
		        for(i = 0; i < len+1; ++i){
		        	Res[i] = Num1[i] - Num2[i] - borrow;
		                if(Res[i] < 0){
		                        borrow = 1;
		                        Res[i] += 10;
		                }
		                else
		                        borrow = 0;
		        }	  
			 }
			 if(state==6||state==7){//2-1 of minus
				 int i = 0,count=0;
				  int borrow = 0;
			        for(i = 0; i < len+1; ++i){
			        	Res[i] = Num2[i] - Num1[i] - borrow;
			                if(Res[i] < 0){
			                        borrow = 1;
			                        Res[i] += 10;
			                }
			                else
			                        borrow = 0;
			        }	  
			 }
		      for(int j = 0; j < len+2; j++){
		    	  tmp[j]=Integer.toString(Res[j]);    	
		      }
		    
	      int k=0;    
	  	int chemizero=0;
	  	  //
	  	for(k=0;k<3;k++){if(tmp[len-k].equals("0")){chemizero++;}else break;}
	  	
	  //	System.out.print(chemizero+" ");
	  	 
	  	   for(k =len-chemizero ; k >=0; --k){
	  	 	answer+=tmp[k];
	  	   }		
	  	     //
	      /*if (tmp[len-1].equals("0"))chemizero=1;
	      int resl=0;
	      if(tmp[len-1].equals("0")&&state==7){resl=len-1-chemizero;}
		     else resl=len-chemizero;
		     // System.out.println(resl);
		      for(k =resl-1 ; k >=0; --k){
		    	answer+=tmp[k];
		      }		     */
		      //System.out.print(answer);
		 }
		 //minus
		
		if(state==1||state==2||state==3||state==4){//add
			
			int resl=0;
			
		int i = 0,carry = 0,count=0;
		   for(i = 0; i < len+1; ++i){
		           Res[i] = Num1[i] + Num2[i] + carry;
		           carry = Res[i] / 10;
		           Res[i] %= 10;	            
		   }
			
		   
		   for(int j = 0; j < len+1; j++){
		 	  tmp[j]=Integer.toString(Res[j]);
		 	  count++;
		   }
		  
		   int k=0;    
			int chemizero=0;
			
			for(k=0;k<3;k++){if(tmp[len-k].equals("0")){chemizero++;}else break;}
			
			//System.out.print(chemizero+" ");
			 
			   for(k =len-chemizero ; k >=0; --k){
			 	answer+=tmp[k];
			   }		     
		  /* 
		    int k=0;
		   int resle=len;
		   *String check=tmp[len];
		   int chemizero=0;
		      if (tmp[len-1].equals("0"))chemizero=1;
		   if(check.equals("0"))resle--;
		   resle-=chemizero;
		   for(k =resle ; k >=0; --k){
		 	answer+=tmp[k];
		   }*/
		   }
			
		//System.out.println(state);
		  // System.out.print(answer);
		if(state==0){answer="0";}
		   return answer;

		   

		   
} 
		   
		


	
	public String perform() {
		return null;
	}  
	
	}



