package docu;
import java.util.Scanner;
public class opop {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String mode=kb.nextLine();
		Document D=new Document();
		Email E=new Email();
		File F=new File();
		if(mode.equals("A")){
			String type=kb.nextLine();
			if(type.equals("Document")){
				
				String a=kb.nextLine();
				     D.setText(a);
				 System.out.println(D.toString());				
			}
			else if(type.equals("Email")){
				String s=kb.nextLine();
				E.setSender(s); 
				String r=kb.nextLine();
				E.setRecipient(r);
				String t=kb.nextLine();
				E.setTitle(t);
				String text=kb.nextLine();
			     E.setText(text);
				System.out.println("From:"+E.getSender());
				System.out.println("To:"+E.getRecipient());
				System.out.println("Title:"+E.getTitle());
				 System.out.println(E.toString());
				
		}
			else if(type.equals("File")){
				
				String p=kb.nextLine();
				F.setPathname(p);
				String text=kb.nextLine();
			     F.setText(text);
				System.out.println("Path: "+F.getPathname());
				System.out.println(F.toString());
			}
	}
		else if(mode.equals("B")){
			String type=kb.nextLine();
			if(type.equals("Document")){
				String a=kb.nextLine();
				String[] input=a.split(" ");
				String keyword=kb.nextLine();
				int i,torf=0;
				for(i = 0; i < input.length; i++){
				if(input[i].equals(keyword)){
				System.out.println("true");
				torf=1;
				}			
				}
				if(torf==0){
					System.out.println("false");
				}
			}
		   else if(type.equals("Email")){
			   
			   String s=kb.nextLine();
				E.setSender(s); 
				String r=kb.nextLine();
				E.setRecipient(r);
				String t=kb.nextLine();
				E.setTitle(t);
				String text=kb.nextLine();
			     E.setText(text);
			       
			     String keyword=kb.nextLine();
			   
			     String[] input=text.split(" ");
					int i,torf=0;
					for(i = 0; i < input.length; i++){
					if(input[i].equals(keyword)){
					System.out.println("true");
					torf=1;
					}			
					}
					if(torf==0){
						System.out.println("false");
					}
			     
		   }
		   else if(type.equals("File")){
			   String p=kb.nextLine();
				F.setPathname(p);
				String text=kb.nextLine();
			     F.setText(text);
			     String keyword=kb.nextLine();
				   
			     String[] input=text.split(" ");
					int i,torf=0;
					for(i = 0; i < input.length; i++){
					if(input[i].equals(keyword)){
					System.out.println("true");
					torf=1;
					}			
					}
					if(torf==0){
						System.out.println("false");
					}
			     
				
		   }
		}
		
		else if(mode.equals("C")){
			String type=kb.nextLine();
			if(type.equals("Document")){
				String choose_term;
				String new_term;
				String a=kb.nextLine();
			     D.setText(a);
				choose_term=kb.nextLine();
				new_term=kb.nextLine();
				if(choose_term.equals("text")){
					D.setText(new_term);
					System.out.println(D.toString());
				}
			}
			else if(type.equals("Email")){
				String choose_term;
				String new_term;
				String s=kb.nextLine();
				E.setSender(s); 
				String r=kb.nextLine();
				E.setRecipient(r);
				String t=kb.nextLine();
				E.setTitle(t);
				String text=kb.nextLine();
			     E.setText(text);
				choose_term=kb.nextLine();
				new_term=kb.nextLine();
				if(choose_term.equals("sender")){
					E.setSender(new_term);
				}
				else if(choose_term.equals("recipient")){
					E.setRecipient(new_term);
				}
				else if(choose_term.equals("title")){
					E.setTitle(new_term);
				}
				else if(choose_term.equals("text")){
					E.setText(new_term);
				}
				System.out.println("From:"+E.getSender());
				System.out.println("To:"+E.getRecipient());
				System.out.println("Title:"+E.getTitle());
				System.out.println(E.toString());
			}
			else if(type.equals("File")){
				String choose_term;
				String new_term;
				String p=kb.nextLine();
				F.setPathname(p);
				String text=kb.nextLine();
			     F.setText(text);
				choose_term=kb.nextLine();
				new_term=kb.nextLine();
				if(choose_term.equals("pathname")){
					F.setPathname(new_term);
				}
				else if(choose_term.equals("text")){
					F.setText(new_term);
				}
				System.out.println("Path:"+F.getPathname());
				System.out.println(F.toString());
			}
			
			
			}
		
		 
			  
			
}
}