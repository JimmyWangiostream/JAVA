package java_pro;

import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



import java.util.*;

public class Groundmouse  implements ActionListener{
  Random ran = new Random();
  int a,b,c,running;
  int l;
  int canatk;
  int hp1,hp2;
  int playtime=30000;
  int hard;
  int timenum=30;
  int bonustime=5;
  int scorenum;
  int check;
  JFrame f;
  
  Cursor cr,br;
  
  JLabel imglab;
  JLabel time;
  JLabel score;
  JLabel imglab1;
  JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,bobtn;
  
  JButton bbtn1,bbtn2,bbtn3,bbtn4,bbtn5,bbtn6,bbtn7,bbtn8,bbtn9;
  
  JButton tbtn1,tbtn2,tbtn3,tbtn4,tbtn5,tbtn6,tbtn7,tbtn8,tbtn9;
  JButton stop,resume;
  Thread set;
  Thread set1;
  Thread bonu;
  
  JButton ch1,ch2,ch3;
  
  Image weaponimg; 

  
  
  public Groundmouse() {
	  
	 
	  
    f=new JFrame("Ground The Mouse");
    f.setSize(1000,800); 
    ImageIcon img=new ImageIcon(getClass().getResource("/res/BG.jpg"));  
    ImageIcon mouse=new ImageIcon(getClass().getResource("/res/MOUSEE.png"));
    ImageIcon weapon=new ImageIcon(getClass().getResource("/res/weapon.png"));
    ImageIcon tmouse=new ImageIcon(getClass().getResource("/res/pap.png"));
    ImageIcon bmouse=new ImageIcon(getClass().getResource("/res/BADMOUSE.png"));
    ImageIcon bomouse=new ImageIcon(getClass().getResource("/res/bonus.png"));
    imglab=new JLabel(img);
    
    
    
    time=new JLabel("Time:60s");
    time.setFont(new java.awt.Font("Dialog",1,20));
    time.setForeground(Color.red);
    time.setBounds(380,50,200,100);
    
    bobtn=new JButton();
    bobtn.setBounds(100,100,200,200);
    bobtn.setIcon(bomouse);
    bol bo=new bol();
    bobtn.addActionListener(bo);
    
    
    score=new JLabel("Score:0");
    score.setFont(new java.awt.Font("Dialog",1,20));
    score.setForeground(Color.blue);
    score.setBounds(380,100,100,100);
    
   stop=new JButton("stop");
   stop.setBounds(30,150,100,50);
   sto st=new sto();
   stop.addActionListener(st);
   
   resume=new JButton("resume");
    resume.setBounds(30,250,100,50);
    res re=new res();
    resume.addActionListener(re);
    
    
    btn1=new JButton();
    btn1.setIcon(mouse);
    btn1.setBounds(180,215,100,100);
    
    btn2=new JButton();
    btn2.setIcon(mouse); 
    btn2.setBounds(420,215,100,100);  
    
    btn3=new JButton();
    btn3.setIcon(mouse);
    btn3.setBounds(660,215,100,100);
    
    btn4=new JButton();
    btn4.setIcon(mouse);
    btn4.setBounds(180,380,100,100);

    btn5=new JButton();
    btn5.setIcon(mouse);
    btn5.setBounds(420,380,100,100);
    
    btn6=new JButton();
    btn6.setIcon(mouse);
    btn6.setBounds(660,380,100,100);
    
    btn7=new JButton();
    btn7.setIcon(mouse);
    btn7.setBounds(180,545,100,100);
    
    btn8=new JButton();
    btn8.setIcon(mouse);
    btn8.setBounds(420,545,100,100);
    
    btn9=new JButton();
    btn9.setIcon(mouse);
    btn9.setBounds(660,545,100,100);
    
    Igotyou p=new Igotyou();
    btn1.addActionListener(p);
    
    btn2.addActionListener(p);
    btn3.addActionListener(p);
    btn4.addActionListener(p);
    btn5.addActionListener(p);
    btn6.addActionListener(p);
    btn7.addActionListener(p);
    btn8.addActionListener(p);
    btn9.addActionListener(p);
    
    
    bbtn1=new JButton();
    bbtn1.setIcon(bmouse);
    bbtn1.setOpaque(false);
    bbtn1.setLocation(180,215);
    
    bbtn2=new JButton();
    bbtn2.setIcon(bmouse); 
    bbtn2.setBounds(420,215,100,100);  
    
    bbtn3=new JButton();
    bbtn3.setIcon(bmouse);
    bbtn3.setBounds(660,215,100,100);
    
    bbtn4=new JButton();
    bbtn4.setIcon(bmouse);
    bbtn4.setBounds(180,380,100,100);

    bbtn5=new JButton();
    bbtn5.setIcon(bmouse);
    bbtn5.setBounds(420,380,100,100);
    
    bbtn6=new JButton();
    bbtn6.setIcon(bmouse);
    bbtn6.setBounds(660,380,100,100);
    
    bbtn7=new JButton();
    bbtn7.setIcon(bmouse);
    bbtn7.setBounds(180,545,100,100);
    
    bbtn8=new JButton();
    bbtn8.setIcon(bmouse);
    bbtn8.setBounds(420,545,100,100);
    
    bbtn9=new JButton();
    bbtn9.setIcon(bmouse);
    bbtn9.setBounds(660,545,100,100);
    
    
    Forgotyou d=new Forgotyou();
    bbtn1.addActionListener(d);
    bbtn2.addActionListener(d);
    bbtn3.addActionListener(d);
    bbtn4.addActionListener(d);
    bbtn5.addActionListener(d);
    bbtn6.addActionListener(d);
    bbtn7.addActionListener(d);
    bbtn8.addActionListener(d);
    bbtn9.addActionListener(d);
    
    tbtn1=new JButton();
    
    tbtn1.setIcon(tmouse);
    tbtn1.setBounds(180,215,100,100);
    
    tbtn2=new JButton();
    tbtn2.setIcon(tmouse); 
    tbtn2.setBounds(420,215,100,100);  
    
    tbtn3=new JButton();
    tbtn3.setIcon(tmouse);
    tbtn3.setBounds(660,215,100,100);
    
    tbtn4=new JButton();
    tbtn4.setIcon(tmouse);
    tbtn4.setBounds(180,380,100,100);

    tbtn5=new JButton();
    tbtn5.setIcon(tmouse);
    tbtn5.setBounds(420,380,100,100);
    
    tbtn6=new JButton();
    tbtn6.setIcon(tmouse);
    tbtn6.setBounds(660,380,100,100);
    
    tbtn7=new JButton();
    tbtn7.setIcon(tmouse);
    tbtn7.setBounds(180,545,100,100);
    
    tbtn8=new JButton();
    tbtn8.setIcon(tmouse);
    tbtn8.setBounds(420,545,100,100);
    
    tbtn9=new JButton();
    tbtn9.setIcon(tmouse);
    tbtn9.setBounds(660,545,100,100);
    
    Pigotyou o=new Pigotyou();
    tbtn1.addActionListener(o);
    tbtn2.addActionListener(o);
    tbtn3.addActionListener(o);
    tbtn4.addActionListener(o);
    tbtn5.addActionListener(o);
    tbtn6.addActionListener(o);
    tbtn7.addActionListener(o);
    tbtn8.addActionListener(o);
    tbtn9.addActionListener(o);   
    
    ch1=new JButton("Easy");
    ch1.setBounds(400,180,200,100);
    c1 cone=new c1();
    ch1.addActionListener(cone);
    
    ch2=new JButton("Nomal");
    ch2.setBounds(400,400,200,100);
    c2 ctwo=new c2();
    ch2.addActionListener(ctwo);
    
    ch3=new JButton("Hard");
    ch3.setBounds(400,620,200,100);
    c3 cthr=new c3();
    ch3.addActionListener(cthr);
 
    imglab.setBounds(0,0,1000,800);
    
   
    
   
    Container cp=f.getContentPane();
    
   
    
    cp.setLayout(null);
    
    
    
    
    cp.add(time);
    cp.add(score);
    
    
    cp.add(bobtn);
    
    cp.add(ch1);
    cp.add(ch2);
    cp.add(ch3);
    
    cp.add(stop);
    cp.add(resume);
    
    cp.add(btn1);
    cp.add(btn2);
    cp.add(btn3);
    cp.add(btn4);
    cp.add(btn5);
    cp.add(btn6);
    cp.add(btn7);
    cp.add(btn8);
    cp.add(btn9);
    
    cp.add(bbtn1);
    cp.add(bbtn2);
    cp.add(bbtn3);
    cp.add(bbtn4);
    cp.add(bbtn5);
    cp.add(bbtn6);
    cp.add(bbtn7);
    cp.add(bbtn8);
    cp.add(bbtn9);
    
    cp.add(tbtn1);
    cp.add(tbtn2);
    cp.add(tbtn3);
    cp.add(tbtn4);
    cp.add(tbtn5);
    cp.add(tbtn6);
    cp.add(tbtn7);
    cp.add(tbtn8);
    cp.add(tbtn9);
    
    btn2.setContentAreaFilled(false);
    btn1.setContentAreaFilled(false);
    btn3.setContentAreaFilled(false);
    btn4.setContentAreaFilled(false);
    btn5.setContentAreaFilled(false);
    btn6.setContentAreaFilled(false);
    btn7.setContentAreaFilled(false);
    btn8.setContentAreaFilled(false);
    btn9.setContentAreaFilled(false);
    bbtn1.setContentAreaFilled(false);
    bbtn2.setContentAreaFilled(false);
    bbtn3.setContentAreaFilled(false);
    bbtn4.setContentAreaFilled(false);
    bbtn5.setContentAreaFilled(false);
    bbtn6.setContentAreaFilled(false);
    bbtn7.setContentAreaFilled(false);
    bbtn8.setContentAreaFilled(false);
    bbtn9.setContentAreaFilled(false);
    tbtn1.setContentAreaFilled(false);
    tbtn2.setContentAreaFilled(false);
    tbtn3.setContentAreaFilled(false);
    tbtn4.setContentAreaFilled(false);
    tbtn5.setContentAreaFilled(false);
    tbtn6.setContentAreaFilled(false);
    tbtn7.setContentAreaFilled(false);
    tbtn8.setContentAreaFilled(false);
    tbtn9.setContentAreaFilled(false);
    bobtn.setContentAreaFilled(false);

    
    cp.add(imglab);
    
    
    bobtn.setVisible(false);
    tbtn1.setVisible(false);
	  tbtn2.setVisible(false);
	  tbtn3.setVisible(false);
	  tbtn4.setVisible(false);
	  tbtn5.setVisible(false);
	  tbtn6.setVisible(false);
	  tbtn7.setVisible(false);
	  tbtn8.setVisible(false);
	  tbtn9.setVisible(false);
	  btn1.setVisible(false);
	  btn2.setVisible(false);
	  btn3.setVisible(false);
	  btn4.setVisible(false);
	  btn5.setVisible(false);
	  btn6.setVisible(false);
	  btn7.setVisible(false);
	  btn8.setVisible(false);
	  btn9.setVisible(false);
	  bbtn1.setVisible(false);
	  bbtn2.setVisible(false);
	  bbtn3.setVisible(false);
	  bbtn4.setVisible(false);
	  bbtn5.setVisible(false);
	  bbtn6.setVisible(false);
	  bbtn7.setVisible(false);
	  bbtn8.setVisible(false);
	  bbtn9.setVisible(false);
	  
	  stop.setVisible(false);
	  resume.setVisible(false);
  
      
    f.setLocationRelativeTo(null);  
    f.setVisible(true); 
    
   
    }
  
public void startgame(){
	  stop.setVisible(true);
	  canatk=1;
	  running=0;
	  setweapon();
	  set = new setmouse();
	    set.start();
	    set1=new setime();
	    set1.start();
  }
  
