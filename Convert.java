import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class Convert {
	public static void main(String[] args){
		new c();
	}
}
class c implements ActionListener
{
	JFrame jf;
	JTextField tf1,tf2;
	JButton b1,b2;
	String s1,s2;
	double x,z;
	c(){
		jf=new JFrame("Celcius to Fharenhit..");
		jf.setSize(500,500);
		jf.setLayout(new FlowLayout());
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		b1=new JButton("Celcius");
		b2=new JButton("Fharenhit");
		jf.setVisible(true);
		jf.add(tf1);
		jf.add(tf2);
		jf.add(b1);
		jf.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae){
		JButton b=(JButton)ae.getSource();
		if(b==b1){
			s1=tf1.getText();
			x=Integer.parseInt(s1);
			z=(x-32)*5/9;
			s2=String.valueOf(z);
			tf2.setText(s2);
		}
		else if(b==b2){
			s1=tf1.getText();
			x=Integer.parseInt(s1);
			z=(x*1.8)+32;
			s2=String.valueOf(z);
			tf2.setText(s2);
		}
		
	}
}