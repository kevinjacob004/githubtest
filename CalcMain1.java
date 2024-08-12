import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{ JFrame jf;
JTextField tf;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
String s1,s2,s4;
int x,y,z;
Calculator()
{
jf=new JFrame("CALCULATOR");
jf.setSize(500,500);
jf.setLayout(new GridLayout(6,3,20,20));
tf=new JTextField(10);
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
b6=new JButton("6");
b7=new JButton("7");
b8=new JButton("8");
b9=new JButton("9");
b10=new JButton("0");
b11=new JButton("+");
b12=new JButton("-");
b13=new JButton("*");
b14=new JButton("/"); 
b15=new JButton("%");
b16=new JButton("AC");
b17=new JButton("=");
jf.setVisible(true);
jf.add(tf);
jf.add(b1);
jf.add(b2);
jf.add(b3);
jf.add(b4);
jf.add(b5);
jf.add(b6);
jf.add(b7);
jf.add(b8);
jf.add(b9);
jf.add(b10);
jf.add(b11);
jf.add(b12);
jf.add(b13);
jf.add(b14);
jf.add(b15);
jf.add(b16);
jf.add(b17);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{
try
{
String s3;
JButton b=(JButton)ae.getSource();
if(b==b1)
tf.setText(tf.getText()+"1");
else if(b==b2)
tf.setText(tf.getText()+"2");
else if(b==b3)
tf.setText(tf.getText()+"3");
else if(b==b4)
tf.setText(tf.getText()+"4");
else if(b==b5)
tf.setText(tf.getText()+"5");
else if(b==b6)
tf.setText(tf.getText()+"6");
else if(b==b7)
tf.setText(tf.getText()+"7");
else if(b==b8)
tf.setText(tf.getText()+"8");
else if(b==b9)
tf.setText(tf.getText()+"9");
else if(b==b10)
tf.setText(tf.getText()+"0"); 
else if(b==b11)
{
s1=tf.getText();
tf.setText("");
s4="+";
}
else if(b==b11)
{
s1=tf.getText();
tf.setText("");
s4="+";
} 
else if(b==b12)
{
s1=tf.getText();
tf.setText("");
s4="-";
}
else if(b==b13)
{
s1=tf.getText();
tf.setText("");
s4="*";
}
else if(b==b14)
{
s1=tf.getText();
tf.setText("");
s4="/";
} else if(b==b15)
{
s1=tf.getText();
tf.setText("");
s4="%";
}
else if(b==b16)
{
s1="";
s2="";
z=0;
tf.setText("");
}
else if(b==b17)
{
s2=tf.getText();
x=Integer.parseInt(s1);
y=Integer.parseInt(s2);
if(s4=="+")
z=x+y;
else if(s4=="-")
z=x-y;
else if(s4=="*")
z=x*y;
else if(s4=="/")
z=x/y;
s3=String.valueOf(z);
tf.setText(s3);
}
} catch(ArithmeticException e)
{
tf.setText("Exception caught");
}
}
} 
class CalcMain1
{
public static void main(String a[])
{
Calculator c=new Calculator();
}
}