  public void randomset()
  {
	  hp1=1;
	  hp2=2;
	  check=1;
	  a=ran.nextInt(9)+1;
	  b=ran.nextInt(9)+1;
	  c=ran.nextInt(9)+1;
	  while(a==b){
		  b=ran.nextInt(9)+1;
	  }
	  while((b==c)||(a==c)){
		  c=ran.nextInt(9)+1;
	  }
	  if(c==1){
		  tbtn1.setVisible(true);
		  tbtn2.setVisible(false);
		  tbtn3.setVisible(false);
		  tbtn4.setVisible(false);
		  tbtn5.setVisible(false);
		  tbtn6.setVisible(false);
		  tbtn7.setVisible(false);
		  tbtn8.setVisible(false);
		  tbtn9.setVisible(false);
	  }
	  else if(c==2){		  	
			  tbtn1.setVisible(false);
			  tbtn2.setVisible(true);
			  tbtn3.setVisible(false);
			  tbtn4.setVisible(false);
			  tbtn5.setVisible(false);
			  tbtn6.setVisible(false);
			  tbtn7.setVisible(false);
			  tbtn8.setVisible(false);
			  tbtn9.setVisible(false);
		  }
	  else if(c==3){		  	
		  tbtn1.setVisible(false);
		  tbtn3.setVisible(true);
		  tbtn2.setVisible(false);
		  tbtn4.setVisible(false);
		  tbtn5.setVisible(false);
		  tbtn6.setVisible(false);
		  tbtn7.setVisible(false);
		  tbtn8.setVisible(false);
		  tbtn9.setVisible(false);
	  }
	  else if(c==4){		  	
		  tbtn1.setVisible(false);
		  tbtn4.setVisible(true);
		  tbtn3.setVisible(false);
		  tbtn2.setVisible(false);
		  tbtn5.setVisible(false);
		  tbtn6.setVisible(false);
		  tbtn7.setVisible(false);
		  tbtn8.setVisible(false);
		  tbtn9.setVisible(false);
	  }
	  else if(c==5){		  	
		  tbtn1.setVisible(false);
		  tbtn5.setVisible(true);
		  tbtn3.setVisible(false);
		  tbtn2.setVisible(false);
		  tbtn4.setVisible(false);
		  tbtn6.setVisible(false);
		  tbtn7.setVisible(false);
		  tbtn8.setVisible(false);
		  tbtn9.setVisible(false);
	  }
	  else if(c==6){		  	
		  tbtn1.setVisible(false);
		  tbtn6.setVisible(true);
		  tbtn3.setVisible(false);
		  tbtn2.setVisible(false);
		  tbtn5.setVisible(false);
		  tbtn4.setVisible(false);
		  tbtn7.setVisible(false);
		  tbtn8.setVisible(false);
		  tbtn9.setVisible(false);
	  }
	  else if(c==7){		  	
		  tbtn1.setVisible(false);
		  tbtn7.setVisible(true);
		  tbtn3.setVisible(false);
		  tbtn2.setVisible(false);
		  tbtn5.setVisible(false);
		  tbtn6.setVisible(false);
		  tbtn4.setVisible(false);
		  tbtn8.setVisible(false);
		  tbtn9.setVisible(false);
	  }
	  else if(c==8){		  	
		  tbtn1.setVisible(false);
		  tbtn8.setVisible(true);
		  tbtn3.setVisible(false);
		  tbtn2.setVisible(false);
		  tbtn5.setVisible(false);
		  tbtn6.setVisible(false);
		  tbtn7.setVisible(false);
		  tbtn4.setVisible(false);
		  tbtn9.setVisible(false);
	  }
	  else {		  	
		  tbtn1.setVisible(false);
		  tbtn9.setVisible(true);
		  tbtn3.setVisible(false);
		  tbtn2.setVisible(false);
		  tbtn5.setVisible(false);
		  tbtn6.setVisible(false);
		  tbtn7.setVisible(false);
		  tbtn8.setVisible(false);
		  tbtn4.setVisible(false);
	  }
	
	  
	  if(a==1){
		  btn1.setVisible(true);
		  btn2.setVisible(false);
		  btn3.setVisible(false);
		  btn4.setVisible(false);
		  btn5.setVisible(false);
		  btn6.setVisible(false);
		  btn7.setVisible(false);
		  btn8.setVisible(false);
		  btn9.setVisible(false);
	  }
	  else if(a==2){		  	
			  btn1.setVisible(false);
			  btn2.setVisible(true);
			  btn3.setVisible(false);
			  btn4.setVisible(false);
			  btn5.setVisible(false);
			  btn6.setVisible(false);
			  btn7.setVisible(false);
			  btn8.setVisible(false);
			  btn9.setVisible(false);
		  }
	  else if(a==3){		  	
		  btn1.setVisible(false);
		  btn3.setVisible(true);
		  btn2.setVisible(false);
		  btn4.setVisible(false);
		  btn5.setVisible(false);
		  btn6.setVisible(false);
		  btn7.setVisible(false);
		  btn8.setVisible(false);
		  btn9.setVisible(false);
	  }
	  else if(a==4){		  	
		  btn1.setVisible(false);
		  btn4.setVisible(true);
		  btn3.setVisible(false);
		  btn2.setVisible(false);
		  btn5.setVisible(false);
		  btn6.setVisible(false);
		  btn7.setVisible(false);
		  btn8.setVisible(false);
		  btn9.setVisible(false);
	  }
	  else if(a==5){		  	
		  btn1.setVisible(false);
		  btn5.setVisible(true);
		  btn3.setVisible(false);
		  btn2.setVisible(false);
		  btn4.setVisible(false);
		  btn6.setVisible(false);
		  btn7.setVisible(false);
		  btn8.setVisible(false);
		  btn9.setVisible(false);
	  }
	  else if(a==6){		  	
		  btn1.setVisible(false);
		  btn6.setVisible(true);
		  btn3.setVisible(false);
		  btn2.setVisible(false);
		  btn5.setVisible(false);
		  btn4.setVisible(false);
		  btn7.setVisible(false);
		  btn8.setVisible(false);
		  btn9.setVisible(false);
	  }
	  else if(a==7){		  	
		  btn1.setVisible(false);
		  btn7.setVisible(true);
		  btn3.setVisible(false);
		  btn2.setVisible(false);
		  btn5.setVisible(false);
		  btn6.setVisible(false);
		  btn4.setVisible(false);
		  btn8.setVisible(false);
		  btn9.setVisible(false);
	  }
	  else if(a==8){		  	
		  btn1.setVisible(false);
		  btn8.setVisible(true);
		  btn3.setVisible(false);
		  btn2.setVisible(false);
		  btn5.setVisible(false);
		  btn6.setVisible(false);
		  btn7.setVisible(false);
		  btn4.setVisible(false);
		  btn9.setVisible(false);
	  }
	  else {		  	
		  btn1.setVisible(false);
		  btn9.setVisible(true);
		  btn3.setVisible(false);
		  btn2.setVisible(false);
		  btn5.setVisible(false);
		  btn6.setVisible(false);
		  btn7.setVisible(false);
		  btn8.setVisible(false);
		  btn4.setVisible(false);
	  }
	  
	  
	  if(b==1){
		  bbtn1.setVisible(true);
		  bbtn2.setVisible(false);
		  bbtn3.setVisible(false);
		  bbtn4.setVisible(false);
		  bbtn5.setVisible(false);
		  bbtn6.setVisible(false);
		  bbtn7.setVisible(false);
		  bbtn8.setVisible(false);
		  bbtn9.setVisible(false);
	  }
	  else if(b==2){		  	
			  bbtn1.setVisible(false);
			  bbtn2.setVisible(true);
			  bbtn3.setVisible(false);
			  bbtn4.setVisible(false);
			  bbtn5.setVisible(false);
			  bbtn6.setVisible(false);
			  bbtn7.setVisible(false);
			  bbtn8.setVisible(false);
			  bbtn9.setVisible(false);
		  }
	  else if(b==3){		  	
		  bbtn1.setVisible(false);
		  bbtn3.setVisible(true);
		  bbtn2.setVisible(false);
		  bbtn4.setVisible(false);
		  bbtn5.setVisible(false);
		  bbtn6.setVisible(false);
		  bbtn7.setVisible(false);
		  bbtn8.setVisible(false);
		  bbtn9.setVisible(false);
	  }
	  else if(b==4){		  	
		  bbtn1.setVisible(false);
		  bbtn4.setVisible(true);
		  bbtn3.setVisible(false);
		  bbtn2.setVisible(false);
		  bbtn5.setVisible(false);
		  bbtn6.setVisible(false);
		  bbtn7.setVisible(false);
		  bbtn8.setVisible(false);
		  bbtn9.setVisible(false);
	  }
	  else if(b==5){		  	
		  bbtn1.setVisible(false);
		  bbtn5.setVisible(true);
		  bbtn3.setVisible(false);
		  bbtn2.setVisible(false);
		  bbtn4.setVisible(false);
		  bbtn6.setVisible(false);
		  bbtn7.setVisible(false);
		  bbtn8.setVisible(false);
		  bbtn9.setVisible(false);
	  }
	  else if(b==6){		  	
		  bbtn1.setVisible(false);
		  bbtn6.setVisible(true);
		  bbtn3.setVisible(false);
		  bbtn2.setVisible(false);
		  bbtn5.setVisible(false);
		  bbtn4.setVisible(false);
		  bbtn7.setVisible(false);
		  bbtn8.setVisible(false);
		  bbtn9.setVisible(false);
	  }
	  else if(b==7){		  	
		  bbtn1.setVisible(false);
		  bbtn7.setVisible(true);
		  bbtn3.setVisible(false);
		  bbtn2.setVisible(false);
		  bbtn5.setVisible(false);
		  bbtn6.setVisible(false);
		  bbtn4.setVisible(false);
		  bbtn8.setVisible(false);
		  bbtn9.setVisible(false);
	  }
	  else if(b==8){		  	
		  bbtn1.setVisible(false);
		  bbtn8.setVisible(true);
		  bbtn3.setVisible(false);
		  bbtn2.setVisible(false);
		  bbtn5.setVisible(false);
		  bbtn6.setVisible(false);
		  bbtn7.setVisible(false);
		  bbtn4.setVisible(false);
		  bbtn9.setVisible(false);
	  }
	  else {		  	
		  bbtn1.setVisible(false);
		  bbtn9.setVisible(true);
		  bbtn3.setVisible(false);
		  bbtn2.setVisible(false);
		  bbtn5.setVisible(false);
		  bbtn6.setVisible(false);
		  bbtn7.setVisible(false);
		  bbtn8.setVisible(false);
		  bbtn4.setVisible(false);
	  }
	  
	  }
  
