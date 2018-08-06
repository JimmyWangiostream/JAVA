package docu;

import java.util.Scanner;

public class Email extends Document{
	public String sender;
	public String recipient;
	public String title;
	 public void setSender(String f){
		 sender=f;
	 }
	 public String getSender(){
			return sender;
	 }
	 public void setRecipient(String e){
			recipient=e;
	 }
	 public String getRecipient(){
		 return recipient;
	 }
	 public void setTitle(String d){

		 title=d;
	 }
	 public String getTitle(){
		 return title;
	 }

}
