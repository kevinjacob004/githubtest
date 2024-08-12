import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class hi {
	JFrame jf;
	JButton b1,b2;
	JTextField jt1,jt2;
	hi(){
		jf=new JFrame("Hello");
		b1=new JButton("!!!!");
		b2=new JButton("%%%");
		jt1=new JTextField(20);
		jt2=new JTextField(20);
		jf.setSize(500,500);
		jf.setLayout(new FlowLayout());
		jf.setVisible(true);
		jf.add(jt1);
		jf.add(b1);
		jf.add(jt2);
		jf.add(b2);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			jt1.setText("Always be happy!!!!!!!!!!!!!");
		}
		});
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			jt2.setText("Greatest of all Time GOAT");
		}
		});
	}
}

class hello{
public static void main(String [] args){
	new hi();
}
}