  public class setmouse extends Thread{
	public setmouse(){}
	public void run(){
		int times=30000/hard;
		int i;
		check=1;
		hp1=1;
		hp2=2;
        for (i=0; i < times; i++) {
        randomset();
        try {
        sleep(hard);
        } catch (InterruptedException e) {}
           
        }
       
   }
  }
  public void btnvanish(){
	  btn1.setVisible(false);
	  btn9.setVisible(false);
	  btn3.setVisible(false);
	  btn2.setVisible(false);
	  btn5.setVisible(false);
	  btn6.setVisible(false);
	  btn7.setVisible(false);
	  btn8.setVisible(false);
	  btn4.setVisible(false);
  }
  public void bbtnvanish(){
	  bbtn1.setVisible(false);
	  bbtn9.setVisible(false);
	  bbtn3.setVisible(false);
	  bbtn2.setVisible(false);
	  bbtn5.setVisible(false);
	  bbtn6.setVisible(false);
	  bbtn7.setVisible(false);
	  bbtn8.setVisible(false);
	  bbtn4.setVisible(false);
  }
  public void tbtnvanish(){
	  tbtn1.setVisible(false);
	  tbtn9.setVisible(false);
	  tbtn3.setVisible(false);
	  tbtn2.setVisible(false);
	  tbtn5.setVisible(false);
	  tbtn6.setVisible(false);
	  tbtn7.setVisible(false);
	  tbtn8.setVisible(false);
	  tbtn4.setVisible(false);
  }
  
  
  public void setweapon(){
	  
		  weaponimg = Toolkit.getDefaultToolkit().getImage( (getClass().getResource("/res/weapon.png")) ); 	   
		    cr = Toolkit.getDefaultToolkit().createCustomCursor(weaponimg, new Point(0,0) ,"MyCursor" );
		    f.setCursor( cr );
	  
  }
  
