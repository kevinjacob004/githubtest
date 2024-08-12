import java.util.*;
import javax.swing.*;
import java.awt.*;
//import java.awt.event;

class od extends Thread{
	JFrame jf;
	JPanel p1,p2,p3,p4,p5,p6,p7;
	JTextField jt1,jt2,jt3;
	//JRadioButton b[]=new JRadioButton[3];
	//ButtonGroup bg;
	od(){
	jf=new JFrame("Traffic Light");
	p1=new JPanel();
	p2=new JPanel();
	 p3=new JPanel();
	p4=new JPanel();
	p5=new JPanel();
	p6=new JPanel();
	p7=new JPanel();
	jt1=new JTextField("STOP");
	jt2=new JTextField("WAIT");
	jt3=new JTextField("GO");
/*	bg=new ButtonGroup();
	b[2]=new JRadioButton("Go");
	b[2].setBackground(Color.WHITE);
	b[1]=new JRadioButton("WAIT");
	b[1].setBackground(Color.WHITE);
	b[0]=new JRadioButton("STOP");
	b[0].setBackground(Color.WHITE);
	bg.add(b[0]);
	bg.add(b[1]);
	bg.add(b[2]);*/
	p1.setBackground(Color.BLACK);
	p2.setBackground(Color.BLACK);
	p3.setBackground(Color.BLACK);
	p4.setBackground(Color.BLACK);
	p5.setBackground(Color.BLACK);
	p6.setBackground(Color.BLACK);
	p7.setBackground(Color.BLACK);
	p2.add(p4);
	p2.add(jt1);
	p2.add(p5);
	p2.add(jt2);
	p2.add(p6);
	p2.add(jt3);
	p2.add(p7);
	p2.setLayout(new GridLayout(7,1));
	jf.add(p1);
	jf.add(p2);
	jf.add(p3);
	jf.setSize(600,600);
	jf.setLayout(new GridLayout());
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void run(){
	for(int i=0;i<10;){
	Thread t=currentThread();
	jt1.setBackground(Color.RED);
	jt2.setBackground(Color.WHITE);
	jt3.setBackground(Color.WHITE);
	try{
		t.sleep(10000);
	}
	catch(Exception e){}
	jt2.setBackground(Color.YELLOW);
	jt1.setBackground(Color.WHITE);
	jt3.setBackground(Color.WHITE);
	try{
		t.sleep(3000);
	}
	catch(Exception e){}
	jt3.setBackground(Color.GREEN);
	jt2.setBackground(Color.WHITE);
	jt1.setBackground(Color.WHITE);
	try{
		t.sleep(20000);
	}
	catch(Exception e){}
	}
	}
	
}


class threadd{
public static void main(String[]args){
	od obj=new od();
	obj.start();
}
}