  private class bol implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			if(canatk==1){		
					 scorenum++;
					 score.setText("Score:"+scorenum);
				  }
			}
			
		  }
		 
  
  
  private class sto implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			canatk=0;
			stop.setVisible(false);
			resume.setVisible(true);
			set.suspend();
			set1.suspend();
			if(running==1){
				bonu.suspend();
			}
		  }
		 }
  
  private class res implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			canatk=1;
			stop.setVisible(true);
			resume.setVisible(false);
			set.resume();
			set1.resume();
			if(running==1){
				bonu.resume();
			}
		  }
		 }
  
  
 
  
  
  public class setime extends Thread{
		
	 public setime() {}
	 public void run() { 
	     for (int i=0; i < 30; i++) {
	     timenum--;
	     time.setText("Time:"+timenum);
	     try {
	     sleep(1000);
	     } catch (InterruptedException e) {}
	           
		 }
	     haha();
	     }
	       
}
  //666
  public class bonus extends Thread{
		
		 public bonus() {}
		 public void run() {
		     for (int i=0; i < 5; i++) {
		    	l=ran.nextInt(4)+1;
		    	 bonustime--;
			     time.setText("Bonus Time:"+bonustime);
			   
			     if(l==1){
				     bobtn.setLocation(750,400);
					     }
			     else if(l==2){
				     bobtn.setLocation(150,400);
					     }
			     else if(l==3){
				     bobtn.setLocation(500,600);
					     }
			     else if(l==4){
				     bobtn.setLocation(500,200);
					     }
			     
		     try {
		     sleep(1000);
		     } catch (InterruptedException e) {}
		           
			 }
		     bobtn.setVisible(false);
		     }
		       
	}
  
  
	  
  
  public void haha(){
	  btn1.setVisible(false);
	
	   bonu=new bonus();
	  btn9.setVisible(false);
	  btn3.setVisible(false);
	  btn2.setVisible(false);
	  btn5.setVisible(false);
	  btn6.setVisible(false);
	  btn7.setVisible(false);
	  btn8.setVisible(false);
	  btn4.setVisible(false);
	  bbtn1.setVisible(false);
	  bbtn9.setVisible(false);
	  bbtn3.setVisible(false);
	  bbtn2.setVisible(false);
	  bbtn5.setVisible(false);
	  bbtn6.setVisible(false);
	  bbtn7.setVisible(false);
	  bbtn8.setVisible(false);
	  bbtn4.setVisible(false);
	  tbtn1.setVisible(false);
	  tbtn9.setVisible(false);
	  tbtn3.setVisible(false);
	  tbtn2.setVisible(false);
	  tbtn5.setVisible(false);
	  tbtn6.setVisible(false);
	  tbtn7.setVisible(false);
	  tbtn8.setVisible(false);
	  tbtn4.setVisible(false);
	  running=1;
	  bobtn.setVisible(true);
	  bonu=new bonus();
		 bonu.run();
		 
	  score.setFont(new java.awt.Font("Dialog",1,50));
	    score.setForeground(Color.blue);
	    score.setBounds(380,200,700,100);
	    	    
	  
  }
  

  private class Igotyou implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			 if(canatk==1){	
			 if(hp1>0){
			 scorenum++;
			 score.setText("Score:"+scorenum);
			 hp1--;
			 btnvanish();
		  }
			 }
	}
  }
 
		
  
  private class Forgotyou implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			 if(canatk==1){		 
			 scorenum--;			 
			 score.setText("Score:"+scorenum);
			 bbtnvanish();
			 }
		 }
	}
  
  private class c1 implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			ch1.setVisible(false);
			ch2.setVisible(false);
			ch3.setVisible(false);
			hard=1800;
			startgame();
		  }
		 }
  private class c2 implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			ch1.setVisible(false);
			ch2.setVisible(false);
			ch3.setVisible(false);
			hard=1500;
			startgame();
		  }
		 }
  private class c3 implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			ch1.setVisible(false);
			ch2.setVisible(false);
			ch3.setVisible(false);
			hard=1000;
			startgame();
		  }
		 }
	
  private class Pigotyou implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			 if(canatk==1){	
			 if(hp2>0){				 
			 hp2--;
		  }
			 else if(hp2==0)  {
				 scorenum+=2;
			 score.setText("Score:"+scorenum);
			 hp2--;
			 tbtnvanish();
		 }
			
			 
			 }
	}
	 }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

    
}
